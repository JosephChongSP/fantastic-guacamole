/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jrago
 */
public class Practical4Q10 {
    public static void main(String [] args){
        for (int row = 0; row <= 8; row++){
            int number=1;
            for(int col = 0; col < row; col++){
                System.out.print(number + " ");
                number *= 2;
            }
            System.out.print('\n');
        }
    }

}
