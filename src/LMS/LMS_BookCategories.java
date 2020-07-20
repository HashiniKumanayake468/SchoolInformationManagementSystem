/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LMS;
import DBConnection.DBConnect;
import SPMS.dbConnection;

import LMS.code.Category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author sanjalee
 */
public class LMS_BookCategories extends javax.swing.JInternalFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public LMS_BookCategories() {
        initComponents();
        
         conn = DBConnect.connect();
        
        tableload();
        
    }
    
    public void tableload(){
    
        String sql_viewCategories = "SELECT * FROM lms_category";
        try {
            pst = conn.prepareStatement(sql_viewCategories);
            rs = pst.executeQuery();
    
            jTablecategory.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(LMS_BookCategories.class.getName()).log(Level.SEVERE, null, ex);
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

        viewcategorypanel = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTablecategory = new javax.swing.JTable();
        btn_addcategory = new javax.swing.JButton();
        btnupdatecategory = new javax.swing.JButton();
        btndeletecategory = new javax.swing.JButton();
        categorybox = new javax.swing.JTextField();
        labelid = new javax.swing.JLabel();

        viewcategorypanel.setBackground(new java.awt.Color(255, 255, 230));

        jTablecategory.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablecategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablecategoryMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTablecategory);

        btn_addcategory.setBackground(new java.awt.Color(0, 179, 60));
        btn_addcategory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_addcategory.setForeground(new java.awt.Color(255, 255, 255));
        btn_addcategory.setText("Insert");
        btn_addcategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addcategoryActionPerformed(evt);
            }
        });

        btnupdatecategory.setBackground(new java.awt.Color(0, 77, 153));
        btnupdatecategory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnupdatecategory.setForeground(new java.awt.Color(255, 255, 255));
        btnupdatecategory.setText("Update");
        btnupdatecategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdatecategoryActionPerformed(evt);
            }
        });

        btndeletecategory.setBackground(new java.awt.Color(255, 26, 26));
        btndeletecategory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btndeletecategory.setForeground(new java.awt.Color(255, 255, 255));
        btndeletecategory.setText("Delete");
        btndeletecategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeletecategoryActionPerformed(evt);
            }
        });

        labelid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelid.setForeground(new java.awt.Color(0, 26, 77));
        labelid.setText("ID");

        javax.swing.GroupLayout viewcategorypanelLayout = new javax.swing.GroupLayout(viewcategorypanel);
        viewcategorypanel.setLayout(viewcategorypanelLayout);
        viewcategorypanelLayout.setHorizontalGroup(
            viewcategorypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewcategorypanelLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(viewcategorypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewcategorypanelLayout.createSequentialGroup()
                        .addGroup(viewcategorypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(viewcategorypanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(viewcategorypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnupdatecategory, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btndeletecategory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(viewcategorypanelLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(categorybox, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btn_addcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(169, 169, 169))
                    .addGroup(viewcategorypanelLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(labelid)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        viewcategorypanelLayout.setVerticalGroup(
            viewcategorypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewcategorypanelLayout.createSequentialGroup()
                .addGroup(viewcategorypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewcategorypanelLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(labelid)
                        .addGap(42, 42, 42)
                        .addGroup(viewcategorypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_addcategory)
                            .addComponent(categorybox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(btnupdatecategory)
                        .addGap(31, 31, 31)
                        .addComponent(btndeletecategory))
                    .addGroup(viewcategorypanelLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(358, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewcategorypanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(viewcategorypanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addcategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addcategoryActionPerformed

        String category = categorybox.getText();

        Category c = new Category();
        try {
            c.addCategory(category);
        } catch (SQLException ex) {
            Logger.getLogger(LMS_LibraryManagementSystem_1.class.getName()).log(Level.SEVERE, null, ex);
        }

        categorybox.setText(null);
        
        tableload();

    }//GEN-LAST:event_btn_addcategoryActionPerformed

    private void btndeletecategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeletecategoryActionPerformed
        
        int isConfirmed = JOptionPane.showConfirmDialog(null, "Do you really want to delete this information?");
        
        Category categoryinstance = new Category();
        
        if(isConfirmed == 0){
        
            String category = categorybox.getText();
            int id = 0;
            try {
                id = categoryinstance.getOne(category);
            } catch (SQLException ex) {
                Logger.getLogger(LMS_BookCategories.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            String sql_DeleteCategory = "DELETE FROM lms_category WHERE id = '"+ id +"'";
            
            try {
                pst = conn.prepareStatement(sql_DeleteCategory);
                pst.execute();
            } catch (SQLException ex) {
                Logger.getLogger(LMS_BookCategories.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            labelid.setText("ID");
            categorybox.setText(null);
            
            tableload();
        
        }
    }//GEN-LAST:event_btndeletecategoryActionPerformed

    private void btnupdatecategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdatecategoryActionPerformed
        
        int isConfirmed = JOptionPane.showConfirmDialog(null, "Do you really want to update this information?");
        
        Category categoryinstance = new Category();
        
        if(isConfirmed == 0){
            
            String category = categorybox.getText();
            int id = Integer.parseInt(labelid.getText());
            
            categoryinstance.update(category, id);

            labelid.setText("ID");
            categorybox.setText(null);

            tableload();
        }
    }//GEN-LAST:event_btnupdatecategoryActionPerformed

    private void jTablecategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablecategoryMouseClicked
        
        int raw = jTablecategory.getSelectedRow();
        
        String id = jTablecategory.getValueAt(raw, 0).toString();
        String category = jTablecategory.getValueAt(raw, 1).toString();
        
        labelid.setText(id);
        categorybox.setText(category);
    }//GEN-LAST:event_jTablecategoryMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addcategory;
    private javax.swing.JButton btndeletecategory;
    private javax.swing.JButton btnupdatecategory;
    private javax.swing.JTextField categorybox;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTablecategory;
    private javax.swing.JLabel labelid;
    private javax.swing.JPanel viewcategorypanel;
    // End of variables declaration//GEN-END:variables
}
