package com.example.android.earthquakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.ArrayList;

import java.util.List;

/**
 * Created by SaiAnirud on 7/3/2017.
 */

public class EarthquakeLoader extends AsyncTaskLoader<ArrayList<Earthquake>> {

    private static final String LOG_TAG = EarthquakeLoader.class.getName();

    private String mUrl;

    public EarthquakeLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public ArrayList<Earthquake> loadInBackground() {
        if (mUrl == null) {
            return null;
        }
        ArrayList<Earthquake> earthquakese = QueryUtils.fetchEarthquakeData(mUrl);
        return earthquakese;
    }
}
