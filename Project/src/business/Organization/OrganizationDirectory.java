/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import java.util.ArrayList;

/**
 *
 * @author Dhwani
 */
public class OrganizationDirectory {
   private ArrayList<Organization> organizationList;
   
   public OrganizationDirectory(){
   this.organizationList = new ArrayList<>();
   }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }
   
        public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.BackGroundCheck.getValue())){
            organization = new BackGroundCheck();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.FireArms.getValue())){
            organization = new FireArmsOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.GunLicense.getValue())){
            organization = new GunLicenseOrganization();
            organizationList.add(organization);
        }
                else if (type.getValue().equals(Organization.Type.MaterialOrg.getValue())){
            organization = new MaterialOrganization();
            organizationList.add(organization);
        }
            else if (type.getValue().equals(Organization.Type.SalesOrg.getValue())){
            organization = new SalesOrganization();
            organizationList.add(organization);
        }else if(type.getValue().equals(Organization.Type.MentalHealthCheckUp.getValue())){
        organization = new MentalHealthCheckUp();
        organizationList.add(organization);
        }
        return organization;
    }
}
