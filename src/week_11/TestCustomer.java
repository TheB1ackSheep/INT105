/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author INT105
 */
public class TestCustomer {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String input = "";        
        do{
            List<Customer> custs = new ArrayList<>();
            System.out.print("Search customer by id/name :");
            input = sc.next().toLowerCase();
            if(IsNum(input)){
                int id = Integer.parseInt(input);
                Customer c = Customer.findById(id);
                if(c != null)
                    custs.add(c);
            }else{                
                custs = Customer.findByName(input);                
            }
            System.out.printf("========================================================================================\n");
            System.out.printf("%3s %-30s %-30s %s\n","ID","NAME","EMAIL","CREDIT_LIMIT");
            System.out.printf("========================================================================================\n");
            if(custs != null){
                for(Customer c : custs)
                    System.out.printf("%3d %-30s %-30s %d\n",c.getId(),c.getName(),c.getEmail(),c.getCreditLimit());
                System.out.printf("========================================================================================\n");
            }
                
        }while(!input.equals("-1"));        
        
    }
    
    public static boolean IsNum(String input){
        return input.matches("^[0-9]*$");        
    }
}
