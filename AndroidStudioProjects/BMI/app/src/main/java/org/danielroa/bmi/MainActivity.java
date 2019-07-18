package org.danielroa.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.danielroa.bmi.util.Utils;

public class MainActivity extends AppCompatActivity {

    private EditText etWeight;
    private EditText etHeight;
    private Button btnCalc;
    private TextView tvReport;
    private ImageView ivReport;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidgets();
        setupListener();
    }

    private void initWidgets() {
       etWeight = findViewById(R.id.etWeight);
       etHeight = findViewById(R.id.etHeight);
       btnCalc = findViewById(R.id.btnCalc);
       tvReport = findViewById(R.id.tvReport);
        ivReport = findViewById(R.id.ivReport);


    }

    private void setupListener() {
        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this, "Hi Mom", Toast.LENGTH_SHORT).show();

                if (formIsOk()){
                    double bmi = calculate();
                    handleLayout (bmi);
                    clearForm();
                }
            }
        });

    }

    private double calculate() {

        double weight = Double.parseDouble(etWeight.getText().toString());
        double height = Double.parseDouble(etHeight.getText().toString());

        if (weight <= 0 || height <= 0){
            return -1;
        }

        height = height > 3 ? height / 100 : height;

        return weight/Math.pow(height, 2);

    }


    private void handleLayout(double bmi) {

        if (bmi == -1){

            tvReport.setText("");
            ivReport.setImageDrawable(null);

        } else if (bmi <= 20){

            tvReport.setText("Underweight");
            ivReport.setImageResource(R.drawable.sad);

        } else if (bmi <= 25) {

            tvReport.setText("Normal");
            ivReport.setImageResource(R.drawable.happy);

        }else{

            tvReport.setText("Overweight");
            ivReport.setImageResource(R.drawable.sad);

        }

    }

    private void clearForm() {

        etWeight.getText().clear();
        etHeight.getText().clear();

        Utils.hideKeyboard(this);

    }

    private boolean formIsOk() {

        if (etWeight.getText().length() == 0){

            etWeight.setError(getString(R.string.please_insert));
            etWeight.requestFocus();
            return false;

        } if (etHeight.getText().length() == 0){

            etHeight.setError(getString(R.string.please_insert));
            etHeight.requestFocus();
            return false;

        }

        return true;
    }


}
