/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.FireArms;

import java.util.ArrayList;

/**
 *
 * @author Dhwani
 */
public class FireArmsDirectory {
    private ArrayList<FireArms> fireArmsList;
    
    public FireArmsDirectory(){
    this.fireArmsList = new ArrayList<FireArms>();
    }

    public ArrayList<FireArms> getFireArmsList() {
        return fireArmsList;
    }

    public void setFireArmsList(ArrayList<FireArms> fireArmsList) {
        this.fireArmsList = fireArmsList;
    }
    
    public FireArms createAndAddFireArms(){
    FireArms fireArms = new FireArms();
    fireArmsList.add(fireArms);
    return fireArms;
    }
    
    public FireArms searchFireArms(int sku){
    for(FireArms fireArms : fireArmsList){
    if(fireArms.getSku()==sku){
    return fireArms;
    }
    }
    return null;
    }
}
