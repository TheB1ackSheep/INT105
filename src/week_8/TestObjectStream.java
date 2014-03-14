/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_8;

import helper.NameSupplier;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author INT105
 */
public class TestObjectStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String file ="C://INT105//BankAccount.dat";
        
        try{
            if((new File(file)).exists()){            
                System.out.print("File is already exists. Do you want to write the file? (y/n) : ");
                if(sc.next().toLowerCase().equals("y"))
                    writeFile(file);
                
            }else{
                writeFile(file);
            }
            readFile(file);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    private static void writeFile(String file) throws FileNotFoundException, IOException {
        
        ObjectOutputStream output = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file),1024));
        for(int i=0;i<20;i++){
            BankAccount ba = new BankAccount();
            ba.setId(4051165+i);
            ba.setName(NameSupplier.getName());
            ba.setBalance(Math.random()*10000);
            output.writeObject(ba);
        }
        output.close();        
        System.out.println("The file has been written.");
        
    }
    
    private static void readFile(String file) throws FileNotFoundException, IOException, ClassNotFoundException{
        BufferedInputStream buffered = new BufferedInputStream(new FileInputStream(file),1024);
        ObjectInputStream input = new ObjectInputStream(buffered);
        BankAccount ba = null;
        while(buffered.available() > 0){
            ba = (BankAccount)input.readObject();
            System.out.println(ba);
        }        
            
    }
    
    
}
