/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.MaterialRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Dhwani
 */
public class MaterialOrganization extends Organization{
    public MaterialOrganization(){
    super(Type.MaterialOrg.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new MaterialRole());
        return roles;
    }
}
