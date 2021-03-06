/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.CustomerWorkArea;

import business.Organization.Organization;
import business.RiskAssessment.RiskAssessment;
import business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Dhwani
 */
public class RiskAssessmentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RiskAssessmentJPanel
     */
    private JPanel userProcessContainer; 
    private WorkRequest wr;
    private Organization orgBkgdck;
    RiskAssessmentJPanel(JPanel userProcessContainer, WorkRequest wr, Organization orgBkgdck) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.wr = wr;
        this.orgBkgdck = orgBkgdck;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        btnSaveAndSubmit = new javax.swing.JButton();

        setBackground(new java.awt.Color(19, 115, 163));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("1. What is the specific reason to buy a firearm?");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Answer the below question with reason(s) if any");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Risk Assessment");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("2. Are you feeling low?");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("3. Are you having thoughts of hurting yourself?");

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("4. Did you had a fight with someone?");

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("5. Do you feel threatened from someone?");

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane5.setViewportView(jTextArea5);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("6. Do you have thoughts of hurting or killing others?");

        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jScrollPane6.setViewportView(jTextArea6);

        btnSaveAndSubmit.setBackground(new java.awt.Color(0, 153, 153));
        btnSaveAndSubmit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSaveAndSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveAndSubmit.setText("Save and Submit");
        btnSaveAndSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveAndSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(btnSaveAndSubmit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSaveAndSubmit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveAndSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveAndSubmitActionPerformed
    if(jTextArea1.getText().isEmpty() || jTextArea2.getText().isEmpty() || 
       jTextArea3.getText().isEmpty() || jTextArea4.getText().isEmpty() ||
       jTextArea5.getText().isEmpty() || jTextArea6.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please answer all the questions.",
        "Error", JOptionPane.ERROR_MESSAGE);
    }else{
    WorkRequest workrq = orgBkgdck.getWorkQueue().searchRequest(wr.getNo());
    RiskAssessment ra = new RiskAssessment();
    ra.setQuestion1(jTextArea1.getText());ra.setQuestion2(jTextArea2.getText());
    ra.setQuestion3(jTextArea3.getText());ra.setQuestion4(jTextArea4.getText());
    ra.setQuestion5(jTextArea5.getText());ra.setQuestion6(jTextArea6.getText());
    workrq.getRiskAssessmentDirectory().getRiskAssessmentList().add(ra);
    wr.getRiskAssessmentDirectory().getRiskAssessmentList().add(ra);
    JOptionPane.showMessageDialog(null, "Submitted Successfully!");
    userProcessContainer.remove(this);
    CardLayout layout = (CardLayout)userProcessContainer.getLayout();
    layout.previous(userProcessContainer);
    }
    }//GEN-LAST:event_btnSaveAndSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveAndSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    // End of variables declaration//GEN-END:variables
}
