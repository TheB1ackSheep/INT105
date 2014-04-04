/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_11;

import week_9.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author INT105
 */
public class Customer {
    private int id;
    private String name;
    private String email;
    private int creditLimit;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }
    
    public static Customer findById(int id) throws Exception{
        Customer cust = null;
        
        DerbyHelper db = new DerbyHelper("sample", "app", "app");
        List<String> params = new ArrayList<>();
        params.add(id+"");
        ResultSet res = db.query("SELECT customer_id as id,name,email,credit_limit FROM customer WHERE customer_id=?",params);
        if(res.next()){
            cust = new Customer();
            cust.setId(res.getInt("id"));
            cust.setName(res.getString("name"));
            cust.setEmail(res.getString("email"));
            cust.setCreditLimit(res.getInt("credit_limit"));
        }
        db.close();
        
        return cust;        
    }
    
     public static List<Customer> findByName(String name) throws Exception{
        List<Customer> custs = null;
        Customer cust = null;
        
        DerbyHelper db = new DerbyHelper("sample", "app", "app");
        List<String> params = new ArrayList<>();
        params.add(name+"%");
        ResultSet res = db.query("SELECT customer_id as id,name name,email,credit_limit FROM customer WHERE LCASE(name) like ?",params);
        while(res.next()){            
            cust = new Customer();
            cust.setId(res.getInt("id"));
            cust.setName(res.getString("name"));
            cust.setEmail(res.getString("email"));
            cust.setCreditLimit(res.getInt("credit_limit"));            
            if(custs == null)
                custs = new ArrayList<>();
            custs.add(cust);
                   
        }
        db.close();
        
        return custs;        
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", email=" + email + ", creditLimit=" + creditLimit + '}';
    }
    
}
