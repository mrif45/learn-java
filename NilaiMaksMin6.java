import java.util.*;

public class NilaiMaksMin6{
    static Scanner input = new Scanner(System.in);
    static ArrayList<Float> Nilai = new ArrayList<Float>();
    static String pilih;
    static boolean Pilih;
    static int menuPilih;

    static void pilihMenu(){
        System.out.println("==================================");
        System.out.println("Program Nilai MaksMin");
        System.out.println("==================================");
        System.out.println("1. Input Data");
        System.out.println("2. Lihat Data");
        System.out.println("3. Nilai Maksimum");
        System.out.println("4. Nilai Minimum");
        System.out.println("5. Keluar");
        System.out.print("Masukan Pilihan: ");
        menuPilih = input.nextInt();
        input.nextLine();
        System.out.println("==================================");
    }

    static void inputData(){
        System.out.println("==================================");
        System.out.print("Masukan Nilai             : ");
        float nilai = input.nextFloat();
        Nilai.add(nilai);
    }

    static void lihatData(){
        System.out.println("==================================");
        for(int i = 0; i<Nilai.size(); i++){
            System.out.println("Data ke-" + (i+1) + " " + Nilai.get(i));
        }
    }

    static void NilaiMaks(){
        System.out.println("==================================");
        System.out.print("Masukan Peringkat: ");
        int peringkat = input.nextInt();
        Collections.sort(Nilai, Collections.reverseOrder());
        System.out.println("Proses cari nilai tertinggi ke-"+ peringkat);
        for(int i = 0; i < peringkat; i++){
            i= peringkat;
            System.out.println("nilai tertinggi ke-" + peringkat +" "+ Nilai.get(i-1));
        }
    }

    static void NilaiMin(){
        System.out.println("==================================");
        System.out.print("Masukan Peringkat: ");
        int peringkat = input.nextInt();
        Collections.sort(Nilai);
        System.out.println("Proses cari nilai terendah ke-" + peringkat);
        for (int i = 0; i < peringkat; i++) {
            i = peringkat;
            System.out.println("nilai terendah ke-" + peringkat + " " + Nilai.get(i - 1));
        }
    }
    public static void main(String[] args) {
        do{
            pilihMenu();
            switch(menuPilih){
                case 1:
                    System.out.println("Input Data");
                    inputData();
                    System.out.print("Masukkan data lagi? (y/t) : ");
                    pilih = input.next();
                    pilih.toLowerCase();
                    if (pilih.equals("y")) {
                        do {
                            inputData();
                            System.out.print("Masukkan data lagi? (y/t) : ");
                            pilih = input.next();
                            pilih = pilih.toLowerCase();
                        } while (pilih.equals("y"));
                    }
                    System.out.println("");
                    Pilih = true;
                    break;
                case 2:
                    System.out.println("Lihat Data");
                    lihatData();
                    Pilih = true;
                    break;
                case 3:
                    System.out.println("Cari Nilai Tertinggi");
                    NilaiMaks();
                    System.out.print("Lanjut mencari Nilai Tertinggi? (y/t) : ");
                    pilih = input.next();
                    pilih.toLowerCase();
                    if (pilih.equals("y")) {
                        do {
                            NilaiMaks();
                            System.out.print("Lanjut mencari Nilai Tertinggi? (y/t) : ");
                            pilih = input.next();
                            pilih = pilih.toLowerCase();
                        } while (pilih.equals("y"));
                    }
                    System.out.println("");
                    Pilih = true;
                    break;
                case 4:
                    System.out.println("Cari Nilai Terendah");
                    NilaiMin();
                    System.out.print("Lanjut mencari Nilai Terendah? (y/t) : ");
                    pilih = input.next();
                    pilih.toLowerCase();
                    if (pilih.equals("y")) {
                        do {
                            NilaiMin();
                            System.out.print("Lanjut mencari Nilai Terendah? (y/t) : ");
                            pilih = input.next();
                            pilih = pilih.toLowerCase();
                        } while (pilih.equals("y"));
                    }
                    System.out.println("");
                    Pilih = true;
                    break;
                case 5:
                    System.out.println("Keluar Dari Program");
                    System.exit(0);
                    Pilih = false;
                    break;
                default:
                    System.out.println("Masukan tidak benar");
                    break;
            }
        }
        while(Pilih);
    }
}