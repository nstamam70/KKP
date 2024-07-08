/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main;

import connection.connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class FormDokter extends javax.swing.JPanel {
    private Connection conn = new connect().connect();
    private DefaultTableModel tabmode;

    /**
     * Creates new form FormDokter
     */
    public FormDokter() {
        initComponents();
        datatable();
        
    }
    
     private void aktif() {
        tdokter.setEnabled(true);
        tspesialis.setEnabled(true);
        tnotelp.setEnabled(true);
        talamat.setEnabled(true);
        
    }

    private void clear() {
        tdokter.setText("");
        tspesialis.setText("");
        tnotelp.setText("");
        talamat.setText("");
        
      
    }

    protected void datatable() {
        Object[] clcis = { "Nama Dokter", "spesialis", "No telpon", "Alamat"};
        tabmode = new DefaultTableModel(null, clcis);
        tabeldokter.setModel(tabmode);
        String sql = "select * from dokter";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String a = hasil.getString("Nama");
                String b = hasil.getString("Spesialis");
                String c = hasil.getString("NoTelp");
                String d = hasil.getString("Alamat");
                

                String[] data = {a, b, c, d};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
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

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        mainPanel = new javax.swing.JPanel();
        pn_dataDokter = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeldokter = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btambah = new javax.swing.JButton();
        bhapus = new javax.swing.JButton();
        bkembali = new javax.swing.JButton();
        pn_formDokter = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        bt_simpan = new javax.swing.JButton();
        bt_kembali2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tdokter = new javax.swing.JTextField();
        tnotelp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tspesialis = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        talamat = new javax.swing.JTextArea();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setLayout(new java.awt.CardLayout());

        mainPanel.setLayout(new java.awt.CardLayout());

        tabeldokter.setModel(new javax.swing.table.DefaultTableModel(
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
        tabeldokter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeldokterMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabeldokter);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Data Dokter");

        btambah.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_Plus_+_30px.png"))); // NOI18N
        btambah.setText("Tambah");
        btambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btambahActionPerformed(evt);
            }
        });

        bhapus.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_delete_30px.png"))); // NOI18N
        bhapus.setText("Hapus");
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });

        bkembali.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bkembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_Back_To_30px_1.png"))); // NOI18N
        bkembali.setText("Kembali");
        bkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_dataDokterLayout = new javax.swing.GroupLayout(pn_dataDokter);
        pn_dataDokter.setLayout(pn_dataDokterLayout);
        pn_dataDokterLayout.setHorizontalGroup(
            pn_dataDokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dataDokterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_dataDokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 944, Short.MAX_VALUE)
                    .addGroup(pn_dataDokterLayout.createSequentialGroup()
                        .addComponent(btambah, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pn_dataDokterLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_dataDokterLayout.setVerticalGroup(
            pn_dataDokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_dataDokterLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pn_dataDokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btambah, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn_dataDokterLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(bkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
        );

        mainPanel.add(pn_dataDokter, "card2");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel3.setText("Tambah Data Dokter");

        bt_simpan.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bt_simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_save_30px.png"))); // NOI18N
        bt_simpan.setText("Simpan");
        bt_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_simpanActionPerformed(evt);
            }
        });

        bt_kembali2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bt_kembali2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_Back_To_30px_1.png"))); // NOI18N
        bt_kembali2.setText("Kembali");
        bt_kembali2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_kembali2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Nama Dokter");

        tnotelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnotelpActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Spesialis");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("No. Telepon");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("Alamat");

        talamat.setColumns(20);
        talamat.setRows(5);
        jScrollPane3.setViewportView(talamat);

        javax.swing.GroupLayout pn_formDokterLayout = new javax.swing.GroupLayout(pn_formDokter);
        pn_formDokter.setLayout(pn_formDokterLayout);
        pn_formDokterLayout.setHorizontalGroup(
            pn_formDokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_formDokterLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(pn_formDokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(pn_formDokterLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(pn_formDokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn_formDokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tspesialis, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tnotelp, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tdokter, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pn_formDokterLayout.createSequentialGroup()
                                .addComponent(bt_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bt_kembali2)))))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        pn_formDokterLayout.setVerticalGroup(
            pn_formDokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_formDokterLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addGroup(pn_formDokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tdokter, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(pn_formDokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tspesialis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pn_formDokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_formDokterLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel7)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel8))
                    .addGroup(pn_formDokterLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(tnotelp, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(pn_formDokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_kembali2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        mainPanel.add(pn_formDokter, "card2");

        add(mainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btambahActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        mainPanel.add(pn_formDokter);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btambahActionPerformed

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapusActionPerformed
        // TODO add your handling code here:
        int ok = JOptionPane.showConfirmDialog(null, "hapus", "Konfirmasi Dialog", JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok == 0) {
            String sql = "delete from dokter where Nama='" + tdokter.getText() + "'";
            try {
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "data berhasi dihapus");;
                clear();
                tdokter.requestFocus();
                datatable();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Data gagal dihapus" + e);
            }
        }
    }//GEN-LAST:event_bhapusActionPerformed

    private void bt_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_simpanActionPerformed
        // TODO add your handling code here:
        String nama = tdokter.getText();
        String spesialis = tspesialis.getText();
        String telp = tnotelp.getText();
        String alamat = talamat.getText();
        

        String sql = "INSERT INTO dokter (Nama,Spesialis,NoTelp,Alamat ) VALUES (?,?,?,?)";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, nama);
            stat.setString(2, spesialis);
            stat.setString(3, telp);
            stat.setString(4, alamat);
          

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            clear();
            tdokter.requestFocus();
            datatable();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan " + e);
        }
    }//GEN-LAST:event_bt_simpanActionPerformed

    private void tnotelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnotelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnotelpActionPerformed

    private void bkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkembaliActionPerformed
        mainPanel.removeAll();
        mainPanel.add(new content_bg());
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_bkembaliActionPerformed

    private void bt_kembali2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_kembali2ActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.add(pn_dataDokter);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_bt_kembali2ActionPerformed

    private void tabeldokterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeldokterMouseClicked
        // TODO add your handling code here:
        int clc = tabeldokter.getSelectedRow();
        String a = tabmode.getValueAt(clc, 0).toString();
        String b = tabmode.getValueAt(clc, 1).toString();
        String c = tabmode.getValueAt(clc, 2).toString();
        String d = tabmode.getValueAt(clc, 3).toString();
        

        tdokter.setText(a);
        tspesialis.setText(b);
        tnotelp.setText(c);
        talamat.setText(d);
    }//GEN-LAST:event_tabeldokterMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bhapus;
    private javax.swing.JButton bkembali;
    private javax.swing.JButton bt_kembali2;
    private javax.swing.JButton bt_simpan;
    private javax.swing.JButton btambah;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel pn_dataDokter;
    private javax.swing.JPanel pn_formDokter;
    private javax.swing.JTable tabeldokter;
    private javax.swing.JTextArea talamat;
    private javax.swing.JTextField tdokter;
    private javax.swing.JTextField tnotelp;
    private javax.swing.JTextField tspesialis;
    // End of variables declaration//GEN-END:variables
}
