/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Karyawan;
import javax.swing.table.DefaultTableModel;
import Koneksi.Db_Koneksi;
import javax.swing.JOptionPane;
/**
 *
 * @author Rifqi Adam
 */
public class Form_Gaji extends javax.swing.JFrame {

    /**
     * Creates new form Form_Gaji
     */
    public Form_Gaji() {
        initComponents();
        DefaultTableModel model = new DefaultTableModel();
        tblGaji.setModel(model);
        model.addColumn("Nama");
        model.addColumn("Jabatan");
        model.addColumn("Gaji Pokok");
        model.addColumn("Transport");
        model.addColumn("Gaji Bersih");
        
        getData();
    }
    
    public void getData(){
    model.getDataVector().removeAllElements(); 
    model.fireTableDataChanged();

    try{
      Statement stat = (Statement) Db_Koneksi.getKoneksi().createStatement();
      String sql = "Select * from gaji";
      ResultSet res = stat.executeQuery(sql);

      while(res.next()) {
        Object[] obj= new Object[6]; 
        obj[0] = res.getString("Nip");
        obj[1] = res.getString("Mama");
        obj[2] = res.getString("Jabatan"); 
        obj[3] = res.getString("Gapok");
        obj[4] = res.getString("Transport"); 
        obj[5] = res.getString("Gaber");

        model.addRow(obj);
      }
    }catch (SOLException err) {
      JOptionPane.shovMessageDialog(null, err.getMessage());
    }
  }

public void loadData(){
  nip       = txtNip.getText();
  nama      = txtNama.getText();
  jabatan   = (String)cmboxJabatan.getSelectedItem();
  gapok     = Integer.parseInt(txtGapok.getText());
  transport = Integer.parseInt(txtTransport.getText());
  gaber     = Integer.parseInt(txtGaber.getText());
}
 
public void loadGaji(){
  jabatan = ""+ cmboxJabatan.getSelectedItem();

  switch (jabatan) {
    case "Manager":
      gapok = 5000000;
    break;
    
    case "Asisten Manager":
      gapok = 4500000;
    break;
    
    case "Kepala HRD":
      gapok = 4000000; 
    break;
    
    case "Staf Keuangan": 
      gapok = 3500000;
    break; 
    
    case "Karyawan":
      gapok = 3000000;
    break;
    
    case "Office Boy": 
      gapok = 2500000;
    break;
  }
  transport = (int) (gapok * 0.1);
  gaber = gapok + transport;
  txtGapok.setText(""+gapok);
  txtTransport.setText(""+transport); txtGaber.setText(""+gaber);
}

public void saveData(){
loadData();
try{
    Statement stat = (Statement) Db_Connection.getKoneksi().createStatement();
    String sql = "insert into gaji (Nip,Nama,Jabataan,Gapok,Transport,Gaber)" + " values ('"+ nip +"','" + nama +"','"+jabatan+"','" + gapok +"','" + "'" + transport +"','" + gaber + "')";
    PreparedStatement p = (preparedStatement) Db_Connection.getKoneksi().prepareStatement(sql);
    p.executeUpdate();
    getData();
  }catch(SQLException err){
    JOptionPane.showMessageDialog(null,err.getMessage());
  }
}



public void Reset(){
  nip = "";
  nama = "";
  jabatan = "";
  gapok = 0;
  transport = 0;
  gaber = 0;
  txtNip.setText (nip); 
  txtNama.setText (nama);
  txtGapok.setText ("");
  txtTransport.setText(""); txtGaber.setText ("");
}

public void dataSelect(){
  int i = tblGaji.getSelectedRow();
  if (i == -1) {
    // tidak ada baris terpilih
    return;
  }

  txtNip.setText(""+model.getValueAt(i, 0));
  txtNama.setText(""+model.getValueAt(i, 1)); cmboxJabatan.setSelectedItem(""+model.getValueAt(i, 2)); 
  txtGapok.setText(""+model.getValueAt(i, 3)); txtTransport.setText(""+model.getValueAt(i, 4));   txtGaber.setText(""+model.getValueAt(i, 5));
}

public void updateData(){
  loadData();
  try{
    Statement stat = (Statement) Db_Connection.getConnection().createStatement();
    String sql = "UPDATE gaji SET Nama = '"+nama+"',"+"Jabatan = '"+jabatan+"',"+"Gapok = '"+gapok+"',"+"Transport = '"+transport+"',"+"Gaber = '"+gaber+"', WHERE Nip = '"+nip+"'";
    PreparedStatement p = (PreparedStatement) Db_Connection.getConnection().prepareStatement(sql);
    p.executeUpdate();
    getData();
    Reset();
    JOptionPane.showMessageDialog(null, "Update berhasil....");
  }catch(SQLException err){
    JOptionPane.showMessageDialog(null, err.getMessage());
  }

}

public void deleteData(){
  loadData();
  // menampilkan pesan konfirmasi OK dan Cancel sebelum dilakukan proses delete

  int pesan = JOptionPane.showConfirmDialog(null, "Anda yakin menghapus data"+ nip +"7", "Konfirmasi",JOptionPane.OK_CANCEL_OPTION);

  // jika user memilih OK maka proses Delete akan

  if (pesan = JOptionPane.OK_OPTION) {
    try{
      Statement stat = (Statement) Db_Connection.getConection().createStatement();
      String sql = "DELETE FROM gaji WHERE Nip = '" +nip +"'";
      PreparedStatement p = (PreparedStatement) Db_Connection.getConection().prepareStatement(sql);
      p.executeUpdate();
      getData();
      Reset ();
      JOptionPane.showMessageDialog(null, "Delete berhasil");
    }catch (SOLException er) {
      JOptionPane.showMessageDialog(null, er.getMessage());
    }
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

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Penggajian Karyawan");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Data Gaji Karyawan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel1)
                .addContainerGap(145, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(287, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form_Gaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Gaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Gaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Gaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
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
            java.util.logging.Logger.getLogger(Form_Gaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Gaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Gaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Gaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Gaji().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
