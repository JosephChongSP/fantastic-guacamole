/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.swing.*;
import java.io.*;
/**
 *
 * @author jrago
 */
public class Test {
    public static void main(String[] args){
        
    }
}    
//    public static void main(String[] args) {
//        File inputFile = new File("input.txt");
//        File outFile  = new File("output.txt");        
//        try{
//            BufferedReader br = new BufferedReader(
//                                    new FileReader(inputFile));
//            PrintWriter outStream = new PrintWriter(new 
//                                    FileOutputStream(outFile));
//            String s = br.readLine();
//            while(s!= null){
//                outStream.println(s);
//                s = br.readLine();
//            }
//            br.close();
//            outStream.close();            
//        }catch(FileNotFoundException e){
//            System.out.println ("File Not Found");
//        }catch(IOException e){
//            System.out.println ("Problem with IO");
//        }
//    }
//    
//    public void writeToFile(File f,int[] values){
//        
//    }
//}
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        int myAge,cellPhone;
//        double salary;
//        char tempChar;
//        myAge = 17;
//        cellPhone = 0;
//        salary = 1500.23;
//        tempChar = 'A';
//        boolean flag = false;
//        flag = true;
//        double num = 1.2225;
//        char escapeChar = '\t'; //tab
//        escapeChar = '\n'; //newline
//        escapeChar = '\"'; //double quote
//        System.out.println("ABC "+escapeChar+"DEF");
//        String text = "I Love Java!";
//        System.out.println(text);
//        
//        int firstNumber = 5;
//        int secondNumber = 10;
//        System.out.println("First number is "+firstNumber);
//        System.out.println("Second number is "+secondNumber);
//        /*multi line
//          comment*/
////        int a = 5;
////        int b = 2;
////        int r = a%b;
////        System.out.println("Remainder is :"+r);
////        double c = 1.222;
////        double result = a+c;
////        //mixture of data types, widening may occur
////        System.out.println("Result is :"+result);
////        double num2 = (5/2)/0.5;
////        System.out.println("Value of num2 is "+num2);
////        num2 = (5./2)/0.5;
////        System.out.println("Value of num2 is "+num2);
//        
//        int a,b;
//        b=7;
//        a=++b;
//        System.out.println("a is "+a);
//        System.out.println("b is "+b);
//        b=7;
//        a=b++;
//        System.out.println("a is "+a);
//        System.out.println("b is "+b);
//        
//        boolean larger = 7>2;
//        boolean lesser = 3<=6;
//        System.out.println("larger "+larger);
//        System.out.println("lesser "+lesser);
//        
//        String input = JOptionPane.showInputDialog(
//        null, "message", "title",JOptionPane.QUESTION_MESSAGE);
//        double area= calculateArea(12,5.2);
//    }
//    public static double calculateArea(double len,double w){
//        
//    }
//}
