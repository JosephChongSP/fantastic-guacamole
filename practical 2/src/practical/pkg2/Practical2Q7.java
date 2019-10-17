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
public class Practical2Q7 {
    public static void main (String[] args){
        String input = JOptionPane.showInputDialog(null,
                "Enter temperature in Fahrenheit",
                "Input",
                JOptionPane.QUESTION_MESSAGE);
        double fahrenheit = Double.parseDouble(input);
        double celsius = (fahrenheit - 32)* 5/9;
        JOptionPane.showMessageDialog(null,
                "Temperature in Celsius: "+celsius,
                "Message",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
