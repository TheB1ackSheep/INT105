/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_13;

import java.awt.*;
import javax.swing.*;

public class MicrowaveOven extends JFrame {

    JPanel p1,p2;
    JButton b1;
    JTextField t1;
    static Thread th;
    
    public MicrowaveOven() throws HeadlessException {        
        super("The Front View of Microwave Oven");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);
        
        getContentPane().add(new JButton("Food to be placed here."),BorderLayout.WEST);
                
        
        p1 = new JPanel();
        p1.setLayout(new GridLayout(4,3,5,5));
        for(int i=0;i<9;i++)
            p1.add(new JButton(i+""));
        p1.add(new JButton("0"));
        p1.add(new JButton("Start"));
        p1.add(new JButton("Stop"));
        
        p2 = new JPanel(new BorderLayout(0,5));
        t1 = new JTextField();
        t1.setEditable(false);
        t1.setText("Time to be display it.");
        p2.add(t1,BorderLayout.NORTH);
        p2.add(p1,BorderLayout.SOUTH);
        
        getContentPane().add(p2,BorderLayout.EAST);
        
        pack();
                
    }
    
    
    
    public static void main(String[] args) {
        MicrowaveOven ov = new MicrowaveOven();       
    }
    
}
