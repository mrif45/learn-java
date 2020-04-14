import java.io.*;

public class PenghitungKata {
    public static void main(String[] args) throws IOException {
        File file = new File("survei.txt"); //silahkan ganti nama file yang ada dalam ("") sesuai dengan nama file dan direktori anda
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);

        String baca;
        int HitungKata = 0;
        int HitungKalimat = 0;
        int HitungAngka = 0;
        int hitung = 1;

        System.out.println("Program ini membaca file : " + file.getName());
        System.out.println("Isinya: ");

        while ((baca = reader.readLine()) != null) {
            //membaca isi file
            System.out.println("\n" + baca);
            baca = baca.toLowerCase();

            //menghitung angka
            String[] angka = baca.split("\\d+");
            HitungAngka += angka.length;

            //menghitung angka
            String[] kata = baca.split("\\s+");
            HitungKata += kata.length;
            HitungKata -= HitungAngka;

            //menghitung kalimat
            String[] kalimat = baca.split("[!?.:]+");
            HitungKalimat += kalimat.length;

            System.out.println("\nJumlah Kalimat  = " + HitungKalimat);
            System.out.println("Jumlah Kata       = " + HitungKata);
            System.out.println("Banyaknya Bilangan= " + HitungAngka + "\n");
            System.out.println("Frekuensi kemunculan kata: ");

            //frekuensi kemunculan kata
            for (int i = 0; i < kata.length; i++) {
                for (int j = i + 1; j < kata.length; j++) {
                    if (kata[i].equals(kata[j])) {
                        hitung = hitung + 1;
                        kata[j] = "0";
                    }
                }
                if (kata[i] != "0"){
                    if(hitung >= 1){
                        System.out.println("|"+ kata[i] + " -> " + hitung + "x|");
                    }
                }
                hitung = 1;
            }
        }
        reader.close();
    }
}