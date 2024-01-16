package com.d4w3school.customrecyclerviewcit;

public class User {
    //String variable declarer ===#01
    String name,phone,email,profile;
    //int profile if image save to drawable

    //Constructor create ====#02
    public User(String name , String phone , String email , String profile) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.profile = profile;
    }
    //Getter and setter create ====#03
    //go to MainActivity.java


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
}

