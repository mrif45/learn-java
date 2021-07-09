import java.util.ArrayList;
import java.util.Scanner;

public class BanyakData{
    static Scanner input = new Scanner(System.in);
    static ArrayList<Float> Nilai = new ArrayList<Float>();
    static String pilih;
    static int menuPilih;

    static void pilihMenu(){
        System.out.println("==================================");
        System.out.println("Program input Data");
        System.out.println("==================================");
        System.out.println("1. Input Data");
        System.out.println("2. Lihat Data");
        System.out.println("3. Nilai Maksimum");
        System.out.println("4. Nilai Minimum");
        System.out.println("5. Keluar");
        System.out.print("Masukan Pilihan: ");
        menuPilih = input.nextInt();
        input.nextLine();
    }

    static void inputData(){
        while (true){
            System.out.print("Masukan Nilai anda: ");
            float nilai = input.nextFloat();
            Nilai.add(nilai);

            System.out.print("memasukan data lagi (y/t): ");
            pilih = input.nextLine();
            pilih = pilih.toLowerCase();
            if(pilih.equals("t")){
                break;
            }
        }
    }

    static void lihatData(){
        System.out.print("Lihat data ke-");
        int ke = input.nextInt();
        int x = ke-1;
        System.out.println("Data ke-" + (ke) + " " + Nilai.get(x));
    }

    static void NilaiMaks(){

    }

    static void NilaiMin(){

    }
    public static void main(String[] args) {
        while(true){
            pilihMenu();
            switch(menuPilih){
                case 1:
                    inputData();
                    break;
                case 2:
                    lihatData();
                    break;
                case 3:
                    NilaiMaks();
                    break;
                case 4:
                    NilaiMin();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Masukan tidak benar");
                    break;
            }
        }
    }
}