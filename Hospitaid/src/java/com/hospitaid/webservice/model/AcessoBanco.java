package com.hospitaid.webservice.model;

import java.sql.*;

public class AcessoBanco {

    public static String ipRaspberryPi = "10.160.4.132";
    
    public static String user = "lucas";
    public static String password = "pamonha";
    public static String nameClass = "com.mysql.jdbc.Driver";
    public static String url = "jdbc:mysql://localhost/hospitaid";
    public static boolean result = false;
    public static ResultSet resultSet = null;
    public static Statement statement = null;
    public static Connection connection = null;
    

    public static void execute (String comando){
        try {
            Class.forName(nameClass);
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            result = statement.execute(comando);
            resultSet = statement.getResultSet();

        } catch (ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static void endConnection (){
        try {
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    public static void endConnectionSemResultSet (){
        try {
            statement.close();
            connection.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
