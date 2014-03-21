/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import java.sql.*;

/**
 *
 * @author INT105
 */
public class TestDatabase {
    static final String DRIVER = "org.apache.derby.jdbc.ClientDriver";
    static final String URL = "jdbc:derby://localhost:1527/sample;user=app;password=app";
    static Connection conn;
    static Statement state;
    static ResultSet res;
         
    public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        Class.forName(DRIVER).newInstance();
        conn = DriverManager.getConnection(URL);
        state = conn.createStatement();
        res = state.executeQuery("SELECT * FROM customer");
        while(res.next()){
            int id = res.getInt("customer_id");
            String name = res.getString("name");
            String email = res.getString("email");
            String phone = res.getString("phone");
            System.out.printf("%3d %-30s %-35s %-10s\n",id,name,email,phone);
        }
        res.close();
        conn.close();
    }
}
