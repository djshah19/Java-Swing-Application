/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.MentalHealthReport;

import java.util.ArrayList;

/**
 *
 * @author Dhwani
 */
public class MentalHealthReportDirectory {
   private ArrayList<MentalHealthReport> mentalHealthReport;
   
   public MentalHealthReportDirectory(){
   this.mentalHealthReport = new ArrayList<>();
   }

    public ArrayList<MentalHealthReport> getMentalHealthReport() {
        return mentalHealthReport;
    }

    public void setMentalHealthReport(ArrayList<MentalHealthReport> mentalHealthReport) {
        this.mentalHealthReport = mentalHealthReport;
    }
   
   
}
