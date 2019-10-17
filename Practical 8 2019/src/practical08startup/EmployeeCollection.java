package practical08startup;

import utils.*;
import java.io.*;

public class EmployeeCollection {

    private LinkList employeeList;
    private int currEmployee;

    public EmployeeCollection() {
      employeeList = new LinkList();
      currEmployee = 0;
    }

    public int getNoOfEmployees() {
      return employeeList.getNoOfElement();
    }

    public Employee getEmployee(int index) {
      return (Employee)employeeList.get(index);
    }

    public void addEmployee(Employee e) {
        employeeList.addLast(e);
    }

    public void readFromFile(String filename){

      File f = new File("data/"+filename);
      try{
        BufferedReader br = new BufferedReader(new FileReader(f));
        String s = br.readLine();
        while (s != null){
          String[] arr = s.split(",");

          Employee e = new Employee(arr[0], arr[1], Double.parseDouble(arr[2]));
          addEmployee(e);
          s = br.readLine();
        }

      }catch(IOException e){
        e.printStackTrace();
      }

    }

    public int getNext(){
      if(currEmployee < getNoOfEmployees()-1)
        currEmployee++;

      return currEmployee;
    }

    public int getPrev(){
      if(currEmployee > 0)
        currEmployee--;

      return currEmployee;
    }

    public int getLast(){
      currEmployee = getNoOfEmployees()-1;
      return currEmployee;
    }

    public int getFirst(){
      currEmployee = 0;
      return currEmployee;
    }
    
    public int getEmployee(){
        return (Employee)employeeList.get(index);
    }

  }
