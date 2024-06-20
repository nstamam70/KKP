/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import connection.connect;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import tablesearch.cariDokterCheck;
import tablesearch.cariMetode;
import tablesearch.cariObatCheck;
import tablesearch.cariPasien;
import tablesearch.cariPasienCheck;
import tablesearch.caripasienkhitan;

/**
 *
 * @author LENOVO
 */
public class FormKhitan extends javax.swing.JPanel {

    private Connection conn = new connect().connect();
    private DefaultTableModel tabmode;

    public String tnikpasien, tnamapasien, ttempatlahirpasien,
            ttanggallahirpasien, tusiapasien, tjenkelpasien,
            tnotlppasien, tgoldarpasien, talamatpasien, tidMetode, tmetode;

    public String getMetode() {
        return tmetode;
    }

    public String getidMetode() {
        return tidMetode;
    }

    public String getnik() {
        return tnikpasien;
    }

    public String getnamakhit() {
        return tnamapasien;
    }

    public String gettemlahir() {
        return ttempatlahirpasien;
    }

    public String gettnglahir() {
        return ttanggallahirpasien;
    }

    public String getusia() {
        return tusiapasien;
    }

    public String getjenkel() {
        return tjenkelpasien;
    }

    public String getnotlp() {
        return tnotlppasien;
    }

    public String getgoldar() {
        return tgoldarpasien;
    }

    public String getalamat() {
        return talamatpasien;
    }

    public void metodeTerpilih() {
        cariMetode cm = new cariMetode();
        cm.khitan = this;
        tmkhitan.setText(tmetode);
        tidme.setText(tidMetode);
    }

    public void pasienterpilih() {
        caripasienkhitan cpk = new caripasienkhitan();
        cpk.khitan = this;
        tnik.setText(tnikpasien);
        tnama.setText(tnamapasien);
        ttempat.setText(ttempatlahirpasien);
        tjeniskelamin.setText(tjenkelpasien);
        tnotelp.setText(tnotlppasien);
        talamat.setText(talamatpasien);
        ttanggal.setText(ttanggallahirpasien);
    }

    private void aktif() {
        tnik.setEnabled(true);
        tnama.setEnabled(true);
        ttempat.setEnabled(true);
        ttanggal.setEnabled(true);
        tjeniskelamin.setEnabled(true);
        tnotelp.setEnabled(true);
        talamat.setEnabled(true);
        tmkhitan.setEnabled(true);
        tnik.requestFocus();
    }

    private void clear() {
        tnik.setText("");
        tnama.setText("");
        ttempat.setText("");
        ttanggal.setText("");
        tjeniskelamin.setText("");
        tnotelp.setText("");
        talamat.setText("");
        tmkhitan.setText("");
        tidme.setText("");
    }

