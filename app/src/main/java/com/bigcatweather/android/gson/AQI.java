package com.bigcatweather.android.gson;

/**
 * Created by Big_Cat on 2017/6/2.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
