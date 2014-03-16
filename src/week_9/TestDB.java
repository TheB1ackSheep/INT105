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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author INT105
 */
public class TestDB {
    public static void main(String[] args) {   
        DurbyHelper db = null; 
        try {
            db = new DurbyHelper("sample", "app", "app");
            String sql = "SELECT * FROM customer WHERE customer_id>?";
            List<String> params = new ArrayList<>();
            params.add("1");
            ResultSet rs = db.query(sql, params);
            while(rs.next()){
                int id = rs.getInt("customer_id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String phone = rs.getString("phone");
                System.out.printf("%4d %-27s %-33s %s\n",id,name,email,phone);
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }finally{
            try {
                if(db != null)
                    db.close();
            } catch (SQLException ex) {
                 System.err.println(ex.getMessage());
            }
        }
        
        
        
        
        
    }

    public TestDB() {
    }
}
