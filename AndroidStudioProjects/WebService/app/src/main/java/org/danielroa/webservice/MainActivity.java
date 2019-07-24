package org.danielroa.webservice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {

    private IService service;
    private Callback<List<LatLng>> callback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setup();
    }

    private void setup() {
        RestAdapter adapter = new RestAdapter.Builder()
                .setEndpoint(IService.ENDPOINT_URL)
                .build();

        service = adapter.create(IService.class);
        callback = new Callback<List<LatLng>>() {
            @Override
            public void success(List<LatLng> latLngs, Response response) {

                if (latLngs != null && latLngs.size() > 0){
                    LatLng latLng = latLngs.get(0);
                    Toast.makeText(MainActivity.this, latLng.toString(), Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void failure(RetrofitError error) {
                Toast.makeText(MainActivity.this, error.toString(), Toast.LENGTH_SHORT).show();
            }
        };
    }

    public void go(View view) {



    }
}
