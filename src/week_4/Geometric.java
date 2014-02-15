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
abstract class Geometric {
    String color="white";
    public abstract double getArea();
    public abstract double getPaerimeter();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
