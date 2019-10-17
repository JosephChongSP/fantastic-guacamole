/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jrago
 */
/*public class Trapezium {
    public double base, top, height;
    
    public void setBase(double base){
        this.base = base;
    }//setter method
    
    public void setTop(double top){
        this.top = top;
    }//setter method
    
    public void setHeight(double height){
        this.height = height;
    }//setter method
    
    public double getArea(){
        return (base + top) * height / 2;
    }//get area

}*/

public class Trapezium {
    public double base, top, height;
    
    public void setBase(double base, double top, double height){
        this.base = base;
        this.top = top;
        this.height = height;
    }//overloaded constructor
        
    public Trapezium(){
        this(1, 1, 1);
    }
    
    public double getBase(){
        return base;
    }
    public double getTop(){
        return top;
    }
    public double getHeight(){
        return height;
    }
    
    public double getArea(){
        return (base + top) * height / 2;
    }//get area

}