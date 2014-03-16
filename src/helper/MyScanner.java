/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package helper;

import java.util.Scanner;

/**
 *
 * @author Falook
 * @param <N>
 */
public class MyScanner{
    private Scanner sc;
    private static final String MSG = "-----------------------------------------\nYour input is invalid. Please try again !\n-----------------------------------------";

    public MyScanner() {
        this.sc = new Scanner(System.in);
    }
    
    public int nextInt(){
        int ren = 0;
        while(ren==0){
            String tmp = sc.next();
            try{
                ren = Integer.parseInt(tmp);
            }catch(NumberFormatException ex){
                printException();
            }
        }
        return ren;
    }
    public int nextInt(String msg,boolean newLine){
        int ren = 0;
        while(ren==0){
            if(newLine)
                System.out.println(msg);
            else
                System.out.print(msg);
            String tmp = sc.next();
            try{
                ren = Integer.parseInt(tmp);
            }catch(NumberFormatException ex){
                printException();
            }
        }
        return ren;
    }
    
    public float nextFloat(){
        float ren = 0;
        while(ren==0){
            String tmp = sc.next();
            try{
                ren = Float.parseFloat(tmp);
            }catch(NumberFormatException ex){
                printException();
            }
        }
        return ren;
    }
    public float nextFloat(String msg,boolean newLine){
        float ren = 0;
        while(ren==0){
            if(newLine)
                System.out.println(msg);
            else
                System.out.print(msg);
            String tmp = sc.next();
            try{
                ren = Float.parseFloat(tmp);
            }catch(NumberFormatException ex){
                printException();
            }
        }
        return ren;
    }
    
    public double nextDouble(){
        double ren = 0;
        while(ren==0){
            String tmp = sc.next();
            try{
                ren = Double.parseDouble(tmp);
            }catch(NumberFormatException ex){
                printException();
            }
        }
        return ren;
    }
    public double nextDouble(String msg,boolean newLine){
        double ren = 0;
        while(ren==0){
            if(newLine)
                System.out.println(msg);
            else
                System.out.print(msg);
            String tmp = sc.next();
            try{
                ren = Double.parseDouble(tmp);
            }catch(NumberFormatException ex){
                printException();
            }
        }
        return ren;
    }
    
    private void printException(){
        System.err.println(MSG);
    }
    
}
