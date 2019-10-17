/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsal.practical.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author jrago
 */
public class SquareTest {
    public static void main(String args[]){
        int size;
        String input= JOptionPane.showInputDialog
        (null,"Please enter your salary","Title",JOptionPane.QUESTION_MESSAGE);
        size = Integer.parseInt(input);
        Square s1 = new Square(size);
    }
}
