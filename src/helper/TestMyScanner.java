/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package helper;

/**
 *
 * @author Falook
 */
public class TestMyScanner {
    public static void main(String[] args) {
        MyScanner msc = new MyScanner();
        int tmp = msc.nextInt("Enter your number : ", false);
        System.out.println(tmp);
                
    }
}
