/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author jrago
 */
public class MonthsQuarter {
    public static void main(String[]args){
        String [] months = {"January", "Febuary", "March",
            "April", "May", "June", "July", "August",
            "September", "October", "November", "December"};        
        int [] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        for (int i=0; i<days.length; i++){
            System.out.println(months[i] + " has " + days[i] + " days.");
        }
        int total=0;
        for(int i=0; i<days.length; i++){
            total += days[i];
        }
        System.out.println("The number of days in the year is " +total +" days");

        for (int outer=0; outer<= 3; outer++){
            System.out.println("Quarter "+(outer+1));
            total = 0;
            for (int inner=0; inner<=2; inner++){
                total += days[outer*3+inner];
                System.out.println(months[outer*3+inner] + " has "
                                    + days[outer*3+inner]+ " days");
            }
            System.out.println("Total per quarter is "+total+"\n");
        }
    }
}
