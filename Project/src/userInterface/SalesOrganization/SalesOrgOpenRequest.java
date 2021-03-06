/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.SalesOrganization;

import business.Organization.Organization;
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
public class SalesOrgOpenRequest extends javax.swing.JPanel {

    /**
     * Creates new form SalesOrgOpenRequest
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization organization;

    SalesOrgOpenRequest(JPanel userProcessContainer, UserAccount account, Organization organization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblOpenReq.getModel();
        dtm.setRowCount(0);
        for (WorkRequest wr : organization.getWorkQueue().getWorkRequest()) {
            if (!wr.getStatus().equalsIgnoreCase("Order Accepted")) {
                Object[] row = new Object[5];
                row[0] = wr.getNo();
                row[1] = wr.getFireArms();
                row[2] = wr.getFireArms().getSku();
                row[3] = wr;
                row[4] = wr.getMessage();
                dtm.addRow(row);
            }
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
        tblOpenReq = new javax.swing.JTable();
        btnAcceptOrd = new javax.swing.JButton();
        btnDecOrd = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(19, 115, 163));

        tblOpenReq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order No", "Order Item", "SKU", "Status", "Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOpenReq);

        btnAcceptOrd.setBackground(new java.awt.Color(0, 153, 153));
        btnAcceptOrd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAcceptOrd.setForeground(new java.awt.Color(255, 255, 255));
        btnAcceptOrd.setText("Accept Order");
        btnAcceptOrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptOrdActionPerformed(evt);
            }
        });

        btnDecOrd.setBackground(new java.awt.Color(0, 153, 153));
        btnDecOrd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDecOrd.setForeground(new java.awt.Color(255, 255, 255));
        btnDecOrd.setText("Decline Order");
        btnDecOrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecOrdActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 153, 153));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("<< Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Open Request(s)");

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
                            .addComponent(jButton3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(btnAcceptOrd)
                                .addGap(18, 18, 18)
                                .addComponent(btnDecOrd))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel1)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAcceptOrd)
                    .addComponent(btnDecOrd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcceptOrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptOrdActionPerformed
        int selectedRow = tblOpenReq.getSelectedRow();
        if (selectedRow >= 0) {
            WorkRequest wr = (WorkRequest) tblOpenReq.getValueAt(selectedRow, 3);
            if (wr.getStatus().equalsIgnoreCase("Approved")) {
                JOptionPane.showMessageDialog(null, "Order Accepted");
                wr.setStatus("Order Accepted");
                wr.setMessage("Item Despatched");
                populateTable();
            } else {
                JOptionPane.showMessageDialog(null, "Request not yet approved by police");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select any row");
        }
    }//GEN-LAST:event_btnAcceptOrdActionPerformed

    private void btnDecOrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecOrdActionPerformed
        int selectedRow = tblOpenReq.getSelectedRow();
        if (selectedRow >= 0) {
            WorkRequest wr = (WorkRequest) tblOpenReq.getValueAt(selectedRow, 3);
            if (wr.getStatus().equalsIgnoreCase("Rejected")){ 
            JOptionPane.showMessageDialog(null, "Order Rejected");
            wr.setStatus("Order Declined");
            wr.setMessage("Item not Delivered");
            populateTable();}
            else{
            JOptionPane.showMessageDialog(null, "Request pending with police");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select any row");
        }
    }//GEN-LAST:event_btnDecOrdActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceptOrd;
    private javax.swing.JButton btnDecOrd;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblOpenReq;
    // End of variables declaration//GEN-END:variables
}
