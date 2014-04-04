/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_12;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author INT105
 */
public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> m1 = new HashMap<>();
        m1.put("ONE", 1);
        m1.put("TWO", 2);
        m1.put("THREE", 3);
        m1.put("FOUR", 4);
        m1.put("FIVE", 5);
        //System.out.println(m1.entrySet());
        Set<Entry<String,Integer>> m2 = m1.entrySet();
        for(Entry e : m2)
            System.out.printf("Key : %-10s Value : %d\n",e.getKey(),e.getValue());
        //System.out.println(m2);
        System.out.println("");
        Collection<Integer> v = m1.values();
        for(Integer i : v){
            System.out.println("Value : "+i);
        }
    }
}
