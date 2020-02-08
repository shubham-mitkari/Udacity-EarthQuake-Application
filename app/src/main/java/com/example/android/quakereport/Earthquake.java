package com.example.android.quakereport;

public class Earthquake {
    private String mLocation;
    private Double mMagnitude;
    private long mTimeInMilliSeconds;
    private String mUrl;

    //construct a new object
    public Earthquake(double magnitude, String location, long timeInMilliSeconds, String url) {
        this.mMagnitude = magnitude;
        this.mLocation = location;
        this.mTimeInMilliSeconds = timeInMilliSeconds;
        this.mUrl = url;
    }

    //returns the magnitude of earth quake
    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getTimeInMilliSeconds() {
        return mTimeInMilliSeconds;
    }

    public String getUrl() {
        return mUrl;
    }
}
