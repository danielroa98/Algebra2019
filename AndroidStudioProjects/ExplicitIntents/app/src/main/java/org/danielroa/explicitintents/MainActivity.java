package org.danielroa.explicitintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String PARAM = "param";
    private EditText etName;
    private Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidgets();
        setupListeners();
    }

    private void initWidgets() {

        etName = findViewById(R.id.etName);
        btnSend = findViewById(R.id.btnSend);

    }

    private void setupListeners() {

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendIntent();
            }
        });

    }

    private void sendIntent() {

        Intent intent = new Intent(this, TargetActivity.class);

        intent.putExtra(PARAM, etName.getText().toString());

        startActivity(intent);

    }
}
