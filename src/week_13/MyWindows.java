/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_13;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author INT105
 */
public class MyWindows extends JFrame{

    public MyWindows() throws HeadlessException {
        this("No Title");
    }

    public MyWindows(String title) throws HeadlessException {
        super(title);
        Dimension dim = new Dimension(300,300);
        this.setSize(dim);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        //this.setLocation(500, 300);
        this.setLocationRelativeTo(null); // centered this frame       
        Container ct = this.getContentPane();
//        ct.setLayout(new BorderLayout(50, 50));       
//        ((BorderLayout)ct.getLayout()).setHgap(20);
//        ((BorderLayout)ct.getLayout()).setVgap(20);
//        ct.add(new JButton("East"),BorderLayout.EAST);
//        ct.add(new JButton("North"),BorderLayout.NORTH);
//        ct.add(new JButton("West"),BorderLayout.WEST);
//        ct.add(new JButton("South"),BorderLayout.SOUTH);
//        ct.add(new JButton("Center"),BorderLayout.CENTER);
//        this.setSize(dim);
//        this.repaint();
//        this.add(butt);
        
    }
    
    public static void main(String[] args) throws Exception{
        javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        new MyWindows("Bank System");
    }
    
    
    
    
}
