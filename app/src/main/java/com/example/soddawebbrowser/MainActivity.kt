package com.example.soddawebbrowser

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       webViewSetup()

    }

@RequiresApi(Build.VERSION_CODES.O)
@SuppressLint("SetJavaScriptEnabled")
private fun  webViewSetup(){
    wb_webwiew.webViewClient= WebViewClient()

    wb_webwiew.apply {
        loadUrl("https://www.google.com/")
        settings.javaScriptEnabled=true


    }
}

    override fun onBackPressed() {
        if (wb_webwiew.canGoBack()) wb_webwiew.goBack() else super.onBackPressed()
    }
}