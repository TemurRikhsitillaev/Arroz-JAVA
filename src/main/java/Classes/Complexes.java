package Classes;


import java.util.Date;
import java.util.List;

public class Complexes {
    private int id;
    private String name;
    private float outdoor_price;
    private String phone;
    private String address;
    private List<Courts> courts;
    private Date timeOpen;
    private Date timeClosed;




    Complexes(String name, float outdoor_price, String phone, String address, List<Courts> courts, Date timeOpen, Date timeClosed){
        this.name = name;
        this.outdoor_price = outdoor_price;
        this.phone = phone;
        this.address = address;
        this.courts = courts;
        this.timeOpen = timeOpen;
        this.timeClosed = timeClosed;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public float getOutdoor_price() {
        return outdoor_price;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOutdoor_price(float outdoor_price) {
        this.outdoor_price = outdoor_price;
    }

    public List<Courts> getCourts() {
        return courts;
    }

    public void setCourts(List<Courts> courts) {
        this.courts = courts;
    }

    public int getId() {
        return id;
    }

    public Date getTimeClosed() {
        return timeClosed;
    }

    public Date getTimeOpen() {
        return timeOpen;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTimeClosed(Date timeClosed) {
        this.timeClosed = timeClosed;
    }

    public void setTimeOpen(Date timeOpen) {
        this.timeOpen = timeOpen;
    }
}

