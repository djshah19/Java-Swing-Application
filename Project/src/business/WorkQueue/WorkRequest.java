/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.WorkQueue;

import business.Appointment.AppointmentDirectory;
import business.Customer.Customer;
import business.FireArms.FireArms;
import business.MentalHealthReport.MentalHealthReportDirectory;
import business.RiskAssessment.RiskAssessmentDirectory;
import business.UserAccount.UserAccount;

/**
 *
 * @author Dhwani
 */
public abstract class WorkRequest {
   private int no;
   private FireArms fireArms;
   private UserAccount sender;
   private UserAccount receiver;
   private String status;
   private String message;
   private RiskAssessmentDirectory riskAssessmentDirectory;
   private AppointmentDirectory appointmentDirectory;
   private MentalHealthReportDirectory mentalHealthReportDirectory;
   
   public WorkRequest(){
   this.riskAssessmentDirectory = new RiskAssessmentDirectory();
   this.appointmentDirectory = new AppointmentDirectory();
   this.mentalHealthReportDirectory = new MentalHealthReportDirectory();
   }
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public FireArms getFireArms() {
        return fireArms;
    }

    public void setFireArms(FireArms fireArms) {
        this.fireArms = fireArms;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public RiskAssessmentDirectory getRiskAssessmentDirectory() {
        return riskAssessmentDirectory;
    }

    public void setRiskAssessmentDirectory(RiskAssessmentDirectory riskAssessmentDirectory) {
        this.riskAssessmentDirectory = riskAssessmentDirectory;
    }

    public AppointmentDirectory getAppointmentDirectory() {
        return appointmentDirectory;
    }

    public void setAppointmentDirectory(AppointmentDirectory appointmentDirectory) {
        this.appointmentDirectory = appointmentDirectory;
    }

    public MentalHealthReportDirectory getMentalHealthReportDirectory() {
        return mentalHealthReportDirectory;
    }

    public void setMentalHealthReportDirectory(MentalHealthReportDirectory mentalHealthReportDirectory) {
        this.mentalHealthReportDirectory = mentalHealthReportDirectory;
    }
   
   @Override
     public String toString(){
     return this.status;
     }
}
