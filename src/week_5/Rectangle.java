/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_5;

import week_4.*;

/**
 *
 * @author INT105
 */
public class Rectangle extends Geometric {
    private double width,height;
    String color = "Rec";

    public Rectangle() {
        this(1,1);
    }
    

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }  
    
     public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    
    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getPaerimeter() {
        return 2*width+2*height;            
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", height=" + height + '}';
    }

   
   
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Rectangle other = (Rectangle) obj;
        if (Double.doubleToLongBits(this.width) != Double.doubleToLongBits(other.width)) {
            return false;
        }
        if (Double.doubleToLongBits(this.height) != Double.doubleToLongBits(other.height)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.width) ^ (Double.doubleToLongBits(this.width) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.height) ^ (Double.doubleToLongBits(this.height) >>> 32));
        return hash;
    }

    
    
    
    
}
