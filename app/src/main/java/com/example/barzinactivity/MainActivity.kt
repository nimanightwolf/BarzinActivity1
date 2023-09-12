package com.example.barzinactivity

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.Display
import android.view.View
import android.view.WindowManager
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient


class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var webView = findViewById<View>(R.id.webview) as WebView
        webView.setWebViewClient(WebViewClient())
        webView.loadUrl("http://185.231.181.224/")

        val webSettings: WebSettings = webView.getSettings()
        val newUA = "Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0"

        webView.getSettings().setUserAgentString(newUA)

        webView.setPadding(0, 0, 0, 0);
        webView.setInitialScale(1);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setJavaScriptEnabled(true);

        webView.getSettings().setBuiltInZoomControls(false);
        webView.getSettings().setSupportZoom(false);
        webView.reload();
        webSettings.javaScriptEnabled = true

    }


}

