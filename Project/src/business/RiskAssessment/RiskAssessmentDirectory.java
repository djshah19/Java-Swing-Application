/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.RiskAssessment;

import java.util.ArrayList;

/**
 *
 * @author Dhwani
 */
public class RiskAssessmentDirectory {
private ArrayList<RiskAssessment> riskAssessmentList;

public RiskAssessmentDirectory(){
this.riskAssessmentList = new ArrayList<>();
}

    public ArrayList<RiskAssessment> getRiskAssessmentList() {
        return riskAssessmentList;
    }

    public void setRiskAssessmentList(ArrayList<RiskAssessment> riskAssessmentList) {
        this.riskAssessmentList = riskAssessmentList;
    }
}
