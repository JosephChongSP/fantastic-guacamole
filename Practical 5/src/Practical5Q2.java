
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
public class Practical5Q2 {
    public static void main(String[]args){
        final int NUM_OF_STUDENTS = 5;
        String [] names = new String [NUM_OF_STUDENTS];
        double [] marks = new double [NUM_OF_STUDENTS];
        int count=0;
        for (int i=0; i<marks.length; i++){
            names[i] = JOptionPane.showInputDialog(null, "Enter name of student" + (i+1));
            marks[i] = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Enter the marks of student "+ (i+1)));
            if (marks[i]>=80)
                count++;
        }
        System.out.println(count + " students scored A grade. They are" );
         for (int i=0; i<marks.length; i++){
             if (marks[i]>=80)
                 System.out.println(names[i]);
         }
    }

}
