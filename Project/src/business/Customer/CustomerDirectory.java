/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Customer;

import java.util.ArrayList;

/**
 *
 * @author Dhwani
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerList;
    
    public CustomerDirectory(){
    this.customerList = new ArrayList<>();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    
    public Customer createAndAddCustomer(){
    Customer cust = new Customer();
    customerList.add(cust);
    return cust;
    }
    
    public Customer searchCust(int Id){
    for(Customer cust : customerList){
    if(cust.getId()==Id)
    {
    return cust;
    }
    }
    return null;
    }
}
