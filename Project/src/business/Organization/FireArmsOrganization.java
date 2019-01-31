/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.FireArmsRegistrarRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Dhwani
 */
public class FireArmsOrganization extends Organization{
    public FireArmsOrganization(){
    super(Type.FireArms.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new FireArmsRegistrarRole());
        return roles;
    }
    
}
