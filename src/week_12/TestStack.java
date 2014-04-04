/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_12;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 *
 * @author INT105
 */
public class TestStack {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File fin = new File("C:\\INT105\\javahelp.txt");
        if(!fin.exists())
            System.out.println(fin.getPath()+" does not exists.");
        else{
            Stack<String> st = new Stack<>();
            BufferedReader br = new BufferedReader(new FileReader(fin));
            String line = br.readLine();
            while(line != null){
                StringTokenizer stk = new StringTokenizer(line," .,:;()\"/");
                while(stk.hasMoreTokens()){
                    String tmp = stk.nextToken();
                    st.push(tmp);
                }
                line = br.readLine();
            }
            
            int c =1;
            while(!st.isEmpty()){
                System.out.printf("%-30s",st.pop());
                if(c++%5==0)
                    System.out.println();
            }
        }
    }
}
