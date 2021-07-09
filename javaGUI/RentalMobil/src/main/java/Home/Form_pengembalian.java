/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home;

import Database.Koneksi;
import Database.constructor;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class Form_pengembalian extends javax.swing.JFrame {
    
    /**
     * Creates new form form_pengembalian
     */
    Connection conn = null;
    Statement st;
    ResultSet resultSet;
    ResultSet RsPengembalian;
    ResultSet RsRental;
    ResultSet RsMobil;
    ResultSet RsStatus;
    ResultSet RsPeminjam;
    ResultSet RsM;
    String nama = constructor.getId();
    String sql="";
    
    String tanggal1, tanggal2, namapeminjam, namamobil, nopol,status;
    long harga,hari,total;
    
    public Form_pengembalian() {
        initComponents();
        setLocationRelativeTo(null);
        conn = Koneksi.koneksi();
        TampilData(sql);
        dataUser();
    }
    
     private void dataUser() {
        try {
            sql="select * from user where " + "nama='"+ nama +"'";
            st=conn.createStatement();
            resultSet=st.executeQuery(sql);
            while (resultSet.next()){
                txt_nama.setText(nama);
            }  
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void TampilData (String sql){
        DefaultTableModel datalist = new DefaultTableModel();
        datalist.addColumn("No");
        datalist.addColumn("Nama Peminjam");
        datalist.addColumn("Nama Mobil");
        datalist.addColumn("Nopol");
        datalist.addColumn("Tanggal Pinjam");
        datalist.addColumn("Tanggal Kembali");
        datalist.addColumn("Lama");
        datalist.addColumn("TOTAL BAYAR");
        datalist.addColumn("Status");
        try{
            int i = 1;
            st=conn.createStatement();
            RsPengembalian=st.executeQuery("select * from tb_pengembalian where nama= '"+ nama +"'");
            while (RsPengembalian.next())
                datalist.addRow(new Object[]{
                (""+i++),
                RsPengembalian.getString(3), RsPengembalian.getString(4), RsPengembalian.getString(5),
                RsPengembalian.getString(6), RsPengembalian.getString(7), RsPengembalian.getString(8), 
                RsPengembalian.getString(9), RsPengembalian.getString(10)});
            TABEL3.setModel(datalist);
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Gagal Tampil \n"+e.getMessage());
        }
    }
    
    private void bersih(){
        txt_namaMobil.setText("");
        txt_nopol.setText("");
        txt_harga.setText("");
        txt_lama.setText("");
        txt_total.setText("");
        Cmb_status.setSelectedItem("PILIH");
        Cmb_id_mobil.setSelectedItem("PILIH");
        tanggalKembali.setDate(null);
        tanggalPinjam.setDate(null);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_namaMobil = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_nopol = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_harga = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_lama = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btn_kembalikan = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABEL3 = new javax.swing.JTable();
        btn_home = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        tanggalPinjam = new com.toedter.calendar.JDateChooser();
        tanggalKembali = new com.toedter.calendar.JDateChooser();
        jLabel20 = new javax.swing.JLabel();
        Cmb_status = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        Cmb_id_mobil = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel1.setText("Form Pengembalian Mobil");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Data Peminjam");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Pembayaran");

        jLabel3.setText(" Nama             :");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        txt_nama.setEditable(false);

        jLabel8.setText("Nama Mobil     :");

        txt_namaMobil.setEditable(false);

        jLabel9.setText("Nomor Polisi    :");

        txt_nopol.setEditable(false);

        jLabel10.setText("Harga             :");

        txt_harga.setEditable(false);

        jLabel13.setText("Tanggal Pinjam:");

        jLabel15.setText("Total Bayar   :");

        jLabel16.setText("Lama             :");

        jLabel17.setText("Tanggal Kembali:");

        btn_kembalikan.setIcon(new javax.swing.ImageIcon("D:\\Sekolah\\Kuliah\\Coding\\learn-Java\\javaGUI\\RentalMobil\\src\\main\\java\\Images\\ic-pengembalian-min.png")); // NOI18N
        btn_kembalikan.setText("Kembalikan");
        btn_kembalikan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_kembalikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kembalikanActionPerformed(evt);
            }
        });

        btn_hapus.setIcon(new javax.swing.ImageIcon("D:\\Sekolah\\Kuliah\\Coding\\learn-Java\\javaGUI\\RentalMobil\\src\\main\\java\\Images\\ant-design_close-circle-filled-min.png")); // NOI18N
        btn_hapus.setText("Batal");
        btn_hapus.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        jLabel19.setIcon(new javax.swing.ImageIcon("D:\\Sekolah\\Kuliah\\Coding\\learn-Java\\javaGUI\\RentalMobil\\src\\main\\java\\Images\\ic-pengembalian-big.png")); // NOI18N

        TABEL3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No.", "Nama Peminjam", "Nama Mobil", "Nopol", "Tanggal Pinjam", "Tanggal Kembali", "Lama", "Total"
            }
        ));
        TABEL3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABEL3MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TABEL3);

        btn_home.setIcon(new javax.swing.ImageIcon("D:\\Sekolah\\Kuliah\\Coding\\learn-Java\\javaGUI\\RentalMobil\\src\\main\\java\\Images\\ant-design_home-filled.png")); // NOI18N
        btn_home.setText("Kembali ke Menu");
        btn_home.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Riwayat Pengembalian Mobil");

        tanggalPinjam.setDateFormatString("dd MMM yyyy");
        tanggalPinjam.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tanggalPinjamPropertyChange(evt);
            }
        });

        tanggalKembali.setDateFormatString("dd MMM yyyy");
        tanggalKembali.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tanggalKembaliPropertyChange(evt);
            }
        });

        jLabel20.setText("Pilih Pengembalian :");

        Cmb_status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PILIH", "KEMBALIKAN" }));
        Cmb_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cmb_statusActionPerformed(evt);
            }
        });

        jLabel7.setText("Pilih Mobil       :");

        Cmb_id_mobil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PILIH" }));
        Cmb_id_mobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cmb_id_mobilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(149, 149, 149))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(22, 22, 22)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_nopol, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                            .addComponent(txt_harga))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(txt_namaMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(txt_nama)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(Cmb_status, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Cmb_id_mobil, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(33, 33, 33)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(190, 190, 190))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tanggalPinjam, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                    .addComponent(txt_total, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_lama)
                                    .addComponent(tanggalKembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_kembalikan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(305, 305, 305)
                                .addComponent(jLabel18)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(tanggalPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(Cmb_id_mobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tanggalKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17)))
                            .addComponent(Cmb_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_namaMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txt_nopol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_kembalikan)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btn_hapus)
                                        .addGap(34, 34, 34))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_home))))
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(txt_lama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

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

    private void btn_kembalikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kembalikanActionPerformed
        namapeminjam=String.valueOf(txt_nama.getText());
        namamobil=String.valueOf(txt_namaMobil.getText());
        nopol=String.valueOf(txt_nopol.getText());
        harga=Integer.parseInt(txt_harga.getText());
        hari=Integer.parseInt(txt_lama.getText());
        total=Long.valueOf(txt_total.getText());
        status = "DIKEMBALIKAN";
        try {
            sql="INSERT INTO tb_pengembalian(nama,"
            + "nama_mobil, nopol, tgl_pinjam, "
            + "tgl_kembali, lama, total, status)VALUE"
            + "('"+ namapeminjam +"','"+ namamobil +"','"+ nopol +"',"
            + "'"+ tanggal1 +"','"+ tanggal2 +"','"+ hari +"','"+ total +"','"+ status +"')";
            st=conn.createStatement();
            st.execute(sql);
            bersih();
            TampilData(sql);
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan \n"+e.getMessage());
        }
        try {
            status = "Tersedia";
            sql="update tb_mobil set status = '"+ status +"' where nama_mobil ='"+ namamobil +"'";
            st=conn.createStatement();
            st.execute(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Maaf Error"+e.getMessage());
        }
        try {
            status = "SELESAI";
            sql="update tb_peminjaman set status = '"+ status +"' where nama= '"+ namapeminjam +"'";
            st=conn.createStatement();
            st.execute(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Maaf Error"+e.getMessage());
        }
    }//GEN-LAST:event_btn_kembalikanActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        bersih();
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void TABEL3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABEL3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TABEL3MouseClicked

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        Home home = new Home();
        home.setLocationRelativeTo(null);
        home.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_homeActionPerformed

    private void tanggalKembaliPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tanggalKembaliPropertyChange
        DateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
        if(tanggalKembali.getDate() !=null){
            tanggal2=myFormat.format(tanggalKembali.getDate());
        }
        try{
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date pinjam = tanggalPinjam.getDate();
        Date kembali = tanggalKembali.getDate();
        long pinjam1 = pinjam.getTime();
        long kembali1 = kembali.getTime();
        long diff = kembali1 - pinjam1;
        long lama = diff/(24*60*60*1000);
        txt_lama.setText(Long.toString(lama));
        harga=Integer.parseInt(txt_harga.getText());
        hari=Integer.parseInt(txt_lama.getText());
        total=harga*hari;
        txt_total.setText(String.valueOf(total));
        }catch(Exception e){
        }
    }//GEN-LAST:event_tanggalKembaliPropertyChange

    private void tanggalPinjamPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tanggalPinjamPropertyChange
        if(tanggalPinjam.getDate() !=null){
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
            tanggal1=format.format(tanggalPinjam.getDate());
        }
    }//GEN-LAST:event_tanggalPinjamPropertyChange

    private void Cmb_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cmb_statusActionPerformed
        nama=String.valueOf(txt_nama.getText());
        if(Cmb_status.getSelectedItem()== "KEMBALIKAN"){
            Cmb_id_mobil.removeAllItems();
            Cmb_id_mobil.addItem("PILIH");
            try{
                sql = "select * from tb_peminjaman where nama = '"+ nama +"'";
                st = conn.createStatement();
                RsMobil=st.executeQuery(sql);
                while (RsMobil.next()){
                    String AliasID =RsMobil.getString("nama_mobil");
                    Cmb_id_mobil.addItem(AliasID);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Gagal Menampilkan mobil \n"+e.getMessage());
            }
        }
    }//GEN-LAST:event_Cmb_statusActionPerformed

    private void Cmb_id_mobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cmb_id_mobilActionPerformed
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            sql="select * from tb_mobil where "
            + "nama_mobil='"+ Cmb_id_mobil.getSelectedItem() +"'";
            st=conn.createStatement();
            RsMobil=st.executeQuery(sql);
            while (RsMobil.next()){
                txt_namaMobil.setText(RsMobil.getString("nama_mobil"));
                txt_nopol.setText(RsMobil.getString("nopol"));
                txt_harga.setText(RsMobil.getString("harga"));
            }
            txt_namaMobil.requestFocus();
        } catch (SQLException e) {
        }
        try {
            sql="select * from tb_peminjaman where "
            + "nama_mobil='"+ Cmb_id_mobil.getSelectedItem() +"'";
            st=conn.createStatement();
            RsMobil=st.executeQuery(sql);
            while (RsMobil.next()){
                tanggalPinjam.setDate(RsMobil.getDate(5));
            }
            txt_namaMobil.requestFocus();
        } catch (SQLException e) {
        }
        
    }//GEN-LAST:event_Cmb_id_mobilActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Form_pengembalian().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Cmb_id_mobil;
    private javax.swing.JComboBox Cmb_status;
    private javax.swing.JTable TABEL3;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_kembalikan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser tanggalKembali;
    private com.toedter.calendar.JDateChooser tanggalPinjam;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_lama;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_namaMobil;
    private javax.swing.JTextField txt_nopol;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
