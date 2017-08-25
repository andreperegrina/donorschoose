package com.donorschoose.model;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface DonorschooseService {
    @GET("/common/json_feed.html")
    Call<ResponseDonorschoose> getProjects(@QueryMap(encoded = true) Map<String, String> options);
}
