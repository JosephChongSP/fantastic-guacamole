/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsal.practical.pkg2;

/**
 *
 * @author jrago
 */
public class Square {
    private int size;
    public Square(){
        
    }
    public Square(int s){
        size=s;
    }
    public void setSize(int s){
        if(size<=0){
            
        }else{
            size=s;  
        }
    }
    public int getSize(){
        return size;
    }
    public void draw(){
        int i;
        for (i = 0; i < size; i++) {	 
            for (i = 0; i < size; i++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
