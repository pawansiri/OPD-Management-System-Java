/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_Data;

import javax.swing.JOptionPane;
import java.util.regex.Pattern;
import java.sql.*;
import JavaClasses.DBConnection;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author GIGABYTE
 */
public class Patient extends javax.swing.JFrame {
        Connection conn = null;
        Statement stmt = null;
        

    /**
     * Creates new form Patient
     */
    public Patient() {
        initComponents();
        conn = DBConnection.getconn();
        displayTable();
    }
    
    private void displayTable()
    {
        try
        {
            stmt = conn.createStatement();
            String sql = "SELECT * FROM patient";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            jSPTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
        }
        catch(Exception ee)
        {
            JOptionPane.showMessageDialog(null, ee.toString());
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

        jPanel1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnChannelDoc = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jSPTable1 = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtPSearch = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuHome = new javax.swing.JMenu();
        jMenuPatient = new javax.swing.JMenu();
        jMenuDoctor = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(15, 135, 242));

        btnBack.setIcon(new javax.swing.ImageIcon("F:\\NIBM\\EAD\\EADCourseWork2_KUDSE20.1F014\\resources\\previous.png")); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnChannelDoc.setIcon(new javax.swing.ImageIcon("F:\\NIBM\\EAD\\EADCourseWork2_KUDSE20.1F014\\resources\\plus.png")); // NOI18N
        btnChannelDoc.setText("Channel a Doctor");
        btnChannelDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChannelDocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnChannelDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(btnBack)
                .addGap(69, 69, 69)
                .addComponent(btnChannelDoc)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSPTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jSPTable1);

        btnSearch.setIcon(new javax.swing.ImageIcon("F:\\NIBM\\EAD\\EADCourseWork2_KUDSE20.1F014\\resources\\magnifying-glass.png")); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon("F:\\NIBM\\EAD\\EADCourseWork2_KUDSE20.1F014\\resources\\clear.png")); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Search by Patient ID or Name");

        jMenuHome.setText("Home");
        jMenuHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuHomeMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuHome);

        jMenuPatient.setText("Patient");
        jMenuBar1.add(jMenuPatient);

        jMenuDoctor.setText("Doctor");
        jMenuDoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuDoctorMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuDoctor);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(txtPSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnSearch)
                    .addComponent(txtPSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
            new Home().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnChannelDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChannelDocActionPerformed
        this.setVisible(false);
            new ChannelDoctor().setVisible(true);
    }//GEN-LAST:event_btnChannelDocActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int deleteRes = JOptionPane.showConfirmDialog(this, "Are sure want delete, data will be lost!", "Select Option",JOptionPane.YES_NO_OPTION);
        
        if(deleteRes == JOptionPane.YES_OPTION)
        {
            try
            {
                stmt = conn.createStatement();
                String sql = "Delete FROM patient WHERE PatientID = '"+txtPSearch.getText()+"' ";
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Deleted Successfully");
                displayTable();
                txtPSearch.setText("");
                txtPSearch.requestFocus();
                
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try
        {
            stmt = conn.createStatement();
            String sql = "SELECT * FROM patient WHERE PatientID = '"+txtPSearch.getText()+"' OR Name = '"+txtPSearch.getText()+"' ";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            jSPTable1.setModel(DbUtils.resultSetToTableModel(rs));
            txtPSearch.setText("");
            txtPSearch.requestFocus();
            
        }
        catch(Exception ee)
        {
            JOptionPane.showMessageDialog(null, ee.toString());
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void jMenuHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuHomeMouseClicked
            this.setVisible(false);
            new Home().setVisible(true);
            
    }//GEN-LAST:event_jMenuHomeMouseClicked

    private void jMenuDoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuDoctorMouseClicked
            this.setVisible(false);
            new Doctor().setVisible(true);
    }//GEN-LAST:event_jMenuDoctorMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnChannelDoc;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuDoctor;
    private javax.swing.JMenu jMenuHome;
    private javax.swing.JMenu jMenuPatient;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable jSPTable1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtPSearch;
    // End of variables declaration//GEN-END:variables
}
