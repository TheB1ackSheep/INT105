/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_9;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author INT105
 */
public class DatabaseHelper {
    private Connection connect = null;
    private Statement statement = null;
    private ResultSet resultSet = null;
    private static final String DRIVER = "org.apache.derby.jdbc.ClientDriver";
    private static final String URL = "jdbc:derby://localhost:1527/";
    private String conStr;
    private String path;
    private String username;
    private String password;
    
    public DatabaseHelper(String path,String username,String password){
        try{
            conStr = URL+path;
            if(!(new File(path)).exists()){
                conStr +=";create=true";
            }
            if(username != null){
                conStr += ";user="+username;
            }
            if(password != null){
                conStr += ";password="+password;
            }
            Class.forName(DRIVER).newInstance();
            connect = DriverManager.getConnection(conStr);
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public ResultSet query(String sql,List<String> params) throws SQLException{
        try{
            statement = connect.createStatement();
            PreparedStatement prep = connect.prepareStatement(sql);            
            if(params != null){
                for(int i=1;i<=params.size();i++)
                    prep.setString(i, params.get(i));
            }
            resultSet = prep.executeQuery();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return resultSet;
    }
    
    public void close() throws SQLException{
        if(!resultSet.isClosed())
            resultSet.close();
        if(!connect.isClosed())
            connect.close();
    }
    
}
