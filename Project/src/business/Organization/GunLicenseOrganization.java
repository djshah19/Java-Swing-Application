/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.GunLicenseIssuerRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Dhwani
 */
public class GunLicenseOrganization extends Organization{
    public GunLicenseOrganization(){
    super(Type.GunLicense.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new GunLicenseIssuerRole());
        return roles;
    }
    
}
