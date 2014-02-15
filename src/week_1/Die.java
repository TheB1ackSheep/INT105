/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package week_1;

/**
 *
 * @author Student LAB
 */
public class Die {
    public final static int MAX = 6;
    private int faceValue = 1;
    
    public int getFaceValue(){
        return this.faceValue;
    }
    public void setFaceValue(int value){
        this.faceValue = value;
    }
    
    public Die(){
        this(1);
    }
    public Die(int value){
        if(value>1 && value<=MAX)
            this.setFaceValue(value);        
    }
    public void roll(){
        int ran = (int)(Math.random()*MAX)+1;
        this.setFaceValue(ran);
    }

    @Override
    public String toString() {
        return "Die{" + "faceValue=" + faceValue + '}';
    }
    
    
}
