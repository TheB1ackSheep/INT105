/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package week_1;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Student LAB
 */
public class DieDriver {

    public static void main(String args[]) {
        Die _die1 = new Die();
        Die _die2 = new Die(1);
        Die _die3 = new Die(2);

        System.out.println(_die1);
        System.out.println(_die2);
        System.out.println(_die3);

        _die1.roll();
        _die2.roll();
        _die3.roll();

        System.out.println(_die1);
        System.out.println(_die2);
        System.out.println(_die3);
        int count = 0;
        for (int i = 0; i <= 9; i++) 
            for (int j = 0; j <= 9; j++) 
                for (int k = 0; k <= 9; k++) 
                    if (i % 2 == 0 && k % 2 == 0) 
                        System.out.println("[" + (++count) + "] " + i + "" + j + "" + k);
    }
}
