/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.CustomerWorkArea;

import business.Organization.Organization;
import business.RiskAssessment.RiskAssessment;
import business.UserAccount.UserAccount;
import business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dhwani
 */
public class ViewOrders extends javax.swing.JPanel {

    /**
     * Creates new form ViewOrders
     */
    private JPanel userProcessContainer;
    private UserAccount account; 
    private Organization orgBkgdck;
    ViewOrders(JPanel userProcessContainer, UserAccount account, Organization orgBkgdck) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.orgBkgdck = orgBkgdck;
        populateTable();
    }
    public void populateTable(){
    DefaultTableModel dtm = (DefaultTableModel)tblOrderDetails.getModel();
    dtm.setRowCount(0);
    for(WorkRequest wr: account.getWorkQueue().getWorkRequest()){
    Object[] row = new Object[4];
    row[0] = wr.getNo();
    row[1] = wr.getFireArms();
    row[2] = wr;
    row[3] = wr.getMessage();
    dtm.addRow(row);
    }
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
        tblOrderDetails = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(19, 115, 163));

        tblOrderDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order No", "Ordered Item", "Status", "Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrderDetails);

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Take Risk Assessment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("View Order(s)");

        btnBack.setBackground(new java.awt.Color(0, 153, 153));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    int selectedRow = tblOrderDetails.getSelectedRow();
    if(selectedRow>=0){
    RiskAssessment raa = null;
    int no = (Integer)tblOrderDetails.getValueAt(selectedRow, 0);
    WorkRequest wr = (WorkRequest)tblOrderDetails.getValueAt(selectedRow, 2);
    for(RiskAssessment ra : wr.getRiskAssessmentDirectory().getRiskAssessmentList()){
        raa = ra;
        break;
    }
    try{
    if(!raa.equals(null)){
    JOptionPane.showMessageDialog(null, "Risk assessment already taken for order no " + no);
    }}catch(NullPointerException e){
    RiskAssessmentJPanel panel = new RiskAssessmentJPanel(userProcessContainer, wr, orgBkgdck);
    userProcessContainer.add("RiskAssessmentJPanel", panel);
    CardLayout layout = (CardLayout)userProcessContainer.getLayout();
    layout.next(userProcessContainer);
    }
    }            else{
            JOptionPane.showMessageDialog(null, "Please Select any Row");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblOrderDetails;
    // End of variables declaration//GEN-END:variables
}
