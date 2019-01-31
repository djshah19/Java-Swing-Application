/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.GunLicense.GunLicenseWorkArea;

/**
 *
 * @author Dhwani
 */
public class GunLicenseIssuerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new GunLicenseWorkArea(userProcessContainer, account, organization, business);
    }
        @Override
        public String toString(){
        return "Gun License Issuer Role";
        }
}
