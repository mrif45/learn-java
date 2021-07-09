/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home;

import Database.Koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import Database.constructor;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Form_akun extends javax.swing.JFrame {

    /**
     * Creates new form form_user
     */
    private String nama = constructor.getId();
    private String id, alamat, telp, nik, sql;
    private Statement st;
    private ResultSet resultSet;
    private Connection conn = null;
    
    public Form_akun() {
        initComponents();
        conn = Koneksi.koneksi();
        this.setLocationRelativeTo(null);
        data();
    }
    
    private void data() {
        try {
            sql="select * from user where " + "nama='"+ nama +"'";
            st=conn.createStatement();
            resultSet=st.executeQuery(sql);
            while (resultSet.next()){
                id = String.valueOf(resultSet.getString("id_user"));
                txt_nama.setText(nama);
                txt_alamat.setText(resultSet.getString("alamat"));
                txt_telp.setText(resultSet.getString("telp"));
                txt_nik.setText(resultSet.getString("nik"));
                txt_password.setText(resultSet.getString("password"));
            }  
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_close = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        txt_alamat = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_telp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_nik = new javax.swing.JTextField();
        btn_simpan = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("Alamat");

        jLabel6.setText("Nomor Telepon");

        btn_close.setIcon(new javax.swing.ImageIcon("D:\\Sekolah\\Kuliah\\Coding\\learn-Java\\javaGUI\\RentalMobil\\src\\main\\java\\Images\\ant-design_home-filled.png")); // NOI18N
        btn_close.setText("Kembali ke menu");
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });

        jLabel7.setText("NIK");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        jLabel1.setText("Akun");

        jLabel2.setText("Nama");

        btn_simpan.setIcon(new javax.swing.ImageIcon("D:\\Sekolah\\Kuliah\\Coding\\learn-Java\\javaGUI\\RentalMobil\\src\\main\\java\\Images\\ant-design_save-filled.png")); // NOI18N
        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        jLabel4.setText("Password");

        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\Sekolah\\Kuliah\\Coding\\learn-Java\\javaGUI\\RentalMobil\\src\\main\\java\\Images\\carbon_user-filled.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nik)
                            .addComponent(txt_telp)
                            .addComponent(txt_alamat)
                            .addComponent(txt_nama)
                            .addComponent(btn_simpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_close, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                            .addComponent(txt_password))))
                .addGap(34, 34, 34)
                .addComponent(jLabel8)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nama))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_alamat))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txt_telp))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txt_nik))
                .addGap(11, 11, 11)
                .addComponent(btn_simpan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_close)
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        Home home = new Home();
        home.setLocationRelativeTo(null);
        home.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        alamat=String.valueOf(txt_alamat.getText());
        telp=String.valueOf(txt_telp.getText());
        nik=String.valueOf(txt_nik.getText());
        try {
            sql="update user set alamat='"+ alamat +"',telp='"+ telp +"',nik='"+ nik +"'where id_user = '"+ id +"'";
            st=conn.createStatement();
            st.execute(sql);
            JOptionPane.showMessageDialog(null, "Data Berhasil disimpan");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal disimpan \n"+e.getMessage());
        }
    }//GEN-LAST:event_btn_simpanActionPerformed

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
            java.util.logging.Logger.getLogger(Form_akun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_akun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_akun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_akun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_akun().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_alamat;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_nik;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_telp;
    // End of variables declaration//GEN-END:variables
}
