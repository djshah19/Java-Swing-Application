/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Network;

import business.Customer.CustomerDirectory;
import business.Enterprise.EnterpriseDirectory;
import business.Organization.Organization;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Dhwani
 */
public class Network extends Organization{
 private EnterpriseDirectory enterpriseDirectory;
 private CustomerDirectory customerDirectory;
 
 public Network(String name){
 super(name);
 this.enterpriseDirectory = new EnterpriseDirectory();
 this.customerDirectory = new CustomerDirectory();
 }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }


    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
 
}
