/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_9;

/**
 *
 * @author INT105
 */
public class TestCustomer {
    public static void main(String[] args) throws Exception {
        Customer target = Customer.findById(1);
        System.out.println(target);
    }
}
