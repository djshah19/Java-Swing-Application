/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Appointment;

import java.util.ArrayList;

/**
 *
 * @author Dhwani
 */
public class AppointmentDirectory {
    private ArrayList<Appointment> appointmentList;
    
    public AppointmentDirectory(){
    this.appointmentList = new ArrayList<>();
    }

    public ArrayList<Appointment> getAppointmentList() {
        return appointmentList;
    }

    public void setAppointmentList(ArrayList<Appointment> appointmentList) {
        this.appointmentList = appointmentList;
    }
    
    
}
