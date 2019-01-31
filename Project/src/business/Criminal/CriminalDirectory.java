/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Criminal;

import java.util.ArrayList;

/**
 *
 * @author Dhwani
 */
public class CriminalDirectory {
    private ArrayList<Criminal> criminalList;
    
    public CriminalDirectory(){
    this.criminalList = new ArrayList<Criminal>();
    }

    public ArrayList<Criminal> getCriminalList() {
        return criminalList;
    }

    public void setCriminalList(ArrayList<Criminal> criminalList) {
        this.criminalList = criminalList;
    }
    
    public Criminal addRecord(String dateOfCrime,String timeOfCrime,String street,String city,String state,
            String crimeCommitted,String weaponUsed,int ssn,int zip, int year, String crimeType){
    Criminal criminal = new Criminal();
    criminalList.add(criminal);
    criminal.setDateOfCrime(dateOfCrime);
    criminal.setTimeOfCrime(timeOfCrime);
    criminal.setStreet(street);
    criminal.setCity(city);criminal.setState(state);
    criminal.setZip(zip);criminal.setSsn(ssn);
    criminal.setCrimeCommitted(crimeCommitted);criminal.setWeaponUsed(weaponUsed);
    criminal.setYear(year);
    criminal.setCrimeType(crimeType);
    return criminal;
    }
}
