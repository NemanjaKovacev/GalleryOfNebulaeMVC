package com.example.nemanja.galleryofnebulaemvc.model;

import com.example.nemanja.galleryofnebulaemvc.R;
import com.example.nemanja.galleryofnebulaemvc.protocol.ListURL;

import java.util.ArrayList;
import java.util.List;

public class ListNebula implements ListURL {

    public static List<Nebula> mNebulas;

    public static void dataInit() {
        mNebulas = new ArrayList<>();
        mNebulas.add(new Nebula(R.string.ngc_1952, R.string.ngc_1952_text, NGC_1952_URL));
        mNebulas.add(new Nebula(R.string.ngc_2024, R.string.ngc_2024_text, NGC_2024_URL));
        mNebulas.add(new Nebula(R.string.ngc_2068, R.string.ngc_2068_text, NGC_2068_URL));
        mNebulas.add(new Nebula(R.string.ngc_7635, R.string.ngc_7635_text, NGC_7635_URL));
        mNebulas.add(new Nebula(R.string.ngc_3372, R.string.ngc_3372_text, NGC_3372_URL));
        mNebulas.add(new Nebula(R.string.ngc_1333, R.string.ngc_1333_text, NGC_1333_URL));
        mNebulas.add(new Nebula(R.string.ngc_6514, R.string.ngc_6514_text, NGC_6514_URL));
        mNebulas.add(new Nebula(R.string.ngc_6543, R.string.ngc_6543_text, NGC_6543_URL));
        mNebulas.add(new Nebula(R.string.ngc_6853, R.string.ngc_6853_text, NGC_6853_URL));
        mNebulas.add(new Nebula(R.string.ngc_7293, R.string.ngc_7293_text, NGC_7293_URL));
    }
}
