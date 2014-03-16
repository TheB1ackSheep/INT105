/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author INT105
 */
public class DurbyHelper {
    private Connection connect = null;
    private Statement statement = null;
    private ResultSet resultSet = null;
    private static final String DRIVER = "org.apache.derby.jdbc.ClientDriver";
    private static final String URL = "jdbc:derby://";
    public static boolean DEBUG = false;
    private String conStr;
    private String db;
    private String username;
    private String password;
    
    public DurbyHelper(String db,String username,String password)throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        this("localhost",1527,db,username,password);
    }
    
    public DurbyHelper(String server,String db,String username,String password)throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        this(server,1527,db,username,password);
    }
    
    public DurbyHelper(String server,int port,String db,String username,String password) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        
        
            conStr = URL+server+":"+port+"/"+db;
            if(username != null){
                conStr += ";user="+username;
            }
            if(password != null){
                conStr += ";password="+password;
            }      
            Class.forName(DRIVER).newInstance();      
            connect = DriverManager.getConnection(conStr);   
        
    }
    
    
    
    public ResultSet query(String sql,List<String> params) throws SQLException{
        try{      
            statement = connect.createStatement();      
            PreparedStatement prep = connect.prepareStatement(sql);            
            if(params != null){          
                for(int i=1;i<=params.size();i++)
                    prep.setString(i, params.get(i-1));
            }      
            resultSet = prep.executeQuery();      
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return resultSet;
    }
    
    public void execute(String sql,List<String> params){
        try{      
            statement = connect.createStatement();                  

            PreparedStatement prep = connect.prepareStatement(sql);            
            if(params != null){          
                for(int i=1;i<=params.size();i++)
                    prep.setString(i, params.get(i));
            }      
            prep.execute();      
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public void close() throws SQLException{
        if(!resultSet.isClosed())
            resultSet.close();
        if(!connect.isClosed())
            connect.close();
    }  
}
