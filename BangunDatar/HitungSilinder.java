package BangunDatar;

import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.text.DecimalFormat;

class DataSilinder{
    Scanner input = new Scanner(System.in);
    ArrayList<Double> jarijari = new ArrayList<Double>();
    ArrayList<Double> tinggi = new ArrayList<Double>();
    ArrayList<Double> Luas = new ArrayList<Double>();
    ArrayList<Double> Volume = new ArrayList<Double>();
    double r, t, luasPermukaan, volume;

    public void inputSilinder() {
        System.out.print("masukan jari - jari   : ");
        r = input.nextDouble();
        jarijari.add(r);
        System.out.print("masukan tinggi tabung : ");
        t = input.nextDouble();
        tinggi.add(t);
    }

    public void lihatSilinder(){
        DecimalFormat df = new DecimalFormat("#.#");

        luasPermukaan = 2 * Math.PI * r * (r + t);
        Luas.add(luasPermukaan);
        volume = Math.PI * Math.pow(r, 2) * t;
        Volume.add(volume);
        for(int i = 0; i<Luas.size(); i++){
            System.out.println("Luas Tabung :" + df.format(luasPermukaan));
        }
        for(int i=0; i<Volume.size(); i++){
            System.out.println("Volume Tabung :" + df.format(volume));
        }
    }

    public void hapusDataSilinder(){
        System.out.println("Pilih data yang akan dihapus");
        System.out.println("Jari-jari : "+ r);
        System.out.println("Tinggi : " + t);
        jarijari.clear();
        tinggi.clear();
    }
}

class HitungSilinder{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataSilinder silinder = new DataSilinder();
        boolean Pilih = true;
        String loop;

        do{
            System.out.println("==========================");
            System.out.println("Program Penghitung Luas dan Volume Silinder");
            System.out.println("==========================");
            System.out.println("1 Masukan Data Silinder");
            System.out.println("2 Lihat Luas dan Volume Silinder");
            System.out.println("3 Hapus Data Silinder ");
            System.out.println("4 Keluar");
            System.out.println("==========================");
            System.out.print("Masukan Pilihan Anda ");
            int pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    silinder.inputSilinder();
                    System.out.println("Apakah anda ingin memasukkan data lagi? y/t");
                    loop = input.next();
                    loop.toLowerCase();
                    if(loop.equals("y")){
                        do{
                            silinder.inputSilinder();
                            System.out.print("Apakah anda ingin memasukkan data lagi? (y/t) : ");
                            System.out.println("");
                            loop = input.next();
                            loop = loop.toLowerCase();
                        }
                        while (loop.equals("y"));
                    }
                    System.out.println("");
                    Pilih = true;
                    break;
                case 2:
                    silinder.lihatSilinder();
                    System.out.println("");
                    Pilih = true;
                    break;
                case 3:
                    silinder.hapusDataSilinder();
                    System.out.println("");
                    Pilih = true;
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("Keluar Program");
                    Pilih= false;
                    break;
                default:
                    System.out.println("Anda salah memasukan pilihan");
                    break;
            }
        } while (Pilih);
        input.close();
    }
}
