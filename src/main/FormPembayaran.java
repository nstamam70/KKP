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
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

import tablesearch.cariPasien;
import tablesearch.cariObat;

/**
 *
 * @author LENOVO
 */
public class FormPembayaran extends javax.swing.JPanel {

    private Connection conn = new connect().connect();
    private DefaultTableModel tabmode;

    /**
     * Creates new form FormDokter
     */
    public FormPembayaran() {
        initComponents();
        datatable();
        tuangbayar.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                hitungUangKembali();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                hitungUangKembali();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                hitungUangKembali();
            }
        });

        ttotalbeli.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateTotalHarga();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateTotalHarga();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateTotalHarga();
            }
        });
    }

    private void clear() {
        tnamapasien.setText("");
        tanggal.setDate(null);
        tresep.setText("");
//        tpilihobat.setText("");
        tnamaadmin.setSelectedItem("");
        ttotalbeli.setText("");
        ttotalharga.setText("");
        tuangbayar.setText("");
        tuangkembali.setText("");
    }

    protected void datatable() {
        Object[] clcis = {"Id", "Nama Pasien", "Obat", "Total Beli", "Total Harga", "Nama Admin", "Bayar", "Kembalian"};
        tabmode = new DefaultTableModel(null, clcis);
        tablepembayaran.setModel(tabmode);

        // SQL query untuk mengambil data yang diperlukan dari tabel pembayaran, pasien, obat, dan admin
        String sql = "SELECT pm.PembayaranId, p.Nama AS NamaPasien, o.Nama AS NamaObat, pm.TotalBeli, pm.TotalHarga, "
                + "pm.NamaAdmin, pm.Bayar, pm.Kembalian "
                + "FROM pembayaran pm "
                + "JOIN pasien p ON pm.PasienId = p.PasienId "
                + "JOIN obat o ON pm.ObatId = o.ObatId";

        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String pembayaranId = hasil.getString("PembayaranId");
                String namaPasien = hasil.getString("NamaPasien");
                String namaObat = hasil.getString("NamaObat");
                String totalBeli = hasil.getString("TotalBeli");
                String totalHarga = "Rp." + hasil.getString("TotalHarga");
                String namaAdmin = hasil.getString("NamaAdmin");
                String bayar = "Rp." + hasil.getString("Bayar");
                String kembalian = "Rp." + hasil.getString("Kembalian");

                String[] data = {pembayaranId, namaPasien, namaObat, totalBeli, totalHarga, namaAdmin, bayar, kembalian};
                tabmode.addRow(data);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Kesalahan database: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

 public String tnama, tresepobat, tobat, thargaobat;

    public String getNamaPas() {
        return tnama;
    }

    public String getObat() {
        return tnama;
    }

    public String getResep() {
        return tresepobat;
    }

    public String getHargaobat() {
        return thargaobat;
    }

    private void updateTotalHarga() {
        try {
            int totalbeli = Integer.parseInt(ttotalbeli.getText());
            int hargaunit = Integer.parseInt(thargaobat);
            int totalharga = totalbeli * hargaunit;
            ttotalharga.setText(String.valueOf(totalharga));
            hitungUangKembali();
        } catch (NumberFormatException e) {
            ttotalharga.setText("");
            tuangkembali.setText("");
        }
    }

    private void hitungUangKembali() {
        try {
            int totalharga = Integer.parseInt(ttotalharga.getText());
            int uangpembayaran = Integer.parseInt(tuangbayar.getText());

            if (uangpembayaran >= totalharga) {
                int uangKembali = uangpembayaran - totalharga;
                tuangkembali.setText(String.valueOf(uangKembali));
            } else {
                tuangkembali.setText("Uang tidak cukup");
            }
        } catch (NumberFormatException ex) {
            tuangkembali.setText("");
        }
    }

    public void pasienTerpilih() {
        cariPasien cp = new cariPasien();
        cp.payment = this;
        tnamapasien.setText(tnama);
        tresep.setText(tobat);
        ttotalharga.setText(thargaobat);
    }

//    public void resepTerpilih() {
//        cariResep cr = new cariResep();
//        cr.payment = this;
//       
//    }
//    public void obatTerpilih() {
//        cariObat co = new cariObat();
//        co.payment = this;
//        tpilihobat.setText(tobat);
//        ttotalharga.setText(thargaobat);
//        updateTotalHarga();
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        pn_dataPembayaran = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        bt_hapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablepembayaran = new javax.swing.JTable();
        pn_formPembayaran = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tnamapasien = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tresep = new javax.swing.JTextField();
        tuangbayar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tuangkembali = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ttotalbeli = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ttotalharga = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        bt_back = new javax.swing.JButton();
        bt_simpan = new javax.swing.JButton();
        btn_pasien = new javax.swing.JButton();
        tanggal = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        tnamaadmin = new javax.swing.JComboBox<>();

        setLayout(new java.awt.CardLayout());

        mainPanel.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Data Pembayaran");

        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jButton1.setText("Tambah");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jButton2.setText("Kembali");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        bt_hapus.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        bt_hapus.setText("Hapus");
        bt_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_hapusActionPerformed(evt);
            }
        });

        tablepembayaran.setModel(new javax.swing.table.DefaultTableModel(
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
        tablepembayaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablepembayaranMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablepembayaran);

        javax.swing.GroupLayout pn_dataPembayaranLayout = new javax.swing.GroupLayout(pn_dataPembayaran);
        pn_dataPembayaran.setLayout(pn_dataPembayaranLayout);
        pn_dataPembayaranLayout.setHorizontalGroup(
            pn_dataPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dataPembayaranLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_dataPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 952, Short.MAX_VALUE)
                    .addGroup(pn_dataPembayaranLayout.createSequentialGroup()
                        .addGroup(pn_dataPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(pn_dataPembayaranLayout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pn_dataPembayaranLayout.setVerticalGroup(
            pn_dataPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dataPembayaranLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(pn_dataPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                .addGap(223, 223, 223))
        );

        mainPanel.add(pn_dataPembayaran, "card2");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Input Data Pembayaran");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Nama Pasien");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Resep Obat Dari Dokter");

        tuangbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tuangbayarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Uang Pembayaran");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Uang Kembali");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Nama Admin");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Total Beli");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Total Harga");

        bt_back.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        bt_back.setText("Kembali");
        bt_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_backActionPerformed(evt);
            }
        });

        bt_simpan.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        bt_simpan.setText("Simpan");
        bt_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_simpanActionPerformed(evt);
            }
        });

        btn_pasien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_pasien.setText("Cari");
        btn_pasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pasienActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Tanggal");

        tnamaadmin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nur Sayid Tamam", "Rizki Yajis", "Ahmad Rivai", "Daztin A", "M Daffa", "Rafli Sena" }));

        javax.swing.GroupLayout pn_formPembayaranLayout = new javax.swing.GroupLayout(pn_formPembayaran);
        pn_formPembayaran.setLayout(pn_formPembayaranLayout);
        pn_formPembayaranLayout.setHorizontalGroup(
            pn_formPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_formPembayaranLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pn_formPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_formPembayaranLayout.createSequentialGroup()
                        .addComponent(tnamaadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pn_formPembayaranLayout.createSequentialGroup()
                        .addGroup(pn_formPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_formPembayaranLayout.createSequentialGroup()
                                .addGroup(pn_formPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tresep, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tnamapasien))
                                .addGroup(pn_formPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pn_formPembayaranLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11))
                                    .addGroup(pn_formPembayaranLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_pasien, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pn_formPembayaranLayout.createSequentialGroup()
                                        .addGap(113, 113, 113)
                                        .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(pn_formPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(tuangkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addGroup(pn_formPembayaranLayout.createSequentialGroup()
                                    .addGroup(pn_formPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pn_formPembayaranLayout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(47, 47, 47))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_formPembayaranLayout.createSequentialGroup()
                                            .addComponent(ttotalbeli, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)))
                                    .addGroup(pn_formPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(ttotalharga))))
                            .addComponent(tuangbayar, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pn_formPembayaranLayout.createSequentialGroup()
                                .addComponent(bt_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_back, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(108, Short.MAX_VALUE))))
        );
        pn_formPembayaranLayout.setVerticalGroup(
            pn_formPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_formPembayaranLayout.createSequentialGroup()
                .addGroup(pn_formPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_formPembayaranLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel3))
                    .addGroup(pn_formPembayaranLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_formPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tnamapasien, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pasien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tresep, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tnamaadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_formPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pn_formPembayaranLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn_formPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ttotalbeli, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ttotalharga, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pn_formPembayaranLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(51, 51, 51)))
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tuangbayar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tuangkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pn_formPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_back, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        mainPanel.add(pn_formPembayaran, "card2");

        add(mainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        mainPanel.add(pn_formPembayaran);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        mainPanel.add(new content_bg());
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void bt_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_backActionPerformed
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        mainPanel.add(pn_dataPembayaran);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_bt_backActionPerformed

    private void bt_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_simpanActionPerformed
        String nama = tnamapasien.getText();
        String resep = tresep.getText();
        java.util.Date date = tanggal.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String admin = tnamaadmin.getSelectedItem().toString();
        String tanggalPembayaran = sdf.format(date);
        String beli = ttotalbeli.getText();
        String harga = ttotalharga.getText();
        String bayar = tuangbayar.getText();
        String kembali = tuangkembali.getText();

        if (nama.isEmpty() || resep.isEmpty() || date == null || admin.isEmpty() || beli.isEmpty() || harga.isEmpty() || bayar.isEmpty() || kembali.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua field harus diisi.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String queryPasienId = "SELECT PasienId FROM pasien WHERE Nama = ?";
        int pasienId = -1;
        try {
            PreparedStatement pstpasien = conn.prepareStatement(queryPasienId);
            pstpasien.setString(1, nama);
            ResultSet rspasien = pstpasien.executeQuery();

            if (rspasien.next()) {
                pasienId = rspasien.getInt("PasienId");
            } else {
                JOptionPane.showMessageDialog(this, "Nama pasien tidak ditemukan.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Kesalahan database: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String queryObatId = "SELECT ObatId FROM obat WHERE Nama = ?";
        int obatId = -1;
        try {
            PreparedStatement pstobat = conn.prepareStatement(queryObatId);
            pstobat.setString(1, resep);
            ResultSet rsobat = pstobat.executeQuery();

            if (rsobat.next()) {
                obatId = rsobat.getInt("ObatId");
            } else {
                JOptionPane.showMessageDialog(this, "Nama obat tidak ditemukan.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Kesalahan database: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String sql = "INSERT INTO pembayaran (PasienId, ObatId, NamaAdmin, Tanggal, TotalBeli, TotalHarga, Bayar, Kembalian) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setInt(1, pasienId);
            pst.setInt(2, obatId);
            pst.setString(3, admin);
            pst.setString(4, tanggalPembayaran);
            pst.setString(5, beli);
            pst.setString(6, harga);
            pst.setString(7, bayar);
            pst.setString(8, kembali);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data Pembayaran berhasil disimpan", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
            clear();
            tnamapasien.requestFocus();
            datatable();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Kesalahan database: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bt_simpanActionPerformed

    private void tuangbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tuangbayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tuangbayarActionPerformed

    private void btn_pasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pasienActionPerformed
        // TODO add your handling code here:
        cariPasien cp = new cariPasien();
        cp.payment = this;
        cp.setVisible(true);
        cp.setResizable(false);
        tnamapasien.setEnabled(false);
        tresep.setEditable(false);
    }//GEN-LAST:event_btn_pasienActionPerformed

    private void tablepembayaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablepembayaranMouseClicked
        // TODO add your handling code here:
//        int row = tablepembayaran.getSelectedRow();
//        String namaPasien = tabmode.getValueAt(row, 0).toString();
//        String namaObat = tabmode.getValueAt(row, 1).toString();
//        String totalBeli = tabmode.getValueAt(row, 2).toString();
//        String totalHarga = tabmode.getValueAt(row, 3).toString();
//
//        tnamapasien.setText(namaPasien);
////        tpilihobat.setText(namaObat);
//        ttotalbeli.setText(totalBeli);
//        ttotalharga.setText(totalHarga);
    }//GEN-LAST:event_tablepembayaranMouseClicked

    private void bt_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_hapusActionPerformed

    }//GEN-LAST:event_bt_hapusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_back;
    private javax.swing.JButton bt_hapus;
    private javax.swing.JButton bt_simpan;
    private javax.swing.JButton btn_pasien;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel pn_dataPembayaran;
    private javax.swing.JPanel pn_formPembayaran;
    private javax.swing.JTable tablepembayaran;
    private com.toedter.calendar.JDateChooser tanggal;
    private javax.swing.JComboBox<String> tnamaadmin;
    private javax.swing.JTextField tnamapasien;
    private javax.swing.JTextField tresep;
    private javax.swing.JTextField ttotalbeli;
    private javax.swing.JTextField ttotalharga;
    private javax.swing.JTextField tuangbayar;
    private javax.swing.JTextField tuangkembali;
    // End of variables declaration//GEN-END:variables
}
