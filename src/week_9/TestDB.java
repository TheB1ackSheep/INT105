/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_9;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author INT105
 */
public class TestDB {
    public static void main(String[] args) throws SQLException{        
        DatabaseHelper db = new DatabaseHelper("sample", "app", "app");
        ResultSet rs = db.query("SELECT * FROM customer", null);
        while(rs.next()){
            int id = rs.getInt("customer_id");
            String name = rs.getString("name");
            String email = rs.getString("email");
            String phone = rs.getString("phone");
            System.out.printf("%4d %-27s %-33s %s\n",id,name,email,phone);
        }
        db.close();
        
        
    }
}
