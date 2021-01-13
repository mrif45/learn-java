package BangunDatar;

import java.util.Scanner;

class Balok{
    Scanner input = new Scanner(System.in);
    private double panjang, lebar, Tinggi;

    public Balok() {
        System.out.print("masukan Panjang: ");
        panjang = input.nextDouble();
        input.nextLine();

        System.out.print("masukan Lebar  : ");
        lebar = input.nextDouble();
        input.nextLine();

        System.out.print("masukan Tinggi : ");
        Tinggi = input.nextDouble();
        input.nextLine();
    }

    private double hitungKeliling(){
        double Keliling = (4*panjang)+(4*lebar)+(4*Tinggi);
        return Keliling;
    }

    private double hitungLuas(){
        double Luas = 2*((panjang*lebar)+(panjang*Tinggi)+(lebar*Tinggi));
        return Luas;
    }

    private double hitungVolume(){
        double Volume = panjang*lebar*Tinggi;
        return Volume;
    }
    public static void main(String[] args) {
        System.out.println("===========================");
        System.out.println("Balok");
        System.out.println("===========================");

        System.out.println("1 Balok Kecil ");
        Balok kecil = new Balok();

        System.out.println("\n2 Balok Sedang ");
        Balok sedang = new Balok();

        System.out.println("\n3 Balok Besar ");
        Balok besar = new Balok();

        System.out.println("\n===========================");
        System.out.println("Hasil Perhitungan");
        System.out.println("===========================");

        System.out.println("1. Balok Kecil :");
        System.out.println("Keliling  : " + kecil.hitungKeliling());
        System.out.println("Luas      : " + kecil.hitungLuas());
        System.out.println("Volume    : " + kecil.hitungVolume());

        System.out.println("\n 2. Balok Sedang :");
        System.out.println("Keliling  : " + sedang.hitungKeliling());
        System.out.println("Luas      : " + sedang.hitungLuas());
        System.out.println("Volume    : " + sedang.hitungVolume());

        System.out.println("\n 3. Balok Besar :");
        System.out.println("Keliling  : " + besar.hitungKeliling());
        System.out.println("Luas      : " + besar.hitungLuas());
        System.out.println("Volume    : " + besar.hitungVolume());

    }
}