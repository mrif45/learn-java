import java.util.Scanner;
import java.util.HashMap;

class DataBuku{
    private String Nama;
    private String Pengarang;
    private Scanner input = new Scanner(System.in);
    private HashMap<String, String> dataBuku = new HashMap<>();

    void InputBuku() {
        System.out.print("Masukan Nama Buku       : ");
        Nama = input.nextLine();
        System.out.print("Masukan Nama Pengarang  : ");
        Pengarang = input.nextLine();
        dataBuku.put(Nama, Pengarang);
    }

    void LihatBuku() {
        System.out.println("===================================================");
        System.out.println("Data buku yang baru dimasukan: ");
        for (String i : dataBuku.keySet()) {
            System.out.println("Nama Buku: " + i + "\nPengarang: " + dataBuku.get(i));
        }
    }

    void setNama(String Nama) {
        this.Nama = Nama;
    }

    String getNama() {
        return Nama;
    }

    void setPengarang(String Pengarang) {
        this.Pengarang = Pengarang;
    }
    String getPengarang() {
        return Pengarang;
    }
}

public class Buku{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataBuku buku = new DataBuku();
        boolean Pilih = true;
        String loop;

        do{
            System.out.println("==========================");
            System.out.println("Program Input Data Perpustakaan");
            System.out.println("1 Masukan Data Buku");
            System.out.println("2 Lihat Data Buku");
            System.out.println("3 Keluar");
            System.out.print("Masukan Pilihan Anda ");
            int pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    buku.InputBuku();
                    System.out.println("Apakah anda ingin memasukkan data lagi? y/t");
                    loop = input.next();
                    if(loop.equals("y")){
                        do{
                            buku.InputBuku();
                            System.out.println("Apakah anda ingin memasukkan data lagi? y/t");
                            loop = input.next();
                        }
                        while (loop.equals("y"));
                    }
                    Pilih = true;
                    break;
                case 2:
                    buku.LihatBuku();
                    Pilih = true;
                    break;
                case 3:
                    System.out.println("==========================");
                    System.out.println("Keluar Program");
                    Pilih= false;
                    break;
                default:
                    System.out.println("Data yang anda masukan salah");
                    break;
            }
        } while (Pilih);
        input.close();
    }
}