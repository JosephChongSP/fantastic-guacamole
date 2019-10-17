/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jrago
 */
public class q5 {
    public static void main(String[]args){
        int [] rand = new int [50];
        for (int i=0; i<rand.length; i++){
            rand[i]=(int)(Math.random()*91);
        }
        printArray(rand);
    }
    public static void printArray(int [] intArr){
        for (int j=0; j<5; j++){
            for (int i = 0; i<5; i++){                
                System.out.print(intArr[i + j*5] + " ");
                
            }
            System.out.println("");            
        }    
        System.out.print("The max is " + max);

    }

    public static int findMax(int[] intArr){
        int max = intArr[0];
        
        for (int i = 1; i < intArr.length; i++){
            if (intArr[i] > max){
                max = intArr[i];
            }
        }
        return max;
    }
}
