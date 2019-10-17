/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical.pkg2;

/**
 *
 * @author jrago
 */
public class Practical2Q3 {
    public static void main(String[] args){
        int num =932;
        int digit1 =num/100;
        int digit2 =num/10 % 10;
        int digit3 =num % 10;
        int sum =digit1+digit2+digit3;
        System.out.println("num:"+num);
        System.out.println("digit1:"+digit1);
        System.out.println("digit2:"+digit2);
        System.out.println("digit3:"+digit3);
        System.out.println("sum:"+sum);
    }
    
}
