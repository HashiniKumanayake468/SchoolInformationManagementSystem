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
public class HMS_FemaleStudent_Details extends javax.swing.JInternalFrame {
    
    
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
        
//    public String driver = "com.microsoft.jdbc.SQLServerDriver";
//    public String url = "jdbcsqlserver://localhost::24809:databaseName=smsDB";
//    public String user = "adminK";
//    public String pw = "adminK";
    

    /**
     * Creates new form HMS_FemaleStudent_Details
     */
    public HMS_FemaleStudent_Details() {
        initComponents();
        
//          Class.forName(driver);
//        conn=DriverManger.getConnection(url,user,pw);
        
//         conn = DBConnect.connect();
 conn = DBConnection.DBConnect.connect();
         
         tableload();
    }
    
    public void tableload(){
        try {
            String sql = "SELECT SHID,First_Name,Last_Name,Date_Of_Birth,Parent_Name,Parent_Phone,Grade,Class FROM hms_femaleboarders";
        
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            F_tbl.setModel(DbUtils.resultSetToTableModel(rs));
            
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

        j_PANEL = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        F_tbl = new javax.swing.JTable();
        B_hid = new javax.swing.JLabel();
        B_fname = new javax.swing.JLabel();
        B_lname = new javax.swing.JLabel();
        B_dob = new javax.swing.JLabel();
        B_pname = new javax.swing.JLabel();
        F_pnameBox_txt = new javax.swing.JTextField();
        F_DOB_dateCH = new com.toedter.calendar.JDateChooser();
        F_lnameBox_txt = new javax.swing.JTextField();
        F_hidBox_txt = new javax.swing.JTextField();
        F_fnameBox_txt = new javax.swing.JTextField();
        B_pphone = new javax.swing.JLabel();
        B_grade = new javax.swing.JLabel();
        B_class = new javax.swing.JLabel();
        F_classBox_txt = new javax.swing.JTextField();
        F_gradeBox_txt = new javax.swing.JTextField();
        F_pphoneBox_txt = new javax.swing.JTextField();
        F_ADD_but = new javax.swing.JButton();
        F_SEARCH_but = new javax.swing.JButton();
        F_VIEW_but = new javax.swing.JButton();
        F_Back_but = new javax.swing.JButton();
        F_UPDATE_but = new javax.swing.JButton();
        F_REMOVE_but = new javax.swing.JButton();
        F_clear_but = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1200, 650));
        setMinimumSize(new java.awt.Dimension(1200, 650));
        setPreferredSize(new java.awt.Dimension(1200, 650));

