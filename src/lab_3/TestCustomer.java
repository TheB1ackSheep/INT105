package lab_3;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import helper.NameSupplier;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import lab_2.Address;

/**
 *
 * @author Student LAB
 */
public class TestCustomer {

    private static int NO_OF_CUSTOMER = 20;

    public static void main(String[] args) {

        Customer[] custs = new Customer[NO_OF_CUSTOMER];
        Random r = new Random();
        Address ad = new Address();
        ad.setHouseNo("126 SIT, KMUTT");
        ad.setSoi("48");
        ad.setRoad("Pracha-utit");
        ad.setDistrict("Thungkru Bangmod");
        ad.setProvince("Bangkok");
        ad.setZipCode(10140);
        for (int i = 0; i < NO_OF_CUSTOMER; i++) {
            custs[i] = new Customer();
            custs[i].setCustName(NameSupplier.getName());
            custs[i].setCustSurname(NameSupplier.getSurname());
            custs[i].setCustEmail(NameSupplier.getName() + "@sit.kmutt.ac.th");
            custs[i].setCustPhone(0, "0" + (int) (Math.random() * 10000000));
            custs[i].setCustPhone(1, "0" + (int) (Math.random() * 10000000));
            Calendar cd = new GregorianCalendar(2014 - (r.nextInt(15) + 15),
                    r.nextInt(12) + 1, r.nextInt(30) + 1);
            custs[i].setCustBirth(cd.getTime());
           custs[i].setCustAdd(ad);
        }
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd MMMM yyyy");
        for (Customer c : custs) {
            System.out.printf("%5d %-22s %-20s %-25s %s\n.... %s\n",
                    c.getCustId(), c.getCustName() + " " + c.getCustSurname(),
                    c.getCustPhone(0) + ", " + c.getCustPhone(1),
                    c.getCustEmail(), sdf.format(c.getCustBirth()), c.getCustAdd());
        }

    }
}
