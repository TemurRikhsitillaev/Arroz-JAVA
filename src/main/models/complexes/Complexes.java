package main.models.complexes;

import java.util.*;

public class Complexes {
    private int id;
    private String name;
    private String address;
    private int phoneNumber;
    private int price;
    private String timeOpen;
    private String timeClose;

    public Complexes(){
        setName("");
        setAddress("");
        setPhoneNumber("");
        setPrice("");
        setTimeOpen("");
        setTimeClose("");
    }

    public Complexes(String name, String address, int phoneNumber, int price, String timeOpen, String timeClose){
        setName(name);
        setAddress(address);
        setPhoneNumber(phoneNumber);
        setPrice(price);
        setTimeOpen(timeOpen);
        setTimeClose(timeClose);
    }

//    GETTERS
    public String getName(){
        return name;
    }

    public String getAddress() {
        return address;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }

    public int getPrice() {
        return price;
    }

    public String getTimeOpen() {
        return timeOpen;
    }

    public String getTimeClose() {
        return timeClose;
    }

//    SETTERS
    public void setName(name){
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTimeOpen(String timeOpen) {
        this.timeOpen = timeOpen;
    }

    public void setTimeClose(String timeClose) {
        this.timeClose = timeClose;
    }
}