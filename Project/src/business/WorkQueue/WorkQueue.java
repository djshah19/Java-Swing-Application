/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author Dhwani
 */
public class WorkQueue {
    private ArrayList<WorkRequest> workRequest;
    
    public WorkQueue(){
    this.workRequest = new ArrayList<>(); 
    }

    public ArrayList<WorkRequest> getWorkRequest() {
        return workRequest;
    }

    public void setWorkRequest(ArrayList<WorkRequest> workRequest) {
        this.workRequest = workRequest;
    }
    
    public WorkRequest searchRequest(int no){
    for(WorkRequest wr : workRequest){
    if(wr.getNo()==no){
    return wr;
    }
    }
    return null;
    }
}
