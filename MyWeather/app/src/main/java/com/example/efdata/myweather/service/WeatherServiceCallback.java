package com.example.efdata.myweather.service;

import com.example.efdata.myweather.data.Channel;

/**
 * Created by efdata on 4/24/2017.
 */

public interface WeatherServiceCallback {
    void serviceSuccess(Channel channel);
    void serviceFailure(Exception exception);
}
