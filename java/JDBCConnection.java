package com.sapient.day5;

import java.sql.*;

public class JDBCConnection {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // Create a variable for the connection string.
        // String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
        //       "databaseName=AdventureWorks;integratedSecurity=true;";
        // jdbc:sqlserver://localhost;user=MyUserName;password=*****;


        // Declare the JDBC objects.
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {

            // Establish the connection.\

            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/world","root","12345");
            // stmt=con.createStatement();


            // Create and execute an SQL statement that returns a
            // set of data and then display it.
            String SQL = "SELECT * FROM city;";

            String SqlCreateCatalog =" Create Table Catalog2 ( Title Varchar(256) Primary Key Not Null, LeadActor Varchar(256) Not Null, LeadActress Varchar(256) Not Null, Type Varchar(20) Not Null, ReleaseDate Date Not NULL );";
            stmt = con.createStatement();
//            rs = stmt.executeQuery(SQL);
             int CreateResult = stmt.executeUpdate(SqlCreateCatalog);
//            displayRow("City", rs);
        }

        // Handle any errors that may have occurred.
        catch (Exception e) {
            e.printStackTrace();
        }

        finally {
            if (rs != null) try { rs.close(); } catch(Exception e) {}
            if (stmt != null) try { stmt.close(); } catch(Exception e) {}
            if (con != null) try { con.close(); } catch(Exception e) {}
        }
    }

    private static void displayRow(String title, ResultSet rs) {
        try {
            System.out.println(title);
            while (rs.next()) {
                //  System.out.println(rs.getString("ProductNumber") + " : " + rs.getString("Name"));
                // CITY Name
                System.out.println(rs.getString(1) + " : " + rs.getString(2)+ " :  " +rs.getString(3));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

