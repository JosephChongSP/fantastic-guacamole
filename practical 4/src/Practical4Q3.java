
import java.util.Scanner;

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
/*public class Practical4Q3 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count = 1;
        while (count < 6){
            System .out.print("number"+count+": " );
            int num = input.nextInt();
            count++;
            sum += num;
        }
        System.out.println("Sum of numbers: "+sum);

    }

}
*/

//(b)
/*public class Practical4Q3 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count = 1;
        do{
            System .out.print("number"+count+": " );
            int num = input.nextInt();
            count++;
            sum += num;
        } while (count < 6);
        System.out.println("Sum of numbers: "+sum);

    }

}
*/

//(c)
public class Practical4Q3 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int c;
        for (c=1;c<6;c++){
            System .out.print("number"+c+": " );
            int num = input.nextInt();
            sum += num;
        }
        System.out.println("Sum of numbers: "+sum);

    }

}