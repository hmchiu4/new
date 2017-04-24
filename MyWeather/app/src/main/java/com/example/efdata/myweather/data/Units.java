package com.example.efdata.myweather.data;

import org.json.JSONObject;
import org.json.JSONException;
/**
 * Created by efdata on 4/24/2017.
 */

public class Units implements JSONPopulator {

    private String temperature;

    public String getTemperature() {
        return temperature;
    }

    @Override
    public void populate(JSONObject data) {

        temperature = data.optString("temperature");
    }


    @Override
    public JSONObject toJSON() {
        JSONObject data = new JSONObject();

        try {
            data.put("temperature", temperature);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return data;
    }
}
