/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jrago
 */
public class TrapeziumUser {
    public static void main(String[]args){
        System.out.println("Trapezium class program started.\n");
        
        Trapezium t1 = new Trapezium(6, 5, 4);
        System.out.println("This trapezium has base value "+ t1.getBase());
        System.out.println("This trapezium has top value "+ t1.getTop());
        System.out.println("This trapezium has height value "+ t1.getHeight());
        System.out.println("The area of the trapezium is "+ t1.getArea());
        System.out.println("");
        System.out.println("Trapezium class program terminated.");
        
    }

}
