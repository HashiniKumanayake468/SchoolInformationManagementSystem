/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CMS;
import DBConnection.DBConnect;
import SPMS.dbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author user
 */
public class CMS_viewCategory extends javax.swing.JInternalFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
//    public String driver = "com.microsoft.jdbc.SQLServerDriver";
//    public String url = "jdbcsqlserver://localhost::24809:databaseName=smsDB";
//    public String user = "adminK";
//    public String pw = "admink";
    
    public CMS_viewCategory() throws ClassNotFoundException, SQLException {
        initComponents();
       
        
//         Class.forName(driver);
//conn=DriverManager.getConnection(url, user, pw);   

         conn = DBConnect.connect();
        viewcms_category();
       // currentDateAndTime();
        
    }
    
   
    
     public void viewcms_category() throws ClassNotFoundException{
        
        try{
//            Class.forName(driver);
//            conn=DriverManager.getConnection(url, user, pw);
        String sql = "SELECT * FROM cms_category";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery(sql);
        jTable_viewCategory.setModel(DbUtils.resultSetToTableModel(rs));
        
        }
        catch(SQLException e ){
            JOptionPane.showMessageDialog(null, e);
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

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_viewCategory = new javax.swing.JTable();
        VFC_btn_ = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1256, 800));
        setMinimumSize(new java.awt.Dimension(1256, 800));
        setPreferredSize(new java.awt.Dimension(1256, 800));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "View Food Category Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(153, 0, 153))); // NOI18N
        jPanel2.setMaximumSize(new java.awt.Dimension(1240, 448));
        jPanel2.setMinimumSize(new java.awt.Dimension(1240, 448));
        jPanel2.setPreferredSize(new java.awt.Dimension(1240, 448));

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setMaximumSize(new java.awt.Dimension(850, 310));
        jPanel3.setMinimumSize(new java.awt.Dimension(850, 310));
        jPanel3.setPreferredSize(new java.awt.Dimension(850, 310));

        jTable_viewCategory.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable_viewCategory.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable_viewCategory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jTable_viewCategory.setColumnSelectionAllowed(true);
        jTable_viewCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_viewCategoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_viewCategory);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        VFC_btn_.setBackground(new java.awt.Color(0, 0, 102));
        VFC_btn_.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        VFC_btn_.setForeground(new java.awt.Color(255, 255, 255));
        VFC_btn_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG_CMS/backTo.png"))); // NOI18N
        VFC_btn_.setText("BACK");
        VFC_btn_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VFC_btn_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(VFC_btn_, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VFC_btn_))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 258, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 322, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VFC_btn_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VFC_btn_ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_VFC_btn_ActionPerformed

    private void jTable_viewCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_viewCategoryMouseClicked
        // TODO add your handling code here:
//        int r = jTable_viewCategory.getSelectedRow();
//        String catId = jTable_viewCategory.getValueAt(r, 0).toString();
//        String catName = jTable_viewCategory.getValueAt(r, 1).toString();
//        String itemName = jTable_viewCategory.getValueAt(r, 2).toString();
        
        //cidBox.setText(catId);
        
    }//GEN-LAST:event_jTable_viewCategoryMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VFC_btn_;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_viewCategory;
    // End of variables declaration//GEN-END:variables
}
