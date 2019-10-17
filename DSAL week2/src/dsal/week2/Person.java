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
public class Person {
  
  	private String name;
  	private int age;
  
  	public Person() {
    		name=null;
   		age=0;
 	 }
  
  	public Person(String s, int age){
   		 name = s;
   		 this.age = age;
 	 }
    	
                public void greetings(){
                     System.out.println("Hi... my name is " + name + " and I am " + age + " years old.");
 	}
}

