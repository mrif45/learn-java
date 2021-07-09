/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.form;
import app.db.Student;
import app.db.StudentManager;
import java.util.ArrayList; 
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * *
 * @author Rifqi Adam
 */
public class MainWindow extends javax.swing.JFrame {
    List<Student> students = new ArrayList<>();
    int currentRow = 0;
    
    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        String lookAndFeel =
        javax.swing.UIManager.getSystemLookAndFeelClassName(); 
        try {
            javax.swing.UIManager.setLookAndFeel(lookAndFeel); 
        }catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            initComponents();
            loadData(); 
            bindData();
            this.setTitle("Data Mahasiswa"); 
            txtNim.setEditable(false); 
            txtName.setEditable(false); 
            txtAddress.setEditable(false); 
            txtEmail.setEditable(false);
            this.setLocationRelativeTo(this);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNim = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Mahasiswa"));

        jLabel1.setText("NIM");

        jLabel2.setText("Nama");

        jLabel3.setText("Alamat");

        jLabel4.setText("Email");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                            .addComponent(txtNim))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnPrev.setText("Previous");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnNew.setText("Tambah baru");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Hapus");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnPrev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)
                        .addGap(4, 4, 4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrev)
                    .addComponent(btnNext)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete)
                    .addComponent(btnNew))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadData() {
        StudentManager studentmgr = new StudentManager(); 
        students = studentmgr.getStudents(); 
        studentmgr.closeConnection();
    }
    private void bindData() {
        if (students.size() > 0) {
            Student s = students.get(currentRow); 
            txtNim.setText(s.getNim()); 
            txtName.setText(s.getName()); 
            txtAddress.setText(s.getAddress()); 
            txtEmail.setText(s.getEmail());
        } else {
            currentRow = 0;
            txtNim.setText(""); 
            txtName.setText("");
            txtAddress.setText(""); 
            txtEmail.setText("");
        }
    }

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        if(currentRow > 0) {
            --currentRow;
            btnNext.setEnabled(true);
        } else {
            btnPrev.setEnabled(false);
        }
        bindData();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        if (btnNew.getText().equals("Tambah baru")) {
            txtNim.setText("");
            txtName.setText("");
            txtAddress.setText(""); 
            txtEmail.setText("");
            txtNim.setEditable(true); 
            txtName.setEditable(true); 
            txtAddress.setEditable(true); 
            txtEmail.setEditable(true); 
            txtNim.requestFocus(); 
            btnNew.setText("Simpan"); 
            btnDelete.setText("Batal"); 
            btnEdit.setEnabled(false); 
            btnPrev.setEnabled(false); 
            btnNext.setEnabled(false);
        } else {
            if (txtNim.getText().equals("") || "".equals(txtName.getText())) {
                JOptionPane.showMessageDialog(this, "Mohon isi data dengan benar", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            } else{
                StudentManager studentmgr = new StudentManager(); //buka koneksi
                Student s = new Student();
                s.setNim(txtNim.getText());
                s.setName(txtName.getText());
                s.setAddress(txtAddress.getText()); 
                s.setEmail(txtEmail.getText());
                if (studentmgr.Insert(s) > 0){
                    loadData();
                    currentRow = students.size() - 1;
                    bindData();
                    JOptionPane.showMessageDialog(this, "Data berhasil disimpan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Data gagal disimpan","Informasi", JOptionPane.INFORMATION_MESSAGE);
                }
                txtNim.setEditable(false);
                txtName.setEditable(false);
                txtAddress.setEditable(false);
                txtEmail.setEditable(false);
                btnNew.setText("Baru");
                btnDelete.setText("Hapus");
                btnEdit.setEnabled(true);
                btnPrev.setEnabled(true);
                btnNext.setEnabled(true); 
                studentmgr.closeConnection(); //tutup koneksi
            }
       
        }
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if (btnEdit.getText().equals("Edit")) {
            txtNim.setEditable(true);
            txtName.setEditable(true); 
            txtAddress.setEditable(true); 
            txtEmail.setEditable(true); 
            btnEdit.setText("Simpan"); 
            btnDelete.setText("Batal"); 
            btnNew.setEnabled(false); 
            btnPrev.setEnabled(false); 
            btnNext.setEnabled(false);
        } else {
            StudentManager studentmgr = new StudentManager();
            Student s = students.get(currentRow); 
            s.setNim(txtNim.getText());
            s.setName(txtName.getText()); 
            s.setAddress(txtAddress.getText()); 
            s.setEmail(txtEmail.getText());
            if (studentmgr.Update(s) > 0) {
                loadData();
                bindData();
                JOptionPane.showMessageDialog(this, "Data berhasil diupdate", "Information", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Data gagal diupdate", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
            txtNim.setEditable(false); 
            txtName.setEditable(false); 
            txtAddress.setEditable(false); 
            txtEmail.setEditable(false); 
            btnEdit.setText("Ubah"); 
            btnDelete.setText("Hapus"); 
            btnNew.setEnabled(true); 
            btnPrev.setEnabled(true); 
            btnNext.setEnabled(true);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (btnDelete.getText().equals("Hapus")) {
            int dialog = JOptionPane.showConfirmDialog(this,"Apakah Anda yakin akan menghapus data ini?","Konfirmasi", JOptionPane.YES_NO_OPTION); 
            StudentManager studentmgr = new StudentManager(); //buka koneksi
            Student s = students.get(currentRow); 
            if(dialog == JOptionPane.YES_OPTION){ 
            if (studentmgr.Delete(s) > 0) {
                loadData();
                currentRow = currentRow - 1; 
                bindData();
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus","Informasi", JOptionPane.INFORMATION_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(this, "Data gagal dihapus", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
            studentmgr.closeConnection(); //tutup koneksi
            }
            } else if (btnDelete.getText().equals("Batal")) {
                loadData();
                bindData();
                btnNew.setText("Baru");
                btnEdit.setText("Ubah");
                btnDelete.setText("Hapus");
                btnEdit.setEnabled(true);
                btnNew.setEnabled(true);
                btnPrev.setEnabled(true);
                btnNext.setEnabled(true);
                txtNim.setEditable(false);
                txtName.setEditable(false);
                txtAddress.setEditable(false); 
                txtEmail.setEditable(false);
            }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if(currentRow < students.size() - 1) {
            ++currentRow;
            btnPrev.setEnabled(true);
        } else {
            btnNext.setEnabled(false);
        }
        bindData();
    }//GEN-LAST:event_btnNextActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainWindow().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNim;
    // End of variables declaration//GEN-END:variables
}
