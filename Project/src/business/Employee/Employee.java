/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Employee;

/**
 *
 * @author Dhwani
 */
public class Employee {
    private String fName;
    private String lName;
    private int id;
    private static int count = 1;
    
    public Employee(){
    id = count;
    count++;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString(){
    return this.fName;
    }
    
}
