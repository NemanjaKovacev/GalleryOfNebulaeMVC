package com.example.nemanja.galleryofnebulaemvc.ui;

import android.content.Context;
import android.os.CountDownTimer;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nemanja.galleryofnebulaemvc.R;

public class Toasts {

    public static void showToastAnswerNoConn(Context mContext) {
        final Toast tag = Toast.makeText(mContext, R.string.answer_no_connection, Toast.LENGTH_SHORT);
        LinearLayout linearLayout = (LinearLayout) tag.getView();
        if (linearLayout.getChildCount() > 0) {
            final TextView tv = (TextView) linearLayout.getChildAt(0);
            tv.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
            tag.show();
        }
        new CountDownTimer(9000, 1000) {
            public void onTick(long millisUntilFinished) {
                tag.show();
            }
            public void onFinish() {
                tag.show();
            }
        }.start();
    }

    public static void showToastAnswerConn(Context mContext) {
        Toast.makeText(mContext, R.string.answer_connected, Toast.LENGTH_LONG).show();
    }
}
