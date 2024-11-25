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
public class PrintDokter extends javax.swing.JPanel {

    private Connection conn = new connect().connect();
    private DefaultTableModel tabmode;

    /**
     * Creates new form PrintPembayaran
     */
    public PrintDokter() {
        initComponents();
        datatable();
    }

    protected void datatable() {
        Object[] clcis = {"Nama Dokter", "Spesialis", "No.Telepon", "Alamat"};
        tabmode = new DefaultTableModel(null, clcis);
        tabelobat.setModel(tabmode);
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

        mainPanel = new javax.swing.JPanel();
        DataObat = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelobat = new javax.swing.JTable();
        bt_print = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        mainPanel.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("DATA DOKTER");

        tabelobat.setBackground(new java.awt.Color(242, 242, 242));
        tabelobat.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelobat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelobatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelobat);

        bt_print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/print.png"))); // NOI18N
        bt_print.setText("PRINT");
        bt_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DataObatLayout = new javax.swing.GroupLayout(DataObat);
        DataObat.setLayout(DataObatLayout);
        DataObatLayout.setHorizontalGroup(
            DataObatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataObatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DataObatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DataObatLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(620, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DataObatLayout.createSequentialGroup()
                        .addComponent(bt_print, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(DataObatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DataObatLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1)
                    .addContainerGap()))
        );
        DataObatLayout.setVerticalGroup(
            DataObatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataObatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(356, 356, 356)
                .addComponent(bt_print, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
            .addGroup(DataObatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DataObatLayout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(179, Short.MAX_VALUE)))
        );

        mainPanel.add(DataObat, "card2");

        add(mainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void tabelobatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelobatMouseClicked

    }//GEN-LAST:event_tabelobatMouseClicked

    private void bt_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_printActionPerformed
        // TODO add your handling code here:
        try {
            String namaFile = "src/report/Dokter.jasper";
            Connection conn = new connect().connect();
            HashMap<String, Object> parameter = new HashMap<>();
            parameter.put("logoPath", "src/images/logo.png"); // Path ke gambar

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
    private javax.swing.JPanel DataObat;
    private javax.swing.JButton bt_print;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTable tabelobat;
    // End of variables declaration//GEN-END:variables
}
