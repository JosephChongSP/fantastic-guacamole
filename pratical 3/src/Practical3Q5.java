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
public class Practical3Q5 {
    public static void main(String [] args){
        int rank = Integer.parseInt(
                JOptionPane.showInputDialog(null,
                "What is your rank?",
                "Q5", JOptionPane.QUESTION_MESSAGE));
        int prizemoney;
        switch (rank) {
            case 1:
                prizemoney = 1000;
                break;
            case 2:
                prizemoney = 800;
                break;
            case 3:
                prizemoney = 700;
                break;
            case 4:
            case 5:
                prizemoney = 300;
                break;
            default:
                prizemoney = 20;
        }        //end of switch
            JOptionPane.showMessageDialog(null,
                "Your prize money is $" + prizemoney);
        
    }

}
