
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author NAYAN MALAKAR
 */
public class bed extends javax.swing.JFrame {

    /**
     * Creates new form bed
     */
    public bed() {
        initComponents();
        panel2.setBackground(new Color(255, 255, 255, 100));
        showTableData();
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
        panel2 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        room = new javax.swing.JTextField();
        bedno = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        depttable = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        category = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel2.setBackground(new java.awt.Color(255, 255, 255));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 102, 204));
        jLabel35.setText("Bed Number");
        panel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(844, 104, -1, 35));

        room.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomrefActionPerformed(evt);
            }
        });
        panel2.add(room, new org.netbeans.lib.awtextra.AbsoluteConstraints(992, 223, 229, 35));

        bedno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bednonameActionPerformed(evt);
            }
        });
        panel2.add(bedno, new org.netbeans.lib.awtextra.AbsoluteConstraints(992, 107, 229, 32));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 102, 204));
        jLabel36.setText("Room#");
        panel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(844, 221, -1, 35));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 102, 204));
        jLabel37.setText("Category");
        panel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(844, 157, 110, 35));

        jButton3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 204));
        jButton3.setText("ADD BED");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3jButton1ActionPerformed(evt);
            }
        });
        panel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 216, 201, 44));

        jButton8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 102, 204));
        jButton8.setText("REMOVE BED");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8jButton4ActionPerformed(evt);
            }
        });
        panel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 216, 176, 44));

        jButton9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 102, 204));
        jButton9.setText("UPDATE BED");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9jButton5ActionPerformed(evt);
            }
        });
        panel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 216, 201, 44));

        depttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10"
            }
        ));
        depttable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                depttableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(depttable);

        panel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 303, 683, 218));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system/home.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        panel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 41, 38));

        category.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        category.setForeground(new java.awt.Color(0, 204, 204));
        category.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Category", "ICU", "CCU", "Genernal Ward", "Emergency" }));
        panel2.add(category, new org.netbeans.lib.awtextra.AbsoluteConstraints(992, 159, 229, 36));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system/BEDDETAILS.png"))); // NOI18N
        panel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system/bed (2).jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        panel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1330, 720));

        jPanel1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1260, 660));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void roomrefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomrefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomrefActionPerformed

    private void bednonameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bednonameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bednonameActionPerformed

    private void jButton3jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3jButton1ActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem", "root", "190128");
            PreparedStatement pst = conn.prepareStatement("insert into bed" + "(bid,category,room)" + " values(?,?,?)");
            pst.setString(1, bedno.getText());
            pst.setString(2, category.getSelectedItem().toString());
            pst.setString(3, room.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "BED Added Sucessfully");
            showTableData();
            bedno.setText(null);
            category.setSelectedIndex(0);
            room.setText(null);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());

        }
    }//GEN-LAST:event_jButton3jButton1ActionPerformed
    public void showTableData() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem", "root", "190128");
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM hospitalmanagementsystem.bed");
            ResultSet rs = pst.executeQuery();
            depttable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    private void jButton8jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8jButton4ActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem", "root", "190128");
            PreparedStatement pst = conn.prepareStatement("delete from bed where bid=?");
            pst.setString(1, bedno.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Deleted Sucessfully");
            showTableData();
            bedno.setText(null);
            category.setSelectedIndex(0);
            room.setText(null);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton8jButton4ActionPerformed

    private void jButton9jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9jButton5ActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem", "root", "190128");
            PreparedStatement pst = conn.prepareStatement("UPDATE bed SET category=?,room=? WHERE bid=?");

            pst.setString(2, room.getText());
            pst.setString(1, category.getSelectedItem().toString());
            pst.setString(3, bedno.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Updated Sucessfully");
            showTableData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton9jButton5ActionPerformed

    private void depttableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depttableMouseClicked
        int SelectedRow = depttable.getSelectedRow();
        DefaultTableModel table = (DefaultTableModel) depttable.getModel();
        bedno.setText(table.getValueAt(SelectedRow, 0).toString());
        category.setSelectedItem(table.getValueAt(SelectedRow, 1).toString());

        room.setText(table.getValueAt(SelectedRow, 2).toString());
    }//GEN-LAST:event_depttableMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        adminpanel ap = new adminpanel();
        ap.setVisible(true);
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(bed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new bed().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bedno;
    private javax.swing.JComboBox category;
    private javax.swing.JTable depttable;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel panel2;
    private javax.swing.JTextField room;
    // End of variables declaration//GEN-END:variables
}
