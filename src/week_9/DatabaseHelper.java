/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week_9;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author INT105
 */

public abstract class DatabaseHelper implements Database{
        protected Connection conn = null;
        protected Statement state = null;
        protected ResultSet res = null;
        protected String conStr;
        protected String user;
        protected String pwd;
        
      
}

    
