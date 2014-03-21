/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_9;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author INT105
 */
public class MySQLHelper extends DatabaseHelper{
        
    private static final String DRIVER = "com.mysql.jdbc.Driver";
        private static final String URL = "jdbc:mysql://";

        public MySQLHelper(String db, int port) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException, Exception {
            this(db, port, "", "");
        }

        public MySQLHelper(String db, int port, String username, String password) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException, Exception {
            this("localhost", port, db, username, password);
        }

        public MySQLHelper(String server, int port, String db, String username, String password) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException, Exception {
            conStr = URL + server + ":" + port + "/" + db;
            user = username;
            pwd = password;
            open();
        }
        
        @Override
        public void open() throws Exception{
            Class.forName(DRIVER).newInstance();
            conn = DriverManager.getConnection(conStr, user, pwd);
        }
         public ResultSet query(String sql) throws Exception{
             return query(sql,null);
         }
        @Override
        public ResultSet query(String sql, List<String> params) throws Exception {
            PreparedStatement prep = conn.prepareStatement(sql);
            if (params != null) {
                for (int i = 1; i <= params.size(); i++) {
                    prep.setString(i, params.get(i - 1));
                }
            }
            res = prep.executeQuery();
            return res;
        }

        @Override
        public int executeUpdate(String sql, List<String> params) throws Exception {
            PreparedStatement prep = conn.prepareStatement(sql);
            if (params != null) {
                for (int i = 1; i <= params.size(); i++) {
                    prep.setString(i, params.get(i));
                }
            }
            return prep.executeUpdate();
        }

        @Override
        public void close() throws Exception {
            if (res != null && !res.isClosed()) {
                res.close();
            }
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        }
    
}
