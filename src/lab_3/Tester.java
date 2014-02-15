/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab_3;

import java.util.Date;
import lab_2.Address;

/**
 *
 * @author INT105
 */
public class Tester {
    public static void main(String[] args) {
        Address ad = new Address("126 SIT KMUTT", "Soi 48", "Pracha-utit", 
                "Bangmod Thungkru", "Bangkok", 10140);
        String phone[] = {"02-357-1138", "083-111-7294"};
        Customer c = new Customer("Somchai", "Sawhangsri", ad, phone, 
                "somchai@sit.kmutt.ac.th", new Date(1966, 06, 03));
        SavingAccount sa = new SavingAccount(c, 1300);
        System.out.println(c);

        System.out.println(sa);
    }                                                                                                        
}
