/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 import javax.swing.JOptionPane;
/**
 *
 * @author jrago
 */
public class Practical3Q1 {
    public static void main(String [] args){
        int num1 = Integer.parseInt(
        JOptionPane.showInputDialog(null,
                "Please enter 1st integer",
                "Q1", JOptionPane.INFORMATION_MESSAGE));
        int num2 = Integer.parseInt(
        JOptionPane.showInputDialog(null,
                "Please enter 2nd integer",
                "Q1", JOptionPane.INFORMATION_MESSAGE));
        if(num1 > num2){
            JOptionPane.showMessageDialog(null,
                    "1st number is bigger",
                    "Q1", JOptionPane.INFORMATION_MESSAGE);
        }else if (num1 < num2){
            JOptionPane.showMessageDialog(null,
                    "2nd number is bigger",
                    "Q1", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,
                    "Both integers are the same",
                    "Q1", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
