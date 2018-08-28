package com.example.errlindeleon.androidfinal;

public class MenuItem {
    private String User;
    private String Review;
    private int Rating;
    private int FoodImage;
    private int UserImage;
    private String Resurant;
    private String FoodName;

    public MenuItem() {
    }

    public MenuItem(String user, String review, int rating, int foodImage, int userImage, String resurant, String foodName) {
        User = user;
        Review = review;
        Rating = rating;
        FoodImage = foodImage;
        UserImage = userImage;
        Resurant = resurant;
        FoodName = foodName;
    }

    public String getFoodName() {
        return FoodName;
    }

    public void setFoodName(String foodName) {
        FoodName = foodName;
    }

    public String getResurant() {
        return Resurant;
    }

    public void setResurant(String resurant) {
        Resurant = resurant;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public String getReview() {
        return Review;
    }

    public void setReview(String review) {
        Review = review;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int rating) {
        Rating = rating;
    }

    public int getFoodImage() {
        return FoodImage;
    }

    public void setFoodImage(int foodImage) {
        FoodImage = foodImage;
    }

    public int getUserImage() {
        return UserImage;
    }

    public void setUserImage(int userImage) {
        UserImage = userImage;
    }
}
