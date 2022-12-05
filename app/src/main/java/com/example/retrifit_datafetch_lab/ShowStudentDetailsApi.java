package com.example.retrifit_datafetch_lab;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ShowStudentDetailsApi
{

    String BASE_URL = "https://imraju.com/labfinal/api/";
    @GET("allStudents.php")
    Call<ModelStatus> GetStudentDetails();
}