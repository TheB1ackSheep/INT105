/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_4;

/**
 *
 * @author INT105
 */
class A {
    int x = 500;
    int a=1;
    public void printa(){
        System.out.println("a = "+a);
    }
}
class B extends A{
    String x = "Somchai";
    int b = 2;
    public void printb(){
        System.out.println("a = "+a+"\nb= "+b);
    }
}
class C extends A{
    int c = 3;
    public void printc(){
        System.out.println("a = "+a+"\nc = "+c);
    }
}
class D extends B{
    int d = 4;
    public void printd(){
        System.out.println("a = "+a+"\nb= "+b+"\nd = "+d);
    }
}
class Z{
    public static void main(String[] args) {
        A a1;
        B b1;
        C c1;
        D d1;
        a1 = new B();
        b1 = new B();

        //System.out.println(a1.x);
        //System.out.println(b1.x);
        
        
        
        
    }
}
