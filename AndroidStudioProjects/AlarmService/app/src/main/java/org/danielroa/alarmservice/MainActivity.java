package org.danielroa.alarmservice;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private AlarmManager alarmManager;
    private PendingIntent pendingIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initAlarm();
    }

    private void initAlarm() {
        alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);

        Intent intent = new Intent(this, AlarmReceiver.class);

        pendingIntent = PendingIntent.getBroadcast(
                this,
                0, //similar to a token, it's just a number
                intent,
                PendingIntent.FLAG_UPDATE_CURRENT //
        );
    }

    public void start(View view) {

        Calendar calendar = Calendar.getInstance(); //static factory method
        calendar.add(Calendar.SECOND, 10);

        alarmManager.setExact(
                AlarmManager.RTC_WAKEUP,
                calendar.getTimeInMillis(),
                pendingIntent
        );

    }
}
