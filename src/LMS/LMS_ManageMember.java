/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LMS;


import DBConnection.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import SPMS.dbConnection;

/**
 *
 * @author sanjalee
 */
public class LMS_ManageMember extends javax.swing.JInternalFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public LMS_ManageMember() {
        initComponents();
        
        conn = DBConnect.connect();
        
        try {
            tableload();
        } catch (SQLException ex) {
            Logger.getLogger(LMS_ManageMember.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tableload() throws SQLException{
    
        String sql_viewMembers = "SELECT id, name, gender, grade, address FROM lms_member";
        pst = conn.prepareStatement(sql_viewMembers);
        rs = pst.executeQuery();
    
        jTableMembers.setModel(DbUtils.resultSetToTableModel(rs));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        searchmember = new javax.swing.JPanel();
        labelName = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        btnSearchMember = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMembers = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        labelIDForm = new javax.swing.JLabel();
        idTextForm = new javax.swing.JTextField();
        labelNameForm = new javax.swing.JLabel();
        nameTextForm = new javax.swing.JTextField();
        labelGenderForm = new javax.swing.JLabel();
        maleradio = new javax.swing.JRadioButton();
        femaleradio = new javax.swing.JRadioButton();
        labelAddressForm = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        addressTextForm = new javax.swing.JTextArea();
        labelGradeForm = new javax.swing.JLabel();
        gradecombo = new javax.swing.JComboBox();
        btnaddmember = new javax.swing.JButton();
        btnUpdateMember = new javax.swing.JButton();
        btnDeleteMember = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(32767, 32767));

        searchmember.setBackground(new java.awt.Color(255, 255, 230));

        labelName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelName.setForeground(new java.awt.Color(0, 26, 77));
        labelName.setText("Name");

        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });

