package Classes;

import java.util.List;

public class Users {
    private int userID;
    private String username;
    private String password;
    private String phone;
    private boolean admin = false;
    private List<Booking> bookings;


    Users(int userID, String username, String password, String phone, boolean admin, List<Booking> bookings){
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.admin = admin;
        this.bookings = bookings;
    }

    public String getUsername() {
        return username;
    }

    public int getUserID() {
        return userID;
    }

    public boolean isAdmin() {
        return admin;
    }

    public String getPassword() {
        return password;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
