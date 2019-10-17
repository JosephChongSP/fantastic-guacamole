/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author jrago
 */
public class Meeps {
    public static void main(String[]args){
        
        nPrintln("Welcome to Java", 5);
        
    }
public static void nPrintln(String message, int n) {  
  
  for (int i = 0; i < n; i++) {
     System.out.println(message);
  }

}

}
