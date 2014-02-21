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
