/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Employee.EmployeeDirectory;
import business.FireArms.FireArmsDirectory;
import business.Role.Role;
import business.UserAccount.UserAccountDirectory;
import business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Dhwani
 */
public abstract class Organization {
 private UserAccountDirectory userAccountDirectory;
 private EmployeeDirectory employeeDirectory;
 private WorkQueue workQueue;
 private FireArmsDirectory fireArmsDirectory;
 private int organizationId; 
 private static int counter;
 String name;
 
 public Organization(String name){
 this.name = name;
 this.userAccountDirectory = new UserAccountDirectory();
 this.employeeDirectory = new EmployeeDirectory();
 this.workQueue = new WorkQueue();
 this.fireArmsDirectory = new FireArmsDirectory();
 counter++;
 this.organizationId = counter;
 }
 
 public enum Type{
  BackGroundCheck("Background Check"){},
  FireArms("Fire Arms"){},
  GunLicense("Gun License"){},
  MentalHealthCheckUp("Mental Health CheckUp"),
  MaterialOrg("Material"){},
  SalesOrg("Sales"){};
     
  String value;
  private Type(String value){
  this.value = value;
  }

        public String getValue() {
            return value;
        }
  @Override
  public String toString(){
  return this.value;
  }
 }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public FireArmsDirectory getFireArmsDirectory() {
        return fireArmsDirectory;
    }

    public void setFireArmsDirectory(FireArmsDirectory fireArmsDirectory) {
        this.fireArmsDirectory = fireArmsDirectory;
    }

    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
 
 public abstract ArrayList<Role> getSupportedRole();
 @Override
 public String toString(){
 return this.name;
 }
}
