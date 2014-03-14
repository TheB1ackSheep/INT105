/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_8;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author INT105
 */
public class TestFileStream {
    final static String PATH = "C:/INT105/";
    public static void main(String[] args){
        //Local var declaration
        Scanner sc = new Scanner(System.in);
        String src,dst;
        
        if(args.length < 2){
            //User inout interface
            System.out.println("==============================================");
            System.out.println("=                 Copy File                  =");
            System.out.println("==============================================");
            System.out.print("Please select your source file : ");
            src = PATH+sc.next();

            if((new File(src)).exists()){
                try{
                System.out.print("Please select your destination file : ");
                dst = PATH+sc.next();         
                    byte[] buffer = readFile(src);
                    for(int i=0;i<buffer.length;i++){
                        System.out.printf("0x%02X ",buffer[i]);
                        if((i+1)%15==0)
                            System.out.printf("\n");
                    }
                    System.out.println("");    
                    writeFile(buffer,dst);
                    System.out.println("File has been copy to "+dst);
                }catch(IOException ex){
                    ex.printStackTrace();
                }
            }else{
                System.out.println("The source file is not exists.");
            }
        }else{
            src = args[0];
            dst = args[1];
            if((new File(src)).exists()){                
                try{
                    byte[] buffer = readFile(src);
                    writeFile(buffer, dst);
                    System.out.println("The file has been copied to \""+dst+"\"");
                }catch(IOException ex){
                    ex.printStackTrace();
                }
            }else{
                System.err.println("The file is not exists");
            }
        }
        
    }

    private static byte[] readFile(String src) throws FileNotFoundException, IOException {
        FileInputStream input = new FileInputStream(src);
        byte[] b = new byte[input.available()];
        input.read(b);
        return b;        
    }
    
    private static void writeFile(byte[] b,String dst) throws FileNotFoundException, IOException{
        FileOutputStream output = new FileOutputStream(dst);
        output.write(b);
        output.close();
    }
    
    
}
