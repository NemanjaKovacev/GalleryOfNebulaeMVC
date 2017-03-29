package com.example.nemanja.galleryofnebulaemvc.model;

import android.content.Context;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.example.nemanja.galleryofnebulaemvc.R;
import com.squareup.picasso.Picasso;

public class PicassoClass {

    public static void downloadImage(Context context, @Nullable String url, ImageView imageView) {
        if (url != null && url.length() > 0) {
            Picasso.with(context)
                    .load(url)
                    .resize(640, 480)
                    .onlyScaleDown()
                    .placeholder(R.drawable.placeholder)
                    .into(imageView);
        } else {
            Picasso.with(context)
                    .load(R.drawable.placeholder)
                    .into(imageView);
        }
    }
}
