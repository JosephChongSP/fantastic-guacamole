/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jrago
 */
public class Rectangle {
    private int length, width;
    
    public void setLength(int len){
        this.length = len;
    }//setter method
    
    public void setWidth(int w){
        this.width = w;
    }//setter method
    
    public int getArea(){
        return length * width;
    }//get area
    
    public int getPerimeter(){
        return 2 * (length + width);
    }//get perimeter
    
    public static void main(String[] args){
        Rectangle rl = new Rectangle();
        rl.length = 10;
    }

}//end of class
