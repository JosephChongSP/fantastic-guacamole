/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jrago
 */
public class TestCircle {
    public static void main(String[] args){
        Circle circle1 = new Circle(2);
        System.out.println("Area of circle1 with radius " + circle1.getRadius() + " is " + circle1.getArea());
        System.out.println("\nCircle is enlarged 3 tims");
        circle1.enlargeCircle();
        System.out.println("Area of circle1 with radius " + circle1.getRadius() + " is " + circle1.getArea());
        System.out.println("\nCircle is shrunk by half");
        circle1.shrinkCircle();
        System.out.println("Area of circle1 with radius " + circle1.getRadius() + " is " + circle1.getArea());
        
    }

}
