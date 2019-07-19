package org.danielroa.explicitintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class TargetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);

        handleIntent();
    }

    private void handleIntent() {

        Intent intent = getIntent();

        if (intent.hasExtra("param")){
            String value = intent.getStringExtra(MainActivity.PARAM);
            Toast.makeText(this, value, Toast.LENGTH_SHORT).show();
        }

    }
}
