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
public class Practical2Q5 {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog(null,
                "Please enter your name",
                "Input",
                JOptionPane.QUESTION_MESSAGE);
        
        JOptionPane.showMessageDialog(null,
                name + " loves Java!");
    }
    
}
