/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_9;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.List;

/**
 *
 * @author INT105
 */
public class DerbyHelper extends DatabaseHelper{

        private static final String DRIVER = "org.apache.derby.jdbc.ClientDriver";
        private static final String URL = "jdbc:derby://";
        

        public DerbyHelper(String db, int port) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException, Exception {
            this(db, port, "", "");
        }
        
        public DerbyHelper(String db, String username, String password) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException, Exception {
            this(db, 1527, username, password);
        }

        public DerbyHelper(String db, int port, String username, String password) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException, Exception {
            this("localhost", port, db, username, password);
        }

        public DerbyHelper(String server, int port, String db, String username, String password) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException, Exception {
            conStr = URL + server + ":" + port + "/" + db;
            this.user = username;
            this.pwd = password;
            this.open();

        }
        
        @Override
        public void open() throws Exception{
            Class.forName(DRIVER).newInstance();
            this.conn = DriverManager.getConnection(this.conStr, this.user, this.pwd);
        }
         public ResultSet query(String sql) throws Exception{
             return query(sql,null);
         }
        @Override
        public ResultSet query(String sql, List<String> params) throws Exception {
            PreparedStatement prep = this.conn.prepareStatement(sql);
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
            PreparedStatement prep = this.conn.prepareStatement(sql);
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
