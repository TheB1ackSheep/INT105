/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_11;

import helper.NameSupplier;
import java.util.*;
/**
 *
 * @author INT105
 */
public class TestSet {
    public static void main(String[] args) {
        Set _set = new HashSet();
        Set _treeSet = new TreeSet();
        
        /*for(int i =0;i<=1_000_000;i++){
            _set.add((int)(Math.random()*1_000_000));
        } 
        
        for(int i =0;i<=1_000_000;i++){
            _treeSet.add((int)(Math.random()*1_000_000));
        } */    
        
        /*Scanner sc = new Scanner(System.in);
        int x=0;
        do{
            System.out.println("Looking for : ");
            x = sc.nextInt();
            long time = System.nanoTime();
            boolean isFound = _treeSet.contains(x);
            long timed = System.nanoTime()- time;
            if(x>0)
                System.out.printf("%s %d %s %d\n",(isFound?"There is ":"There isn't "), x, " in Tree Set using time to search about ",timed);           
            
            time = System.nanoTime();
            isFound = _set.contains(x);
            timed = System.nanoTime()- time;
            if(x>0)
                System.out.printf("%s %d %s %d\n",(isFound?"There is ":"There isn't "), x, " in Hash Set using time to search about ",timed);           
        }while(x>0);*/
        
        
        _treeSet.add(NameSupplier.getName());
        _treeSet.add(NameSupplier.getName());
        _treeSet.add(NameSupplier.getName());
        _treeSet.add(NameSupplier.getName());
        _treeSet.add(NameSupplier.getName());
        
        _set.add(NameSupplier.getName());
        _set.add(NameSupplier.getName());
        _set.add(NameSupplier.getName());
        _set.add(NameSupplier.getName());
        _set.add(NameSupplier.getName());
        
        System.out.println(_treeSet);
        System.out.println(_set);        
        
        _treeSet.retainAll(_set);
        System.out.println(_treeSet);
        
        
        
    }
    
}
