/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package print;

import connection.connect;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author USER
 */
public class PrintPemeriksaan extends javax.swing.JPanel {

    private Connection conn = new connect().connect();
    private DefaultTableModel tabmode;

    /**
     * Creates new form PrintPembayaran
     */
    public PrintPemeriksaan() {
        initComponents();
        datatable();
    }

    protected void datatable() {
        Object[] clcis = {"Id Pasien", "Nama Pasien", "Tanggal", "Tekanan Darah", "Diagnosa", "Id Obat", "Nama Obat"};
        tabmode = new DefaultTableModel(null, clcis);
        tpemeriksaan.setModel(tabmode);
        String sql = "SELECT pemeriksaan.PasienId, pasien.Nama AS NamaPasien, pemeriksaan.Tanggal, pemeriksaan.TekananDarah, pemeriksaan.Diagnosa, pemeriksaan.ObatId, obat.Nama AS NamaObat "
                + "FROM pemeriksaan "
                + "JOIN pasien ON pemeriksaan.PasienId = pasien.PasienId "
                + "JOIN obat ON pemeriksaan.ObatId = obat.ObatId";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String a = hasil.getString("PasienId");
                String b = hasil.getString("NamaPasien");
                String c = hasil.getString("Tanggal");
                String d = hasil.getString("TekananDarah");
                String e = hasil.getString("Diagnosa");
                String f = hasil.getString("ObatId");
                String g = hasil.getString("NamaObat");

                String[] data = {a, b, c, d, e, f, g};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        DataPemeriksaan = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tpemeriksaan = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        bt_print = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        mainPanel.setLayout(new java.awt.CardLayout());

        tpemeriksaan.setModel(new javax.swing.table.DefaultTableModel(
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
        tpemeriksaan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tpemeriksaanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tpemeriksaan);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("DATA PEMERIKSAAN");

        bt_print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/print.png"))); // NOI18N
        bt_print.setText("PRINT");
        bt_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DataPemeriksaanLayout = new javax.swing.GroupLayout(DataPemeriksaan);
        DataPemeriksaan.setLayout(DataPemeriksaanLayout);
        DataPemeriksaanLayout.setHorizontalGroup(
            DataPemeriksaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataPemeriksaanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(511, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DataPemeriksaanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_print, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(DataPemeriksaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DataPemeriksaanLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        DataPemeriksaanLayout.setVerticalGroup(
            DataPemeriksaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataPemeriksaanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(380, 380, 380)
                .addComponent(bt_print, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(DataPemeriksaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DataPemeriksaanLayout.createSequentialGroup()
                    .addGap(110, 110, 110)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(169, Short.MAX_VALUE)))
        );

        mainPanel.add(DataPemeriksaan, "card2");

        add(mainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void tpemeriksaanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tpemeriksaanMouseClicked

    }//GEN-LAST:event_tpemeriksaanMouseClicked

    private void bt_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_printActionPerformed
        try {
            String namaFile = "src/report/Pemeriksaan.jasper";
            Connection conn = new connect().connect();
            HashMap<String, Object> parameter = new HashMap<>();
            File report_file = new File(namaFile);
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(report_file);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameter, conn);
            JasperViewer.viewReport(jasperPrint, false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_bt_printActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DataPemeriksaan;
    private javax.swing.JButton bt_print;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTable tpemeriksaan;
    // End of variables declaration//GEN-END:variables
}
