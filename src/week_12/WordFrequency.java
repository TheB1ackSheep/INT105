/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;

/**
 *
 * @author INT105
 */
public class WordFrequency {
    public static void main(String[] args)throws Exception {
         File fin = new File("C:\\INT105\\javahelp.txt");
        if(!fin.exists())
            System.out.println(fin.getPath()+" does not exists.");
        else{
            Map<String,WordCount> m1 = new TreeMap<>();
            BufferedReader br = new BufferedReader(new FileReader(fin));
            String line = br.readLine();
            while(line != null){
                StringTokenizer stk = new StringTokenizer(line," .,:;()\"/-[]{}");
                while(stk.hasMoreTokens()){
                    String tmp = stk.nextToken();
                    WordCount wc = m1.get(tmp);
                    if(wc == null){
                        wc = new WordCount();
                        wc.setWord(tmp);
                        m1.put(tmp, wc);
                    }else{
                        wc.inc();
                        m1.put(tmp, wc);
                    }
                }
                line = br.readLine();
            }
            
            int c =1;
            List<WordCount> words = new ArrayList<>(m1.values());      
            Collections.sort(words,new AscWordFrequencyByWord());
            for(WordCount w : words){
                System.out.printf("%20s = %-10d",w.getWord(),w.getCount());
                if(c++%4==0)
                    System.out.println();
            }
        }
    }
    
    private static class AscWordFrequencyByCount implements Comparator<WordCount>{

        @Override
        public int compare(WordCount o1, WordCount o2) {
            return o1.getCount() - o2.getCount();
        }
        
    }
    
     private static class AscWordFrequencyByWord implements Comparator<WordCount>{

        @Override
        public int compare(WordCount o1, WordCount o2) {
            return o1.getWord().compareTo(o2.getWord());
        }
        
    }
     
      private static class DscWordFrequencyByWord implements Comparator<WordCount>{

        @Override
        public int compare(WordCount o1, WordCount o2) {
            return -o1.getWord().compareTo(o2.getWord());
        }
        
    }
    
}
