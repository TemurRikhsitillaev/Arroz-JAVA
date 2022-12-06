package Classes;

import java.util.Date;
import java.util.List;

public class Courts {
    private int courtID;
    private float pricePerHour;
    private boolean surface = true; //true = hard ... false = clay
    private boolean type = false; //true = indoor ... false = outdoor
    private String phone;
    private Complexes complex;

    private List<Date> bookedTimes;

    Courts(int courtID, float pricePerHour, boolean surface, boolean type, String phone, List<Date> bookedTimes, Complexes complex){
        this.courtID = courtID;
        this.pricePerHour = pricePerHour;
        this.surface = surface;
        this.type = type;
        this.phone = phone;
        this.bookedTimes = bookedTimes;
        this.complex = complex;
    }


    public int getCourtID() {
        return courtID;
    }

    public boolean isSurface() {
        return surface;
    }

    public boolean isType() {
        return type;
    }

    public float getPricePerHour() {
        return pricePerHour;
    }

    public void setCourtID(int courtID) {
        this.courtID = courtID;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPricePerHour(float pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public void setSurface(boolean surface) {
        this.surface = surface;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public List<Date> getBookedTimes() {
        return bookedTimes;
    }

    public void setBookedTimes(List<Date> bookedTimes) {
        this.bookedTimes = bookedTimes;
    }

    public Complexes getComplex() {
        return complex;
    }

    public void setComplex(Complexes complex) {
        this.complex = complex;
    }
}
