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
public class Person
{
	private String name;
	public Person(){
            name = null;
        }
	public Person(String name)
	{
            this.name = name;
	}
	public void setName(String n)
	{
		name=n;
	}
	public String getName(){//accessor
		return name;
	}
	public void introduce(){
		System.out.println("My name is " + name + ".");
	}
}
