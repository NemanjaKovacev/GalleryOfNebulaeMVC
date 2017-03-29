package com.example.nemanja.galleryofnebulaemvc.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nemanja.galleryofnebulaemvc.R;
import com.example.nemanja.galleryofnebulaemvc.adapter.RecyclerViewAdapter;
import com.example.nemanja.galleryofnebulaemvc.model.ListNebula;
import com.example.nemanja.galleryofnebulaemvc.protocol.ListURL;
import com.example.nemanja.galleryofnebulaemvc.ui.Toasts;
import com.example.nemanja.galleryofnebulaemvc.util.ConnectionDetector;

import static com.example.nemanja.galleryofnebulaemvc.model.ListNebula.mNebulas;

public class GalleryFragment extends Fragment implements ListURL {

    public GalleryFragment() {
        // Required empty public constructor
    }

    private RecyclerView mRecyclerView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.recyclerview_fragment, container, false);

        ConnectionDetector mConnectionDetector = new ConnectionDetector(getContext());
        if (!mConnectionDetector.isConnectingToInternet()) {
            Toasts.showToastAnswerNoConn(getContext());
        } else {
            Toasts.showToastAnswerConn(getContext());
        }

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerview);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setHasFixedSize(true);

        ListNebula.dataInit();
        adapterInit();

        return view;
    }

    private void adapterInit() {
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(getContext(), mNebulas);
        mRecyclerView.setAdapter(adapter);
    }
}

