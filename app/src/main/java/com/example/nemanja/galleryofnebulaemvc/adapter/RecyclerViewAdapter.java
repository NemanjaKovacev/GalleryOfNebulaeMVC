package com.example.nemanja.galleryofnebulaemvc.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.nemanja.galleryofnebulaemvc.R;
import com.example.nemanja.galleryofnebulaemvc.model.Nebula;
import com.example.nemanja.galleryofnebulaemvc.model.PicassoClass;
import com.example.nemanja.galleryofnebulaemvc.viewholder.RecyclerViewHolder;
import com.transitionseverywhere.ChangeBounds;
import com.transitionseverywhere.ChangeImageTransform;
import com.transitionseverywhere.TransitionManager;
import com.transitionseverywhere.TransitionSet;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    private final Context mContext;
    private final List<Nebula> mNebulaList;
    private boolean mExpanded;

    public RecyclerViewAdapter(Context context, List<Nebula> nebulaList) {
        this.mContext = context;
        this.mNebulaList = nebulaList;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, @StringRes int position) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card, viewGroup, false);

        final ViewGroup transitionsContainer = (ViewGroup) view.findViewById(R.id.cardview);
        final ImageView nebulaImage = (ImageView) transitionsContainer.findViewById(R.id.nebulaImage);

        nebulaImage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mExpanded = !mExpanded;

                TransitionManager.beginDelayedTransition(transitionsContainer, new TransitionSet()
                        .addTransition(new ChangeBounds())
                        .addTransition(new ChangeImageTransform()));

                ViewGroup.LayoutParams params = nebulaImage.getLayoutParams();
                params.height = mExpanded ? ViewGroup.LayoutParams.MATCH_PARENT : ViewGroup.LayoutParams.WRAP_CONTENT;
                nebulaImage.setLayoutParams(params);
                nebulaImage.setScaleType(mExpanded ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_END);
            }
        });

        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, @StringRes int position) {
        holder.mNebulaName.setText(mNebulaList.get(position).mName);
        holder.mNebulaDescription.setText(mNebulaList.get(position).mDescription);
        PicassoClass.downloadImage(mContext, mNebulaList.get(position).getUrl(), holder.mNebulaImage);
    }

    @Override
    public int getItemCount() {
        return mNebulaList.size();
    }
}