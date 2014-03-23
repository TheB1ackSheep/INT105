/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author INT105
 */
public class JDBCStepByStep {
    public static final String DRIVER = "org.apache.derby.jdbc.ClientDriver";
    public static final String URL = "jdbc:derby://localhost:1527/sample";
    public static void main(String[] args) {
        try {
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(URL,"app","app");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter you id to update NAME : ");
            int cId = sc.nextInt();
            sc.nextLine();
            
            System.out.println("Change NAME to : ");
            String newName = sc.nextLine();
            
            String sql = "UPDATE customer SET name=? WHERE customer_id=?";
            
            PreparedStatement prep = conn.prepareStatement(sql);
            prep.setString(1, newName);
            prep.setString(2, cId+"");
                    
            int x =prep.executeUpdate();
            System.out.println("update "+x+" record(s)");
            
            
            
                    
            
        } catch (ClassNotFoundException ex) {
            System.err.println(ex);
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }
}
