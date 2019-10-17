/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsal.week2;

/**
 *
 * @author jrago
 */
public class Lecturer extends Person {
    
    private double salary;

    public Lecturer() {
        salary = 0.0;
    }

    public Lecturer(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }
    public void setSalary(double d){
        salary=d;
    }
    public double getSalary(){
        return salary;
    }
   
    
}
