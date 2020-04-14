import java.util.ArrayList;
import java.util.Scanner;

public class ProgramParkir6 {
    static Scanner input = new Scanner(System.in);
    static String Pilih;
    static ArrayList<Integer> dataKendaraan = new ArrayList<Integer>();
    static int Biaya, Jam, Kendaraan;

    static int motor() {
        System.out.print("Masukan Jam Parkir(dalam Jam): ");
        Jam = input.nextInt();
        if (Jam <= 2) {
            Biaya = 3000;
        } else if(Jam>2 && Jam < 24) {
            Biaya = 3000 + ((Jam - 2) * 2000);
        } else if (Jam > 24) {
            int Denda = ((Jam-2) / 24) * 100000;
            Biaya = 3000 + ((Jam - 2) * 2000) + Denda;
        }
        dataKendaraan.add(Biaya);
        System.out.println("Biaya Parkir Anda adalah Rp." + Biaya);
        Biaya = 0;
        return Biaya;
    }

    static int mobil() {
        System.out.print("Masukan Jam Parkir(dalam Jam): ");
        Jam = input.nextInt();
        if (Jam <= 2) {
            Biaya = 3000;
        } else if (Jam > 2 && Jam < 24) {
            Biaya = 3000 + ((Jam - 2) * 4000);
        } else if (Jam > 24) {
            int Denda = ((Jam - 2) / 24) * 100000;
            Biaya = 3000 + ((Jam - 2) * 4000) + Denda;
        }
        dataKendaraan.add(Biaya);
        System.out.println("Biaya Parkir Anda adalah Rp." + Biaya);
        Biaya = 0;
        return Biaya;
    }

    static void pilihKendaraan() {
        System.out.print("Pilih Jenis Kendaraan (Masukan Angka) : ");
        Kendaraan = input.nextInt();
        switch (Kendaraan) {
            case 1:
                motor();
                break;
            case 2:
                mobil();
                break;
            default:
                System.out.println("Jenis Kendaraan Tidak Valid");
                break;
        }
    }

     public static void main(String[] args) {
         do {
            System.out.println("==========================");
            System.out.println("Program Parkir Sederhana ");
            System.out.println("==========================");
            System.out.println("1. Parkir Motor ");
            System.out.println("2. Parkir Mobil");

            System.out.println("==========================");
            pilihKendaraan();

            System.out.println("==========================");
            System.out.print("Apakah admin perlu menghitung biaya parkir pelanggan lain?(y/t): ");
            Pilih = input.next();
            Pilih = Pilih.toLowerCase();
        }while(Pilih.equals("y"));
    }
}