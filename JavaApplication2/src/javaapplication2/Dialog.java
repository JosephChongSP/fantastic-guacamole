/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import javax.swing.JOptionPane;

/**
 *
 * @author jrago
 */


public class Dialog {
    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(
                null,
                "This is my first dialog box");
        JOptionPane.showMessageDialog(
        null,
                "I Love Java!",
                "Practical02 (Part1) Q6",
                JOptionPane.INFORMATION_MESSAGE);
    }
}//end of class
