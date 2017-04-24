package com.example.efdata.myweather.data;

import org.json.JSONObject;

/**
 * Created by efdata on 4/24/2017.
 */

public interface JSONPopulator {
    void populate(JSONObject data);
    JSONObject toJSON();
}
