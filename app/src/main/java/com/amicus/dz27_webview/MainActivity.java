package com.amicus.dz27_webview;

import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        WebView browser = findViewById(R.id.browser);
//        browser.getSettings().setJavaScriptEnabled(true);
//        browser.setWebViewClient(new WebViewClient());
//        browser.loadUrl("https://www.google.com/");
//        WebSettings webSettings = browser.getSettings();
//        webSettings.setDomStorageEnabled(true);
//        webSettings.setLoadWithOverviewMode(true);
//        webSettings.setUseWideViewPort(true);
//        webSettings.setSupportZoom(true);
        Button btn1,btn2,btn3;
        VideoView videoPlayer = findViewById(R.id.videoView);
        Uri videoUri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video1);
        videoPlayer.setVideoURI(videoUri);
        MediaController mediaController = new MediaController(this);
        videoPlayer.setMediaController(mediaController);
        mediaController.setMediaPlayer(videoPlayer);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn1.setOnClickListener(b->videoPlayer.start());
        btn2.setOnClickListener(b->{videoPlayer.pause();});
        btn3.setOnClickListener(b->{videoPlayer.stopPlayback();videoPlayer.resume();videoPlayer.resetPivot();});




    }
}