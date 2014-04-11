/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_13;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author INT105
 */
public class TestFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello, Java");
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton butt = new JButton();
       
        frame.getContentPane().add(butt);
        butt.setText("label");
        butt.setSize(200, 100);
        frame.setLayout(null);
        
    }
}
