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

import helper.NameSupplier;
import week_5.Circle;

/**
 *
 * @author INT105
 */
public class Tester {
    public static void main(String[] args) {
        String[] str = new String[15];
        for(int i=0;i<str.length;i++)
            str[i] = NameSupplier.getName();
        print(str);
        Sorter.selectionSort(str);
        print(str);
        
        Circle[] cir = new Circle[15];
        for(int i=0;i<cir.length;i++){
            cir[i] = new Circle();
            cir[i].setRad((int)(Math.random()*15));
        }
        print(cir);
        Sorter.insertionSort(cir);
        print(cir);
        
        int key = Sorter.binarySearch(str,"ABIGAIL");
        System.out.println(key+"");
    }
    public static void print(Object[] x){
        for(int i=0;i<x.length;i++)
            System.out.printf("%-12s %s",x[i].toString(),(i+1)%5==0?"\n":"\t");
        System.out.println("--------------------------------\n");
    }
}
