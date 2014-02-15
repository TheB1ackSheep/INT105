/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_2;

import java.util.Date;
import lab_1.Customer;
import helper.*;

/**
 *
 * @author Student LAB
 */
public class BankAccountDriver {
    public static void main(String[] args) {
        AddressSupplier as = new AddressSupplier();
        BankAccount ba1 = new BankAccount(0, new Date(),
                new Customer(NameSupplier.getName()+" "+NameSupplier.getSurname(),
                new Address(as.getNo(), as.getSoi(), as.getRoad(), as.getDistrict(), as.getProvince(),as.getZipCode()),                
                new String[]{"0868316304"}, "123@123.com", new Date(1994, 6, 11)));
        BankAccount ba2 = new BankAccount(0, new Date(),
                new Customer(NameSupplier.getName()+" "+NameSupplier.getSurname(),
                new Address(as.getNo(), as.getSoi(), as.getRoad(), as.getDistrict(), as.getProvince(),as.getZipCode()),                
                new String[]{"0868316304"}, "123@123.com", new Date(1994, 6, 11)));
        
        System.out.println(ba1);
        System.out.println(ba2);

    }
}
