package com.example.efdata.myweather.listener;

/**
 * Created by efdata on 4/24/2017.
 */

import com.example.efdata.myweather.data.LocationResult;

public interface GeocodingServiceListener {
    void geocodeSuccess(LocationResult location);

    void geocodeFailure(Exception exception);
}