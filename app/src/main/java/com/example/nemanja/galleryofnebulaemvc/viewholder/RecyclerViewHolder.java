package com.example.nemanja.galleryofnebulaemvc.viewholder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nemanja.galleryofnebulaemvc.R;

public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    @NonNull
    public final TextView mNebulaName;
    @NonNull
    public final TextView mNebulaDescription;
    @NonNull
    public final ImageView mNebulaImage;

    public RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        mNebulaName = (TextView) itemView.findViewById(R.id.nebulaName);
        mNebulaDescription = (TextView) itemView.findViewById(R.id.nebulaDescription);
        mNebulaImage = (ImageView) itemView.findViewById(R.id.nebulaImage);
    }
}