/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminWorkArea;

import business.EcoSystem;
import business.Network.Network;
import business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Dhwani
 */
public class ManageCustomerWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form ManageCustomerWorkArea
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    ManageCustomerWorkArea(JPanel userProcessContainer, EcoSystem business) {
       initComponents();
       this.userProcessContainer = userProcessContainer;
       this.business = business;
       populateTable();
    }
        public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)tblCustDetails.getModel();
        dtm.setRowCount(0);
        for(Network network : business.getNetworkList()){
        for(UserAccount userAcc : network.getUserAccountDirectory().getUserAccountList()){
        Object[] row = new Object[5];
        row[0] = network;
        row[1] = userAcc.getCustomer().getId();
        row[2] = userAcc;
        row[3] = userAcc.getCustomer().getfName();
        row[4] = userAcc.getCustomer().getlName();
        dtm.addRow(row);
        }}
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
        tblCustDetails = new javax.swing.JTable();
        btnFndCust = new javax.swing.JButton();
        txtUserName = new javax.swing.JTextField();
        btnNewCust = new javax.swing.JButton();
        btnUpdCust = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(19, 115, 163));

        tblCustDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Network", "Customer Id", "User Name", "First Name", "Last Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCustDetails);

        btnFndCust.setBackground(new java.awt.Color(0, 153, 153));
        btnFndCust.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFndCust.setForeground(new java.awt.Color(255, 255, 255));
        btnFndCust.setText("Find Customer");
        btnFndCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFndCustActionPerformed(evt);
            }
        });

        btnNewCust.setBackground(new java.awt.Color(0, 153, 153));
        btnNewCust.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNewCust.setForeground(new java.awt.Color(255, 255, 255));
        btnNewCust.setText("New Customer");
        btnNewCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewCustActionPerformed(evt);
            }
        });

        btnUpdCust.setBackground(new java.awt.Color(0, 153, 153));
        btnUpdCust.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdCust.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdCust.setText("Update Customer");
        btnUpdCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdCustActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 153, 153));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Manage Customer");

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
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnFndCust, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnNewCust, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnUpdCust, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBack)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFndCust, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNewCust, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdCust, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnFndCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFndCustActionPerformed
         char flag = 0;
        if(txtUserName.getText().isEmpty()){
       JOptionPane.showMessageDialog(null, "Please enter user name to search.",
        "Error", JOptionPane.ERROR_MESSAGE);
     }else {
     for(Network network : business.getNetworkList()){
     for(UserAccount userAccount : network.getUserAccountDirectory().getUserAccountList()){
     if(userAccount.getUsername().equals(txtUserName.getText())){
     UpdateCustomer panel = new UpdateCustomer(userProcessContainer, userAccount, network);
     userProcessContainer.add("UpdateCustomer", panel);
     CardLayout layout = (CardLayout)userProcessContainer.getLayout();
     layout.next(userProcessContainer);
     flag = 'X';}}}
     if(flag!='X'){
     JOptionPane.showMessageDialog(null, "No Customer found.",
     "Error", JOptionPane.ERROR_MESSAGE);
     }
     }
    }//GEN-LAST:event_btnFndCustActionPerformed

    private void btnNewCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewCustActionPerformed
      CreateCustomer panel = new CreateCustomer(userProcessContainer, business);
      userProcessContainer.add("CreateCustomer", panel);
      CardLayout layout = (CardLayout)userProcessContainer.getLayout();
      layout.next(userProcessContainer);
    }//GEN-LAST:event_btnNewCustActionPerformed

    private void btnUpdCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdCustActionPerformed
        int selectedRow = tblCustDetails.getSelectedRow();
    if(selectedRow>=0){
        Network network = (Network)tblCustDetails.getValueAt(selectedRow, 0);
        UserAccount userAccount = (UserAccount)tblCustDetails.getValueAt(selectedRow, 2);
        UpdateCustomer panel = new UpdateCustomer(userProcessContainer, userAccount, network);
        userProcessContainer.add("UpdateCustomer", panel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }else{
        JOptionPane.showMessageDialog(null, "Please Select any Row");
        }        
    }//GEN-LAST:event_btnUpdCustActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
     userProcessContainer.remove(this);
     CardLayout layout = (CardLayout)userProcessContainer.getLayout();
     layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnFndCust;
    private javax.swing.JButton btnNewCust;
    private javax.swing.JButton btnUpdCust;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCustDetails;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
