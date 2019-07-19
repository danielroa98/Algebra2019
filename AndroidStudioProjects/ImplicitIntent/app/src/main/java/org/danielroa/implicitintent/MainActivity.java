package org.danielroa.implicitintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etUrl;
    private Button btnOpen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidgets();

        setupListeners();

    }

    private void initWidgets() {

        etUrl = findViewById(R.id.etUrl);
        btnOpen = findViewById(R.id.btnOpen);

    }

    private void setupListeners() {

        btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sendIntent();

            }
        });

    }

    private void sendIntent() {

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(etUrl.getText().toString()));

        startActivity(intent);

    }


}
