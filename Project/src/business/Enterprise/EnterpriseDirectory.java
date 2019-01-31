/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author Dhwani
 */
public class EnterpriseDirectory {
   private ArrayList<Enterprise> enterpriseList;
   
   public EnterpriseDirectory(){
   this.enterpriseList = new ArrayList<Enterprise>();
   }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
   
   public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
   Enterprise enterprise = null;
   if(type==Enterprise.EnterpriseType.GunSeller){
   enterprise = new GunSeller(name);
   enterpriseList.add(enterprise);
   }else if(type==Enterprise.EnterpriseType.StatePolice){
   enterprise = new StatePolice(name);
   enterpriseList.add(enterprise);
   }else if(type==Enterprise.EnterpriseType.Hospital){
   enterprise = new Hospital(name);
   enterpriseList.add(enterprise);
   }
   return enterprise;
}}
