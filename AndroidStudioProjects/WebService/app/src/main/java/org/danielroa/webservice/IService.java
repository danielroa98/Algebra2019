package org.danielroa.webservice;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

public interface IService {

    public static final String ENDPOINT_URL = "https://www.metaweather.com";


    @GET("/api/location/search")
    void getLatLng(@Query("query") String cityName, Callback<List<LatLng>> callback);
}
