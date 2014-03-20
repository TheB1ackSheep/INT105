package test;

import java.sql.*;

/**
 * Created with IntelliJ IDEA.
 * User: Falook
 * Date: 3/20/14
 * Time: 11:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestDatabase {
    static final String DRIVER = "org.apache.derby.jdbc.ClientDriver";
    static final String URL = "jdbc:derby://localhost:1527/sample;user=app;password=app";
    static Connection conn;
    static Statement state;
    static ResultSet res;

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        Class.forName(DRIVER).newInstance();
        conn = DriverManager.getConnection(URL);
        state = conn.createStatement();
        res = state.executeQuery("SELECT * FROM customer");

        while(res.next()){
            int id = res.getInt("customer_id");
            String name = res.getString("name");
            String email = res. getString("email");
            String phone = res.getString("phone");
            System.out.printf("%3d %-27s %-33s %-10s\n",id,name,email,phone);
        }
        res.close();
        conn.close();
    }

}
