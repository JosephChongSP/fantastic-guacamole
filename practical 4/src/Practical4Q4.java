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
public class Practical4Q4 {
    public static void main(String [] args){
        int num;
        do{
            num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
            if (num<10||num>200)
                JOptionPane.showMessageDialog(null, "Pls enter a number between 100 and 200!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            
        }while(!((num>=100&&(num<=200))));
        JOptionPane.showMessageDialog(null,"End of program!");
        
    }

}
