import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Point;
import de.hsmainz.gi.indoornavcl.Locator;
import de.hsmainz.gi.indoornavcl.Measurement;
import de.hsmainz.gi.indoornavcl.comm.Location;
import org.ejml.simple.SimpleMatrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/**
 * Wrapper to parse the observations gathered by the input device and filter them for the parameter estimation.
 *
 * Created by Saufaus on 31.01.2015.
 */
public class Wrapper implements Locator{



    /**
     * Basic function to filter the input map. Will produce a matrix one row per found beacon containing: X-,Y-,Z-coordinates and the the median of the observed pseudoranges:
     *
     * Created by Saufaus on 31.01.2015.
     */
    public static SimpleMatrix locatorToObservations (Map<Location, Measurement> locations){

        int u = 4;
        double mediandistance = -1;
        SimpleMatrix output = new SimpleMatrix(locations.keySet().size(), u);                                           // Set size
        ArrayList<Measurement> rawObservations = new ArrayList<Measurement>();

        // Scan map for individual beacons amd create an array from them.
        ArrayList<Location> foundLocations = new ArrayList<Location>(locations.keySet());


        for (int i=0;i<foundLocations.size();i++) {

            rawObservations.addAll(Arrays.asList(locations.get(foundLocations.get(i))));

            // if more then one observation is found, filter for median.
            if(rawObservations.size() > 1){

                // if list has even size, form median.
                if (rawObservations.size() % 2 == 0) {
                    mediandistance = (rawObservations.get(rawObservations.size() / 2).getRssi() + rawObservations.get((rawObservations.size() / 2) + 1).getRssi()) / 2;
                } else {
                    mediandistance = rawObservations.get((rawObservations.size() + 1) / 2).getRssi();
                }

            } else if (rawObservations.size() == 1){
                mediandistance = rawObservations.get(0).getRssi();
            }

            // Add the position of the beacon and the calculated distance from the observed pseudoranges to output matrix
            output.set(i,0,foundLocations.get(i).getCoord().getX());                                                     // X-coordinate
            output.set(i,1,foundLocations.get(i).getCoord().getY());                                                     // Y-coordinate
            output.set(i,2,2.5);                                                                                         // Z-coordinate
            output.set(i,3,DistanceCalculation.calculateDistance(rawObservations.get(0).getTxPower(), mediandistance));  // calculated distance
        }

        return output;
    }

    /**
     * Function that converts the output from an estimator to a JTS point.
     *
     * Created by Saufaus on 31.01.2015.
     */
    public static Point observationsToJTSPoint (SimpleMatrix input, int SRID){
        GeometryFactory gf = new GeometryFactory();
        Point output = gf.createPoint(new Coordinate(input.get(0,0),input.get(1,0),input.get(2,0)));
        System.out.println("Point created: " + output.getCoordinate().toString());
        return output;
    }

    @Override
    public Point getLocation(Map<Location, Measurement> locations) {
        return null;
    }
}
