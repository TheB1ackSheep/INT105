/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_9;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import week_9.DatabaseHelper.*;

/**
 *
 * @author INT105
 */
public class TestMySQL {
    public static void main(String[] args) throws Exception {
        DatabaseHelper db = null;  
        try {
            db = new MySQLHelper("localhost",3311, "sample","root", "root");
            String sql = "SELECT * FROM customer";
            ResultSet rs = db.query(sql, null);
            while(rs.next()){
                int id = rs.getInt("customer_id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String phone = rs.getString("phone");
                System.out.printf("%4d %-27s %-33s %s\n",id,name,email,phone);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally{
            try {
                if(db != null)
                    db.close();
            } catch (Exception ex) {
                 System.err.println(ex.getMessage());
            }
        }
    }
}
