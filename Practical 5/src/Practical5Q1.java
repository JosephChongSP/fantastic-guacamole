

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jrago
 */

//(a)
public class Practical5Q1 {
    public static void main(String []args){
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
    }

}
