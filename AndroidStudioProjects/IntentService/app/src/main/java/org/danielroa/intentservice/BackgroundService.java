package org.danielroa.intentservice;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.widget.Toast;

public class BackgroundService extends IntentService {

    private Handler handler = new Handler();

    public BackgroundService() {
        super("BackgroundService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        for (int i = 1; i <= 5; i++){

            doLongTask();

            int progress = (int)((i / 5.0)*100);

            showProgress(progress);

        }

    }

    private void doLongTask() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private void showProgress(final int progress) {

        handler.post(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(BackgroundService.this, progress + "%", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void onDestroy() {

        Toast.makeText(this, getString(R.string.destroyed), Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
}
