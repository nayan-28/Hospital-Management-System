
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author NAYAN MALAKAR
 */
public class drpatientadddetail extends javax.swing.JFrame {

    /**
     * Creates new form drpatientadddetail
     */
    public drpatientadddetail() {
        initComponents();
        combo();
        medicine();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        patientid = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        firstname = new javax.swing.JTextField();
        secondname = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox();
        date = new javax.swing.JTextField();
        nid = new javax.swing.JTextField();
        patienttype = new javax.swing.JComboBox();
        phoneno = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        disease = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        dailydose = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        refno = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        dose = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        company = new javax.swing.JTextField();
        medicine = new javax.swing.JComboBox();
        bedno = new javax.swing.JComboBox();
        jLabel23 = new javax.swing.JLabel();
        sideeffects = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        details = new javax.swing.JTextArea();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        searchpatient = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(93, 154, 244));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("UPDATE PATIENTS");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system/home.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 764, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 6, 1180, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 165, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("First Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 105, 35));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("Patient ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 77, -1, 35));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 204));
        jLabel5.setText("Maritial Status");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, 35));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 204));
        jLabel6.setText("Age");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 105, 35));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 204));
        jLabel7.setText("Phone No.");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 105, 35));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 204));
        jLabel8.setText("NID");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 55, 35));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 204));
        jLabel9.setText("Gender");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, 35));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 204));
        jLabel11.setText("Bed No.");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 105, 35));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 204));
        jLabel12.setText("Second Name");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, 35));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 204));
        jLabel13.setText("Address");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 105, 35));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 204));
        jLabel14.setText("Patient Type");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 105, 35));
        getContentPane().add(patientid, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 85, 193, 32));

        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 216, 32));
        getContentPane().add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 223, 32));
        getContentPane().add(secondname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 223, 32));
        getContentPane().add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 223, 32));

        gender.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        gender.setForeground(new java.awt.Color(0, 204, 255));
        gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Gender", "Male", "Female", "Other" }));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 216, 33));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 204));
        jLabel15.setText("Date");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 48, 35));

        status.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        status.setForeground(new java.awt.Color(0, 204, 255));
        status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Maritial Status", "Single", "Married", "Engaged" }));
        getContentPane().add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 216, 33));
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 212, 32));

        nid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nidActionPerformed(evt);
            }
        });
        getContentPane().add(nid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 216, 32));

        patienttype.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        patienttype.setForeground(new java.awt.Color(0, 204, 255));
        patienttype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Patient Type", "Indoor Patient", "Outdoor Patient" }));
        patienttype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patienttypeActionPerformed(evt);
            }
        });
        getContentPane().add(patienttype, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 540, 216, 33));

        phoneno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenoActionPerformed(evt);
            }
        });
        getContentPane().add(phoneno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 590, 220, 32));

        search.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        search.setForeground(new java.awt.Color(0, 102, 204));
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system/search.png"))); // NOI18N
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 47, 30));

        update.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        update.setForeground(new java.awt.Color(0, 102, 204));
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system/save-icon--1.png"))); // NOI18N
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 550, -1, 51));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 102, 204));
        jLabel16.setText("Disease");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 105, 35));

        disease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diseaseActionPerformed(evt);
            }
        });
        getContentPane().add(disease, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 220, 32));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 102, 204));
        jLabel18.setText("Discription & Details");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, -1, 35));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 204));
        jLabel10.setText("MEDICINE PRESCRIPTION");
        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 70, 316, 50));

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 204));
        jLabel17.setText("Name Of Tablet");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 130, -1, 35));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 102, 204));
        jLabel19.setText("Ref#");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 250, -1, 35));

        dailydose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dailydoseActionPerformed(evt);
            }
        });
        getContentPane().add(dailydose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 250, 229, 32));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 102, 204));
        jLabel20.setText("Daily Dose");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 290, 105, 35));

        refno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refnoActionPerformed(evt);
            }
        });
        getContentPane().add(refno, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 190, 229, 32));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 102, 204));
        jLabel21.setText("Dose(mg)");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 200, 105, 35));

        dose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doseActionPerformed(evt);
            }
        });
        getContentPane().add(dose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 290, 229, 32));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 102, 204));
        jLabel22.setText("Company");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 350, -1, 35));

        company.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyActionPerformed(evt);
            }
        });
        getContentPane().add(company, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 350, 229, 32));

        medicine.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        medicine.setForeground(new java.awt.Color(0, 204, 255));
        medicine.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Medicine" }));
        medicine.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                medicinePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        getContentPane().add(medicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 130, 229, 42));

        bedno.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                bednoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        getContentPane().add(bedno, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 220, 36));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 102, 204));
        jLabel23.setText("Possible SideEffects");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 410, -1, 35));

        sideeffects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sideeffectsActionPerformed(evt);
            }
        });
        getContentPane().add(sideeffects, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 410, 225, 32));

        details.setColumns(20);
        details.setRows(5);
        jScrollPane1.setViewportView(details);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 329, 253));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 102, 204));
        jLabel24.setText("Nayan Malakar & Nishat Jahan Tandra");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 670, -1, -1));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 102, 204));
        jLabel25.setText("Copy@right");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 670, -1, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system/pat.jpg"))); // NOI18N
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, 690));
        setJMenuBar(searchpatient);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DRPATIENTDETAILS DD = new DRPATIENTDETAILS();
        DD.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void nidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nidActionPerformed

    private void patienttypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patienttypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patienttypeActionPerformed

    private void phonenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonenoActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem","root","190128");
            PreparedStatement pst = conn.prepareStatement("select *from patient where P_id=?");
            pst.setString(1, patientid.getText());
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String fname = rs.getString("FirstName");
                firstname.setText(fname);
                String sname = rs.getString("SecondName");
                secondname.setText(sname);
                String age1 = rs.getString("Age");
                age.setText(age1);
                String mstatus = rs.getString("MaritialStatus");
                status.setSelectedItem(mstatus);
                String gen = rs.getString("Gender");
                gender.setSelectedItem(gen);
                String add = rs.getString("Address");
                address.setText(add);
                String NID = rs.getString("NID");
                nid.setText(NID);
                String ptype = rs.getString("PatientType");
                patienttype.setSelectedItem(ptype);
                String datey = rs.getString("Date");
                date.setText(datey);
                String pno = rs.getString("Phoneno");
                phoneno.setText(pno);
                String bed = rs.getString("BedNo");
                bedno.setSelectedItem(bed);
                String des = rs.getString("disease");
                disease.setText(des);
                String dis = rs.getString("detail");
                details.setText(dis);
                String tablet = rs.getString("tabletname");
                medicine.setSelectedItem(tablet);
                String dd = rs.getString("dailydose");
                dailydose.setText(dd);
            } else {
                JOptionPane.showMessageDialog(null, "No Specific Id Found");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_searchActionPerformed
    private void combo() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem", "root", "190128");

            PreparedStatement pst = conn.prepareStatement("SELECT * FROM hospitalmanagementsystem.bed");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {

                bedno.addItem(rs.getString("bid"));
            }

            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }

    private void medicine() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem", "root", "190128");

            PreparedStatement pst = conn.prepareStatement("SELECT * FROM hospitalmanagementsystem.medicine");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {

                medicine.addItem(rs.getString("name"));

            }

            pst.execute();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem", "root", "190128");
            PreparedStatement pst = conn.prepareStatement("UPDATE patient SET FirstName=?,SecondName=?,Age=?,MaritialStatus=?,Gender=?,Address=?,NID=?,PatientType=?,Date=?,PhoneNo=?,BedNo=?,disease=?,detail=?,tabletname=?,dailydose=? WHERE P_id=?");
            pst.setString(1, firstname.getText());
            pst.setString(2, secondname.getText());
            pst.setString(3, age.getText());
            pst.setString(4, (String) status.getSelectedItem());
            pst.setString(5, (String) gender.getSelectedItem());
            pst.setString(6, address.getText());
            pst.setString(7, nid.getText());
            pst.setString(8, (String) patienttype.getSelectedItem());
            pst.setString(9, date.getText());
            pst.setString(10, phoneno.getText());
            pst.setString(11, bedno.getSelectedItem().toString());
            pst.setString(12, disease.getText());
            pst.setString(13, details.getText());
            pst.setString(14, (String) medicine.getSelectedItem());
            pst.setString(15, dailydose.getText());
            pst.setString(16, patientid.getText());

            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Updated Sucessfully");
            patientid.setText(null);
            firstname.setText(null);
            secondname.setText(null);
            age.setText(null);
            address.setText(null);
            nid.setText(null);
            date.setText(null);
            phoneno.setText(null);
            gender.setSelectedIndex(0);
            status.setSelectedIndex(0);
            patienttype.setSelectedIndex(0);
            disease.setText(null);
            details.setText(null);
            medicine.setSelectedIndex(0);
            dailydose.setText(null);
            refno.setText(null);
            dose.setText(null);
            sideeffects.setText(null);
            company.setText(null);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem", "root", "190128");
            PreparedStatement pst = conn.prepareStatement("insert into patient" + "(disease,detail,tabletname,dailydose,company)" + " values(?,?,?,?,?)");
            pst.setString(1, disease.getText());
            pst.setString(2, details.getText());
            pst.setString(3, (String) medicine.getSelectedItem());
            pst.setString(4, dailydose.getText());
            pst.setString(5, company.getText());
            Object o = bedno.getSelectedItem();
            bedno.removeItem(o);
            if (bedno.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(this,"BEDS FULL");
            }
            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }//GEN-LAST:event_updateActionPerformed

    private void diseaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diseaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diseaseActionPerformed

    private void dailydoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dailydoseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dailydoseActionPerformed

    private void refnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refnoActionPerformed

    private void doseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doseActionPerformed

    private void companyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_companyActionPerformed

    private void sideeffectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sideeffectsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sideeffectsActionPerformed

    private void medicinePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_medicinePopupMenuWillBecomeInvisible
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem", "root", "190128");
            PreparedStatement pst = conn.prepareStatement("select *from medicine where name=?");
            pst.setString(1, medicine.getSelectedItem().toString());
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String ref = rs.getString("refno");
                refno.setText(ref);
                String daily = rs.getString("dailydose");
                dailydose.setText(daily);
                String dose1 = rs.getString("dose");
                dose.setText(dose1);
                String ss = rs.getString("sideeffects");
                sideeffects.setText(ss);
                String com = rs.getString("componyname");
                company.setText(com);

            } else {
                JOptionPane.showMessageDialog(null,"No Specific Id Found");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_medicinePopupMenuWillBecomeInvisible

    private void bednoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_bednoPopupMenuWillBecomeInvisible

    }//GEN-LAST:event_bednoPopupMenuWillBecomeInvisible

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(drpatientadddetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(drpatientadddetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(drpatientadddetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(drpatientadddetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new drpatientadddetail().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JComboBox bedno;
    private javax.swing.JTextField company;
    private javax.swing.JTextField dailydose;
    private javax.swing.JTextField date;
    private javax.swing.JTextArea details;
    private javax.swing.JTextField disease;
    private javax.swing.JTextField dose;
    private javax.swing.JTextField firstname;
    private javax.swing.JComboBox gender;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox medicine;
    private javax.swing.JTextField nid;
    private javax.swing.JTextField patientid;
    private javax.swing.JComboBox patienttype;
    private javax.swing.JTextField phoneno;
    private javax.swing.JTextField refno;
    private javax.swing.JButton search;
    private javax.swing.JMenuBar searchpatient;
    private javax.swing.JTextField secondname;
    private javax.swing.JTextField sideeffects;
    private javax.swing.JComboBox status;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
