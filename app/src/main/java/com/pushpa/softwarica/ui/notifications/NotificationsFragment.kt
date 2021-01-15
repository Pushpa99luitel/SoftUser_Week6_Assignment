package com.pushpa.softwarica.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.pushpa.softwarica.R

class NotificationsFragment : Fragment() {
    private lateinit var webView: WebView

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_notifications, container, false)
        webView=view.findViewById(R.id.webView)
        webView.webViewClient= WebViewClient()
        webView.apply {
            loadUrl("https://softwarica.edu.np/")
            webView.settings.javaScriptEnabled=true
            webView.settings.allowFileAccess=true
        }
        return view
    }
}