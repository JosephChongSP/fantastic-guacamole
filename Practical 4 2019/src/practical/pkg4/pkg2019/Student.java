/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practical.pkg4.pkg2019;

/**
 *
 * @author jrago
 */
public class Student extends Person {
    private char stdYear;

    public Student(String name, char stdYear) {
        super(name);
        this.stdYear = stdYear;
    }
    public char getYear(){//accessor
	return stdYear;
    }
    public void introduce(){
        System.out.println("I am a year " + stdYear + " student.");
    }
}
