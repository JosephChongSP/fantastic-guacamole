/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practical.pkg1.pkg2019;

/**
 *
 * @author jrago
 */
public class Rectangle {
    int width,height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public void setWidth(int w){
        this.width = w;
    }//setter method
    public int getWidth(){
        return width;
    }
    public void setHeight(int hgt){
        this.height = hgt;
    }//setter method
    public int getHeight(){
        return height;
    }
    public int calculateArea(){
        return height * width;
    }//get area
    
}
