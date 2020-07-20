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
public class HMS_Search_HostelACC extends javax.swing.JInternalFrame {
    
    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
//    public String driver = "com.microsoft.jdbc.SQLServerDriver";
//    public String url = "jdbcsqlserver://localhost::24809:databaseName=smsDB";
//    public String user = "adminK";
//    public String pw = "adminK";
    /**
     * Creates new form Search_HostelACC
     */
    public HMS_Search_HostelACC() {
        
        initComponents();
        
         conn = DBConnection.DBConnect.connect();
//        
//        Class.forName(driver);
//        conn=DriverManger.getConnection(url,user,pw);
        
          
//        conn = DBConnect.connect();
        viewAccountTable();
    }
    
     public void viewAccountTable(){
        
        try{
            
        String sql1 = "SELECT * FROM hms_hostelaccount";
        pst = conn.prepareStatement(sql1);
        rs = pst.executeQuery();
        haSearch_tble.setModel(DbUtils.resultSetToTableModel(rs));
        
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
    @SuppressWarnings("uncheckejTextField1d")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        haSearch_txt = new javax.swing.JTextField();
        haSearchBack_but = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        haSearch_tble = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(1200, 620));
        setMinimumSize(new java.awt.Dimension(1200, 620));
        setPreferredSize(new java.awt.Dimension(1200, 620));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(1200, 720));
        jPanel2.setMinimumSize(new java.awt.Dimension(1200, 720));
        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 720));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Type Account No To Search Expenses");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 204));
        jLabel10.setText("Search Expenses");

        haSearch_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                haSearch_txtActionPerformed(evt);
            }
        });
        haSearch_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                haSearch_txtKeyReleased(evt);
            }
        });

        haSearchBack_but.setBackground(new java.awt.Color(204, 204, 255));
        haSearchBack_but.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        haSearchBack_but.setText("Back");
        haSearchBack_but.setToolTipText("");
        haSearchBack_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                haSearchBack_butActionPerformed(evt);
            }
        });

        haSearch_tble.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(haSearch_tble);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(haSearch_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 193, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(haSearchBack_but)
                .addGap(314, 314, 314))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(haSearch_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(haSearchBack_but)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(571, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void haSearch_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_haSearch_txtActionPerformed
       
       /* DefaultTableModel table =(DefaultTableModel)jTable1.getModel();
        String search=jTextField2.getText();
        TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(table);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
        
        
        try{
            String sql="SELECT * FROM hms_payment WHERE pid=?";
            
            pst=con.prepareStatement(sql);
            pst.setString(1,jTextField2.getText());
            rs=pst.executeQuery();
            
            
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }*/

    }//GEN-LAST:event_haSearch_txtActionPerformed

    private void haSearchBack_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_haSearchBack_butActionPerformed
      
        jPanel2.removeAll();
        HMS_Hostal_Account viewall =new HMS_Hostal_Account ();
        jPanel2.add(viewall).setVisible(true);
       
        
    }//GEN-LAST:event_haSearchBack_butActionPerformed

    private void haSearch_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_haSearch_txtKeyReleased
     
        DefaultTableModel table =(DefaultTableModel)haSearch_tble.getModel();
        String search=haSearch_txt.getText();
        TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(table);
        haSearch_tble.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
        
        
        try{
            
            String sql="SELECT * FROM hms_hostelaccount WHERE AccountID =?";
            
            pst=conn.prepareStatement(sql);
            pst.setString(1,haSearch_txt.getText());
            rs=pst.executeQuery();
                        
                       
        }
        
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e);
            
        }
    }//GEN-LAST:event_haSearch_txtKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton haSearchBack_but;
    private javax.swing.JTable haSearch_tble;
    private javax.swing.JTextField haSearch_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
