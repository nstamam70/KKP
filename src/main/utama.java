package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import connection.connect;

public class utama extends javax.swing.JFrame {

    private Connection conn = new connect().connect();
    private DefaultTableModel tabmode;

    public utama() {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
        datatable();
        datatablepasien();
    }

    protected void active() {
        ipas.setEnabled(true);
        nik.setEnabled(true);
        napes.setEnabled(true);
        ittl.setEnabled(true);
        ilaki.setEnabled(true);
        inotelp.setEnabled(true);
        ialm.setEnabled(true);
        iumur.setEnabled(true);
        ibb.setEnabled(true);
        itb.setEnabled(true);
        igoldar.setEnabled(true);
        ipas.requestFocus();
    }

    protected void ksg() {
        ipas.setText("");
        nik.setText("");
        napes.setText("");
        ittl.setText("");
        ilaki.setSelected(true);
        inotelp.setText("");
        ialm.setText("");
        iumur.setText("");
        ibb.setText("");
        itb.setText("");
        igoldar.setText("");
        icari.setText("");
    }
    
    protected void datatablepasien(){
         Object[]Baris ={"Id Pasien","NIK","Nama Pasien","TTL","Jenis Kelamin","No.Telp","Alamat","Umur","BB","TB","Golongan Darah"};
         tabmode = new DefaultTableModel(null, Baris);
         tabpas.setModel(tabmode);
         String sql = "select * from pasien";
         try {
             java.sql.Statement stat = conn.createStatement();
             ResultSet hasil = stat.executeQuery(sql);
             while(hasil.next()){
                 String a = hasil.getString("id");
                 String b = hasil.getString("nik");
                 String c = hasil.getString("nama_pasien");
                 String d = hasil.getString("ttl");
                 String e = hasil.getString("jenkel");
                 String f = hasil.getString("notlp");
                 String g = hasil.getString("alamat");
                 String h = hasil.getString("umur");
                 String i = hasil.getString("bb");
                 String j = hasil.getString("tb");
                 String k = hasil.getString("goldar");
                 
                 
                 String[] data={a,b,c,d,e,f,g,h,i,j,k};
                 tabmode.addRow(data);
             }
         } catch (Exception e) {
     }
     }

    protected void aktif() {
        jcodeobat.setEnabled(true);
        jnamaobat.setEnabled(true);
        jstokobat.setEnabled(true);
        jhargakontrak.setEnabled(true);
        jhargabeli.setEnabled(true);
        jhargajual.requestFocus();

    }

    protected void kosong() {
        jcodeobat.setText("");
        jnamaobat.setText("");
        cbsatuanobat.setSelectedIndex(0);
        jstokobat.setText("");
        jhargakontrak.setText("");
        jhargabeli.setText("");
        jhargajual.setText("");
    }

    protected void datatable() {
        Object[] Baris = {"kode obat", "Nama obat", "satuan obat", "stok obat", "harga kontrak", "harga beli", "harga jual"};
        tabmode = new DefaultTableModel(null, Baris);
        tableobat.setModel(tabmode);
        String sql = "select * from obat";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String a = hasil.getString("kode");
                String b = hasil.getString("nama");
                String c = hasil.getString("satuan");
                String d = hasil.getString("stok");
                String e = hasil.getString("harga_kontrak");
                String f = hasil.getString("harga_beli");
                String g = hasil.getString("harga_jual");

                String[] data = {a, b, c, d, e, f, g};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        pn_kanan = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pn_kiri = new javax.swing.JPanel();
        jldata = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlbayar = new javax.swing.JLabel();
        pn_dasar = new javax.swing.JPanel();
        pn_pembayaran = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jbayar = new javax.swing.JTextField();
        jnamapasien = new javax.swing.JTextField();
        jharga = new javax.swing.JTextField();
        jkembali = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        bhitung = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        bbatal = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        bkeluar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        cbpembayaran = new javax.swing.JComboBox<>();
        pn_datapasien = new javax.swing.JPanel();
        igoldar = new javax.swing.JTextField();
        ipas = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        nik = new javax.swing.JTextField();
        tsave = new javax.swing.JButton();
        idelete = new javax.swing.JButton();
        tedit = new javax.swing.JButton();
        tclear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabpas = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        icari = new javax.swing.JTextField();
        napes = new javax.swing.JTextField();
        bcari = new javax.swing.JButton();
        iperem = new javax.swing.JRadioButton();
        ilaki = new javax.swing.JRadioButton();
        iumur = new javax.swing.JTextField();
        ittl = new javax.swing.JTextField();
        ibb = new javax.swing.JTextField();
        itb = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        inotelp = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        ialm = new javax.swing.JTextArea();
        pn_formobat = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jcodeobat = new javax.swing.JTextField();
        jnamaobat = new javax.swing.JTextField();
        jstokobat = new javax.swing.JTextField();
        jhargakontrak = new javax.swing.JTextField();
        jhargajual = new javax.swing.JTextField();
        jhargabeli = new javax.swing.JTextField();
        bsimpan = new javax.swing.JButton();
        cbsatuanobat = new javax.swing.JComboBox<>();
        bedit = new javax.swing.JButton();
        btambah = new javax.swing.JButton();
        jhapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableobat = new javax.swing.JTable();
        pn_dokter = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        iddok = new javax.swing.JTextField();
        namadok = new javax.swing.JTextField();
        waktu = new javax.swing.JTextField();
        jpol = new javax.swing.JComboBox<>();
        tcari = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pn_kanan.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/hospital-29-64.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Impact", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Klinik Fatiyah");

