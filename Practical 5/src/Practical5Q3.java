/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jrago
 */
public class Practical5Q3 {
    public static void main(String[]args){
        int [] list1 = (12, 56, 76, 32, 12, 34);
        int [] list2 = (12, 56, 76, 32, 12, 34);
        
        if (list1.length != list2.length){
            System.out.println("Two lisrs are not strictly identical");
        }else{
            String msg = "Two lists are strictly identical";
            for (int i=0; i<list1.length; i++)(
                    if (list1[i] != list2[i]){
                        msg = "Two lists are not strictly identical";
                        break;
                    }
            )
        }
    }

}
