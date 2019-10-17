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
public class Lecturer extends Person{
    private String[] modules;

    public Lecturer() {
    }
    public Lecturer(String name, String[] modules){
        super(name);
        this.modules = modules;
    }
    public void setModule(String[] m){
        modules = m;
    }
    public String[] getModules(){
        return modules;
    }
    public void introduce(){
        System.out.println("I am a lecturer for the following subjects: \n" + modules);
    }
}
