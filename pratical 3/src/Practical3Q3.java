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
public class Practical3Q3 {
    public static void main(String [] args){
        int number = Integer.parseInt(
                JOptionPane.showInputDialog(null,
                "Enter an integer",
                "Q3", JOptionPane.QUESTION_MESSAGE));
        String msg;
        if ((number%5==0)&&(number%6==0)) {
            msg = number + " is divisible by both 5 and 6";
        }else if((number%5==0)^(number%6==0)){
            msg = number + " is divisible by either 5 or 6";
        }else{
            msg = number + " is not divisible by either 5 or 6";
        }

    }

}
