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
public class Practical3Q4 {

    public static void main(String[] args) {
        String inputsal = JOptionPane.showInputDialog(null,
                "Enter the salary",
                "Salary",
                JOptionPane.QUESTION_MESSAGE);
        String inputyears = JOptionPane.showInputDialog(null,
                "Enter the years of service",
                "Years of service",
                JOptionPane.QUESTION_MESSAGE);
        int salary = Integer.parseInt(inputsal);
        int years = Integer.parseInt(inputyears);
        int increment;
        
        if (years < 10) {
            if (salary < 1000) {
                increment = 100;
            }
            else if (salary < 2000) {
                increment = 200;
            }
            else {
                increment = 300;
            }
        }
        else {
            if (salary < 1000) {
                increment = 200;
            }
            else if (salary < 2000) {
                increment = 300;
            }
            else {
                increment = 400;
            }
        }
        JOptionPane.showMessageDialog(null,
                "The increment is " + increment);
    }//end of main
}//end of class     