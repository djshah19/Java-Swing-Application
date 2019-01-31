/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.FireArmsRegistration;

import java.util.ArrayList;

/**
 *
 * @author Dhwani
 */
public class FireArmsRegistrationDirectory {
 private ArrayList<FireArmsRegistration> fireArmsRegistrationList;
 
 public FireArmsRegistrationDirectory(){
 this.fireArmsRegistrationList = new ArrayList<>(); 
 }

    public ArrayList<FireArmsRegistration> getFireArmsRegistrationList() {
        return fireArmsRegistrationList;
    }

    public void setFireArmsRegistrationList(ArrayList<FireArmsRegistration> fireArmsRegistrationList) {
        this.fireArmsRegistrationList = fireArmsRegistrationList;
    }
 
 public FireArmsRegistration registerAndAdd(){
 FireArmsRegistration far = new FireArmsRegistration();
 fireArmsRegistrationList.add(far);
 return far;
 }
 
    public FireArmsRegistration getDetails(int ssn){
    for(FireArmsRegistration far : fireArmsRegistrationList){
    if(far.getSsn()==ssn){
    return far;
    }
    }
    return null;
    }
}
