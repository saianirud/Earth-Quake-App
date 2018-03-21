package com.example.android.earthquakereport;

/**
 * Created by SaiAnirud on 7/2/2017.
 */

public class Earthquake {

    private Double magnitude;
    private String city;
    private long time;
    private String url;

    public Earthquake(Double mag,String c,long t,String u){
        magnitude=mag;
        city=c;
        time=t;
        url=u;
    }

    public Double getMagnitude(){
        return magnitude;
    }
    public String getCity(){
        return city;
    }
    public long getTime(){
        return time;
    }
    public String getUrl(){return url;}
}
