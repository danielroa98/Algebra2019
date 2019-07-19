package org.danielroa.implicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class BrowserActivity extends AppCompatActivity {

    private WebView wvBroswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);

        initWidgets();
        loadPage();

    }

    private void initWidgets() {

        wvBroswer = findViewById(R.id.wvBrowser);

        wvBroswer.setWebViewClient(new WebViewClient());

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url){
            view.loadUrl(url);
            return true;
        }

    }

    private void loadPage() {

        Intent intent = getIntent();
        String url = intent.getData().toString();
        wvBroswer.loadUrl(url);

    }

}
