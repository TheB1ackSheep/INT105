/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_5;


/**
 *
 * @author INT105
 */
public class Circle extends Geometric{
    private String color = "Cir";
    private int rad;

    public Circle() {
        
    }
    
    public String getColor(){
        return color;
    } 

    public void setColor(String color){
        this.color = color;
    }
    
    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }

    public Circle(int rad) {
        this.rad = rad;
    }   
    
    @Override
    public double getArea() {
        return Math.PI*rad*rad;
    }

    @Override
    public double getPaerimeter() {
        return 2*Math.PI*rad;
    }

    @Override
    public String toString() {
        return "Circle{" + "area=" + getArea()+'}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Circle)
            if(((Circle)obj).rad == rad)
                return true;
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.rad;
        return hash;
    }

    @Override
    public int compareTo(Geometric o) {
        if(o instanceof Circle){            
            Circle cir = (Circle)o;
            if(this.rad == cir.rad)
                return 0;
            else if(this.rad < cir.rad)
                return -1;
            else return 1;
        }
        return 1;
    }
    
    
    
}
