package org.danielroa.widgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox chbEnglish;
    private CheckBox chbFrench;
    private CheckBox chbGerman;

    private RadioGroup rgGender;

    private Spinner spCountry;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidgets();
    }

    private void initWidgets() {
        chbEnglish = findViewById(R.id.chbEnglish);
        chbFrench = findViewById(R.id.chbFrench);
        chbGerman = findViewById(R.id.chbGerman);

        rgGender = findViewById(R.id.rgGender);

        spCountry = findViewById(R.id.spCountry);
    }

    public void submit(View view) {

        StringBuilder report = new StringBuilder();

        report.append(getString(R.string.language));
        report.append(":");

        if (chbEnglish.isChecked()){
            report.append(getString(R.string.english));
            report.append(" ");
        }

        if (chbGerman.isChecked()){
            report.append(getString(R.string.german));
            report.append(" ");
        }

        if (chbFrench.isChecked()){
            report.append(getString(R.string.french));
            report.append(" ");
        }

        report.append("\n");

        report.append(getString(R.string.gender));
        report.append(":");

        switch (rgGender.getCheckedRadioButtonId()){

            case R.id.rbFemale:
                report.append(getString(R.string.female));
                break;

            case R.id.rbMale:
                report.append(getString(R.string.male));
                break;

        }

        report.append("\n");

        report.append(getString(R.string.country));
        report.append(":");

        report.append(spCountry.getSelectedItem());

        Toast.makeText(this, report, Toast.LENGTH_SHORT).show();
    }
}
