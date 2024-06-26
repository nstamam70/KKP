/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tablesearch;

import connection.connect;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import main.FormKhitan;


public class caripasienkhitan extends javax.swing.JFrame {

    private Connection conn = new connect().connect();
    private DefaultTableModel tabmode;
    public FormKhitan khitan = null;


    public caripasienkhitan() {
        initComponents();
        datatable();
    }
protected void datatable() {
        Object[] clcis = {"Nik","Nama Pasien", "Tempat", "Tanggal Lahir", "Jenis Kelamin","Golongan Darah", "No. Telepon", "Alamat"};
        tabmode = new DefaultTableModel(null, clcis);
        tbpasienkhitan.setModel(tabmode);
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
                String f = hasil.getString("Goldar");
                String g = hasil.getString("NoTelp");
                String h = hasil.getString("Alamat");

                String[] data = {a, b, c, d, e, f,g,h};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
        }
    }

//    protected void datatable() {
//        Object[] clcis = {"nik", "Nama", "tempat", "tanggallahir", "usia", "jenkel", "NoTlp", "goldar", "alamat"};
//        tabmode = new DefaultTableModel(null, clcis);
//        tbpasienkhitan.setModel(tabmode);
//        String sql = "select * from pasien";
//        try {
//            java.sql.Statement stat = conn.createStatement();
//            ResultSet hasil = stat.executeQuery(sql);
//            while (hasil.next()) {
//                String a = hasil.getString("Nik");
//                String b = hasil.getString("Nama");
//                String c = hasil.getString("TempatLahir");
//                String d = hasil.getString("TanggalLahir");
//                String e = hasil.getString("Usia");
//                String f = hasil.getString("Jenkel");
//                String g = hasil.getString("NoTlp");
//                String h = hasil.getString("Goldar");
//                String i = hasil.getString("Alamat");
//
//                String[] data = {a, b, c, d, e, f, g, h, i};
//                tabmode.addRow(data);
//            }
//        } catch (Exception e) {
//        }
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbpasienkhitan = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbpasienkhitan.setModel(new javax.swing.table.DefaultTableModel(
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
        tbpasienkhitan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbpasienkhitanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbpasienkhitan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbpasienkhitanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbpasienkhitanMouseClicked
        int tabmode = tbpasienkhitan.getSelectedRow();
        khitan.tnikpasien = tbpasienkhitan.getValueAt(tabmode, 0).toString();
        khitan.tnamapasien = tbpasienkhitan.getValueAt(tabmode, 1).toString();
        khitan.ttempatlahirpasien = tbpasienkhitan.getValueAt(tabmode, 2).toString();
        khitan.ttanggallahirpasien = tbpasienkhitan.getValueAt(tabmode, 3).toString();
//        khitan.tusiapasien = tbpasienkhitan.getValueAt(tabmode, 8).toString();
        khitan.tjenkelpasien = tbpasienkhitan.getValueAt(tabmode, 4).toString();
        khitan.tnotlppasien = tbpasienkhitan.getValueAt(tabmode, 6).toString();
        khitan.tgoldarpasien = tbpasienkhitan.getValueAt(tabmode, 5).toString();
        khitan.talamatpasien = tbpasienkhitan.getValueAt(tabmode, 7).toString();
        
        khitan.pasienterpilih();
        this.dispose();
    }//GEN-LAST:event_tbpasienkhitanMouseClicked


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
            java.util.logging.Logger.getLogger(caripasienkhitan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(caripasienkhitan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(caripasienkhitan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(caripasienkhitan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new caripasienkhitan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbpasienkhitan;
    // End of variables declaration//GEN-END:variables
}
