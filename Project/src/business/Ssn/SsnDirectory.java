/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Ssn;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Dhwani
 */
public class SsnDirectory {
private ArrayList<Ssn> ssnList;

public SsnDirectory(){
this.ssnList = new ArrayList<>();
}

    public ArrayList<Ssn> getSsnList() {
        return ssnList;
    }

    public void setSsnList(ArrayList<Ssn> ssnList) {
        this.ssnList = ssnList;
    }

public Ssn createAndAddSsn(String fName,String mName,String lName,String placeOfBirth,String citizenship, 
            String ethnicity,String race,String sex,String street,String city,String state,String emailId,
            String dateOfBirth, String filePath, long phoneNo, int zip, int sssn){
Ssn ssn = new Ssn();
ssnList.add(ssn);
ssn.setfName(fName);ssn.setmName(mName);ssn.setlName(lName);
ssn.setPlaceOfBirth(placeOfBirth);ssn.setCitizenship(citizenship);
ssn.setEthnicity(ethnicity);ssn.setRace(race);ssn.setSex(sex);
ssn.setStreet(street);ssn.setCity(city);ssn.setState(state);ssn.setZip(zip);
ssn.setDateOfBirth(dateOfBirth);ssn.setPhoneNo(phoneNo);ssn.setEmailId(emailId);
ssn.setImagePath(filePath);
String imagePath=filePath;
ssn.setImg(ResizeImage(imagePath));
ssn.setSsn(sssn);
return ssn;
}
    public ImageIcon ResizeImage(String imagePath)
    {
        ImageIcon myImage = new ImageIcon(imagePath);
        Image img = myImage.getImage();
        Image newImg = 
        img.getScaledInstance(117, 99, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    
    public Ssn getDetails(int ssn){
    for(Ssn sssn : ssnList){
    if(sssn.getSsn()==ssn){
    return sssn;
    }
    }
    return null;
    }
}
