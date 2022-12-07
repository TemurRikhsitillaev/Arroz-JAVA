package main.models.complexes;

import java.math.BigDecimal;
import java.sql.*;
import java.util.*;

public class ComplexesQueries {
    private static final String URL = "jdbc:derby:../../resources/db/db";
    private Connection connection;
    private PreparedStatement selectComplexData;
    private PreparedStatement selectOneRow;
    public PreparedStatement selectComplexID;
    private PreparedStatement selectComplexName;
    private PreparedStatement selectComplexAddress;
    private PreparedStatement selectComplexPhoneNumber;
    private PreparedStatement selectComplexPrice;
    private PreparedStatement selectComplexTimeOpen;
    private PreparedStatement selectComplexTimeClose;

    private PreparedStatement insertComplex;

    public ComplexesQueries(){
        try{
            selectComplexData = connection.prepareStatement("SELECT * FROM complexes");
            insertComplex = connection.prepareStatement("INSERT INTO complexes (name, address, phone-number, price, open-at, close-at) VALUES(?,?,?,?,?,?)");

            selectOneRow = connection.prepareStatement("SELECT * FROM complexes LIMIT 1");
            selectComplexID = connection.prepareStatement("SELECT")

        }catch (SQLException sqlException){
            sqlException.printStackTrace();
            System.exit(1);
        }
    }
}
