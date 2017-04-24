package com.example.efdata.myweather.listener;

/**
 * Created by efdata on 4/24/2017.
 */
import com.example.efdata.myweather.data.Channel;

public interface WeatherServiceListener {
    void serviceSuccess(Channel channel);

    void serviceFailure(Exception exception);
}
