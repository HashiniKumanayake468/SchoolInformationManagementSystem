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
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Hashini
 */
public class HMS_Hostal_Account extends javax.swing.JInternalFrame {
    
     Connection conn = null;
     PreparedStatement pst = null;
     ResultSet rs = null;
     
//    public String driver = "com.microsoft.jdbc.SQLServerDriver";
//    public String url = "jdbcsqlserver://localhost::24809:databaseName=smsDB";
//    public String user = "adminK";
//    public String pw = "adminK";
    
    

    /**
     * Creates new form Hostal_Account
     */
    public HMS_Hostal_Account() {
        initComponents();
        
         conn = DBConnection.DBConnect.connect();
//        Class.forName(driver);
//        conn=DriverManger.getConnection(url,user,pw);
        
//        conn = DBConnect.connect();
//        
        tableload();
    }
    
     public void tableload(){
        try {
            String sql = "SELECT AccountID,SHID,Amount,Transaction_Date,Description FROM hms_hostelaccount";
        
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            haTable.setModel(DbUtils.resultSetToTableModel(rs));
            
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

        HostalAcc_Panel1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        haAccNoBx_txt = new javax.swing.JTextField();
        haID_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        haExpenseBx_but = new javax.swing.JTextField();
        haDesc_txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        haDate_DateCH = new com.toedter.calendar.JDateChooser();
        haADD_but = new javax.swing.JButton();
        haUPDATE_but = new javax.swing.JButton();
        haREMOVE_but = new javax.swing.JButton();
        haSEARCH_but = new javax.swing.JButton();
        haVIEW_but = new javax.swing.JButton();
        haCLEAR_but = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        haTable = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(1200, 620));
        setMinimumSize(new java.awt.Dimension(1200, 620));
        setPreferredSize(new java.awt.Dimension(1200, 620));

        HostalAcc_Panel1.setBackground(new java.awt.Color(204, 204, 255));
        HostalAcc_Panel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hostel Account", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 36), new java.awt.Color(0, 0, 255))); // NOI18N
        HostalAcc_Panel1.setMaximumSize(new java.awt.Dimension(1200, 720));
        HostalAcc_Panel1.setMinimumSize(new java.awt.Dimension(1200, 720));
        HostalAcc_Panel1.setPreferredSize(new java.awt.Dimension(1200, 720));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Add Expenses", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(0, 0, 204))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Account No");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Description");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Expense");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("SHID");

        haExpenseBx_but.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                haExpenseBx_butKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Date");

        haDate_DateCH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                haDate_DateCHKeyTyped(evt);
            }
        });

        haADD_but.setBackground(new java.awt.Color(204, 204, 255));
        haADD_but.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        haADD_but.setText("Add Expense");
        haADD_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                haADD_butActionPerformed(evt);
            }
        });

        haUPDATE_but.setBackground(new java.awt.Color(204, 204, 255));
        haUPDATE_but.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        haUPDATE_but.setText("Update Expense");
        haUPDATE_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                haUPDATE_butActionPerformed(evt);
            }
        });

        haREMOVE_but.setBackground(new java.awt.Color(204, 204, 255));
        haREMOVE_but.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        haREMOVE_but.setText("Remove Expense");
        haREMOVE_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                haREMOVE_butActionPerformed(evt);
            }
        });

        haSEARCH_but.setBackground(new java.awt.Color(204, 204, 255));
        haSEARCH_but.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        haSEARCH_but.setText("Search Expense");
        haSEARCH_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                haSEARCH_butActionPerformed(evt);
            }
        });

        haVIEW_but.setBackground(new java.awt.Color(204, 204, 255));
        haVIEW_but.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        haVIEW_but.setText("View Expense");
        haVIEW_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                haVIEW_butActionPerformed(evt);
            }
        });

        haCLEAR_but.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        haCLEAR_but.setText("Clear");
        haCLEAR_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                haCLEAR_butActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(haDesc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(haExpenseBx_but, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                            .addComponent(haID_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                            .addComponent(haAccNoBx_txt)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(haDate_DateCH, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(haUPDATE_but, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(haADD_but, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(haREMOVE_but, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(haSEARCH_but, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(haVIEW_but, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(haCLEAR_but)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(haAccNoBx_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(haID_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(haExpenseBx_but, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(haDate_DateCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(haDesc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(haADD_but)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(haUPDATE_but)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(haREMOVE_but)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(haSEARCH_but)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(haVIEW_but)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(haCLEAR_but, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(42, 42, 42))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        haTable.setModel(new javax.swing.table.DefaultTableModel(
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
        haTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                haTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(haTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout HostalAcc_Panel1Layout = new javax.swing.GroupLayout(HostalAcc_Panel1);
        HostalAcc_Panel1.setLayout(HostalAcc_Panel1Layout);
        HostalAcc_Panel1Layout.setHorizontalGroup(
            HostalAcc_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HostalAcc_Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(HostalAcc_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HostalAcc_Panel1Layout.createSequentialGroup()
                        .addGap(537, 537, 537)
                        .addComponent(jLabel5))
                    .addGroup(HostalAcc_Panel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(260, Short.MAX_VALUE))
        );
        HostalAcc_Panel1Layout.setVerticalGroup(
            HostalAcc_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HostalAcc_Panel1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(HostalAcc_Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HostalAcc_Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HostalAcc_Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void haVIEW_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_haVIEW_butActionPerformed

        HostalAcc_Panel1.removeAll();
        HMS_View_HostelAccount   Vha1 = new  HMS_View_HostelAccount();
        HostalAcc_Panel1.add(Vha1).setVisible(true);
    }//GEN-LAST:event_haVIEW_butActionPerformed

    private void haSEARCH_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_haSEARCH_butActionPerformed

        HostalAcc_Panel1.removeAll();
        HMS_Search_HostelACC   Sha1 = new  HMS_Search_HostelACC();
        HostalAcc_Panel1.add(Sha1).setVisible(true);
    }//GEN-LAST:event_haSEARCH_butActionPerformed

    private void haREMOVE_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_haREMOVE_butActionPerformed

        int confirmdelete = JOptionPane.showConfirmDialog(null, "Do you really want to delete this record ?","Delete",JOptionPane.YES_NO_OPTION);

        if(confirmdelete==0){

            try{
                String sql = "DELETE FROM hms_hostelaccount WHERE AccountID=?";

                pst = conn.prepareStatement(sql);

                pst.setString(1,haAccNoBx_txt.getText());

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Record Deleted Successfully !");
                
                  tableload();
            }

            catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);

              
            }

        }
    }//GEN-LAST:event_haREMOVE_butActionPerformed

    private void haUPDATE_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_haUPDATE_butActionPerformed

        try{
            String sql = "UPDATE hms_hostelaccount SET SHID=?,Amount=?,Transaction_Date=? ,Description=?WHERE AccountID=?";

            pst = conn.prepareStatement(sql);

            pst.setString(5, haAccNoBx_txt.getText());

            pst.setString(1,haID_txt.getText());

            pst.setString(2, haExpenseBx_but.getText());

            pst.setString(3,((JTextField)haDate_DateCH.getDateEditor().getUiComponent()).getText());

            pst.setString(4, haDesc_txt.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record Updated Successfully !");

            tableload();
        }

        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);

        }

        // int confirmupdate = JOptionPane.showConfirmDialog(null, "Do you really want to update this record ?","Update",JOptionPane.YES_NO_OPTION);

        //  if(confirmupdate==0){
            // if(isEmpty()){
                // if(!txt_pid.getText().isEmpty()){

                    //  try{
                        //    String sql = "UPDATE hms_hostelaccount SET SHID=?,Amount=?,Transaction_Date=?,Description=? WHERE AccountID=?";

                        //conn = DriverManager.getConnection("jdbc:mysql://localhost/iuds","root","");

                        // pst = con.prepareStatement(sql);

                        // pst.setString(5,accNobx.getText());

                        // pst.setString(1,H_shidbx.getText());
                        // pst.setString(2,expensebx.getText());
                        //  pst.setString(3,descriptionbx.getText());
                        //  pst.setString(4,((JTextField)trnsctDatebx.getDateEditor().getUiComponent()).getText());

                        //  pst.executeUpdate();
                        //  JOptionPane.showMessageDialog(null, "Record Updated Successfully !");
                        //
                        // catch(Exception ex){
                            // JOptionPane.showMessageDialog(null, ex);
                            // }

                        //showTableData();
                        //}
                    //  }
                // }

    }//GEN-LAST:event_haUPDATE_butActionPerformed

    private void haADD_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_haADD_butActionPerformed
        //int confirmupdate = JOptionPane.showConfirmDialog(null, "Do you really want to update this record ?","Update",JOptionPane.YES_NO_OPTION);

        // if(confirmupdate==0){
            // if(isEmpty()){
                // if(!txt_pid.getText().isEmpty()){

                    try{
                        String sql = "INSERT INTO hms_hostelaccount"
                        + "(AccountID,SHID,Amount,Transaction_Date,Description)"
                        + "VALUES (?,?,?,?,?)";

                        //con = DriverManager.getConnection("jdbc:mysql://localhost/iuds","root","");

                        pst = conn.prepareStatement(sql);

                        pst = conn.prepareStatement(sql);
                        
                        pst.setString(1,haAccNoBx_txt.getText());

                        pst.setString(2,haID_txt.getText());

                        pst.setString(3, haExpenseBx_but.getText());

                        pst.setString(4,((JTextField)haDate_DateCH.getDateEditor().getUiComponent()).getText());

                        pst.setString(5, haDesc_txt.getText());

                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Record Inserted Successfully !");
                        tableload();

                    }
                    catch(Exception ex){

                        JOptionPane.showMessageDialog(null, ex);
                        
                       

                    }
    }//GEN-LAST:event_haADD_butActionPerformed

    private void haTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_haTableMouseClicked

        
        //mouse clicking event on the table
        
        int r = haTable.getSelectedRow();

        String AccountID = haTable.getValueAt(r, 0).toString();
        String SHID = haTable.getValueAt(r, 1).toString();
        String Amount = haTable.getValueAt(r, 2).toString();
        String trnsctDatebx = haTable.getValueAt(r, 3).toString();

        String Description = haTable.getValueAt(r, 4).toString();
        
     try{  
         
        Date date=new SimpleDateFormat("MMM d,yyyy").parse(trnsctDatebx);
        haAccNoBx_txt.setText(AccountID);
        haID_txt.setText(SHID);
        haExpenseBx_but.setText(Amount);
        haDate_DateCH.setDate(date);
        haDesc_txt.setText(Description);
       }
     
    catch(Exception e){
          JOptionPane.showMessageDialog(null,e);
      }
   
    }//GEN-LAST:event_haTableMouseClicked

    private void haCLEAR_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_haCLEAR_butActionPerformed
        
        haAccNoBx_txt.setText(" ");
        haID_txt.setText(" ");
        haExpenseBx_but.setText(" ");
        haDate_DateCH.setCalendar(null);
        haDesc_txt.setText(" ");
        
    }//GEN-LAST:event_haCLEAR_butActionPerformed

    private void haExpenseBx_butKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_haExpenseBx_butKeyTyped
      
            char c = evt.getKeyChar();
        if(!(Character.isDigit(c)||(c==com.sun.glass.events.KeyEvent.VK_BACKSPACE)||(c==com.sun.glass.events.KeyEvent.VK_DELETE))){
            getToolkit().beep();
            evt.consume();
            
        }     
    }//GEN-LAST:event_haExpenseBx_butKeyTyped

    private void haDate_DateCHKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_haDate_DateCHKeyTyped
      
            char c = evt.getKeyChar();
        if(!(Character.isDigit(c)||(c==com.sun.glass.events.KeyEvent.VK_BACKSPACE)||(c==com.sun.glass.events.KeyEvent.VK_DELETE))){
            getToolkit().beep();
            evt.consume();
            
        }     
    }//GEN-LAST:event_haDate_DateCHKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HostalAcc_Panel1;
    private javax.swing.JButton haADD_but;
    private javax.swing.JTextField haAccNoBx_txt;
    private javax.swing.JButton haCLEAR_but;
    private com.toedter.calendar.JDateChooser haDate_DateCH;
    private javax.swing.JTextField haDesc_txt;
    private javax.swing.JTextField haExpenseBx_but;
    private javax.swing.JTextField haID_txt;
    private javax.swing.JButton haREMOVE_but;
    private javax.swing.JButton haSEARCH_but;
    private javax.swing.JTable haTable;
    private javax.swing.JButton haUPDATE_but;
    private javax.swing.JButton haVIEW_but;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
