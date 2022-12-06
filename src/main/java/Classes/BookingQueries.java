package Classes;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookingQueries {
    private static final String URL = "jdbc:derby:./db/db";
    private Connection connection; // manages connection

    private PreparedStatement selectAllBorrowRecords;
    private PreparedStatement selectStudentBorrowRecords;

    private PreparedStatement insertBorrowRecord;
    private PreparedStatement updateBorrowRecord;

    public BookingQueries() {
        try {
            connection = DriverManager.getConnection(URL);

            String SELECT_ALL_RECORDS_QUERY =   "SELECT * FROM BOOKINGS";

            selectAllBorrowRecords = connection.prepareStatement(SELECT_ALL_RECORDS_QUERY);
            selectStudentBorrowRecords = connection.prepareStatement(SELECT_ALL_RECORDS_QUERY + " WHERE USERS.USERID = ?");

            insertBorrowRecord = connection.prepareStatement("INSERT INTO BOOKINGS (BOOKINGID , USERID, USERNAME, COMPLEXID, COURTID, BOOKINGDATE) VALUES (?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);

            updateBorrowRecord = connection.prepareStatement("UPDATE BORROW_RECORDS SET USERID = ?, USERNAME = ?, COMPLEXID = ?, COURTID = ?, BOOKINGDATE = ? WHERE BOOKINGID = ?");
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
            System.exit(1);
        }
    }


    // Helper method. Returns BorrowRecord object, populated with data from resultSet
    private Booking getBorrowRecordObject(ResultSet resultSet) throws SQLException {
        return new Booking(
                resultSet.getInt("bookingID"),
                resultSet.getInt("userID"),
                resultSet.getInt("complexID"),
                resultSet.getInt("courtID"),
                resultSet.getDate("bookingDate"));
    }

    private List<Booking> selectBorrowRecords(PreparedStatement statement) {
        ResultSet resultSet;
        List<Booking> records = null;

        // set parameters, then execute
        try {
            records = new ArrayList<>();

            resultSet = statement.executeQuery();
            while(resultSet.next()) {
                records.add(getBorrowRecordObject(resultSet));
            }
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
            close();
        }

        return records;
    }
    public List<Booking> selectStudentBorrowRecords(int userID) {
        try {
            selectStudentBorrowRecords.setInt(1, userID);
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
            close();
        }
        return selectBorrowRecords(selectStudentBorrowRecords);
    }
    public List<Booking> selectAllBorrowRecords() { return selectBorrowRecords(selectAllBorrowRecords); }

    // Inserts record taking object as argument and sets generated id to the object
    public int insertBorrowRecord(Booking borrowRecord) {
        int generatedKey = 0;

        // set parameters, then execute insertBorrowRecord
        try {
            insertBorrowRecord.setInt(1, borrowRecord.getUserID());
            insertBorrowRecord.setInt(2, borrowRecord.getComplexID());
            insertBorrowRecord.setInt(5, borrowRecord.getCourtID());
            insertBorrowRecord.setDate(3, new java.sql.Date(borrowRecord.getBookingDate().getTime()));

            // insert the new entry, return generated key
            insertBorrowRecord.executeUpdate();
            ResultSet resultSet = insertBorrowRecord.getGeneratedKeys();
            if(resultSet.next()) {
                generatedKey = resultSet.getInt(1);
                borrowRecord.setBookingID(generatedKey);
            }
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
            close();
        }

        return generatedKey;
    }

    public int updateBorrowRecord(Booking borrowRecord) {
        int result = 0;

        // set parameters, then execute updateBorrowRecord
        try {
            updateBorrowRecord.setInt(1, borrowRecord.getUserID());
            updateBorrowRecord.setInt(2, borrowRecord.getComplexID());
            updateBorrowRecord.setInt(5, borrowRecord.getCourtID());
            updateBorrowRecord.setDate(3, new java.sql.Date(borrowRecord.getBookingDate().getTime()));
            updateBorrowRecord.setInt(6, borrowRecord.getBookingID());

            // insert the new entry, return number of rows updated
            result = updateBorrowRecord.executeUpdate();
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
            close();
        }

        return result;
    }

    // Close the database connection
    private void close() {
        try
        {
            connection.close();
        }
        catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
    }
}
