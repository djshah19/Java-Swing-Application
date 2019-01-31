/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.Criminal.CriminalDirectory;
import business.FireArmsRegistration.FireArmsRegistrationDirectory;
import business.GunLicense.GunLicenseDirectory;
import business.Network.Network;
import business.Organization.Organization;
import business.Role.Role;
import business.Ssn.SsnDirectory;
import java.util.ArrayList;

/**
 *
 * @author Dhwani
 */
public class EcoSystem extends Organization{
    private static EcoSystem business;
    private SsnDirectory ssnDirectory;
    private CriminalDirectory criminalDirectory;
    private ArrayList<Network> networkList;
    private GunLicenseDirectory gunLicenseDirectory;
    private FireArmsRegistrationDirectory farDirectory;
    
    private EcoSystem(){
    super(null);
    this.networkList = new ArrayList<>();
    this.ssnDirectory = new SsnDirectory();
    this.criminalDirectory = new CriminalDirectory();
    this.gunLicenseDirectory = new GunLicenseDirectory();
    this.farDirectory = new FireArmsRegistrationDirectory();
    }
    
    public static EcoSystem getInstance(){
    if(business == null){
    business = new EcoSystem();
    }
    return business;
    }

    public SsnDirectory getSsnDirectory() {
        return ssnDirectory;
    }

    public void setSsnDirectory(SsnDirectory ssnDirectory) {
        this.ssnDirectory = ssnDirectory;
    }

    public CriminalDirectory getCriminalDirectory() {
        return criminalDirectory;
    }

    public void setCriminalDirectory(CriminalDirectory criminalDirectory) {
        this.criminalDirectory = criminalDirectory;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public GunLicenseDirectory getGunLicenseDirectory() {
        return gunLicenseDirectory;
    }

    public void setGunLicenseDirectory(GunLicenseDirectory gunLicenseDirectory) {
        this.gunLicenseDirectory = gunLicenseDirectory;
    }

    public FireArmsRegistrationDirectory getFarDirectory() {
        return farDirectory;
    }

    public void setFarDirectory(FireArmsRegistrationDirectory farDirectory) {
        this.farDirectory = farDirectory;
    }

    public Network createAndAddNetwork(String name){
    Network network = new Network(name);
    networkList.add(network);
    return network;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
