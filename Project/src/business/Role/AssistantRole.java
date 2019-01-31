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
import userInterface.MentalHealthCheckUp.MentalHealthCheckUpWorkArea;

/**
 *
 * @author Dhwani
 */
public class AssistantRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new MentalHealthCheckUpWorkArea(userProcessContainer, account,organization, enterprise, network);
    }
        @Override
        public String toString(){
        return "Assistant Role";
        }
}
