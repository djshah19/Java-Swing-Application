/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.FireArmsRegistration;

/**
 *
 * @author Dhwani
 */
public class FireArmsRegistration {
   private int ssn, gunNo;
   private String gunType, model, regisDate;

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public int getGunNo() {
        return gunNo;
    }

    public void setGunNo(int gunNo) {
        this.gunNo = gunNo;
    }

    public String getGunType() {
        return gunType;
    }

    public void setGunType(String gunType) {
        this.gunType = gunType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegisDate() {
        return regisDate;
    }

    public void setRegisDate(String regisDate) {
        this.regisDate = regisDate;
    }
  

}
