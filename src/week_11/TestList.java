/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_11;

import java.util.*;

/**
 *
 * @author INT105
 */
public class TestList {
    public static void main(String[] args) {
        List<Integer> _list = new ArrayList<>();
        List<Integer> _linkedList = new LinkedList<>();
        List<Integer> _stack = new Stack<>();
        for(int i=0;i<10_000_000;i++){
            int tmp = (int)Math.random()*1_000_000;
            _list.add(tmp);
            _linkedList.add(tmp);
            _stack.add(tmp);
        }
        
        long startTime = System.nanoTime();
        _list.remove(10);
        System.out.println("Remove operation for ArrayList used time about "+(System.nanoTime()-startTime));
        
        startTime = System.nanoTime();
        _linkedList.remove(10);
        System.out.println("Remove operation for LinkedList used time about "+(System.nanoTime()-startTime));
        
        startTime = System.nanoTime();
        _stack.remove(10);
        System.out.println("Remove operation for Stack used time about "+(System.nanoTime()-startTime));
        
        startTime = System.nanoTime();
        _list.add(10, 555);
        System.out.println("Insert operation for ArrayList used time about "+(System.nanoTime()-startTime));
        
        startTime = System.nanoTime();
        _linkedList.add(10, 555);
        System.out.println("Insert operation for LinkedList used time about "+(System.nanoTime()-startTime));
        
        startTime = System.nanoTime();
        _stack.add(10, 555);
        System.out.println("Insert operation for Stack used time about "+(System.nanoTime()-startTime));
        
        startTime = System.nanoTime();
        boolean isFound = _list.contains(20);
        System.out.println("Search operation for ArrayList used time about "+(System.nanoTime()-startTime));
        
        startTime = System.nanoTime();
        isFound = _linkedList.contains(20);
        System.out.println("Search operation for LinkedList used time about "+(System.nanoTime()-startTime));
        
        startTime = System.nanoTime();
        isFound = _stack.contains(20);
        System.out.println("Search operation for Stack used time about "+(System.nanoTime()-startTime));
        
        
    }
}
