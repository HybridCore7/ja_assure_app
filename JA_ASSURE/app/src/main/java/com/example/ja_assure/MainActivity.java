package com.example.ja_assure;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Ensure 'activity_main.xml' exists in 'res/layout'

        // Find the WebView by its ID
        WebView webView = findViewById(R.id.android_app); // Ensure this ID exists in activity_main.xml

        // Configure WebView settings
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true); // Enable JavaScript
        webSettings.setDomStorageEnabled(true); // Enable DOM storage for modern web apps

        // Set a WebViewClient to handle navigation within the WebView
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);

                // Execute JavaScript to modify the page after it's fully loaded
                view.evaluateJavascript(
                        "(function() { " +
                                "var elementToRemove = document.querySelector('.element-to-remove');" +
                                "if (elementToRemove) { elementToRemove.remove(); }" + // Safely handle removal
                                "var elementToModify = document.querySelector('.element-to-modify');" +
                                "if (elementToModify) { elementToModify.style.color = 'blue'; }" + // Change color to blue
                                "})();",
                        null
                );
            }
        });

        // Load the website
        webView.loadUrl("https://jade.insure/login");
    }
}