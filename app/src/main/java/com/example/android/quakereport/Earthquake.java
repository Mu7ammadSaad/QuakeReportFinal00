package com.example.android.quakereport;

/**
 * Created by FirmwareMS on 8/10/2016.
 */
public class Earthquake {

    /**Magnitude of the earthquake */
    private double mMagnitude;

    /**Location of the earthquake */
    private String mLocation;

    /**time of the earthquake */
    private long mTimeInMilliseconds;

    /**Url of the Earthquake */
    private String mUrl;
    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the city location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *                           earthquake happened
     *@param url is the url of the earthquake
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds,String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    public double getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    /**
     * Returns the time of the earthquake.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getUrl(){
        return mUrl;
    }

}
