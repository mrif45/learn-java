package OperasiHimpunan;

import java.util.ArrayList;
import java.util.Scanner;

public class OperasiHimpunan {
    static ArrayList<Integer> himpunan1 = new ArrayList<Integer>();
    static ArrayList<Integer> himpunan2 = new ArrayList<Integer>();
    static Scanner input = new Scanner(System.in);
    static int pilih = 0;
    static String nama1, nama2;

    //operasi gabungan
    static ArrayList<Integer> gabungan(ArrayList<Integer> Himpunan1, ArrayList<Integer> Himpunan2) {
        ArrayList<Integer> Himpunan = new ArrayList<Integer>(Himpunan1);
        Himpunan.addAll(Himpunan2);
        return Himpunan;
    }

    //operasi irisan
    static ArrayList<Integer> irisan(ArrayList<Integer> Himpunan1, ArrayList<Integer> Himpunan2) {
        ArrayList<Integer> Himpunan = new ArrayList<Integer>();
        for (Integer x : Himpunan1)
        if (Himpunan2.contains(x))
            Himpunan.add(x);
        return Himpunan;
    }

    //operasi selisih
    static ArrayList<Integer> selisih(ArrayList<Integer> Himpunan1, ArrayList<Integer> Himpunan2) {
        ArrayList<Integer> Himpunan = new ArrayList<Integer>(Himpunan1);
        Himpunan.removeAll(Himpunan2);
        return Himpunan;
    }

    //operasi beda Tangkup
    static ArrayList<Integer> bedaTangkup(ArrayList<Integer> Himpunan1, ArrayList<Integer> Himpunan2) {
        ArrayList<Integer> HimpunanA;
        ArrayList<Integer> HimpunanB;

        HimpunanA = gabungan(Himpunan1, Himpunan2);
        HimpunanB = irisan(Himpunan1, Himpunan2);
        return selisih(HimpunanA, HimpunanB);
    }

    //operasi komplemen
    static ArrayList<Integer> komplemen(ArrayList<Integer> Himpunan1, ArrayList<Integer> Himpunan2) {
        ArrayList<Integer> Himpunan = new ArrayList<Integer>(Himpunan2);
        Himpunan.removeAll(Himpunan1);
        return Himpunan;
    }

    //operasi perkalian kartesian
    static ArrayList<Integer> kaliKartesian(ArrayList<Integer> Himpunan1, ArrayList<Integer> Himpunan2) {
        ArrayList<Integer> Himpunan = new ArrayList<Integer>(Himpunan1);
        for (int i = 0; i < Himpunan1.size(); i++)
            for (int j = 0; j < Himpunan2.size(); j++)
                System.out.print("{" + Himpunan1.get(i)+ ", " + Himpunan2.get(j) + "}, ");
        return Himpunan;
    }

    //memasukan data himpunan
    static void inputData(){
        System.out.print("Masukan nama dari himpunan pertama  : ");
        nama1 = input.next();
        System.out.print("Masukan jumlah anggota dari himpunan: ");
        int jumlah = input.nextInt();
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukan anggota himpunan ke-" + (i + 1) + "       : ");
            int Himpunan1 = input.nextInt();
            himpunan1.add(Himpunan1);
        }
        System.out.println("");
        System.out.print("Masukan nama dari himpunan kedua    : ");
        nama2 = input.next();
        System.out.print("Masukan jumlah anggota dari himpunan: ");
        jumlah = input.nextInt();
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukan anggota himpunan ke-" + (i + 1) + "       : ");
            int Himpunan2 = input.nextInt();
            himpunan2.add(Himpunan2);
        }
    }

    static void lihatData(){
        System.out.println("===================");
        System.out.println(nama1 + ": " + himpunan1);
        System.out.println(nama2 + ": " + himpunan2);
        System.out.println("===================");
    }

    static void pilihMenu(){
        System.out.println("Pilih operasi berikut: ");
        System.out.println("1. Gabungan");
        System.out.println("2. Irisan");
        System.out.println("3. Selisih");
        System.out.println("4. Beda Setangkup");
        System.out.println("5. Komplemen");
        System.out.println("6. Perkalian Kartesian");
        System.out.print("masukan pilihan Anda: ");
        pilih = input.nextInt();
        switch (pilih) {
            case 1:
                lihatData();
                System.out.println("Gabungan : " + gabungan(himpunan1, himpunan2));
                break;
            case 2:
                lihatData();
                System.out.println("Irisan : " + irisan(himpunan1, himpunan2));
                break;
            case 3:
                lihatData();
                System.out.println("Selisih : " + selisih(himpunan1, himpunan2));
                break;
            case 4:
                lihatData();
                System.out.println("Beda Setangkup : " + bedaTangkup(himpunan1, himpunan2));
                break;
            case 5:
                lihatData();
                System.out.println("Komplemen : " + komplemen(himpunan1, himpunan2));
                break;
            case 6:
                lihatData();
                kaliKartesian(himpunan1, himpunan2);
                break;
            default:
                System.out.println("Pilihan tidak benar");
                break;
        }
    }

    static void pilihUlang(){
        System.out.println("===================");
        System.out.println("Apakah anda ingin melakukan operasi lainya(ol) atau memasukan himpunan baru(hb) atau keluar program(kp)?");
        System.out.println("silahkan tulis (ol / hb / kp) :");
        String ulang = input.next();
        if (ulang.equals("ol")) {
            pilihMenu();
            while(true){
                pilihUlang();
            }
        }else if (ulang.equals("hb")){
            inputData();
            lihatData();
            pilihMenu();
            pilihUlang();
        } else if (ulang.equals("kp")) {
            System.exit(0);
        }
    }

    public static void main(String args[]) {
        System.out.println("===================");
        System.out.println("Program Himpunan");
        System.out.println("===================");
        System.out.println("Terdapat dua buah himpunan");
        System.out.println("===================");
        inputData();
        lihatData();
        pilihMenu();
        pilihUlang();
    }
}
