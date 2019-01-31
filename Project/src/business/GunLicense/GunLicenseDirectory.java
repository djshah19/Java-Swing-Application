/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.GunLicense;

import java.util.ArrayList;

/**
 *
 * @author Dhwani
 */
public class GunLicenseDirectory {
    private ArrayList<GunLicense> gunLicenseList;
    
    public GunLicenseDirectory(){
    this.gunLicenseList = new ArrayList<>();
    }

    public ArrayList<GunLicense> getGunLicenseList() {
        return gunLicenseList;
    }

    public void setGunLicenseList(ArrayList<GunLicense> gunLicenseList) {
        this.gunLicenseList = gunLicenseList;
    }
    
    public GunLicense addAndCreateGunLicense(){
    GunLicense gunLicense = new GunLicense();
    gunLicenseList.add(gunLicense);
    return gunLicense;
    }
    
    public GunLicense getGunLicenseNo(int ssn){
    for(GunLicense gl : gunLicenseList){
    if(gl.getOwner().getSsn()==ssn){
    return gl;
    }
    }
    return null;
    }
}
