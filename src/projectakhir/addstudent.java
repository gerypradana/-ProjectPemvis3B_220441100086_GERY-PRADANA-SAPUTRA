/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectakhir;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;


/**
 *
 * @author LENOVO
 */
public class addstudent extends javax.swing.JFrame {

    /**
     * Creates new form addstudent
     */
    
    Connection conn = null;
    Statement stmt = null;

    public addstudent() {
        initComponents();
        conn = databaseconnection.connection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        namaortu = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        nohp = new javax.swing.JTextField();
        kelas = new javax.swing.JTextField();
        darah = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        submit = new javax.swing.JButton();
        kembali = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        home = new javax.swing.JMenuItem();
        logout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(81, 170, 232));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectakhir/project_akhir_gambar/siswa logo (1).png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel2.setText("Nama : ");

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel3.setText("Nama Orang Tua : ");

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel4.setText("Alamat : ");

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel5.setText("Gol. Darah : ");

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel6.setText("No Hp : ");

        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel7.setText("Kelas : ");

        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });

        namaortu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaortuActionPerformed(evt);
            }
        });

        nohp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nohpActionPerformed(evt);
            }
        });

        kelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelasActionPerformed(evt);
            }
        });

        darah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- pilih --", "A", "B", "AB", "O" }));
        darah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darahActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(201, 202, 202));

        submit.setFont(new java.awt.Font("Segoe UI Emoji", 3, 14)); // NOI18N
        submit.setText("Submit ");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel2.add(submit);

        kembali.setFont(new java.awt.Font("Segoe UI Emoji", 3, 14)); // NOI18N
        kembali.setText("Back");
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        jPanel2.add(kembali);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nama)
                            .addComponent(namaortu)
                            .addComponent(alamat)
                            .addComponent(nohp)
                            .addComponent(kelas)
                            .addComponent(darah, 0, 236, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(namaortu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(darah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nohp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(kelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Function");

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectakhir/project_akhir_gambar/home.png"))); // NOI18N
        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        jMenu1.add(home);

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectakhir/project_akhir_gambar/logout.png"))); // NOI18N
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jMenu1.add(logout);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namaortuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaortuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaortuActionPerformed

    private void nohpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nohpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nohpActionPerformed

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        // TODO add your handling code here:
         setVisible(false);
               home object = new home();
               object.setVisible(true);
    }//GEN-LAST:event_kembaliActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
    String klmdarah = (String) darah.getSelectedItem();
    if ("--pilih--".equals(klmdarah)) {
        JOptionPane.showMessageDialog(null, "Silakan pilih golongan darah sebelum submit.");
        return; 
    }

    String klmnama = nama.getText();
    String klmnamaortu = namaortu.getText();
    String klmalamat = alamat.getText();
    String klmnohp = nohp.getText();
    String klmkelasText = kelas.getText();

    if (klmnama.isEmpty() || klmnamaortu.isEmpty() || klmalamat.isEmpty() || klmnohp.isEmpty() || klmkelasText.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Silakan isi semua data sebelum submit.");
        return; 
    }

   int klmkelas;
   try {
        klmkelas = Integer.parseInt(klmkelasText);
        if (klmkelas < 1 || klmkelas > 3) {
            JOptionPane.showMessageDialog(null, "kelas yang tersedia hanya 1 sampai 3.");
            return;
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Kolom kelas harus berupa angka.");
        return; 
    }
   
    try {
        stmt = conn.createStatement();
        String sql = "INSERT INTO student (nama, namaOrtu, golDarah, asal, noHp, kelas) VALUES ('"
            + klmnama + "', '" + klmnamaortu + "', '" + klmdarah + "', '"
            + klmalamat + "', '" + klmnohp + "', '" + klmkelas + "')";

        stmt.execute(sql);
        JOptionPane.showMessageDialog(null, "Data sudah berhasil diisi.");
        
        nama.setText("");
        namaortu.setText("");
        alamat.setText("");
        nohp.setText("");
        kelas.setText("");
        darah.setSelectedItem("-- pilih --");
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "pililah golongan darah anda terlebih dahulu" );
    }
    
    }//GEN-LAST:event_submitActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void darahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_darahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_darahActionPerformed

    private void kelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kelasActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        setVisible(false);
            home object = new home();
            object.setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        setVisible(false);
            login object = new login();
            object.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(addstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addstudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JComboBox<String> darah;
    private javax.swing.JMenuItem home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField kelas;
    private javax.swing.JButton kembali;
    private javax.swing.JMenuItem logout;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField namaortu;
    private javax.swing.JTextField nohp;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
