/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pertemuan10;

import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class DataMahasiswa extends javax.swing.JFrame {

    /**
     * Creates new form DataMahasiswa
     */
    public DataMahasiswa() {
        initComponents();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        labelNIM = new javax.swing.JLabel();
        labelNama = new javax.swing.JLabel();
        labelAlamat = new javax.swing.JLabel();
        labelMataKuliah = new javax.swing.JLabel();
        fieldMataKuliah = new javax.swing.JTextField();
        fieldAlamat = new javax.swing.JTextField();
        fieldNama = new javax.swing.JTextField();
        fieldNIM = new javax.swing.JTextField();
        labelNilai1 = new javax.swing.JLabel();
        labelNilai2 = new javax.swing.JLabel();
        labelNilaiUTS = new javax.swing.JLabel();
        labelNilai4 = new javax.swing.JLabel();
        labelNilai5 = new javax.swing.JLabel();
        labelNilaiAkhir = new javax.swing.JLabel();
        fieldNilaiUTS = new javax.swing.JTextField();
        fieldNilai2 = new javax.swing.JTextField();
        fieldNilai1 = new javax.swing.JTextField();
        fieldNilai4 = new javax.swing.JTextField();
        fieldNilai5 = new javax.swing.JTextField();
        fieldNilai6 = new javax.swing.JTextField();
        tombolHapus = new javax.swing.JButton();
        tombolSimpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        labelNIM.setText("NIM");

        labelNama.setText("Nama");

        labelAlamat.setText("Alamat");

        labelMataKuliah.setText("Mata Kuliah");

        fieldMataKuliah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldMataKuliahActionPerformed(evt);
            }
        });

        fieldAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldAlamatActionPerformed(evt);
            }
        });

        fieldNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNamaActionPerformed(evt);
            }
        });

        fieldNIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNIMActionPerformed(evt);
            }
        });

        labelNilai1.setText("Nilai 1 [10 %]");

        labelNilai2.setText("Nilai 2 [15 %]");

        labelNilaiUTS.setText("Nilai 3 UTS [25 %]");

        labelNilai4.setText("Nilai 4 [15 %]");

        labelNilai5.setText("Nilai 5 [35 %]");

        labelNilaiAkhir.setText("Nilai Akhir");

        fieldNilaiUTS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNilaiUTSActionPerformed(evt);
            }
        });

        fieldNilai2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNilai2ActionPerformed(evt);
            }
        });

        fieldNilai1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNilai1ActionPerformed(evt);
            }
        });

        fieldNilai4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNilai4ActionPerformed(evt);
            }
        });

        fieldNilai5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNilai5ActionPerformed(evt);
            }
        });

        fieldNilai6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNilai6ActionPerformed(evt);
            }
        });

        tombolHapus.setText("Hapus");
        tombolHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolHapusActionPerformed(evt);
            }
        });

        tombolSimpan.setText("Simpan");
        tombolSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolSimpanActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NIM", "Nama", "Alamat", "Mata Kuliah", "Nilai Akhir"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelMataKuliah)
                                    .addComponent(labelAlamat)
                                    .addComponent(labelNama, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelNIM, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fieldMataKuliah)
                                    .addComponent(fieldAlamat)
                                    .addComponent(fieldNama)
                                    .addComponent(fieldNIM, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tombolSimpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tombolHapus)))
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNilaiUTS)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelNilai1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelNilai2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(labelNilai5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelNilai4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(labelNilaiAkhir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fieldNilaiUTS)
                            .addComponent(fieldNilai2)
                            .addComponent(fieldNilai1)
                            .addComponent(fieldNilai4)
                            .addComponent(fieldNilai5)
                            .addComponent(fieldNilai6, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNIM)
                    .addComponent(fieldNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNilai1)
                    .addComponent(fieldNilai1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNama)
                    .addComponent(fieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNilai2)
                    .addComponent(fieldNilai2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAlamat)
                    .addComponent(fieldAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNilaiUTS)
                    .addComponent(fieldNilaiUTS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMataKuliah)
                    .addComponent(fieldMataKuliah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNilai4)
                    .addComponent(fieldNilai4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNilai5)
                    .addComponent(fieldNilai5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldNilai6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNilaiAkhir)
                    .addComponent(tombolHapus)
                    .addComponent(tombolSimpan))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldNIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNIMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNIMActionPerformed

    private void fieldNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNamaActionPerformed

    private void fieldAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldAlamatActionPerformed

    private void fieldMataKuliahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldMataKuliahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldMataKuliahActionPerformed

    private void fieldNilai1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNilai1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNilai1ActionPerformed

    private void fieldNilai2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNilai2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNilai2ActionPerformed

    private void fieldNilaiUTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNilaiUTSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNilaiUTSActionPerformed

    private void fieldNilai4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNilai4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNilai4ActionPerformed

    private void fieldNilai5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNilai5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNilai5ActionPerformed

    private void fieldNilai6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNilai6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNilai6ActionPerformed

    private void tombolSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolSimpanActionPerformed
        // TODO add your handling code here:
        String nim = fieldNIM.getText();
        String nama = fieldNama.getText();
        String alamat = fieldAlamat.getText();
        String mataKuliah = fieldMataKuliah.getText();

        try {
            double nilai1 = Double.parseDouble(fieldNilai1.getText());
            double nilai2 = Double.parseDouble(fieldNilai2.getText());
            double nilaiUTS = Double.parseDouble(fieldNilaiUTS.getText());
            double nilai4 = Double.parseDouble(fieldNilai4.getText());
            double nilai5 = Double.parseDouble(fieldNilai5.getText());

            // Perhitungan Nilai Akhir
            double nilaiAkhir = (nilai1 * 0.10) + (nilai2 * 0.15) + (nilaiUTS * 0.25) + (nilai4 * 0.15) + (nilai5 * 0.35);
            fieldNilai6.setText(String.valueOf(nilaiAkhir));

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.addRow(new Object[]{nim, nama, alamat, mataKuliah, nilaiAkhir});
            
            // Mengosongkan semua field input setelah data disimpan
            fieldNIM.setText("");
            fieldNama.setText("");
            fieldAlamat.setText("");
            fieldMataKuliah.setText("");
            fieldNilai1.setText("");
            fieldNilai2.setText("");
            fieldNilaiUTS.setText("");
            fieldNilai4.setText("");
            fieldNilai5.setText("");
            fieldNilai6.setText("");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Input nilai harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tombolSimpanActionPerformed

    private void tombolHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolHapusActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih baris yang ingin dihapus!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            model.removeRow(selectedRow);
            // Mengosongkan semua field input
            fieldNIM.setText("");
            fieldNama.setText("");
            fieldAlamat.setText("");
            fieldMataKuliah.setText("");
            fieldNilai1.setText("");
            fieldNilai2.setText("");
            fieldNilaiUTS.setText("");
            fieldNilai4.setText("");
            fieldNilai5.setText("");
            fieldNilai6.setText("");
        }
    }//GEN-LAST:event_tombolHapusActionPerformed

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
            java.util.logging.Logger.getLogger(DataMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fieldAlamat;
    private javax.swing.JTextField fieldMataKuliah;
    private javax.swing.JTextField fieldNIM;
    private javax.swing.JTextField fieldNama;
    private javax.swing.JTextField fieldNilai1;
    private javax.swing.JTextField fieldNilai2;
    private javax.swing.JTextField fieldNilai4;
    private javax.swing.JTextField fieldNilai5;
    private javax.swing.JTextField fieldNilai6;
    private javax.swing.JTextField fieldNilaiUTS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelAlamat;
    private javax.swing.JLabel labelMataKuliah;
    private javax.swing.JLabel labelNIM;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelNilai1;
    private javax.swing.JLabel labelNilai2;
    private javax.swing.JLabel labelNilai4;
    private javax.swing.JLabel labelNilai5;
    private javax.swing.JLabel labelNilaiAkhir;
    private javax.swing.JLabel labelNilaiUTS;
    private javax.swing.JButton tombolHapus;
    private javax.swing.JButton tombolSimpan;
    // End of variables declaration//GEN-END:variables
}
