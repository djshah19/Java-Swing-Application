/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.UserAccount;

import business.Customer.Customer;
import business.Employee.Employee;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Dhwani
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount> userAccountList;
    
    public UserAccountDirectory(){
    this.userAccountList = new ArrayList<>();
    }
    
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role, Customer customer){
    UserAccount userAccount = new UserAccount();
    userAccountList.add(userAccount);
    userAccount.setUsername(username);
    userAccount.setPassword(password);
    userAccount.setRole(role);
    userAccount.setEmployee(employee);
    userAccount.setCustomer(customer);
    return userAccount;
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public void setUserAccountList(ArrayList<UserAccount> userAccountList) {
        this.userAccountList = userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
                for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    
    }
}
