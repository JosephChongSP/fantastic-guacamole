
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
public class Practical6Q1 {
    public static void main(String[]args){
        printTable();
    }
    //main
    public static void printTable(){
    String msg = "";
    for (int i=1; i<=12; i++){
        msg+= i + " x 5 = " + (i*5) + "\n";
    }
    JOptionPane.showMessageDialog(null, msg);
    }

}
