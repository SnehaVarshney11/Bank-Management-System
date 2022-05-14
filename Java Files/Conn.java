/*
5 Steps--> 
Register Driver
Create Connection
Create Statement
Execute query
Close Connection
*/

import java.sql.*;

public class Conn {
    static final String DB_URL = "jdbc:mysql://localhost/bankmanagementsystem";
    static final String USER = "root";
    static final String PASS = "Amazon@123";
    Connection connect;
    Statement stmt;
    public Conn(){
        try{
            //Register Driver
            //Class.forName(com.mysql.cj.jdbc.Driver);
            //Create connection
            connect = DriverManager.getConnection(DB_URL, USER, PASS);
            //Create statement
            stmt = connect.createStatement();
        }catch(Exception exception){
            System.out.println(exception);
        }
    }
    public static void main(String[] args){
        Conn c = new Conn();
    }
    
}