        javax.swing.GroupLayout pn_kananLayout = new javax.swing.GroupLayout(pn_kanan);
        pn_kanan.setLayout(pn_kananLayout);
        pn_kananLayout.setHorizontalGroup(
            pn_kananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_kananLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(836, Short.MAX_VALUE))
        );
        pn_kananLayout.setVerticalGroup(
            pn_kananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_kananLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(31, 31, 31))
        );

        getContentPane().add(pn_kanan, java.awt.BorderLayout.PAGE_START);

        pn_kiri.setBackground(new java.awt.Color(0, 102, 102));
        pn_kiri.setPreferredSize(new java.awt.Dimension(200, 308));

        jldata.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jldata.setForeground(new java.awt.Color(255, 255, 255));
        jldata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/pasien.png"))); // NOI18N
        jldata.setText("Data Pasien");
        jldata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jldataMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/data-34-16.png"))); // NOI18N
        jLabel4.setText("Pemeriksaan");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/drug-inspection-16.png"))); // NOI18N
        jLabel5.setText("form Obat");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/doctor-40-16.png"))); // NOI18N
        jLabel6.setText("Dokter ");

        jlbayar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlbayar.setForeground(new java.awt.Color(255, 255, 255));
        jlbayar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/cash-38-16.png"))); // NOI18N
        jlbayar.setText("Pembayaran");
        jlbayar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbayarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn_kiriLayout = new javax.swing.GroupLayout(pn_kiri);
        pn_kiri.setLayout(pn_kiriLayout);
        pn_kiriLayout.setHorizontalGroup(
            pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_kiriLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbayar)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jldata))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        pn_kiriLayout.setVerticalGroup(
            pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_kiriLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jldata)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jlbayar)
                .addContainerGap(346, Short.MAX_VALUE))
        );

        getContentPane().add(pn_kiri, java.awt.BorderLayout.LINE_START);

        pn_dasar.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setText("Uang di Bayar");

        jLabel9.setText("Uang Kembali");

        jnamapasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnamapasienActionPerformed(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("PEMBAYARAN");

        bhitung.setText("HITUNG");
        bhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhitungActionPerformed(evt);
            }
        });

        jLabel11.setText("Nama pasien");

        bbatal.setText("BATAL");

        jLabel12.setText("Pembayaran");

        bkeluar.setText("KELUAR");
        bkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkeluarActionPerformed(evt);
            }
        });

        jLabel13.setText("Jumlah Harga");

        cbpembayaran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Dana", "BCA", "Danamon", "Mandiri" }));
        cbpembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbpembayaranActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_pembayaranLayout = new javax.swing.GroupLayout(pn_pembayaran);
        pn_pembayaran.setLayout(pn_pembayaranLayout);
        pn_pembayaranLayout.setHorizontalGroup(
            pn_pembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_pembayaranLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(pn_pembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_pembayaranLayout.createSequentialGroup()
                        .addGroup(pn_pembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_pembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pn_pembayaranLayout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jkembali))
                                .addGroup(pn_pembayaranLayout.createSequentialGroup()
                                    .addGroup(pn_pembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(pn_pembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jnamapasien, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbpembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(pn_pembayaranLayout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jharga, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pn_pembayaranLayout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbayar, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_pembayaranLayout.createSequentialGroup()
                                .addComponent(bhitung)
                                .addGap(18, 18, 18)
                                .addComponent(bbatal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bkeluar)
                                .addGap(79, 79, 79)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(896, 896, 896))
        );
        pn_pembayaranLayout.setVerticalGroup(
            pn_pembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_pembayaranLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_pembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jnamapasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(pn_pembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cbpembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_pembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(pn_pembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_pembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jkembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(36, 36, 36)
                .addGroup(pn_pembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bhitung)
                    .addComponent(bkeluar)
                    .addComponent(bbatal))
                .addContainerGap(485, Short.MAX_VALUE))
        );

        igoldar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igoldarActionPerformed(evt);
            }
        });

        jLabel22.setText("NIK");

        nik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nikActionPerformed(evt);
            }
        });

        tsave.setText("Save");
        tsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsaveActionPerformed(evt);
            }
        });

        idelete.setText("Delete");
        idelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ideleteActionPerformed(evt);
            }
        });

        tedit.setText("Edit");
        tedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teditActionPerformed(evt);
            }
        });

        tclear.setText("Clear");
        tclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tclearActionPerformed(evt);
            }
        });

        tabpas.setModel(new javax.swing.table.DefaultTableModel(
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
        tabpas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabpasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabpas);

        jLabel23.setText("Jenis Kelamin");

        jLabel24.setText("No.Telp");

        jLabel25.setText("Cari Pasien");

        jLabel26.setText("Golongan Darah");

        bcari.setText("Cari");
        bcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcariActionPerformed(evt);
            }
        });

        iperem.setText("Perempuan");

        ilaki.setText("Laki-laki");

        iumur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iumurActionPerformed(evt);
            }
        });

        ittl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ittlActionPerformed(evt);
            }
        });

        jLabel27.setText("Alamat");

        jLabel28.setText("Nama Pasien");

        jLabel29.setText("BB");

        jLabel30.setText("TB");

        jLabel31.setText("Id Pasien");

        jLabel32.setText("Umur");

        jLabel33.setText("TTL");

        ialm.setColumns(20);
        ialm.setRows(5);
        jScrollPane3.setViewportView(ialm);

        javax.swing.GroupLayout pn_datapasienLayout = new javax.swing.GroupLayout(pn_datapasien);
        pn_datapasien.setLayout(pn_datapasienLayout);
        pn_datapasienLayout.setHorizontalGroup(
            pn_datapasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_datapasienLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pn_datapasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_datapasienLayout.createSequentialGroup()
                        .addGroup(pn_datapasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel28)
                            .addComponent(jLabel33)
                            .addComponent(jLabel31))
                        .addGap(38, 38, 38)
                        .addGroup(pn_datapasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(napes, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ittl, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nik, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ipas, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(pn_datapasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_datapasienLayout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addGap(22, 22, 22)
                                .addGroup(pn_datapasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(itb, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ibb, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(iumur, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(igoldar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel32)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30)))
                    .addGroup(pn_datapasienLayout.createSequentialGroup()
                        .addGroup(pn_datapasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel27)
                            .addComponent(jLabel25)
                            .addComponent(jLabel23))
                        .addGap(37, 37, 37)
                        .addGroup(pn_datapasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_datapasienLayout.createSequentialGroup()
                                .addComponent(ilaki)
                                .addGap(23, 23, 23)
                                .addComponent(iperem))
                            .addGroup(pn_datapasienLayout.createSequentialGroup()
                                .addComponent(icari, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bcari, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(inotelp, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pn_datapasienLayout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(pn_datapasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tsave, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tclear, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pn_datapasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tedit, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idelete, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 252, Short.MAX_VALUE))
        );
        pn_datapasienLayout.setVerticalGroup(
            pn_datapasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_datapasienLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(pn_datapasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_datapasienLayout.createSequentialGroup()
                        .addGroup(pn_datapasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(ipas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn_datapasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(nik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pn_datapasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(napes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30)))
                    .addGroup(pn_datapasienLayout.createSequentialGroup()
                        .addComponent(iumur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ibb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pn_datapasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_datapasienLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(pn_datapasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addComponent(ittl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pn_datapasienLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pn_datapasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(igoldar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_datapasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addGroup(pn_datapasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(iperem)
                        .addComponent(ilaki)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_datapasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(inotelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_datapasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_datapasienLayout.createSequentialGroup()
                        .addGroup(pn_datapasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(pn_datapasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(icari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bcari)))
                    .addGroup(pn_datapasienLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(pn_datapasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tsave)
                            .addComponent(tedit))
                        .addGap(18, 18, 18)
                        .addGroup(pn_datapasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tclear)
                            .addComponent(idelete))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jLabel7.setText("Obat");

        jLabel15.setText("kode obat");

        jLabel16.setText("satuan obat");

        jLabel17.setText("stok obat");

        jLabel18.setText("nama obat");

        jLabel19.setText("harga jual");

        jLabel20.setText("harga beli");

        jLabel21.setText("harga kontrak");

        jcodeobat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcodeobatActionPerformed(evt);
            }
        });

        jhargabeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jhargabeliActionPerformed(evt);
            }
        });

        bsimpan.setText("SIMPAN");
        bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsimpanActionPerformed(evt);
            }
        });

        cbsatuanobat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "kapsul", "Botol" }));

        bedit.setText("EDIT");
        bedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beditActionPerformed(evt);
            }
        });

        btambah.setText("TAMBAH");

        jhapus.setText("HAPUS");

        tableobat.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableobat);

        javax.swing.GroupLayout pn_formobatLayout = new javax.swing.GroupLayout(pn_formobat);
        pn_formobat.setLayout(pn_formobatLayout);
        pn_formobatLayout.setHorizontalGroup(
            pn_formobatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_formobatLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pn_formobatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pn_formobatLayout.createSequentialGroup()
                        .addGroup(pn_formobatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addGroup(pn_formobatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel19)
                                .addComponent(jLabel20)))
                        .addGap(33, 33, 33)
                        .addGroup(pn_formobatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jhargakontrak)
                            .addComponent(jhargabeli)
                            .addComponent(jhargajual)))
                    .addComponent(jLabel15)
                    .addGroup(pn_formobatLayout.createSequentialGroup()
                        .addGroup(pn_formobatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17))
                        .addGroup(pn_formobatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_formobatLayout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(jLabel14))
                            .addGroup(pn_formobatLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(pn_formobatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcodeobat)
                                    .addComponent(jnamaobat)
                                    .addComponent(cbsatuanobat, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jstokobat, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1006, Short.MAX_VALUE)
                .addGroup(pn_formobatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bedit)
                    .addComponent(bsimpan)
                    .addComponent(btambah)
                    .addComponent(jhapus))
                .addGap(88, 88, 88))
            .addGroup(pn_formobatLayout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pn_formobatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        pn_formobatLayout.setVerticalGroup(
            pn_formobatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_formobatLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel7)
                .addGap(30, 30, 30)
                .addGroup(pn_formobatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jcodeobat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jLabel14)
                .addGroup(pn_formobatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_formobatLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel18))
                    .addGroup(pn_formobatLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn_formobatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jnamaobat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bsimpan))
                        .addGroup(pn_formobatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_formobatLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(bedit))
                            .addGroup(pn_formobatLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pn_formobatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbsatuanobat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))
                                .addGap(20, 20, 20)
                                .addGroup(pn_formobatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(jstokobat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn_formobatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pn_formobatLayout.createSequentialGroup()
                                .addComponent(btambah)
                                .addGap(44, 44, 44)
                                .addComponent(jhapus))
                            .addGroup(pn_formobatLayout.createSequentialGroup()
                                .addGroup(pn_formobatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jhargakontrak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21))
                                .addGap(26, 26, 26)
                                .addGroup(pn_formobatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20)
                                    .addComponent(jhargabeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(35, 35, 35)
                .addGroup(pn_formobatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19)
                    .addComponent(jhargajual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        jLabel39.setText("Id Dokter");

        jLabel40.setText("Waktu pelayanan");

        jLabel41.setText("Jenis Poli");

        iddok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iddokActionPerformed(evt);
            }
        });

        jpol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Poli Umum", "Poli Gigi", "Poli jantung", "Poli Penyakit Dalam", "Poli THT", "Poli Saraf" }));

        tcari.setText("Cari");
        tcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcariActionPerformed(evt);
            }
        });

        jButton2.setText("Simpan");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel42.setText("Dokter");

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel43.setText("Nama dokter");

        javax.swing.GroupLayout pn_dokterLayout = new javax.swing.GroupLayout(pn_dokter);
        pn_dokter.setLayout(pn_dokterLayout);
        pn_dokterLayout.setHorizontalGroup(
            pn_dokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_dokterLayout.createSequentialGroup()
                .addGroup(pn_dokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pn_dokterLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addGroup(pn_dokterLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(pn_dokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_dokterLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(pn_dokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel41))
                                .addGap(35, 35, 35)
                                .addGroup(pn_dokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jpol, javax.swing.GroupLayout.Alignment.TRAILING, 0, 529, Short.MAX_VALUE)
                                    .addComponent(waktu)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_dokterLayout.createSequentialGroup()
                                .addGroup(pn_dokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pn_dokterLayout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addGroup(pn_dokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel43)
                                            .addComponent(jLabel39))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pn_dokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(iddok, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                                    .addComponent(namadok))))))
                .addGap(12, 12, 12)
                .addComponent(tcari)
                .addGap(52, 52, 52))
        );
        pn_dokterLayout.setVerticalGroup(
            pn_dokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dokterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42)
                .addGap(21, 21, 21)
                .addGroup(pn_dokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(iddok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_dokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(namadok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_dokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(waktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addGap(31, 31, 31)
                .addGroup(pn_dokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jpol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_dokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(215, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pn_dasarLayout = new javax.swing.GroupLayout(pn_dasar);
        pn_dasar.setLayout(pn_dasarLayout);
        pn_dasarLayout.setHorizontalGroup(
            pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1575, Short.MAX_VALUE)
            .addGroup(pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pn_pembayaran, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_dasarLayout.createSequentialGroup()
                    .addComponent(pn_datapasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 576, Short.MAX_VALUE)))
            .addGroup(pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pn_formobat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_dasarLayout.createSequentialGroup()
                    .addComponent(pn_dokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 680, Short.MAX_VALUE)))
        );
        pn_dasarLayout.setVerticalGroup(
            pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 921, Short.MAX_VALUE)
            .addGroup(pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pn_pembayaran, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_dasarLayout.createSequentialGroup()
                    .addComponent(pn_datapasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 181, Short.MAX_VALUE)))
            .addGroup(pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_dasarLayout.createSequentialGroup()
                    .addComponent(pn_formobat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_dasarLayout.createSequentialGroup()
                    .addComponent(pn_dokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 393, Short.MAX_VALUE)))
        );

        getContentPane().add(pn_dasar, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1118, 630));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jldataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jldataMouseClicked
        pn_dasar.removeAll();
        pn_dasar.repaint();
        pn_dasar.revalidate();
        // menambahkan panel
        pn_dasar.add(pn_datapasien);
        pn_dasar.repaint();
        pn_dasar.revalidate();
    }//GEN-LAST:event_jldataMouseClicked

    private void jlbayarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbayarMouseClicked
        pn_dasar.removeAll();
        pn_dasar.repaint();
        pn_dasar.revalidate();
        // menambahkan panel
        pn_dasar.add(pn_pembayaran);
        pn_dasar.repaint();
        pn_dasar.revalidate();
    }//GEN-LAST:event_jlbayarMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        pn_dasar.removeAll();
        pn_dasar.repaint();
        pn_dasar.revalidate();
        // menambahkan panel
        pn_dasar.add(pn_formobat);
        pn_dasar.repaint();
        pn_dasar.revalidate();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jhargabeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jhargabeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jhargabeliActionPerformed

    private void beditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_beditActionPerformed

    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsimpanActionPerformed
        // TODO add your handling code here:
        String sql = "insert into obat value(?,?,?,?,?,?,?)";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, jcodeobat.getText());
            stat.setString(2, jnamaobat.getText());
            stat.setString(3, cbsatuanobat.getSelectedItem().toString());
            stat.setString(4, jstokobat.getText());
            stat.setString(5, jhargakontrak.getText());
            stat.setString(6, jhargabeli.getText());
            stat.setString(7, jhargajual.getText());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
            kosong();
            jcodeobat.requestFocus();
            datatable();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data gagal disimpan" + e);
        }
    }//GEN-LAST:event_bsimpanActionPerformed

    private void jcodeobatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcodeobatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcodeobatActionPerformed

    private void cbpembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbpembayaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbpembayaranActionPerformed

    private void bkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkeluarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bkeluarActionPerformed

    private void bhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhitungActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bhitungActionPerformed

    private void jnamapasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnamapasienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jnamapasienActionPerformed

    private void igoldarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igoldarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_igoldarActionPerformed

    private void nikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nikActionPerformed

    private void tsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsaveActionPerformed
        // TODO add your handling code here:
        String sql = "insert into pasien values (?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, ipas.getText());
            stat.setString(2, nik.getText());
            stat.setString(3, napes.getText());
            stat.setString(4, ittl.getText());

            String jkel = "";
            if (ilaki.isSelected()) {
                jkel = "Laki-laki";
            } else {
                jkel = "Perempuan";
            }
            stat.setString(5, jkel);

            stat.setString(6, inotelp.getText());
            stat.setString(7, ialm.getText());
            stat.setString(8, iumur.getText());
            stat.setString(9, ibb.getText());
            stat.setString(10, itb.getText());

            stat.setString(11, igoldar.getText());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            ksg();
            ipas.requestFocus();
            datatablepasien();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan " + e);
        }
    }//GEN-LAST:event_tsaveActionPerformed

    private void ideleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ideleteActionPerformed
        // TODO add your handling code here:
        int ok = JOptionPane.showConfirmDialog(null, "hapus", "Konfirmasi Dialog", JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok == 0) {
            String sql = "delete from pasien where id='" + ipas.getText() + "'";
            try {
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "data berhasi dihapus");;
                ksg();
                ipas.requestFocus();
                datatablepasien();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Data gagal dihapus" + e);
            }
        }
    }//GEN-LAST:event_ideleteActionPerformed

    private void teditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teditActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "update pasien set nik=?,nama_pasien=?,ttl=?,jenkel=?,notlp=?,alamat=?,umur=?,bb=?,tb=?,goldar=? where id =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, nik.getText());
            stat.setString(2, napes.getText());
            stat.setString(3, ittl.getText());

            String jkel = "";
            if (ilaki.isSelected()) {
                jkel = "Laki-laki";
            } else {
                jkel = "Perempuan";
            }
            stat.setString(4, jkel);

            stat.setString(5, inotelp.getText());
            stat.setString(6, ialm.getText());
            stat.setString(7, iumur.getText());
            stat.setString(8, ibb.getText());
            stat.setString(9, itb.getText());
            stat.setString(10, igoldar.getText());
            stat.setString(11, ipas.getText());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil diubah");
            ksg();
            ipas.requestFocus();
            datatablepasien();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal diubah" + e);
        }
    }//GEN-LAST:event_teditActionPerformed

    private void tclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tclearActionPerformed
        // TODO add your handling code here:
        ksg();
        datatablepasien();
    }//GEN-LAST:event_tclearActionPerformed

    private void tabpasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabpasMouseClicked
        // TODO add your handling code here:
        int bar = tabpas.getSelectedRow();
        String a = tabmode.getValueAt(bar, 0).toString();
        String b = tabmode.getValueAt(bar, 1).toString();
        String c = tabmode.getValueAt(bar, 2).toString();
        String d = tabmode.getValueAt(bar, 3).toString();
        String e = tabmode.getValueAt(bar, 4).toString();
        String f = tabmode.getValueAt(bar, 5).toString();
        String g = tabmode.getValueAt(bar, 6).toString();
        String h = tabmode.getValueAt(bar, 7).toString();
        String i = tabmode.getValueAt(bar, 8).toString();
        String j = tabmode.getValueAt(bar, 9).toString();
        String k = tabmode.getValueAt(bar, 10).toString();

        ipas.setText(a);
        nik.setText(b);
        napes.setText(c);
        ittl.setText(d);

        if (c.equals("Laki-laki")) {
            ilaki.setSelected(true);
            iperem.setSelected(false);
        } else {
            ilaki.setSelected(false);
            iperem.setSelected(true);
        }

        inotelp.setText(f);
        ialm.setText(g);
        iumur.setText(h);
        ibb.setText(i);
        itb.setText(j);
        igoldar.setText(k);
    }//GEN-LAST:event_tabpasMouseClicked

    private void bcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcariActionPerformed
        // TODO add your handling code here:
        Object[] Baris = {"Id Pasien", "NIK", "Nama Pasien", "TTL", "Jenis Kelamin", "No.Telp", "Alamat", "Umur", "BB", "TB", "Golongan Darah"};
        tabmode = new DefaultTableModel(null, Baris);
        tabpas.setModel(tabmode);
        String sql = "select * from pasien where id like '%" + icari.getText() + "%'";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String a = hasil.getString("id");
                String b = hasil.getString("nik");
                String c = hasil.getString("nama_pasien");
                String d = hasil.getString("ttl");
                String e = hasil.getString("jenkel");
                String f = hasil.getString("notlp");
                String g = hasil.getString("alamat");
                String h = hasil.getString("umur");
                String i = hasil.getString("bb");
                String j = hasil.getString("tb");
                String k = hasil.getString("goldar");

                String[] data = {a, b, c, d, e, f, g, h, i, j, k};
                tabmode.addRow(data);

            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_bcariActionPerformed

    private void iumurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iumurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iumurActionPerformed

    private void ittlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ittlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ittlActionPerformed

    private void iddokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iddokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iddokActionPerformed

    private void tcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcariActionPerformed
        // TODO add your handling code here:
        String sql = "select * from dokter where id_dokter = '" +iddok.getText() + "'";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String nm = hasil.getString("nama_dokter");
                namadok.setText(nm);
                namadok.setEnabled(false);
            }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_tcariActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String sql = "insert into dokter values (?,?,?,?)";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, iddok.getText());
            stat.setString(2, namadok.getText());

            stat.setString(3, waktu.getText());
            stat.setString(4, jpol.getSelectedItem().toString());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            kosong();
            iddok.requestFocus();
            datatable();
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan "+e);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int ok = JOptionPane.showConfirmDialog(null,"hapus","Konfirmasi Dialog", JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok==0){
            String sql ="delete from pasien where id='"+ipas.getText()+"'";
            try {
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "data berhasi dihapus");;
                kosong();
                ipas.requestFocus();
                datatable();
            }catch (SQLException e){
                JOptionPane.showMessageDialog(null, "Data gagal dihapus"+e);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbatal;
    private javax.swing.JButton bcari;
    private javax.swing.JButton bedit;
    private javax.swing.JButton bhitung;
    private javax.swing.JButton bkeluar;
    private javax.swing.JButton bsimpan;
    private javax.swing.JButton btambah;
    private javax.swing.JComboBox<String> cbpembayaran;
    private javax.swing.JComboBox<String> cbsatuanobat;
    private javax.swing.JTextArea ialm;
    private javax.swing.JTextField ibb;
    private javax.swing.JTextField icari;
    private javax.swing.JTextField iddok;
    private javax.swing.JButton idelete;
    private javax.swing.JTextField igoldar;
    private javax.swing.JRadioButton ilaki;
    private javax.swing.JTextField inotelp;
    private javax.swing.JTextField ipas;
    private javax.swing.JRadioButton iperem;
    private javax.swing.JTextField itb;
    private javax.swing.JTextField ittl;
    private javax.swing.JTextField iumur;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jbayar;
    private javax.swing.JTextField jcodeobat;
    private javax.swing.JButton jhapus;
    private javax.swing.JTextField jharga;
    private javax.swing.JTextField jhargabeli;
    private javax.swing.JTextField jhargajual;
    private javax.swing.JTextField jhargakontrak;
    private javax.swing.JTextField jkembali;
    private javax.swing.JLabel jlbayar;
    private javax.swing.JLabel jldata;
    private javax.swing.JTextField jnamaobat;
    private javax.swing.JTextField jnamapasien;
    private javax.swing.JComboBox<String> jpol;
    private javax.swing.JTextField jstokobat;
    private javax.swing.JTextField namadok;
    private javax.swing.JTextField napes;
    private javax.swing.JTextField nik;
    private javax.swing.JPanel pn_dasar;
    private javax.swing.JPanel pn_datapasien;
    private javax.swing.JPanel pn_dokter;
    private javax.swing.JPanel pn_formobat;
    private javax.swing.JPanel pn_kanan;
    private javax.swing.JPanel pn_kiri;
    private javax.swing.JPanel pn_pembayaran;
    private javax.swing.JTable tableobat;
    private javax.swing.JTable tabpas;
    private javax.swing.JButton tcari;
    private javax.swing.JButton tclear;
    private javax.swing.JButton tedit;
    private javax.swing.JButton tsave;
    private javax.swing.JTextField waktu;
    // End of variables declaration//GEN-END:variables
}