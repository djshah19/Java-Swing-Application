/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.Role;
import business.Role.SalesRole;
import java.util.ArrayList;

/**
 *
 * @author Dhwani
 */
public class SalesOrganization extends Organization{
    public SalesOrganization(){
    super(Type.SalesOrg.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SalesRole());
        return roles;
    }
    
}
