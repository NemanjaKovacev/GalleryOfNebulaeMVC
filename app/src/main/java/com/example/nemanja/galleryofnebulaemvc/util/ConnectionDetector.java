package com.example.nemanja.galleryofnebulaemvc.util;

import android.content.Context;
import android.net.ConnectivityManager;

public class ConnectionDetector {

    private final Context mContext;

    public ConnectionDetector(Context context) {
        this.mContext = context;
    }

    public boolean isConnectingToInternet() {
        final ConnectivityManager cm = (ConnectivityManager) mContext.getSystemService(Context.CONNECTIVITY_SERVICE);
        return cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isConnected();
    }
}