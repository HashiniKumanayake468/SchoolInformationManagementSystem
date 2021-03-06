/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Hashini
 */
public class HMS_Search_FeedBack extends javax.swing.JInternalFrame {
    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
//    public String driver = "com.microsoft.jdbc.SQLServerDriver";
//    public String url = "jdbcsqlserver://localhost::24809:databaseName=smsDB";
//    public String user = "adminK";
//    public String pw = "adminK";
//    

    /**
     * Creates new form Search_FeedBack
     */
    public HMS_Search_FeedBack() {
        initComponents();
        
         conn = DBConnection.DBConnect.connect();
        
//        Class.forName(driver);
//        conn=DriverManger.getConnection(url,user,pw);
//        
//         conn = DBConnect.connect();
         
         viewFeedbackTable();
    }
    
    
 public void viewFeedbackTable(){
        
        try{
            
        String sql1 = "SELECT * FROM hms_feedback";
        pst = conn.prepareStatement(sql1);
        rs = pst.executeQuery();
        fbSearchTable.setModel(DbUtils.resultSetToTableModel(rs));
        
        }
        
        catch(Exception e ){
            
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
        jLabel2 = new javax.swing.JLabel();
        fbBack_But = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fbSearchTxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        fbSearchTable = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(1200, 535));
        setMinimumSize(new java.awt.Dimension(1200, 535));
        setPreferredSize(new java.awt.Dimension(1200, 535));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Search Feedback");

        fbBack_But.setBackground(new java.awt.Color(204, 204, 255));
        fbBack_But.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fbBack_But.setText("Back");
        fbBack_But.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fbBack_ButActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Type Feedback ID To Search Feedback");

        fbSearchTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fbSearchTxtActionPerformed(evt);
            }
        });
        fbSearchTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fbSearchTxtKeyReleased(evt);
            }
        });

        fbSearchTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(fbSearchTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(55, 55, 55)
                                .addComponent(fbSearchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(556, 556, 556)
                        .addComponent(fbBack_But)))
                .addContainerGap(668, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fbSearchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fbBack_But)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fbBack_ButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fbBack_ButActionPerformed
       
        jPanel2.removeAll();
        HMS_Feedback viewall =new HMS_Feedback ();
        jPanel2.add(viewall).setVisible(true);
    }//GEN-LAST:event_fbBack_ButActionPerformed

    private void fbSearchTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fbSearchTxtActionPerformed

       
        /*DefaultTableModel table =(DefaultTableModel)jTable2.getModel();
        String search=jTextField1.getText();
        TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(table);
        jTable2.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));

        try{
            String sql="SELECT * FROM hms_payment WHERE pid=?";

            pst=con.prepareStatement(sql);
            pst.setString(1,jTextField1.getText());
            rs=pst.executeQuery();

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }*/

    }//GEN-LAST:event_fbSearchTxtActionPerformed

    private void fbSearchTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fbSearchTxtKeyReleased
  
        DefaultTableModel table =(DefaultTableModel)fbSearchTable.getModel();
        String search=fbSearchTxt.getText();
        TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(table);
        fbSearchTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));

        try{
            
            String sql="SELECT * FROM hms_feedback WHERE Feedback_ID=?";

            pst=conn.prepareStatement(sql);
            pst.setString(1,fbSearchTxt.getText());
            rs=pst.executeQuery();

        }
        
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_fbSearchTxtKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fbBack_But;
    private javax.swing.JTable fbSearchTable;
    private javax.swing.JTextField fbSearchTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
