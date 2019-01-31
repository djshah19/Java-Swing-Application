/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Criminal;

import java.sql.Time;
import java.util.Date;
import javax.swing.Icon;

/**
 *
 * @author Dhwani
 */
public class Criminal {
    private int ssn,zip,year;
    private String dateOfCrime,timeOfCrime,street,city,state,crimeCommitted,weaponUsed,crimeType;

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getDateOfCrime() {
        return dateOfCrime;
    }

    public void setDateOfCrime(String dateOfCrime) {
        this.dateOfCrime = dateOfCrime;
    }

    public String getTimeOfCrime() {
        return timeOfCrime;
    }

    public void setTimeOfCrime(String timeOfCrime) {
        this.timeOfCrime = timeOfCrime;
    }


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCrimeCommitted() {
        return crimeCommitted;
    }

    public void setCrimeCommitted(String crimeCommitted) {
        this.crimeCommitted = crimeCommitted;
    }

    public String getWeaponUsed() {
        return weaponUsed;
    }

    public void setWeaponUsed(String weaponUsed) {
        this.weaponUsed = weaponUsed;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }    

    public String getCrimeType() {
        return crimeType;
    }

    public void setCrimeType(String crimeType) {
        this.crimeType = crimeType;
    }
    
}
