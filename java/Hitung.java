interface Operasi{
    double pi = 3.14;
    String panjang = " cm";
    void kelilingLingkaran(double radius);
    void kelilingPersegi();
}

class Hitung implements Operasi{
    static double lingkaran;
    double persegi;
    double sisi = 5;
    public void kelilingLingkaran(double radius) {
        System.out.println("Menghitung Keliling Lingkaran");
        System.out.println("nilai radius       = " + radius + panjang);
        lingkaran = pi * 2 * radius;
        System.out.println("keliling lingkaran = " + lingkaran + panjang);
    }

    public void kelilingPersegi() {
        // System.out.println("Menghitung Keliling Persegi");
        // System.out.println("nilai sisi       = " + sisi + panjang);
        // persegi = 4 * sisi;
        // System.out.println("keliling persegi = " + persegi + panjang);
    }

    public static void main(String[] args) {
        Hitung h = new Hitung();
        h.kelilingLingkaran(lingkaran);
        h.kelilingPersegi();
    }
}