/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 *
 * @author INT105
 */
public class TestFreq {
    public static void main(String[] args)throws Exception {
         File fin = new File("C:\\INT105\\javahelp.txt");
        if(!fin.exists())
            System.out.println(fin.getPath()+" does not exists.");
        else{
            HashMap<String,Integer> hm = new HashMap<>();
            BufferedReader br = new BufferedReader(new FileReader(fin));
            String line = br.readLine();
            while(line != null){
                StringTokenizer stk = new StringTokenizer(line," .,:;()\"/");
                while(stk.hasMoreTokens()){
                    String tmp = stk.nextToken();
                    if(hm.containsKey(tmp))
                        hm.put(tmp, hm.get(tmp)+1);
                    else
                        hm.put(tmp, 1);
                }
                line = br.readLine();
            }
            
            int c =1;
            for(String s : hm.keySet()){
                System.out.printf("%-10s => %d\n",s,hm.get(s));
            }
        }
    }
   
}
