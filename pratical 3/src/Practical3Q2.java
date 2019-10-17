
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jrago
 */
public class Practical3Q2 {
    public static void main(String [] args){
        double score = Double.parseDouble(
        JOptionPane.showInputDialog(null,
                "What is your score",
                "Q2", JOptionPane.QUESTION_MESSAGE));
        char grade;
        if (score >= 80){
            grade = 'A';
        }else if (score >= 70){
            grade = 'B';
        }else if (score >= 60){
            grade = 'C';
        }else if (score >= 50){
            grade = 'D';
        }else{
            grade = 'F';
        }
        JOptionPane.showMessageDialog(null,
                "Your grade is " + grade,
                "Q2", JOptionPane.INFORMATION_MESSAGE);
    }

}
