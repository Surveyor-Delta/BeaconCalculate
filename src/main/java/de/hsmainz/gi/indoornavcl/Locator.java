package de.hsmainz.gi.indoornavcl;

import com.vividsolutions.jts.geom.Point;
import de.hsmainz.gi.indoornavcl.comm.Location;

import java.util.Map;

/**
 * Created by keks on 26.01.15.
 */
public interface Locator {

    /**
     * Calculate the {@link de.hsmainz.gi.indoornavcl.comm.Location} of the Client
     * based on the visible {@link de.hsmainz.gi.indoornavcl.comm.Beacon}s and their
     * {@link de.hsmainz.gi.indoornavcl.Measurement}s.
     *
     * @param   locations   a Map of Locations with a List of their Measurements
     * @return  the Location of the Client
     */
    public Point getLocation(Map<Location, Measurement> locations);

}
