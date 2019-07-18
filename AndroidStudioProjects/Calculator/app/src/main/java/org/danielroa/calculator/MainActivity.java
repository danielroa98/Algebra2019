package org.danielroa.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText firstNo;
    private EditText secondNo;

    private TextView result;

    private Button plus;
    private Button minus;
    private Button mult;
    private Button div;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initWidgets();
        setupListeners();
    }

    private void initWidgets() {

        firstNo = findViewById(R.id.firstNo);
        secondNo = findViewById(R.id.secondNo);

        result = findViewById(R.id.result);

        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        mult = findViewById(R.id.mult);
        div = findViewById(R.id.div);

    }

    private void setupListeners() {

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double res = calculateAdd();

                handleLayout(res);
                clearForm();

            }
        });

    }

    private void clearForm() {

        firstNo.getText().clear();
        secondNo.getText().clear();

        //Utils.hideKeyboard(this);
    }

    private double handleLayout(double res) {


        double result = res;

        return res;
    }

    private double calculateAdd() {

        double a =Double.parseDouble(firstNo.getText().toString());
        double b =Double.parseDouble(secondNo.getText().toString());

        return a+b;

    }

    private double calculateMin() {

        double a =Double.parseDouble(firstNo.getText().toString());
        double b =Double.parseDouble(secondNo.getText().toString());

        return a-b;

    }

    private double calculateMult() {

        double a =Double.parseDouble(firstNo.getText().toString());
        double b =Double.parseDouble(secondNo.getText().toString());

        return a*b;

    }

    private double calculateDiv() {

        double a =Double.parseDouble(firstNo.getText().toString());
        double b =Double.parseDouble(secondNo.getText().toString());

        return a/b;

    }

    /*private boolean formIsOk() {
    }*/
}
