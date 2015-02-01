import org.ejml.simple.SimpleMatrix;

/**
 * Created by Saufaus on 30.01.2015.
 */
public class main {
    public static void main(String [] args) {

        long startTime = System.currentTimeMillis();

        SimpleMatrix test = new SimpleMatrix(6, 4);

        test.set(0,0,-4.95);
        test.set(0,1,27.30);
        test.set(0,2,10.04);
        test.set(0,3,3.85);

        test.set(1,0,-4.85);
        test.set(1,1,20.69);
        test.set(1,2,10.51);
        test.set(1,3,4.35);

        test.set(2,0,0.52);
        test.set(2,1,22.59);
        test.set(2,2,9.77);
        test.set(2,3,3.51);

        test.set(3,0,-6.12);
        test.set(3,1,25.48);
        test.set(3,2,10.92);
        test.set(3,3,3.98);

        test.set(4,0,0.45);
        test.set(4,1,27.39);
        test.set(4,2,10.75);
        test.set(4,3,4.37);

        test.set(5,0,-7.88);
        test.set(5,1,22.45);
        test.set(5,2,10.16);
        test.set(5,3,5.73);


        double[] pos = new double[] {-2.59, 24.22, 9.62, 0};

        parameterEstimation Est = new parameterEstimation();
        Est.setLastPosition(pos);

        Wrapper.observationsToJTSPoint(Est.estimate(test), 1);


        long estimatedTime = System.currentTimeMillis() - startTime;

        System.out.println("Laufzeit: " + (estimatedTime) + " ms");
    }
}
