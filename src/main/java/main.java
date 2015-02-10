import org.ejml.simple.SimpleMatrix;

import javax.swing.*;
import java.awt.*;
import java.io.*;

/**
 * Created by Saufaus on 30.01.2015.
 */
public class main{


    public static void main(String [] args) {

        // Sample implementation with runtime calculaton
        long startTime = System.currentTimeMillis();

        JFileChooser openDialog = new JFileChooser();
        File file = new File("C:/Users/Saufaus/Standpunkt1.txt");
        int lineCount = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file.getAbsolutePath()));

            for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                lineCount++;
            }

            reader.close();
            reader = new BufferedReader(new FileReader(file.getAbsolutePath()));

        // Sample input matrix
        SimpleMatrix test = new SimpleMatrix(lineCount, 4);
        int i =0;

            for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                String[] linearray = line.split("\t");
                if (linearray.length == 4) {
                    test.set(i,0, Double.parseDouble(linearray[0]));
                    test.set(i,1, Double.parseDouble(linearray[1]));
                    test.set(i,2, Double.parseDouble(linearray[2]));
                    test.set(i,3, Double.parseDouble(linearray[3]));
                    i++;
                }

            }

            //test.set(0,0,-4.95);
            //test.set(0,1,27.30);
            //test.set(0,2,10.04);
            // test.set(0,3,3.85);

            //  test.set(1,0,-4.85);
            //  test.set(1,1,20.69);
            // test.set(1,2,10.51);
            //   test.set(1,3,4.35);

            //  test.set(2,0,0.52);
            //  test.set(2,1,22.59);
            // test.set(2,2,9.77);
            // test.set(2,3,3.51);

            //  test.set(3,0,-6.12);
            //  test.set(3,1,25.48);
            // test.set(3,2,10.92);
            //  test.set(3,3,3.98);

            //  test.set(4,0,0.45);
            //  test.set(4,1,27.39);
            //   test.set(4,2,10.75);
            //  test.set(4,3,4.37);

            // test.set(5,0,-7.88);
            //  test.set(5,1,22.45);
            //  test.set(5,2,10.16);
            // test.set(5,3,5.73);

        // Sample approximation for position
        //double[] pos = new double[] {-2.59, 24.22, 9.62, 0};

        // Initialize estimator
        parameterEstimation Est = new parameterEstimation();
        // Set approximation (optional)
        //Est.setLastPosition(pos);

        // Return estimated position as JTS.Point
        Wrapper.observationsToJTSPoint(Est.estimate(test), 1);
        long runTime = System.currentTimeMillis() - startTime;

       // Print time needed
        System.out.println("Laufzeit: " + (runTime) + " ms");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
