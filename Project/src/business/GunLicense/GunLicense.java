/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.GunLicense;

import business.Customer.Customer;

/**
 *
 * @author Dhwani
 */
public class GunLicense {
    private int gunLicenseNo;
    private Customer owner;
    String validFrom, validTo;
    private String reason;

    public int getGunLicenseNo() {
        return gunLicenseNo;
    }

    public void setGunLicenseNo(int gunLicenseNo) {
        this.gunLicenseNo = gunLicenseNo;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }



    public String getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    public String getValidTo() {
        return validTo;
    }

    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }
    
    
}