        j_PANEL.setBackground(new java.awt.Color(204, 204, 255));
        j_PANEL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        j_PANEL.setMaximumSize(new java.awt.Dimension(1200, 650));
        j_PANEL.setMinimumSize(new java.awt.Dimension(1200, 650));
        j_PANEL.setPreferredSize(new java.awt.Dimension(1200, 650));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 204));
        jLabel14.setText("Boarder Details");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        F_tbl.setModel(new javax.swing.table.DefaultTableModel(
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
        F_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F_tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(F_tbl);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        B_hid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        B_hid.setText("Student HID");

        B_fname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        B_fname.setText("First Name");

        B_lname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        B_lname.setText("Last Name");

        B_dob.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        B_dob.setText("Date Of Birth");

        B_pname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        B_pname.setText("Parent Name");

        F_pnameBox_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_pnameBox_txtActionPerformed(evt);
            }
        });
        F_pnameBox_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                F_pnameBox_txtKeyTyped(evt);
            }
        });

        F_lnameBox_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                F_lnameBox_txtKeyTyped(evt);
            }
        });

        F_fnameBox_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_fnameBox_txtActionPerformed(evt);
            }
        });
        F_fnameBox_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                F_fnameBox_txtKeyTyped(evt);
            }
        });

        B_pphone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        B_pphone.setText("Parent's Phone");

        B_grade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        B_grade.setText("Grade");

        B_class.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        B_class.setText("Class");

        F_classBox_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_classBox_txtActionPerformed(evt);
            }
        });
        F_classBox_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                F_classBox_txtKeyTyped(evt);
            }
        });

        F_gradeBox_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_gradeBox_txtActionPerformed(evt);
            }
        });
        F_gradeBox_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                F_gradeBox_txtKeyTyped(evt);
            }
        });

        F_pphoneBox_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_pphoneBox_txtActionPerformed(evt);
            }
        });
        F_pphoneBox_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                F_pphoneBox_txtKeyTyped(evt);
            }
        });

        F_ADD_but.setBackground(new java.awt.Color(204, 204, 255));
        F_ADD_but.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        F_ADD_but.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG_HMS/insert.png"))); // NOI18N
        F_ADD_but.setText("Add");
        F_ADD_but.setMaximumSize(new java.awt.Dimension(133, 41));
        F_ADD_but.setMinimumSize(new java.awt.Dimension(133, 41));
        F_ADD_but.setPreferredSize(new java.awt.Dimension(133, 41));
        F_ADD_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_ADD_butActionPerformed(evt);
            }
        });

        F_SEARCH_but.setBackground(new java.awt.Color(204, 204, 255));
        F_SEARCH_but.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        F_SEARCH_but.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG_HMS/find.png"))); // NOI18N
        F_SEARCH_but.setText("Search");
        F_SEARCH_but.setMaximumSize(new java.awt.Dimension(133, 41));
        F_SEARCH_but.setMinimumSize(new java.awt.Dimension(133, 41));
        F_SEARCH_but.setPreferredSize(new java.awt.Dimension(133, 41));
        F_SEARCH_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_SEARCH_butActionPerformed(evt);
            }
        });

        F_VIEW_but.setBackground(new java.awt.Color(204, 204, 255));
        F_VIEW_but.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        F_VIEW_but.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG_HMS/view.png"))); // NOI18N
        F_VIEW_but.setText("View");
        F_VIEW_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_VIEW_butActionPerformed(evt);
            }
        });

        F_Back_but.setBackground(new java.awt.Color(204, 204, 255));
        F_Back_but.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        F_Back_but.setText("Back");
        F_Back_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_Back_butActionPerformed(evt);
            }
        });

        F_UPDATE_but.setBackground(new java.awt.Color(204, 204, 255));
        F_UPDATE_but.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        F_UPDATE_but.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG_HMS/update.png"))); // NOI18N
        F_UPDATE_but.setText("Update");
        F_UPDATE_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_UPDATE_butActionPerformed(evt);
            }
        });

        F_REMOVE_but.setBackground(new java.awt.Color(204, 204, 255));
        F_REMOVE_but.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        F_REMOVE_but.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG_HMS/delete.png"))); // NOI18N
        F_REMOVE_but.setText("Remove");
        F_REMOVE_but.setMaximumSize(new java.awt.Dimension(133, 41));
        F_REMOVE_but.setMinimumSize(new java.awt.Dimension(133, 41));
        F_REMOVE_but.setPreferredSize(new java.awt.Dimension(133, 41));
        F_REMOVE_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_REMOVE_butActionPerformed(evt);
            }
        });

        F_clear_but.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        F_clear_but.setText("Clear");
        F_clear_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_clear_butActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout j_PANELLayout = new javax.swing.GroupLayout(j_PANEL);
        j_PANEL.setLayout(j_PANELLayout);
        j_PANELLayout.setHorizontalGroup(
            j_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(j_PANELLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(j_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(j_PANELLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(j_PANELLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(666, 904, Short.MAX_VALUE))))
            .addGroup(j_PANELLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(j_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(j_PANELLayout.createSequentialGroup()
                        .addGroup(j_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B_lname)
                            .addComponent(B_fname)
                            .addComponent(B_pname)
                            .addGroup(j_PANELLayout.createSequentialGroup()
                                .addGroup(j_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(B_hid)
                                    .addComponent(B_dob))
                                .addGap(50, 50, 50)
                                .addGroup(j_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(F_fnameBox_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(F_hidBox_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(F_lnameBox_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(F_DOB_dateCH, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(F_pnameBox_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(29, 29, 29)
                        .addGroup(j_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B_grade)
                            .addComponent(B_class)
                            .addComponent(B_pphone))
                        .addGap(32, 32, 32)
                        .addGroup(j_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(j_PANELLayout.createSequentialGroup()
                                .addComponent(F_pphoneBox_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(F_ADD_but, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(j_PANELLayout.createSequentialGroup()
                                .addGroup(j_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(F_gradeBox_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(F_classBox_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(j_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(F_SEARCH_but, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(F_VIEW_but, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(j_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(F_REMOVE_but, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(F_UPDATE_but, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(F_Back_but, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, j_PANELLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(F_clear_but)
                        .addGap(91, 91, 91)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        j_PANELLayout.setVerticalGroup(
            j_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(j_PANELLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGroup(j_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(j_PANELLayout.createSequentialGroup()
                        .addGroup(j_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(j_PANELLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(j_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(B_hid)
                                    .addComponent(F_hidBox_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(j_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(B_fname)
                                    .addComponent(F_fnameBox_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(j_PANELLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(j_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(B_pphone)
                                    .addComponent(F_pphoneBox_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(j_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(B_grade)
                                    .addComponent(F_gradeBox_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)))
                        .addGroup(j_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B_lname)
                            .addGroup(j_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(F_lnameBox_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(B_class)
                                .addComponent(F_classBox_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(j_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(j_PANELLayout.createSequentialGroup()
                                .addComponent(B_dob)
                                .addGap(7, 7, 7)
                                .addComponent(B_pname))
                            .addGroup(j_PANELLayout.createSequentialGroup()
                                .addComponent(F_DOB_dateCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(F_pnameBox_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47))
                    .addGroup(j_PANELLayout.createSequentialGroup()
                        .addGroup(j_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(F_ADD_but, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(F_REMOVE_but, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(j_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(F_SEARCH_but, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(F_UPDATE_but))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(j_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(F_VIEW_but, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(F_Back_but, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F_clear_but)))
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(j_PANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(j_PANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void F_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F_tblMouseClicked

        //moue clicking event on the tabel
           int r = F_tbl.getSelectedRow();
        
        String SHID = F_tbl.getValueAt(r, 0).toString();
        String First_Name = F_tbl.getValueAt(r, 1).toString();
        String Last_Name = F_tbl.getValueAt(r, 2).toString();
        String Date_Of_Birth = F_tbl.getValueAt(r, 3).toString();
        String Parent_Name = F_tbl.getValueAt(r, 4).toString();
        String Parent_Phone = F_tbl.getValueAt(r, 5).toString();
        String Grade = F_tbl.getValueAt(r, 6).toString();
        String Class = F_tbl.getValueAt(r, 7).toString();
       
     
        try{
        Date date=new SimpleDateFormat("MMM d,yyyy").parse(Date_Of_Birth);
       
        F_hidBox_txt.setText(SHID);
        F_fnameBox_txt.setText(First_Name);
        F_lnameBox_txt.setText(Last_Name);
        F_DOB_dateCH.setDate(date);
        F_pnameBox_txt.setText(Parent_Name);
        F_pphoneBox_txt.setText(Parent_Phone);
        F_gradeBox_txt.setText(Grade);
        F_classBox_txt.setText(Class);
       
        }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null,e);
                    }
        
    }//GEN-LAST:event_F_tblMouseClicked

    private void F_pnameBox_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_pnameBox_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F_pnameBox_txtActionPerformed

    private void F_pnameBox_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_F_pnameBox_txtKeyTyped

        char c = evt.getKeyChar();
        if(!((Character.isAlphabetic(c))||(c==com.sun.glass.events.KeyEvent.VK_BACKSPACE)||(c==com.sun.glass.events.KeyEvent.VK_DELETE))){
            getToolkit().beep();
            evt.consume();

    }//GEN-LAST:event_F_pnameBox_txtKeyTyped
    }
    private void F_lnameBox_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_F_lnameBox_txtKeyTyped

        char c = evt.getKeyChar();
        if(!((Character.isAlphabetic(c))||(c==com.sun.glass.events.KeyEvent.VK_BACKSPACE)||(c==com.sun.glass.events.KeyEvent.VK_DELETE))){
            getToolkit().beep();
            evt.consume();

    }//GEN-LAST:event_F_lnameBox_txtKeyTyped
    }
    private void F_fnameBox_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_fnameBox_txtActionPerformed

    }//GEN-LAST:event_F_fnameBox_txtActionPerformed

    private void F_fnameBox_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_F_fnameBox_txtKeyTyped

        char c = evt.getKeyChar();
        if(!((Character.isAlphabetic(c))||(c==com.sun.glass.events.KeyEvent.VK_BACKSPACE)||(c==com.sun.glass.events.KeyEvent.VK_DELETE))){
            getToolkit().beep();
            evt.consume();

    }//GEN-LAST:event_F_fnameBox_txtKeyTyped
    }
    private void F_classBox_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_classBox_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F_classBox_txtActionPerformed

    private void F_gradeBox_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_gradeBox_txtActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_F_gradeBox_txtActionPerformed

    private void F_gradeBox_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_F_gradeBox_txtKeyTyped

        char c = evt.getKeyChar();
        if(!(Character.isDigit(c)||(c==com.sun.glass.events.KeyEvent.VK_BACKSPACE)||(c==com.sun.glass.events.KeyEvent.VK_DELETE))){
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_F_gradeBox_txtKeyTyped

    private void F_pphoneBox_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_pphoneBox_txtActionPerformed

    }//GEN-LAST:event_F_pphoneBox_txtActionPerformed

    private void F_pphoneBox_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_F_pphoneBox_txtKeyTyped

        char c = evt.getKeyChar();
        if(!(Character.isDigit(c)||(c==com.sun.glass.events.KeyEvent.VK_BACKSPACE)||(c==com.sun.glass.events.KeyEvent.VK_DELETE))){
            getToolkit().beep();
            evt.consume();

        }

    }//GEN-LAST:event_F_pphoneBox_txtKeyTyped

    private void F_ADD_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_ADD_butActionPerformed

        try {
            String sql = "INSERT INTO hms_femaleboarders"
            + "(First_Name,Last_Name,Date_Of_Birth,Parent_Name,Parent_Phone,Grade,Class)"
            + "VALUES (?,?,?,?,?,?,?)";

            pst = conn.prepareStatement(sql);

            pst.setString(1, F_fnameBox_txt.getText());

            pst.setString(2, F_lnameBox_txt.getText());

            pst.setString(3, ((JTextField) F_DOB_dateCH.getDateEditor().getUiComponent()).getText());

            pst.setString(4, F_pnameBox_txt.getText());

            pst.setString(5, F_pphoneBox_txt.getText());

            pst.setString(6, F_gradeBox_txt.getText());

            pst.setString(7, F_classBox_txt.getText());

           

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record Inserted Successfully !");

            tableload();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    
    }//GEN-LAST:event_F_ADD_butActionPerformed

    private void F_SEARCH_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_SEARCH_butActionPerformed

        j_PANEL.removeAll();
        HMS_Search_Female   Ssd2 = new  HMS_Search_Female();
        j_PANEL.add(Ssd2).setVisible(true);
    }//GEN-LAST:event_F_SEARCH_butActionPerformed

    private void F_VIEW_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_VIEW_butActionPerformed

        j_PANEL.removeAll();
        HMS_View_FemaleBoarders  Vsd2 = new  HMS_View_FemaleBoarders();
        j_PANEL.add(Vsd2).setVisible(true);
    }//GEN-LAST:event_F_VIEW_butActionPerformed

    private void F_Back_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_Back_butActionPerformed

        j_PANEL.removeAll();
        HMS_BoardersINFO viewall =new HMS_BoardersINFO ();
        j_PANEL.add(viewall).setVisible(true);
    }//GEN-LAST:event_F_Back_butActionPerformed

    private void F_UPDATE_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_UPDATE_butActionPerformed
        try{
            String sql = "UPDATE hms_femaleboarders SET First_Name=?,Last_Name=?,Date_Of_Birth=?,Parent_Name=?,Parent_Phone=?,Grade=?,Class=? WHERE SHID=?";

            pst = conn.prepareStatement(sql);

            pst.setString(8, F_hidBox_txt.getText());

            pst.setString(1,F_fnameBox_txt.getText());

            pst.setString(2, F_lnameBox_txt.getText());

            pst.setString(3,((JTextField)F_DOB_dateCH.getDateEditor().getUiComponent()).getText());

            pst.setString(4, F_pnameBox_txt.getText());

            pst.setString(5, F_pphoneBox_txt.getText());

            pst.setString(6,F_gradeBox_txt.getText());

            pst.setString(7,F_classBox_txt.getText());

           

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record Updated Successfully !");

            tableload();
        }

        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_F_UPDATE_butActionPerformed

    private void F_REMOVE_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_REMOVE_butActionPerformed

        int confirmdelete = JOptionPane.showConfirmDialog(null, "Do you really want to delete this record ?","Delete",JOptionPane.YES_NO_OPTION);

        if(confirmdelete==0){

            try{
                String sql = "DELETE FROM hms_femaleboarders WHERE SHID=?";

                pst = conn.prepareStatement(sql);

                pst.setString(1,F_hidBox_txt.getText());

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Record Deleted Successfully !");

                tableload();
            }

            catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }

        }
    }//GEN-LAST:event_F_REMOVE_butActionPerformed

    private void F_clear_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_clear_butActionPerformed

        F_hidBox_txt.setText(" ");
        F_fnameBox_txt.setText(" ");
        F_lnameBox_txt.setText(" ");
        F_DOB_dateCH.setCalendar(null);
        F_pnameBox_txt.setText(" ");
        F_pphoneBox_txt.setText(" ");
        F_gradeBox_txt.setText(" ");
        F_classBox_txt.setText(" ");
        
    }//GEN-LAST:event_F_clear_butActionPerformed

    private void F_classBox_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_F_classBox_txtKeyTyped
       
          char c = evt.getKeyChar();
        if(!((Character.isAlphabetic(c))||(c==com.sun.glass.events.KeyEvent.VK_BACKSPACE)||(c==com.sun.glass.events.KeyEvent.VK_DELETE))){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_F_classBox_txtKeyTyped
          

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel B_class;
    private javax.swing.JLabel B_dob;
    private javax.swing.JLabel B_fname;
    private javax.swing.JLabel B_grade;
    private javax.swing.JLabel B_hid;
    private javax.swing.JLabel B_lname;
    private javax.swing.JLabel B_pname;
    private javax.swing.JLabel B_pphone;
    private javax.swing.JButton F_ADD_but;
    private javax.swing.JButton F_Back_but;
    private com.toedter.calendar.JDateChooser F_DOB_dateCH;
    private javax.swing.JButton F_REMOVE_but;
    private javax.swing.JButton F_SEARCH_but;
    private javax.swing.JButton F_UPDATE_but;
    private javax.swing.JButton F_VIEW_but;
    private javax.swing.JTextField F_classBox_txt;
    private javax.swing.JButton F_clear_but;
    private javax.swing.JTextField F_fnameBox_txt;
    private javax.swing.JTextField F_gradeBox_txt;
    private javax.swing.JTextField F_hidBox_txt;
    private javax.swing.JTextField F_lnameBox_txt;
    private javax.swing.JTextField F_pnameBox_txt;
    private javax.swing.JTextField F_pphoneBox_txt;
    private javax.swing.JTable F_tbl;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel j_PANEL;
    // End of variables declaration//GEN-END:variables
}
