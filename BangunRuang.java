import java.util.Scanner;

//class bangunanya untuk membuat method-method yang akan digunakan
class Bangunanya {
    private static Scanner s = new Scanner(System.in);

    public void bola() {
        double r, pi;
        System.out.println("=================================");
        System.out.println("Bangun Bola");
        System.out.println("=================================");
        System.out.println("Rumus luas Bola = 4 x πr²");
        System.out.println("Rumus Volume Bola = 4/3 x πr³  ");
        System.out.println("=================================");
        System.out.print("masukan jari-jari : ");

        r = s.nextDouble();
        pi = 3.14;
        double luasBl = 4 * (pi * r * r);
        double volumeBl = 4 / 3 * (pi * r * r * r);

        System.out.println("=================================");
        System.out.println("Luas permukaan : " + luasBl);
        System.out.println("Volume         : " + volumeBl);
    }

    public void prismaSegitiga() {
        double a, t, z;
        System.out.println("=================================");
        System.out.println("Bangun Prisma segitiga");
        System.out.println("=================================");

        System.out.print("Alas segitiga   : ");
        a = s.nextDouble();
        System.out.print("tinggi segitiga : ");
        t = s.nextDouble();
        System.out.print("tinggi prisma   : ");
        z = s.nextDouble();

        double luas_alas = a * t / 2;
        double volumePs = luas_alas * z;

        System.out.println("=================================");
        System.out.println("Luas alas  = " + luas_alas);
        System.out.println("Volume     = " + volumePs);
    }

    public void tabung() {
        double r, t;
        System.out.println("=================================");
        System.out.println("Bangun Tabung");
        System.out.println("=================================");

        System.out.print("masukan jari - jari  : ");
        r = s.nextDouble();
        System.out.print("masukan tinggi tabung : ");
        t = s.nextDouble();

        double pi = 3.14;
        double luasTb = 2 * pi * r * t * 2 * pi * r * r;
        double volumeTb = pi * r * r * t;

        System.out.println("=================================");
        System.out.println("Luas permukaan Tabung : " + luasTb);
        System.out.println("Volume Tabung         : " + volumeTb);
    }
}

//main class
public class BangunRuang{
    public static void main(String[] args){
        //intansiasi Scanner
        Scanner inputan = new Scanner(System.in);
        //inisialisasi variabel p untuk perulangan
        int p = 1;
        int y;

        System.out.println("=================================");
        System.out.println("Pengolah Bangun Ruang");
        System.out.println("=================================");

        //membuat object bangunan
        Bangunanya bangunan = new Bangunanya();

        //while untuk mengulang program
        while(p > 0){
            System.out.println("=================================");
            System.out.println("Silahkan Pilih Bangun Ruang");
            System.out.println("1 Prisma Segitiga");
            System.out.println("2 Tabung");
            System.out.println("3 Bola");
            System.out.println("=================================");
            System.out.print("Masukkan Angka pilihan : ");

            //scanner untuk memasukan inputan angka dari user
            y = inputan.nextInt();

            //switch case untuk memilih bangunan
            switch(y){
                case 1 :
                    bangunan.prismaSegitiga();
                    break;
                case 2:
                    bangunan.tabung();
                    break;
                case 3:
                    bangunan.bola();
                    break;
                default:
                    System.out.println("=================================");
                    System.out.println("Bangunan Tidak ada di daftar");
                    break;
            }
            System.out.println("=================================");
            System.out.println("Ganti bangun?(0 = keluar / 1 = iya)");

            //karena p > 0 maka jika 0 program akan keluar
            p = inputan.nextInt();
        }
        inputan.close();
    }
}

