package practical08startup;

public class Employee {

  private String empID;
  private String empName;
  private double empSalary;

  public Employee() {
    this(null, null, 0.0);
  }

  public Employee(String id, String name, double salary) {
    setEmpID(id);
    setEmpName(name);
    setEmpSalary(salary);
  }

  public void setEmpID(String s){
    empID = s;
  }

  public void setEmpName(String s){
    empName = s;
  }

  public void setEmpSalary(double salary){
    empSalary = salary;
  }

  public String getEmpID() {
    return empID;
  }

  public String getEmpName() {
    return empName;
  }

  public double getEmpSalary() {
    return empSalary;
  }

}
