/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
/*
 *
 * @author jrago
 */
public class Practical4Q5 {
    public static void main(String [] args){
        String msg = "";
        for (int counter = 1, num; counter < 13; counter++) {
            num = counter * 5;
            msg = msg + counter + " X 5 = " + num + "\n";
        }
        JOptionPane.showMessageDialog(null, msg);
    }
}