package com.example.searchhotel;

public class HotelModel {
    public  String hotelLocation;
    public String hotelName;
    public String imageUri;
    public  String hotelRating;
    public String hotelListTag;
    public String hotelPricePerHour;
    public String hotelMapUrl;
    public String hotelPhone;
    public String hotelEmail;
    private String key;
    private String ID;


    public HotelModel() {

    }

    public HotelModel(String hotelMapUrl, String hotelPhone, String hotelEmail) {
        this.hotelMapUrl = hotelMapUrl;
        this.hotelPhone = hotelPhone;
        this.hotelEmail = hotelEmail;
    }

    public HotelModel(String hotelLocation, String hotelName, String imageUri, String hotelRating, String hotelListTag, String hotelPricePerHour) {
        this.hotelLocation = hotelLocation;
        this.hotelName = hotelName;
        this.imageUri = imageUri;
        this.hotelRating = hotelRating;
        this.hotelListTag = hotelListTag;
        this.hotelPricePerHour = hotelPricePerHour;

    }

    public String getHotelMapUrl() {
        return hotelMapUrl;
    }

    public void setHotelMapUrl(String hotelMapUrl) {
        this.hotelMapUrl = hotelMapUrl;
    }

    public String getHotelPhone() {
        return hotelPhone;
    }

    public void setHotelPhone(String hotelPhone) {
        this.hotelPhone = hotelPhone;
    }

    public String getHotelEmail() {
        return hotelEmail;
    }

    public void setHotelEmail(String hotelEmail) {
        this.hotelEmail = hotelEmail;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getHotelLocation() {
        return hotelLocation;
    }

    public void setHotelLocation(String hotelLocation) {
        this.hotelLocation = hotelLocation;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    public String getHotelRating() {
        return hotelRating;
    }

    public void setHotelRating(String hotelRating) {
        this.hotelRating = hotelRating;
    }

    public String getHotelListTag() {
        return hotelListTag;
    }

    public void setHotelListTag(String hotelListTag) {
        this.hotelListTag = hotelListTag;
    }

    public String getHotelPricePerHour() {
        return hotelPricePerHour;
    }

    public void setHotelPricePerHour(String hotelPricePerHour) {
        this.hotelPricePerHour = hotelPricePerHour;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
