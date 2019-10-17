/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author jrago
 */
public class Practical2Q6 {
    public static void main(String[] args){
        String input = JOptionPane.showInputDialog(null,
                "Enter 1st number",
                "First number",
                JOptionPane.QUESTION_MESSAGE);
        int num1 = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog(null,
                "Enter 2nd number",
                "Second number",
                JOptionPane.QUESTION_MESSAGE);
        int num2 = Integer.parseInt(input);
        
        int sum = num1 + num2;
        boolean isDivisible; 
        isDivisible = num1 % num2 == 0;
        
        JOptionPane.showMessageDialog(null,
                num1 + " + " + num2 + " = " + sum,
                "Answer",
                JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null,
                num1 + " is divisible by " + num2 + "? " + isDivisible,
                "Answer",
                JOptionPane.INFORMATION_MESSAGE);
    }
    
}
