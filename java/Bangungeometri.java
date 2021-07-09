import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

class Balok{
    private int panjang, lebar, tinggi, volume, luasPermukaan;
    public void setPanjang(int p){
        panjang = p;
    }
    public void setLebar(int l){
        lebar = l;
    }
    public void setTinggi(int t){
        tinggi = t;
    }
    public void setVolume(){
        volume = panjang * tinggi * lebar;
    }
    public void setLuasPermukaan(){
        luasPermukaan = 2 * panjang * lebar + 2 * panjang * tinggi + 2 * lebar * tinggi;
    }
    public int getPanjang(){
        return panjang;
    }
    public int getLebar(){
        return lebar;
    }
    public int getTinggi(){
        return tinggi;
    }
    public int getVolume(){
        return volume;
    }
    public int getLuasPermukaan(){
        return luasPermukaan;
    }
}


class Tabung{
    DecimalFormat df = new DecimalFormat("#.##");
    private int tinggi, jarijari;
    private double volume, luasPermukaan;

    public void setTinggi(int t){
        tinggi = t;
    }
    public void setJariJari(int r){
        jarijari = r;
    }
    public void setVolume(){
        volume =  Math.PI * Math.pow(jarijari, 2) * tinggi;
    }
    public void setLuasPermukaan(){
        luasPermukaan = 2 * Math.PI * jarijari * (jarijari + tinggi);
    }
    public int getJariJari(){
        return jarijari;
    }
    public int getTinggi(){
        return tinggi;
    }
    public double getVolume(){
        return volume;
    }
    public double getLuasPermukaan(){
        return luasPermukaan;
    }
}

class TestDrive{
    private static Scanner s = new Scanner(System.in);

    public static void balokTestDrive(){
        int p,l,t;
        Balok B = new Balok();

        System.out.println("===========================");
        System.out.println("Bangun Balok");
        System.out.println("===========================");
        System.out.print("Masukkan panjang balok : ");
        p = s.nextInt();
        System.out.print("Masukkan lebar balok   : ");
        l = s.nextInt();
        System.out.print("Masukkan tinggi balok  : ");
        t = s.nextInt();

        B.setPanjang(p);
        B.setLebar(l);
        B.setTinggi(t);
        B.setVolume();
        B.setLuasPermukaan();

        System.out.println("===========================");
        System.out.println("Panjang balok        = "+ B.getPanjang());
        System.out.println("Lebar balok          = " + B.getLebar());
        System.out.println("Tinggi balok         = "+ B.getTinggi());
        System.out.println("Volume balok         = "+ B.getVolume());
        System.out.println("Luas permukaan balok = "+ B.getLuasPermukaan());
        s.close();
    }

    public static void tabungTestDrive() {
        Tabung T = new Tabung();
        int jarijari, t;

        System.out.println("===========================");
        System.out.println("Bangun Tabung");
        System.out.println("===========================");
        System.out.print("Masukkan panjang jari jari : ");
        jarijari = s.nextInt();
        System.out.print("Masukkan tinggi            : ");
        t = s.nextInt();

        T.setJariJari(jarijari);
        T.setTinggi(t);
        T.setVolume();
        T.setLuasPermukaan();

        System.out.println("===========================");
        System.out.println("Jarijari tabung       = " + T.getJariJari());
        System.out.println("Tinggi tabung         = " + T.getTinggi());
        System.out.println("Volume tabung         = " + T.df.format(T.getVolume()));
        System.out.println("Luas permukaan tabung = " + T.df.format(T.getLuasPermukaan()));
    }
}

class Bangungeometri {
    public static void main(String[] args) {
        System.out.println("===========================");
        System.out.println("Pengolahan Bangun Geometri");
        System.out.println("===========================");
        Scanner input = new Scanner(System.in);

        int p = 1;
        int i;

        while (p > 0) {
            System.out.println("Menu");
            System.out.println("1 Tabung");
            System.out.println("2 Balok");
            System.out.println("Masukkan angka pilihan");
            i = input.nextInt();
            switch (i) {
                case 1:
                    TestDrive.tabungTestDrive();
                    break;
                case 2:
                    TestDrive.balokTestDrive();
                    break;
            }
            System.out.println("===========================");
            System.out.println("Ulang Program? (O = keluar / 1 = Iya)");
            p = input.nextInt();
        }
        input.close();
    }
}