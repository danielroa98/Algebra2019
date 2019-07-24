package org.danielroa.alarmservice;

import android.app.IntentService;
import android.content.Intent;
import android.os.Handler;
import android.widget.Toast;

public class BackgroundService extends IntentService {

    private Handler handler = new Handler();

    public BackgroundService() {
        super("BgService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        doLongTask();
        notifyEnd();
    }

    private void doLongTask() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void notifyEnd(){

        handler.post(new Runnable() {
            @Override
            public void run() {

                Toast.makeText(BackgroundService.this, R.string.done, Toast.LENGTH_SHORT).show();

            }
        });


    }
}
