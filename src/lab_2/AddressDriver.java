/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_2;

/**
 *
 * @author Student LAB
 */
public class AddressDriver {
    public static void main(String[] args) {
        Address addr = new Address();
        addr.setHouseNo("123");
        addr.setSoi("Four");
        addr.setRoad("Five Rd.");
        addr.setDistrict("Six");
        addr.setProvince("Seven");
        addr.setZipCode(88888);
        
        System.out.println(addr);
      
        
    }
}
