package com.epam.agency.travel.safari.entity;

import com.epam.agency.travel.safari.entity.api.Identifible;
import com.epam.agency.travel.safari.entity.enums.Features;

import java.util.List;

public class Hotel implements Identifible {

    private long id;
    private String name;
    private int stars;
    private String website;
    private double latitude;
    private double longitude;
    private List<Features> features;

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public List<Features> getFeatures() {
        return features;
    }

    public int getStars() {
        return stars;
    }

    public long getId() {
        return id;
    }
}
