/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Employee;

import java.util.ArrayList;

/**
 *
 * @author Dhwani
 */
public class EmployeeDirectory {
    private ArrayList<Employee> employeeList;
    
    public EmployeeDirectory(){
    this.employeeList = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    
    public Employee createEmployee(String fName, String lName){
    Employee emp = new Employee();
    employeeList.add(emp);
    emp.setfName(fName);
    emp.setlName(lName);
    return emp;
    }
}
