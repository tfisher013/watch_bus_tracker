package com.bustracker.dataobject;

/**
 * Immutable class representing a latitude and longitude pair.
 */
public class LatLon {

    /**
     * Creates an instance of this.
     *
     * @param lat the latitude of this
     * @param lon the longitude of this
     */
    public LatLon(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    /**
     * Returns the latitude of this
     *
     * @return the latitude of this
     */
    public double getLat() {
        return lat;
    }

    /**
     * Returns the longitude of this
     *
     * @return the longitude of this
     */
    public double getLon() {
        return lon;
    }

    /* Represents the latitude of this */
    private final double lat;

    /* Represents the longitude of this */
    private final double lon;
}
