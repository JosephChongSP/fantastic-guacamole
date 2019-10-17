/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical.pkg2;
import java.util.Scanner;
//import javax.swing.JOptionPane;
/**
 *
 * @author jrago
 */
public class Practical2Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name>>");
        String name = input.nextLine();
        System.out.print("Enter your year of birth>>");
        int year = input.nextInt();
        System.out.println("Name:\t"+name);
        System.out.println("Year of Birth:\t"+year);
        System.out.println("Age:\t"+(2018 - year));
                
                
                
                
        //String name = JOptionPane.showInputDialog(null, "Enter name here", "Name", JOptionPane.QUESTION_MESSAGE );
        //String DOB = JOptionPane.showInputDialog(null, "Enter date of birth", "Date of Birth", JOptionPane.QUESTION_MESSAGE);
        //int DoB = Integer.parseInt(DOB);
        //int no1 = 2018 - DoB;
        //System.out.println("Enter your name >> " + name);
        //System.out.println("Enter your year of birth >> " + DoB);
        //System.out.println("Name: " + name);
        //System.out.println("Year of Birth: " + DoB);
        //System.out.println("Age: " + no1);
    }
}