    protected void datatable() {
        Object[] clcis = {"NIK", "Nama Pasien", "Tempat", "Tanggal Lahir", "Jenis Kelamin", "No. Telepon", "Alamat", "Metode"};
        tabmode = new DefaultTableModel(null, clcis);
        tabelkhitan.setModel(tabmode);
        String sql = "select * from pasien";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String a = hasil.getString("Nik");
                String b = hasil.getString("Nama");
                String c = hasil.getString("TempatLahir");
                String d = hasil.getString("TanggalLahir");
                String e = hasil.getString("Jenkel");
                String f = hasil.getString("NoTelp");
                String g = hasil.getString("Alamat");
                String h = hasil.getString("KhitanId");

                String[] data = {a, b, c, d, e, f, g, h};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
        }
    }

    /**
     * Creates new form FormDokter
     */
    public FormKhitan() {
        initComponents();
        datatable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        pn_dataKhitan = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelkhitan = new javax.swing.JTable();
        bt_kembali = new javax.swing.JButton();
        bt_edit = new javax.swing.JButton();
        bt_hapus = new javax.swing.JButton();
        bt_tambah = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pn_formKhitan = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tnik = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bt_cari = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tnama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tjeniskelamin = new javax.swing.JTextField();
        ttempat = new javax.swing.JTextField();
        tnotelp = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        talamat = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        bt_back = new javax.swing.JButton();
        bt_simpan = new javax.swing.JButton();
        tmkhitan = new javax.swing.JTextField();
        bt_carii = new javax.swing.JButton();
        ttanggal = new javax.swing.JTextField();
        tidme = new javax.swing.JTextField();

        setLayout(new java.awt.CardLayout());

        mainPanel.setLayout(new java.awt.CardLayout());

        tabelkhitan.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelkhitan);

        bt_kembali.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        bt_kembali.setText("Kembali");
        bt_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_kembaliActionPerformed(evt);
            }
        });

        bt_edit.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        bt_edit.setText("Edit");

        bt_hapus.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        bt_hapus.setText("Hapus");

        bt_tambah.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        bt_tambah.setText("Tambah");
        bt_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_tambahActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Data Khitan");

        javax.swing.GroupLayout pn_dataKhitanLayout = new javax.swing.GroupLayout(pn_dataKhitan);
        pn_dataKhitan.setLayout(pn_dataKhitanLayout);
        pn_dataKhitanLayout.setHorizontalGroup(
            pn_dataKhitanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dataKhitanLayout.createSequentialGroup()
                .addGroup(pn_dataKhitanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_dataKhitanLayout.createSequentialGroup()
                        .addGroup(pn_dataKhitanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_dataKhitanLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel1))
                            .addGroup(pn_dataKhitanLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bt_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 442, Short.MAX_VALUE))
                    .addGroup(pn_dataKhitanLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        pn_dataKhitanLayout.setVerticalGroup(
            pn_dataKhitanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_dataKhitanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(pn_dataKhitanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addGap(122, 122, 122))
        );

        mainPanel.add(pn_dataKhitan, "card2");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Tambah Data Khitan");

        jLabel3.setText("Nik");

        bt_cari.setText("Cari");
        bt_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cariActionPerformed(evt);
            }
        });

        jLabel4.setText("Nama");

        jLabel5.setText("Tempat");

        jLabel6.setText("Tanggal Lahir");

        jLabel7.setText("Jenis Kelamin");

        tjeniskelamin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tjeniskelaminActionPerformed(evt);
            }
        });

        ttempat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttempatActionPerformed(evt);
            }
        });

        jLabel9.setText("No Telepon");

        jLabel10.setText("Alamat");

        jLabel12.setText("Metode Khitan");

        bt_back.setBackground(new java.awt.Color(242, 242, 242));
        bt_back.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bt_back.setText("Kembali");
        bt_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_backActionPerformed(evt);
            }
        });

        bt_simpan.setBackground(new java.awt.Color(242, 242, 242));
        bt_simpan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bt_simpan.setText("Simpan");
        bt_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_simpanActionPerformed(evt);
            }
        });

        bt_carii.setText("Cari");
        bt_carii.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_cariiMouseClicked(evt);
            }
        });
        bt_carii.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cariiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_formKhitanLayout = new javax.swing.GroupLayout(pn_formKhitan);
        pn_formKhitan.setLayout(pn_formKhitanLayout);
        pn_formKhitanLayout.setHorizontalGroup(
            pn_formKhitanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_formKhitanLayout.createSequentialGroup()
                .addGroup(pn_formKhitanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_formKhitanLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pn_formKhitanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_formKhitanLayout.createSequentialGroup()
                                .addComponent(bt_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bt_back))
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addGroup(pn_formKhitanLayout.createSequentialGroup()
                                .addGroup(pn_formKhitanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ttempat, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pn_formKhitanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(ttanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pn_formKhitanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(tjeniskelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(tnotelp, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(talamat, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addGroup(pn_formKhitanLayout.createSequentialGroup()
                                .addGroup(pn_formKhitanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tnik)
                                    .addComponent(tnama, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_cari))))
                    .addGroup(pn_formKhitanLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(tidme, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tmkhitan, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_carii)))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        pn_formKhitanLayout.setVerticalGroup(
            pn_formKhitanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_formKhitanLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_formKhitanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_cari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_formKhitanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pn_formKhitanLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn_formKhitanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ttempat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ttanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pn_formKhitanLayout.createSequentialGroup()
                        .addGroup(pn_formKhitanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tjeniskelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tnotelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(talamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_formKhitanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tmkhitan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_carii)
                    .addComponent(tidme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pn_formKhitanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_back, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        mainPanel.add(pn_formKhitan, "card2");

        add(mainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void bt_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_kembaliActionPerformed
        mainPanel.removeAll();
        mainPanel.add(new content_bg());
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_bt_kembaliActionPerformed

    private void bt_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_tambahActionPerformed
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        mainPanel.add(pn_formKhitan);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_bt_tambahActionPerformed

    private void tjeniskelaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tjeniskelaminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tjeniskelaminActionPerformed

    private void ttempatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttempatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ttempatActionPerformed

    private void bt_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_backActionPerformed
        mainPanel.removeAll();
        mainPanel.add(pn_dataKhitan);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_bt_backActionPerformed

    private void bt_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_simpanActionPerformed

        try {
            String sql = "UPDATE pasien SET Nik=?,KhitanId=? WHERE Nik=?";
            PreparedStatement stat = conn.prepareStatement(sql);

            stat.setString(1, tnik.getText());
            stat.setString(2, tidme.getText());
            stat.setString(3, tnik.getText());

            stat.executeUpdate();

            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");

            clear();
            tnik.requestFocus();
            datatable();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data gagal diubah: " + e.getMessage());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan tidak terduga: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_bt_simpanActionPerformed

    private void bt_cariiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cariiActionPerformed
        cariMetode cm = new cariMetode();
        cm.khitan = this;
        cm.setVisible(true);
        cm.setResizable(false);
        tmkhitan.setEnabled(false);
        tidme.setEnabled(false);
    }//GEN-LAST:event_bt_cariiActionPerformed

    private void bt_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cariActionPerformed
        // TODO add your handling code here:
        caripasienkhitan cpk = new caripasienkhitan();
        cpk.khitan = this;
        cpk.setVisible(true);
        cpk.setResizable(false);
        tnik.setEnabled(false);
        tnama.setEnabled(false);
        ttempat.setEnabled(false);
        ttanggal.setEnabled(false);
        tjeniskelamin.setEnabled(false);
//        tusia.setEnabled(false);
        tnotelp.setEnabled(false);
        talamat.setEnabled(false);
//        tgoldar.setEnabled(false);
    }//GEN-LAST:event_bt_cariActionPerformed

    private void bt_cariiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cariiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_cariiMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_back;
    private javax.swing.JButton bt_cari;
    private javax.swing.JButton bt_carii;
    private javax.swing.JButton bt_edit;
    private javax.swing.JButton bt_hapus;
    private javax.swing.JButton bt_kembali;
    private javax.swing.JButton bt_simpan;
    private javax.swing.JButton bt_tambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel pn_dataKhitan;
    private javax.swing.JPanel pn_formKhitan;
    private javax.swing.JTable tabelkhitan;
    private javax.swing.JTextField talamat;
    private javax.swing.JTextField tidme;
    private javax.swing.JTextField tjeniskelamin;
    private javax.swing.JTextField tmkhitan;
    private javax.swing.JTextField tnama;
    private javax.swing.JTextField tnik;
    private javax.swing.JTextField tnotelp;
    private javax.swing.JTextField ttanggal;
    private javax.swing.JTextField ttempat;
    // End of variables declaration//GEN-END:variables
}
