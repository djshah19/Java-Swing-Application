/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.BackGroundCheckOfficerRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Dhwani
 */
public class BackGroundCheck extends Organization{
    public BackGroundCheck(){
    super(Type.BackGroundCheck.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new BackGroundCheckOfficerRole());
        return roles;
    }
    
}
