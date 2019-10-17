
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
public class Practical3Q7 {
    public static void main (String [] args){
        //get legnth of three sides
        double edge1 = Double.parseDouble(JOptionPane.showInputDialog("Please enter edge1"));
        double edge2 = Double.parseDouble(JOptionPane.showInputDialog("Please enter edge2"));
        double edge3 = Double.parseDouble(JOptionPane.showInputDialog("Please enter edge3"));
//check and displa results
        boolean valid = (edge1 + edge2 > edge3) && (edge2 + edge3 > edge1&& (edge3 + edge1 > edge2));
        
        if (!valid){
            JOptionPane.showMessageDialog(null, "Input is invalid");
        } else {
            if ((edge1==edge2) && (edge2==edge3))
                    {
                        System.out.println("Those sides from an equilateral triangle");                       
                    }
        else if ((edge1!=edge2)&&(edge2!=edge3)&&(edge1!=edge3)){
                        System.out.println("Those sides from a scalene triangle");
        }else {
            System.out.println("Those sides from an isoceles triangle");
        }
        }
    }

}
