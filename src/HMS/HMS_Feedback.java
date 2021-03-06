/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Hashini
 */
public class HMS_Feedback extends javax.swing.JInternalFrame {
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
//    
//    public String driver = "com.microsoft.jdbc.SQLServerDriver";
//    public String url = "jdbcsqlserver://localhost::24809:databaseName=smsDB";
//    public String user = "adminK";
//    public String pw = "adminK";
    
    /**
     * Creates new form Feedback
     */
    public HMS_Feedback() {
        initComponents();
        
//         Class.forName(driver);
//        conn=DriverManger.getConnection(url,user,pw);
        
//         conn = DBConnect.connect();
 conn = DBConnection.DBConnect.connect();
         tableload();
         
         
         
         
    }
    
   
            
            
            
     
      public void tableload(){
        try {
            String sql = "SELECT Feedback_ID,Feedback FROM hms_feedback";
        
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            fbTable.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (SQLException e) {
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

        feedbackPanel1 = new javax.swing.JPanel();
        feedbox = new javax.swing.JLabel();
        feedID = new javax.swing.JLabel();
        fbID_txt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        fbDesc_txt = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        fbTable = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1250, 620));
        setMinimumSize(new java.awt.Dimension(1250, 620));
        setPreferredSize(new java.awt.Dimension(1250, 620));

        feedbackPanel1.setBackground(new java.awt.Color(204, 204, 255));
        feedbackPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter Feedback", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 36), new java.awt.Color(0, 0, 204))); // NOI18N
        feedbackPanel1.setMaximumSize(new java.awt.Dimension(1250, 620));
        feedbackPanel1.setMinimumSize(new java.awt.Dimension(1250, 620));
        feedbackPanel1.setPreferredSize(new java.awt.Dimension(1250, 620));

        feedbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        feedbox.setText("Feedback");

        feedID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        feedID.setText("Feedback ID");

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG_HMS/insert.png"))); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG_HMS/delete.png"))); // NOI18N
        jButton2.setText("Remove");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG_HMS/find.png"))); // NOI18N
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 204, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG_HMS/view.png"))); // NOI18N
        jButton5.setText("View");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        fbDesc_txt.setColumns(20);
        fbDesc_txt.setRows(5);
        fbDesc_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fbDesc_txtKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(fbDesc_txt);

        jButton6.setBackground(new java.awt.Color(204, 204, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG_HMS/update.png"))); // NOI18N
        jButton6.setText("Update");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        fbTable.setModel(new javax.swing.table.DefaultTableModel(
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
        fbTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fbTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(fbTable);

        jButton7.setBackground(new java.awt.Color(204, 204, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setText("Clear");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 204, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Feedback Report");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout feedbackPanel1Layout = new javax.swing.GroupLayout(feedbackPanel1);
        feedbackPanel1.setLayout(feedbackPanel1Layout);
        feedbackPanel1Layout.setHorizontalGroup(
            feedbackPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, feedbackPanel1Layout.createSequentialGroup()
                .addGroup(feedbackPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(feedbackPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addGroup(feedbackPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(feedbackPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, feedbackPanel1Layout.createSequentialGroup()
                                .addGroup(feedbackPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, feedbackPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(feedbackPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2)))
                                .addGap(18, 18, 18))
                            .addGroup(feedbackPanel1Layout.createSequentialGroup()
                                .addGroup(feedbackPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(feedID)
                                    .addComponent(feedbox))
                                .addGap(44, 44, 44)
                                .addGroup(feedbackPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fbID_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(335, 335, 335))
        );
        feedbackPanel1Layout.setVerticalGroup(
            feedbackPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(feedbackPanel1Layout.createSequentialGroup()
                .addComponent(jButton4)
                .addGap(22, 22, 22)
                .addGroup(feedbackPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(feedbackPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(feedbackPanel1Layout.createSequentialGroup()
                        .addGroup(feedbackPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(feedID)
                            .addComponent(fbID_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(feedbackPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(feedbackPanel1Layout.createSequentialGroup()
                                .addComponent(feedbox)
                                .addGap(186, 186, 186))
                            .addGroup(feedbackPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(feedbackPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(jButton2)
                                    .addComponent(jButton6))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(feedbackPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton5)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(186, 186, 186))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(feedbackPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(feedbackPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        int confirmupdate = JOptionPane.showConfirmDialog(null, "Do you really want to update this record ?","Update",JOptionPane.YES_NO_OPTION);

        if(confirmupdate==0){

            try{
                String sql = "UPDATE hms_feedback SET Feedback=?WHERE Feedback_ID=?";

                pst = conn.prepareStatement(sql);

                pst.setString(2, fbID_txt.getText());

                pst.setString(1,fbDesc_txt.getText());

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Record Updated Successfully !");

                tableload();

            }

            catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        
    }//GEN-LAST:event_jButton6ActionPerformed
    }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        feedbackPanel1.removeAll();
        HMS_View_Feedback viewall =new HMS_View_Feedback ();
        feedbackPanel1.add(viewall).setVisible(true);
    
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        feedbackPanel1.removeAll();
        HMS_Search_FeedBack  Sfb1= new  HMS_Search_FeedBack  ();
        feedbackPanel1.add(Sfb1).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int confirmdelete = JOptionPane.showConfirmDialog(null, "Do you really want to delete this record ?","Delete",JOptionPane.YES_NO_OPTION);

        if(confirmdelete==0){

            try{
                String sql = "DELETE FROM hms_feedback WHERE Feedback_ID=?";

                pst = conn.prepareStatement(sql);

                pst.setString(1,fbID_txt.getText());

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Record Deleted Successfully !");

                tableload();
            }

            catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

         
          String feedback = fbDesc_txt.getText();
          
        //check null fields
        
        // if(confirminsert == 0){
        
        if( feedback.isEmpty()) {
                 
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Complete all the input fields!!");
        }
        else{
            //String pattern =  fbID_txt.getText().trim();
           // fbDesc_txt.setText(pattern);
        
        try{
            String sql = "INSERT INTO hms_feedback"
            + "(Feedback)"
            + "VALUES (?)";

            pst = conn.prepareStatement(sql);

         pst.setString(1,fbDesc_txt.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record Inserted Successfully !");

            tableload();

        }

        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed
    }
    private void fbTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fbTableMouseClicked

//mouse clicking event on the table        
                
          int r = fbTable.getSelectedRow();
        
        String Feedback_ID = fbTable.getValueAt(r, 0).toString();
        String Feedback = fbTable.getValueAt(r, 1).toString();
        
        fbID_txt.setText( Feedback_ID);
        fbDesc_txt.setText(Feedback);
    }//GEN-LAST:event_fbTableMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       
        fbID_txt.setText(" ");
        fbDesc_txt.setText(" ");
       
      
    }//GEN-LAST:event_jButton7ActionPerformed

    private void fbDesc_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fbDesc_txtKeyTyped
       
  
    }//GEN-LAST:event_fbDesc_txtKeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     
          //SELECT * FROM hms_feedback
          
          try {
            String feedback_report = "C:\\xampp\\htdocs\\ITP\\IREPORTS\\HMS_FeedbackN.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(feedback_report);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, conn);
            JasperViewer.viewReport(jp, false);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea fbDesc_txt;
    private javax.swing.JTextField fbID_txt;
    private javax.swing.JTable fbTable;
    private javax.swing.JLabel feedID;
    private javax.swing.JPanel feedbackPanel1;
    private javax.swing.JLabel feedbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
