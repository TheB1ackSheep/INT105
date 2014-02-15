/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_4;

/**
 *
 * @author INT105
 */
public class Tester {
    public static void main(String[] args) {
        Geometric g1 = new Circle(1);        
        System.out.println(g1.getArea()+"");
        Geometric g2 = new Rectangle(5,4);
        System.out.println(g1.getArea()+"");
        g1 = g2;
        System.out.println(g1.getColor());
    }
}
