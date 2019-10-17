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
public class Practical3Q6 {
    public static void main(String [] args){
        int type = Integer.parseInt(
        JOptionPane.showInputDialog("Enter bicycle type\n"+
                "1.Single Seater; 2.Double Seater"));
        double hours = Double.parseDouble(
        JOptionPane.showInputDialog("Enter number of hours rented"));
        double fee;
        
        if (type==1){
            fee = 5.5 * hours;
        }else {
            fee = 7.8 * hours;
        }
        if (hours >= 3)
            fee *= 0.7;
        JOptionPane.showMessageDialog(null, "Total Rental fee: $" + fee);
    }

}
