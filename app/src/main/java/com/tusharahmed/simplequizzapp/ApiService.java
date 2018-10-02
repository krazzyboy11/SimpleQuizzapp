package com.tusharahmed.simplequizzapp;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("views")
    Call<MostViewedResponse> getAllAnimals();
}
