package com.bustracker.calculations;

import com.bustracker.dataobject.LatLon;

/*
Handles calculations relating to computing distances
 */
public class DistanceComputer {

    /**
     * Returns the great circle distance between the two provided lat/lon pairs.
     *
     * @param latLon1 a lat/lon pair
     * @param latLon2 a lat/lon pair
     * @return the great circle distance between the provided lat/lon pairs in kilometers
     */
    public static double getGreatCircleDistance(final LatLon latLon1, final LatLon latLon2) {

        // compute haversines of lat/lon differences
        final double haversineOfLats = haversine(latLon2.getLat() - latLon1.getLat());
        final double haversineOfLons = haversine(latLon2.getLon() - latLon1.getLon());

        // compute cosines of lats
        final double cosOfLat1 = Math.cos(latLon1.getLat());
        final double cosOfLat2 = Math.cos(latLon2.getLat());

        return 2 * EARTH_RADIUS_KM
                * Math.asin(haversineOfLats + cosOfLat1 * cosOfLat2 * haversineOfLons);
    }

    /**
     * Returns the haversine of the provided angle.
     *
     * @param theta an angle in radians
     * @return the haversine of the provided angle
     */
    private static double haversine(double theta) {
        return Math.pow(Math.sin(theta / 2.0), 2);
    }

    /* Constant representing the radius of the Earth in kilometers */
    private static final double EARTH_RADIUS_KM = 6371;

}
