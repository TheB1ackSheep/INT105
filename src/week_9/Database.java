/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_9;

import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author INT105
 */
public interface Database{
    public void open() throws Exception;
    public void close() throws Exception;
    
    public ResultSet query(String sql, List<String> params) throws Exception;
    public int executeUpdate(String sql, List<String> params)  throws Exception;
}
