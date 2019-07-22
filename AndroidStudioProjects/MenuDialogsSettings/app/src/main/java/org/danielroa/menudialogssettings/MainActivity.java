package org.danielroa.menudialogssettings;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvNick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //HELLO, I´M THE LINE IT'S TALKING ABOUT

        //IF YOU WANT TO WRITE A TEXTBOX, YOU HAVE TO DO IT AFTER THIS LINE


        initWidgets();
    }

    @Override
    protected void onResume() {
        super.onResume();

        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);

        tvNick.setText(sp.getString("nick", ""));
    }

    private void initWidgets() {
        tvNick = findViewById(R.id.tvNick);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.miSettings:
                showSettings();
                return true;
                //break;

            case R.id.miExit:
                exit();
                return true;
                //break;
        }

        return super.onOptionsItemSelected(item);
    }

    private void showSettings() {

        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);

    }

    private void exit() {

        new AlertDialog.Builder(this).setTitle(R.string.exit_app).
                setIcon(R.drawable.exit).
                setMessage(R.string.really).
                setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                MainActivity.this.finish();
            }
        })
                .setNegativeButton(R.string.cancel, null)
                .setCancelable(false)
                .create()
                .show();

    }
}
