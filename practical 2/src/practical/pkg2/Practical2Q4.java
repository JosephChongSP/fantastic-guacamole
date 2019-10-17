/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical.pkg2;

/**
 *
 * @author jrago
 */
import javax.swing.JOptionPane;
        
public class Practical2Q4 {
    public static void main(String[] args) {
        int year1= 1996, year2= 1900;
        boolean isLeapYear;
        isLeapYear = (year1%4 == 0) && (year1%100 != 0) || (year1%400 == 0);
        JOptionPane.showMessageDialog(null,
                year1 + " is a leap year? " + isLeapYear);
        isLeapYear = (year2%4 == 0) && (year2%100 != 0) || (year2%400 == 0);
        JOptionPane.showMessageDialog(null,
                year2 + " is a leap year? " + isLeapYear);
    }
    
}
