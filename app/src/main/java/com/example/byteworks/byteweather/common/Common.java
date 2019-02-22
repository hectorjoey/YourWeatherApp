package com.example.byteworks.byteweather.common;

public class Common {
    public static String API_KEY = "";
    public static String  API_LINK = "http://api.openweatherapp.org/data/2.5/weather";

    public static String apiRequest(String lat, String lng){
        StringBuilder sb = new StringBuilder(API_LINK);
        sb.append(String.format("?lat=%s&lon=%s&APPID=%s&units=metric",lat, lng, API_KEY));
        return sb.toString();
    }
}
