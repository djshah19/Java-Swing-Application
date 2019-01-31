/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.MentalHealthCheckUp;

import business.Enterprise.Enterprise;
import business.MentalHealthReport.MentalHealthReport;
import business.Network.Network;
import business.Organization.BackGroundCheck;
import business.Organization.Organization;
import business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Dhwani
 */
public class SubmitReportJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SubmitReportJPanel
     */
    private JPanel userProcessContainer;
    private WorkRequest wr;
    private Network network;
    SubmitReportJPanel(JPanel userProcessContainer, WorkRequest wr, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.wr = wr;
        this.network = network;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        btnSubmit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(19, 115, 163));

        jTextArea.setColumns(20);
        jTextArea.setRows(5);
        jScrollPane1.setViewportView(jTextArea);

        btnSubmit.setBackground(new java.awt.Color(0, 153, 153));
        btnSubmit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Report");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btnSubmit)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSubmit)
                .addContainerGap(83, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
    if(jTextArea.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Text area is blank",
        "Error", JOptionPane.ERROR_MESSAGE);
    }else{
    Organization inOrg = null;
    for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
    for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList()){
    if(org instanceof BackGroundCheck){
    inOrg = org;
    break;
    }
    }
    }
    WorkRequest workRq = inOrg.getWorkQueue().searchRequest(wr.getNo());
    MentalHealthReport mhr = new MentalHealthReport();
    mhr.setReport(jTextArea.getText());
    workRq.getMentalHealthReportDirectory().getMentalHealthReport().add(mhr);
    wr.getMentalHealthReportDirectory().getMentalHealthReport().add(mhr);
    JOptionPane.showMessageDialog(null, "Report Submitted Successfully!");
    wr.setStatus("Under Process");wr.setMessage("Pending with Police");
     userProcessContainer.remove(this);
     Component[] componentArray = userProcessContainer.getComponents();
     Component component = componentArray[componentArray.length - 1];
     MhcpOpenRequest mhcp = (MhcpOpenRequest)component;
     mhcp.populateTable();
     CardLayout layout = (CardLayout)userProcessContainer.getLayout();
     layout.previous(userProcessContainer);  
    }
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea;
    // End of variables declaration//GEN-END:variables
}