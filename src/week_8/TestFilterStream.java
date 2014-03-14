/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_8;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author INT105
 */
public class TestFilterStream {
    final static String PATH = "C:\\INT105\\";
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String file = PATH+"text.txt" ,data = "";
        
        //User inout interface
        System.out.println("==============================================");
        System.out.println("=               Filter Stream                =");
        System.out.println("==============================================");
        System.out.println("The file that you've been written is located at \"C:\\INT105\\text.txt\"");   
        
        
        try {
            writeFile(file);
            readFile(file);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }

    private static void writeFile( String file) throws FileNotFoundException, IOException {
        DataOutputStream output = new DataOutputStream(new FileOutputStream(file));
        /*for(int i=0;i<1000;i++){
            output.writeInt(i);
        }*/
        output.writeDouble(15.625d);
        output.close();
    }

    private static void readFile(String file) throws FileNotFoundException, IOException {
        DataInputStream input = new DataInputStream((new FileInputStream(file)));
        for(int i=0;input.available() > 0;i++){
            System.out.printf("%-4s",input.readDouble()+" ");
            if((i+1)%15==0)
                System.out.println();
        }
    }
    
   
}
