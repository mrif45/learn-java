import java.util.HashMap;
import java.util.Scanner;

class BukuTest{
    static HashMap<String, String> dataBuku = new HashMap<String, String>();
    static Scanner input = new Scanner(System.in);
    static int menuPilih;

    static void pilihMenu(){
        System.out.println("==================================");
        System.out.println("Program input Data");
        System.out.println("==================================");
        System.out.println("1. Input Data");
        System.out.println("2. Lihat Data");
        System.out.println("3. Keluar");
        System.out.print("Masukan Pilihan: ");
        menuPilih = input.nextInt();
        input.nextLine();
    }

    static void InputData(){
        System.out.println("Masukan Nama Buku          : ");
        String Nama = input.nextLine();
        System.out.println("Masukan Nama Pengarang Buku: ");
        String Penulis = input.nextLine();
        dataBuku.put(Nama, Penulis);
    }

    static void lihatData(){
        for (String i : dataBuku.keySet()) {
            System.out.println("Nama Buku: " + i + "\nPengarang: " + dataBuku.get(i));
        }
    }

    public static void main(String[] args) {
        while (true) {
            pilihMenu();
            switch (menuPilih) {
                case 1:
                    InputData();
                    break;
                case 2:
                    lihatData();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Masukan tidak benar");
                    break;
            }
        }
    }
}