/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rifqi Adam
 */

public class Form_pengembalian_admin extends javax.swing.JFrame {

    /**
     * Creates new form Form_pengembalian_admin
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
    
    String tanggal1,tanggal2,namapeminjam,namamobil,nopol,lama,total;
    
    public Form_pengembalian_admin() {
        initComponents();
        conn = Koneksi.koneksi();
        this.setLocationRelativeTo(null);
        TampilData(sql);
    }
    
    private void TampilData (String sql){
        DefaultTableModel datalist = new DefaultTableModel();
        datalist.addColumn("No");
        datalist.addColumn("Nama Peminjam");
        datalist.addColumn("Nama Mobil");
        datalist.addColumn("Nomor Polisi");
        datalist.addColumn("Tanggal Pinjam");
        datalist.addColumn("Tanggal Kembali");
        datalist.addColumn("Lama");
        datalist.addColumn("Total");
        try{
            int i = 1;
            st=conn.createStatement();
            RsPengembalian=st.executeQuery("select * from tb_pengembalian");
            while (RsPengembalian.next())
                datalist.addRow(new Object[]{
                (""+i++),
                RsPengembalian.getString(3), RsPengembalian.getString(4),
                RsPengembalian.getString(5), RsPengembalian.getString(6), 
                RsPengembalian.getString(7), RsPengembalian.getString(8), 
                RsPengembalian.getString(9), RsPengembalian.getString(10)});
                TABEL_PENGEMBALIAN.setModel(datalist);
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Gagal Menampilkan\n"+e.getMessage());
        }
    }
    
    private void bersih(){
        txt_nama.setText("");
        txt_namaMobil.setText("");
        txt_nopol.setText("");
        txt_lama.setText("");
        txt_total.setText("");
        tanggalPinjam.setDate(null);
        tanggalKembali.setDate(null);
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
        txt_namaMobil = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_nopol = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_lama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btn_simpan = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_close = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABEL_PENGEMBALIAN = new javax.swing.JTable();
        tanggalPinjam = new com.toedter.calendar.JDateChooser();
        tanggalKembali = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txt_namaMobil.setEditable(false);

        jLabel9.setText("Nomor Polisi    :");

        jLabel13.setText("Tanggal Pinjam:");

        jLabel15.setText("Total Bayar   :");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel1.setText("Form Pengembalian Mobil Admin");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Data Peminjam");

        jLabel16.setText("Lama             :");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Data Pengembalian Mobil");

        jLabel3.setText(" Nama             :");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel17.setText("Tanggal Kembali:");

        btn_simpan.setIcon(new javax.swing.ImageIcon("D:\\Sekolah\\Kuliah\\Coding\\learn-Java\\javaGUI\\RentalMobil\\src\\main\\java\\Images\\ant-design_save-filled.png")); // NOI18N
        btn_simpan.setText("Simpan");
        btn_simpan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        btn_hapus.setIcon(new javax.swing.ImageIcon("D:\\Sekolah\\Kuliah\\Coding\\learn-Java\\javaGUI\\RentalMobil\\src\\main\\java\\Images\\ant-design_delete-filled.png")); // NOI18N
        btn_hapus.setText("Hapus");
        btn_hapus.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_close.setIcon(new javax.swing.ImageIcon("D:\\Sekolah\\Kuliah\\Coding\\learn-Java\\javaGUI\\RentalMobil\\src\\main\\java\\Images\\ant-design_home-filled.png")); // NOI18N
        btn_close.setText("Kembali Ke Menu");
        btn_close.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });

        jLabel19.setIcon(new javax.swing.ImageIcon("D:\\Sekolah\\Kuliah\\Coding\\learn-Java\\javaGUI\\RentalMobil\\src\\main\\java\\Images\\ic-pengembalian-big.png")); // NOI18N

        txt_nama.setEditable(false);

        jLabel8.setText("Nama Mobil     :");

        TABEL_PENGEMBALIAN.setModel(new javax.swing.table.DefaultTableModel(
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
                "No.", "Nama Peminjam", "Nama Mobil", "Nomor Polisi", "Tanggal Pinjam", "Tanggal Kembali", "Lama", "Total"
            }
        ));
        TABEL_PENGEMBALIAN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABEL_PENGEMBALIANMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TABEL_PENGEMBALIAN);

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

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Pembayaran");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_namaMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_nopol))))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_lama, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel17))
                                    .addGap(5, 5, 5)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tanggalPinjam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tanggalKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_hapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_simpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 19, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(jLabel14)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel17))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txt_namaMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txt_nopol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tanggalPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tanggalKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_lama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_simpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_hapus)
                                .addGap(18, 18, 18)
                                .addComponent(btn_close))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
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

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        namapeminjam=String.valueOf(txt_nama.getText());
        namamobil=String.valueOf(txt_namaMobil.getText());
        nopol=String.valueOf(txt_nopol.getText());
        lama=String.valueOf(txt_lama.getText());
        total=String.valueOf(txt_total.getText());
        
        try {
            sql="update tb_pengembalian set nama='"+ namapeminjam +"',nopol='"+ nopol +"',tgl_pinjam='"+ tanggal1 +"',tgl_kembali='"+ tanggal2 +"',lama='"+ lama +"',total='"+ total +"' where nama_mobil = '"+ namamobil +"'";
            st=conn.createStatement();
            st.execute(sql);
            bersih();
            TampilData(sql);
            JOptionPane.showMessageDialog(null, "Data Berhasil di Simpan");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal di Simpan\n"+e.getMessage());
        }
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
         int response = JOptionPane.showConfirmDialog(null, "Hapus Data ?", "Konfirmasi",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
           if (response == JOptionPane.YES_OPTION) {
             namamobil=String.valueOf(txt_namaMobil.getText());
                try {
                sql="delete from tb_pengembalian where nama_mobil='"+ namamobil +"'";
                st=conn.createStatement();
                st.execute(sql);
                bersih();
                TampilData(sql);
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
                } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "Data Gagal Dihapus"+e.getMessage());
                }
            } 
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        Home_admin home = new Home_admin();
        home.setLocationRelativeTo(null);
        home.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_closeActionPerformed

    private void tanggalPinjamPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tanggalPinjamPropertyChange
        
    }//GEN-LAST:event_tanggalPinjamPropertyChange

    private void tanggalKembaliPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tanggalKembaliPropertyChange

    }//GEN-LAST:event_tanggalKembaliPropertyChange

    private void TABEL_PENGEMBALIANMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABEL_PENGEMBALIANMouseClicked
        int baris = TABEL_PENGEMBALIAN.rowAtPoint(evt.getPoint());
        nama = TABEL_PENGEMBALIAN.getValueAt(baris, 1).toString();
        txt_nama.setText(nama);
        
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
        
        namamobil = TABEL_PENGEMBALIAN.getValueAt(baris, 2).toString();
        txt_namaMobil.setText(namamobil);
        
        nopol = TABEL_PENGEMBALIAN.getValueAt(baris, 3).toString();
        txt_nopol.setText(nopol);
        
        tanggal1 = TABEL_PENGEMBALIAN.getValueAt(baris, 4).toString();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = format.parse(tanggal1);
            tanggalPinjam.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(Form_peminjaman_admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        tanggal2 = TABEL_PENGEMBALIAN.getValueAt(baris, 5).toString();
        try {
            Date date = format.parse(tanggal2);
            tanggalKembali.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(Form_peminjaman_admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        lama = TABEL_PENGEMBALIAN.getValueAt(baris, 6).toString();
        txt_lama.setText(lama);
        total = TABEL_PENGEMBALIAN.getValueAt(baris, 7).toString();
        txt_total.setText(total);
    }//GEN-LAST:event_TABEL_PENGEMBALIANMouseClicked

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
            java.util.logging.Logger.getLogger(Form_pengembalian_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_pengembalian_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_pengembalian_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_pengembalian_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_pengembalian_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TABEL_PENGEMBALIAN;
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser tanggalKembali;
    private com.toedter.calendar.JDateChooser tanggalPinjam;
    private javax.swing.JTextField txt_lama;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_namaMobil;
    private javax.swing.JTextField txt_nopol;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}