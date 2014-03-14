/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author INT105
 */
public class FileDem {
    public static void main(String[] args){
        File _file = new File("C:\\INT105\\dog.txt");
        File _file2 = new File("C:\\INT105\\dog.new");
        try{
            Scanner sc = new Scanner(_file);
            FileWriter fw = new FileWriter(_file2);
            while(sc.hasNext()){
                fw.write(sc.next()+"\r\n");
            }
            fw.close();
            System.out.println("Write COmplete !");
        }catch(FileNotFoundException ex){
            System.out.println("---------------------------------------------");
            System.out.println("File \""+_file.getPath()+"\" do not exists");
            System.out.println("---------------------------------------------");
        } catch (IOException ex) {
            
        }        
    }
}
