import javax.swing.*;

class TugasKelompok{
    public static void main(String[] args) {
        String Datanilai = JOptionPane.showInputDialog(null, "masukan nilai anda",
        "memasukan data",JOptionPane.QUESTION_MESSAGE);
        int nilai = Integer.parseInt(Datanilai);

        if(nilai >= 0 && nilai <= 100){
            if (nilai <= 100 && nilai >= 90) {
                JOptionPane.showMessageDialog(null, "nilai anda A", "Tampilkan Data", JOptionPane.INFORMATION_MESSAGE);
            } else if (nilai <= 89 && nilai >= 80) {
                JOptionPane.showMessageDialog(null, "nilai anda B", "Tampilkan Data", JOptionPane.INFORMATION_MESSAGE);
            } else if (nilai <= 79 && nilai >= 70) {
                JOptionPane.showMessageDialog(null, "nilai anda C", "Tampilkan Data", JOptionPane.INFORMATION_MESSAGE);
            } else if (nilai <= 69 && nilai >= 60) {
                JOptionPane.showMessageDialog(null, "nilai anda D", "Tampilkan Data", JOptionPane.INFORMATION_MESSAGE);
            } else if (nilai <= 59 ) {
                JOptionPane.showMessageDialog(null, "nilai anda E", "Tampilkan Data", JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "nilai tidak sesuai", "Tampilkan Data", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}

