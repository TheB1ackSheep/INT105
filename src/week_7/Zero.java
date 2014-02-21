/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_7;

import java.util.Scanner;
/**
 *
 * @author INT105
 */
public class Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.print("Enter value of x (positive only) : ");
        x = sc.nextInt();
        System.out.print("Enter value of y (positive only) : ");
        y = sc.nextInt();
        int a = div(x,y);
        System.out.println(x+"/"+y+"="+a);
    }

    private static int div(int x, int y) {
        return x/y;
    }
    
}
