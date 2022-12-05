package com.example.retrifit_datafetch_lab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    TextView id,name,email,batchid,contact,address,tv;
    String Url5="https://imraju.com/labfinal/api/";
    ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView editTextQuery = findViewById(R.id.editText);

        ArrayList<String> listItem = new ArrayList<String>();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1,
                android.R.id.text1,listItem
        );
        editTextQuery.setAdapter(adapter);

        
        Log.e("Gop", "Data Start RCV1");

        Log.e("Gop", "Data Start RCV2");



         Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ShowStudentDetailsApi.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Log.e("Gop", "Data Start RCV3");


        ShowStudentDetailsApi showStudentDetailsApi = retrofit.create(ShowStudentDetailsApi.class);
        Log.e("Gop", "Data Start RCV4");

        Call<ModelStatus> call = showStudentDetailsApi.GetStudentDetails();
        Log.e("Gop", "Data Start RCV5");

        call.enqueue(new Callback<ModelStatus>() {

            @Override
            public void onResponse(Call<ModelStatus> call, Response<ModelStatus> response) {
                List <ModelPostData> lists = response.body().getStudents();

                Log.e("Gop", "Data Start RCV6");

                for(ModelPostData mpd:lists){
                    String content = "";
                    content+="name:"+mpd.getName();
                    listItem.add(content);
                }

                adapter.notifyDataSetChanged();

                    Log.e("Gop", "Data RCV Done");

            }

            @Override
            public void onFailure(Call<ModelStatus> call, Throwable t) {
                Log.e("Gop", "Data NotRCV\n"+t.toString());
                Toast.makeText(getApplicationContext(),t.toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}