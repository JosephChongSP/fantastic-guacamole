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
public class Practical2Q8 {
    public static void main(String[] args) {
        String m1 = JOptionPane.showInputDialog(null, "Insert first number", "First number", JOptionPane.QUESTION_MESSAGE);
        String n1 = JOptionPane.showInputDialog(null, "Insert second number", "Second number", JOptionPane.QUESTION_MESSAGE);
        int m = Integer.parseInt(m1);
        int n = Integer.parseInt(n1);
        int total = ((n - m + 1) * (n + m)) / 2;
        JOptionPane.showMessageDialog(null, "The sum of all the integers from " + m + " to " + n + " is " + total, "Output", JOptionPane.INFORMATION_MESSAGE);
        }
}