        btnSearchMember.setBackground(new java.awt.Color(255, 173, 51));
        btnSearchMember.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearchMember.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchMember.setText("Search");
        btnSearchMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchMemberActionPerformed(evt);
            }
        });

        jTableMembers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableMembers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMembersMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableMembers);

        jPanel12.setBackground(new java.awt.Color(255, 255, 230));

        labelIDForm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelIDForm.setForeground(new java.awt.Color(0, 26, 77));
        labelIDForm.setText("ID");

        idTextForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFormActionPerformed(evt);
            }
        });

        labelNameForm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelNameForm.setForeground(new java.awt.Color(0, 26, 77));
        labelNameForm.setText("Name");

        labelGenderForm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelGenderForm.setForeground(new java.awt.Color(0, 26, 77));
        labelGenderForm.setText("Gender");

        buttonGroup1.add(maleradio);
        maleradio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        maleradio.setForeground(new java.awt.Color(0, 26, 77));
        maleradio.setText("Male");

        buttonGroup1.add(femaleradio);
        femaleradio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        femaleradio.setForeground(new java.awt.Color(0, 26, 77));
        femaleradio.setText("female");

        labelAddressForm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelAddressForm.setForeground(new java.awt.Color(0, 26, 77));
        labelAddressForm.setText("address");

        addressTextForm.setColumns(20);
        addressTextForm.setRows(5);
        jScrollPane15.setViewportView(addressTextForm);

        labelGradeForm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelGradeForm.setForeground(new java.awt.Color(0, 26, 77));
        labelGradeForm.setText("Grade");

        gradecombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11" }));
        gradecombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradecomboActionPerformed(evt);
            }
        });

        btnaddmember.setBackground(new java.awt.Color(0, 179, 60));
        btnaddmember.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnaddmember.setForeground(new java.awt.Color(255, 255, 255));
        btnaddmember.setText("Insert");
        btnaddmember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddmemberActionPerformed(evt);
            }
        });

        btnUpdateMember.setBackground(new java.awt.Color(0, 77, 153));
        btnUpdateMember.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdateMember.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateMember.setText("Update");
        btnUpdateMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateMemberActionPerformed(evt);
            }
        });

        btnDeleteMember.setBackground(new java.awt.Color(255, 26, 26));
        btnDeleteMember.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDeleteMember.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteMember.setText("Delete");
        btnDeleteMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteMemberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelNameForm))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelIDForm)
                            .addComponent(labelGenderForm)
                            .addComponent(labelAddressForm)
                            .addComponent(labelGradeForm))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gradecombo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(maleradio)
                                .addGap(41, 41, 41)
                                .addComponent(femaleradio))
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nameTextForm, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(idTextForm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnaddmember)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdateMember)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteMember)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIDForm)
                    .addComponent(idTextForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNameForm)
                    .addComponent(nameTextForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelGenderForm)
                    .addComponent(maleradio)
                    .addComponent(femaleradio))
                .addGap(47, 47, 47)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAddressForm)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelGradeForm)
                    .addComponent(gradecombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnaddmember)
                    .addComponent(btnUpdateMember)
                    .addComponent(btnDeleteMember))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        btnReset.setBackground(new java.awt.Color(255, 173, 51));
        btnReset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchmemberLayout = new javax.swing.GroupLayout(searchmember);
        searchmember.setLayout(searchmemberLayout);
        searchmemberLayout.setHorizontalGroup(
            searchmemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchmemberLayout.createSequentialGroup()
                .addGroup(searchmemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchmemberLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(labelName)
                        .addGap(44, 44, 44)
                        .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btnSearchMember, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReset))
                    .addGroup(searchmemberLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(501, Short.MAX_VALUE))
        );
        searchmemberLayout.setVerticalGroup(
            searchmemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchmemberLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(searchmemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchMember)
                    .addComponent(btnReset))
                .addGap(38, 38, 38)
                .addGroup(searchmemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(341, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1415, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(searchmember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 917, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(searchmember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextActionPerformed

    private void btnSearchMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchMemberActionPerformed
        
        String name = nameText.getText();
        
        String sql_searchMember = "SELECT id, name, gender, grade, address FROM lms_member WHERE name LIKE '%"+ name +"%'";
        
        
        try {
            pst = conn.prepareStatement(sql_searchMember);
            
            rs = pst.executeQuery();
    
            jTableMembers.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(LMS_ManageMember.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnSearchMemberActionPerformed

    private void idTextFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextFormActionPerformed

    private void gradecomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradecomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gradecomboActionPerformed

    private void btnaddmemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddmemberActionPerformed
        int id = Integer.parseInt(idTextForm.getText());
        String name = nameTextForm.getText();
        String address = addressTextForm.getText();
        String grade = gradecombo.getSelectedItem().toString();
        maleradio.setActionCommand("male");
        femaleradio.setActionCommand("female");
        String gender = buttonGroup1.getSelection().getActionCommand();
        
        
        
        String sql_addMember = String.format("INSERT INTO lms_member(id,name,gender,grade,address) "
                + "VALUES(%d,'%s','%s','%s','%s')", id, name, gender, grade, address );
        //System.out.println(sql_addMember);
        
        try {
            pst = conn.prepareStatement(sql_addMember);
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(LMS_ManageMember.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        JOptionPane.showMessageDialog(null,"Entered Successfully!!");
        
        idTextForm.setText(null);
        nameTextForm.setText(null);
        addressTextForm.setText(null);
        
        try {
            tableload();
        } catch (SQLException ex) {
            Logger.getLogger(LMS_ManageMember.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnaddmemberActionPerformed

    private void btnUpdateMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateMemberActionPerformed
        
        int isConfirmed = JOptionPane.showConfirmDialog(null, "Do you really want to update this information?");
        
        if(isConfirmed == 0){
        
            int id = Integer.parseInt(idTextForm.getText());
            String name = nameTextForm.getText();
            String address = addressTextForm.getText();
            String grade = gradecombo.getSelectedItem().toString();
            maleradio.setActionCommand("male");
            femaleradio.setActionCommand("female");
            String gender = buttonGroup1.getSelection().getActionCommand();
            
            String sql_updateMember = "UPDATE lms_member "
                                    + "SET id = '"+ id +"', name = '"+ name +"', gender = '"+ gender +"', "
                                    + "grade = '"+ grade +"', address = '"+ address +"' "
                                    + "WHERE id = '"+ id +"'";
            try {
                pst = conn.prepareStatement(sql_updateMember);
                pst.execute();
            } catch (SQLException ex) {
                Logger.getLogger(LMS_ManageMember.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                tableload();
            } catch (SQLException ex) {
                Logger.getLogger(LMS_ManageMember.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        } 
    }//GEN-LAST:event_btnUpdateMemberActionPerformed

    private void jTableMembersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMembersMouseClicked
        
        int raw = jTableMembers.getSelectedRow();
        
        String id = jTableMembers.getValueAt(raw, 0).toString();
        String name = jTableMembers.getValueAt(raw, 1).toString();
        String gender = jTableMembers.getValueAt(raw, 2).toString();
        String grade = jTableMembers.getValueAt(raw, 3).toString();
        String address = jTableMembers.getValueAt(raw, 4).toString();
        
        idTextForm.setText(id);
        nameTextForm.setText(name);
        addressTextForm.setText(address);
        gradecombo.setSelectedItem(grade);
        if(gender.equals("male")){
        
            maleradio.setSelected(true);
        
        }
        else{
        
            femaleradio.setSelected(true);
        
        }
    }//GEN-LAST:event_jTableMembersMouseClicked

    private void btnDeleteMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteMemberActionPerformed
        
        int isConfirmed = JOptionPane.showConfirmDialog(null, "Do you really want to delete this information?");
        
        if(isConfirmed == 0){
        
           int id = Integer.parseInt(idTextForm.getText());
           
           String sql_DeleteMember = "DELETE FROM lms_member WHERE id = '"+ id +"'";
            try {
                pst = conn.prepareStatement(sql_DeleteMember);
                pst.execute();
            } catch (SQLException ex) {
                Logger.getLogger(LMS_ManageMember.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            try {
                tableload();
            } catch (SQLException ex) {
                Logger.getLogger(LMS_ManageMember.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            idTextForm.setText(null);
            nameTextForm.setText(null);
            addressTextForm.setText(null);
        
        }
        
    }//GEN-LAST:event_btnDeleteMemberActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        try {
            tableload();
        } catch (SQLException ex) {
            Logger.getLogger(LMS_ManageMember.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnResetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addressTextForm;
    private javax.swing.JButton btnDeleteMember;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearchMember;
    private javax.swing.JButton btnUpdateMember;
    private javax.swing.JButton btnaddmember;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton femaleradio;
    private javax.swing.JComboBox gradecombo;
    private javax.swing.JTextField idTextForm;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableMembers;
    private javax.swing.JLabel labelAddressForm;
    private javax.swing.JLabel labelGenderForm;
    private javax.swing.JLabel labelGradeForm;
    private javax.swing.JLabel labelIDForm;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelNameForm;
    private javax.swing.JRadioButton maleradio;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField nameTextForm;
    private javax.swing.JPanel searchmember;
    // End of variables declaration//GEN-END:variables
}