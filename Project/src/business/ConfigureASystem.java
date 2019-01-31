/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.Criminal.Criminal;
import business.Employee.Employee;
import business.Role.SystemAdminRole;
import business.Ssn.Ssn;
import business.UserAccount.UserAccount;

/**
 *
 * @author Dhwani
 */
public class ConfigureASystem {
    public static EcoSystem configure(){
    EcoSystem business = EcoSystem.getInstance();
    Employee employee = business.getEmployeeDirectory().createEmployee("ABCD", "EFGH");
    UserAccount userAccount = business.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole(),null);
    Ssn ssn = business.getSsnDirectory().createAndAddSsn("Bluto", 
            "Crisler", "Segar", "Boston", "American", "Non-Hispanic", 
            "White", "Male", "57B Smith St.", "Boston", "MA", "bluto@gmail.com", 
            "19 Jan 1970", "C:\\Users\\Dhwani Shah\\Desktop\\IS\\AED\\Project\\bluto.jpg", 7743293711L, 2120, 123456789);
    
    ssn = business.getSsnDirectory().createAndAddSsn("Johnny",
            "D", "Bravo", "Boston", "American", "Non-Hispanic", "White",
            "Male", "Boylston Street", "Boston", "MA", "johnny@gmail.com",
            "12 Dec 1992", "C:\\Users\\Dhwani Shah\\Desktop\\IS\\AED\\Project\\johnny.jpg", 2012699263L, 2120, 123456781);
    
    ssn = business.getSsnDirectory().createAndAddSsn("Donald", "John", "Trump",
            "New York City", "American", "Non-Hispanic", 
            "White", "Male", "1600 Pennsylvania Ave NW", "Boston", "MA", "trump@gmail.com",
            "14 Jun 1946", "C:\\Users\\Dhwani Shah\\Desktop\\IS\\AED\\Project\\Flintstone.png", 3547896471L, 2120, 123456783);
    
    Criminal criminal = business.getCriminalDirectory().addRecord("11-26-2015", "22:00:00", 
        "57B Smith St.", "Boston", "MA", "Assault by Firearm", "Pistol", 123456789, 2120, 2015, "Gun Violence");
        criminal = business.getCriminalDirectory().addRecord("11-26-2016", "23:59:59", 
        "57B Smith St.", "Boston", "MA", "Gang War", "Semi Automatic Rifle", 123456781, 2120, 2016, "Gun Violence");
        criminal = business.getCriminalDirectory().addRecord("11-26-2016", "23:59:59", 
        "57B Smith St.", "Boston", "MA", "Gang War", "Semi Automatic Rifle", 123456782, 2120, 2016, "Gun Violence");
        criminal = business.getCriminalDirectory().addRecord("11-26-2017", "23:59:59", 
        "57B Smith St.", "Boston", "MA", "Assault by Firearm", "Pistol", 123456783, 2120, 2017, "Gun Violence");
    return business;
    }
}
