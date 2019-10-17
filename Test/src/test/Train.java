/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

/**
 *
 * @author jrago
 */
public class Train {
    public Train(){
        TrainCarriage tc1 = new TrainCarriage("economy");
        TrainCarriage tc2 = new TrainCarriage("business");
        TrainCarriage tc3 = new TrainCarriage("firstClass");
        
        tc3.setNext(tc2);
        tc2.setNext(tc1);
    }
    
    public static void main(String[] args){
        Train t = new Train();
    }
}
