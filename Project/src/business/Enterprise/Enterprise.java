/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;

import business.Organization.Organization;
import business.Organization.OrganizationDirectory;

/**
 *
 * @author Dhwani
 */
public abstract class Enterprise extends Organization{
    private OrganizationDirectory organizationDirectory;
    private EnterpriseType enterpriseType;    
    public Enterprise(String name, EnterpriseType enterpriseType){
    super(name);
    this.enterpriseType = enterpriseType;
    this.organizationDirectory = new OrganizationDirectory();
    }
    public enum EnterpriseType{
    GunSeller("Gun Seller"){},
    StatePolice("State Police"){},
    Hospital("Hospital"){};
    
    private String value;
    private EnterpriseType(String value){
    this.value = value;
    }

        public String getValue() {
            return value;
        }
    
    @Override
    public String toString(){
    return this.value;
    }
            }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }



    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    
}
