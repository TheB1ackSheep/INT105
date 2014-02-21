/*
 * Copyright (C) 2014 INT105
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package week_6;

import java.util.Collections;       

/**
 *
 * @author INT105
 */
public class Sorter {

    public static void selectionSort(Comparable[] x) {
        for (int i = 0; i < x.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < x.length; j++) {
                if (x[j].compareTo(x[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swap(x,minIndex,i);
            }

        }
    }
    
    public static void insertionSort(Comparable[] x){
        for(int i=1;i<x.length;i++){
            int j = i-1;
            Comparable tmp = x[i];
            while((j>=0) && x[j].compareTo(tmp)>0){
                x[j+1] = x[j];
                j--;
            }
            x[j+1] = tmp;
        }
    }
    
    public static int binarySearch(Comparable[] x,Comparable key){
        int min=0;
        int max = x.length-1;
        int mid = 0;
        while(min<=max){
            mid = (min+max)/2;
            if(key.compareTo(x[mid])==0)
                return mid;
            else if(key.compareTo(x[mid])>0)
                min = mid+1;
            else
                max = mid-1;            
        }
        return -1;
    }

    private static void swap(Object[] o,int i,int j) {
        Object tmp = o[i];
        o[i] = o[j];
        o[j] = tmp;
    }
}
