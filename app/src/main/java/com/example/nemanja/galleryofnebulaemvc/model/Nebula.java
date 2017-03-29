package com.example.nemanja.galleryofnebulaemvc.model;

import android.support.annotation.StringRes;

public class Nebula {

    public final int mName;
    public final int mDescription;
    private final String mUrl;

    Nebula(@StringRes int name, @StringRes int description, String url) {
        this.mName = name;
        this.mDescription = description;
        this.mUrl = url;
    }

    public String getUrl() {
        return mUrl;
    }
}