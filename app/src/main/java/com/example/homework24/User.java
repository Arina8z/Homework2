package com.example.homework24;

import java.io.Serializable;

public class User implements Serializable {


    private String id;
    private String placeOt;
    private String timeOt;
    private String timePrib;
    private String price;
    private String placePrib;

    public User(String id, String placeOt, String placePrib, String timeOt, String timePrib, String price) {
        this.id = id;
        this.timeOt = timeOt;
        this.timePrib = timePrib;
        this.placeOt = placeOt;
        this.placePrib = placePrib;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlaceOt() {
        return placeOt;
    }

    public void setPlaceOt(String placeOt) {
        this.placeOt = placeOt;
    }

    public String getPlacePrib() {
        return placePrib;
    }

    public void setPlacePrib(String placePrib) {
        this.placePrib = placePrib;
    }

    public String getTimeOt() {
        return timeOt;
    }

    public void setTimeOt(String timeOt) {
        this.timeOt = timeOt;
    }

    public String getTimePrib() {
        return timePrib;
    }

    public void setTimePrib(String timePrib) {
        this.timePrib = timePrib;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}