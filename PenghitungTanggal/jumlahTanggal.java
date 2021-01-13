package PenghitungTanggal;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class jumlahTanggal{
    static Scanner input = new Scanner(System.in);

    public static boolean cekTanggal(String masukTanggal) {
        if (masukTanggal.trim().equals("")) {
            return true;
        }
        else {
            SimpleDateFormat sdfrmt = new SimpleDateFormat("ddMMyyyy");
            sdfrmt.setLenient(false);
            try {
                sdfrmt.parse(masukTanggal);
                System.out.println(masukTanggal + " format tanggal benar");
            }
            catch (ParseException e) {
                System.out.println(masukTanggal + " format tanggal tidak benar");
                return false;
            }
            return true;
        }
    }

    static int hitung(int tanggal) {
        int jumlah = 0;
        while (tanggal > 0 || jumlah > 9) {
            if (tanggal == 0) {
                tanggal = jumlah;
                jumlah = 0;
                System.out.println("jumlah " + jumlah);
                System.out.println("jumlah " + tanggal);
            }
            jumlah += tanggal % 10;
            tanggal /= 10;
            System.out.println("jumlah " + jumlah);
            System.out.println("jumlah " + tanggal);
        }
        return jumlah;
    }
    public static void main(String[] args) {
        String Pilih = "";
        do{
            System.out.println("Program Digit Kehidupan");
            System.out.println("Masukan tanggal(DDMMYYYY): ");
            String masukTanggal = input.next();
            cekTanggal(masukTanggal);
            int tanggal = Integer.parseInt(masukTanggal);

            System.out.println("Hasil : " + hitung(tanggal));

            System.out.println("==============================");
            System.out.print("Ingin memasukan data lagi?(y/t): ");
            Pilih = input.next();
            Pilih = Pilih.toLowerCase();
        }while(Pilih.equals("y"));
    }
}