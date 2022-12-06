package Classes;

import java.util.Date;

public class Booking {
    private int bookingID;
    private int userID;
    private int complexID;
    private int courtID;
    private Date bookingDate;

    Booking(int bookingID,int userID, int complexID, int courtID, Date bookingDate){
        this.bookingID = bookingID;
        this.userID = userID;
        this.complexID = complexID;
        this.courtID = courtID;
        this.bookingDate = bookingDate;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getUserID() {
        return userID;
    }

    public int getBookingID() {
        return bookingID;
    }

    public int getComplexID() {
        return complexID;
    }

    public int getCourtID() {
        return courtID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public void setComplexID(int complexID) {
        this.complexID = complexID;
    }

    public void setCourtID(int courtID) {
        this.courtID = courtID;
    }


    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }
}
