/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tut_1;

import helper.DerbyHelper;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author INT105
 */
public class TestBookDB {
    public static void main(String[] args)throws Exception  {
        DerbyHelper db = new DerbyHelper("Library", 1527,"app","app");
        List<String> cmd = Files.readAllLines(Paths.get("DataBook.txt"), StandardCharsets.UTF_8);
        for(String s : cmd){
            List<String> params = Arrays.asList(s.split(","));
            db.executeUpdate("INSERT INTO Book (isbn,bookname,author) VALUES(?,?,?)", params);            
        }
        db.close(); 
    }
   
}
