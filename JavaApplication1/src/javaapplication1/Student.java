/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/*
 * Simple java program for student details using Arraylist
 */
/*
 * create student class with name,id and location
 * in student class write toString method to return id name and location as an string
 * add 5 students information in arraylist in main()
 * loop arraylist and display by calling object toString method.
 */
import java.util.ArrayList;

public class Student {

	String Name;
	int id;
	String Location;
	
	public Student(String Name, int id, String Location) {
		this.Name=Name;
		this.id=id;
		this.Location=Location;
	}

	//toString() method returning string type data
	public String toString(){
		
		//return this.Name+""+this.id+""+this.Location;
		return "("+Name+","+id+","+Location+")";
		
	}

	public static void  main(String args[]){
		
		ArrayList al=new ArrayList();
		Student s=new Student("Suraj",101,"Mumbai");
		Student s1=new Student("Sam",102,"Bangalore");
		Student s2=new Student("Rose",103,"Delhi");
		Student s3=new Student("Risa",104,"Rajkot");
		Student s4=new Student("Ram",105,"Patna");
		al.add(s);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		//for(int i=0;i<al.size();i++)
		for(Student student:al){
			System.out.println(student.toString());
		}
	
}
}