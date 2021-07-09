import java.util.Scanner;

public class Stacks {
    private static int[] stack = new int[10];
    private static int hitung = 0;

    private static boolean isFull() {
        if (hitung < stack.length) {
            return true;
        } else {
            return false;
        }
    }

    private static void push() {
        int ulang = 0;
        int nilai = 0;
        while (ulang == 0) {
            System.out.print("Masukkan Data (angka): ");
            Scanner masukan = new Scanner(System.in);
            nilai = masukan.nextInt();
            ulang = 1;
        }
        stack[hitung] = nilai;
        hitung++;
    }

    private static void pop() {
        hitung--;
        System.out.print("Data telah dikeluarkan\n");
    }

    private static void tampilkan() {
        System.out.println("Penyimpanan Stack : 10 data");
        System.out.println("Data dalam Stack: ");
        for (int i = 0; i < hitung; i++) {
            System.out.println( i+1 + " => " + stack[i]);
        }
        System.out.println("");
    }

    private static void clear() {
        System.out.print("Stack dibersihkan");
        hitung = 0;
    }

    private static void exit() {
        System.out.print("Anda keluar dari program");
        System.exit(0);
    }

    private static void pilihan(int pilih) {
        switch (pilih) {
            case 1:
                boolean cek = isFull();
                if (cek) {
                    push();
                } else {
                    System.out.println("Stack Penuh!, kosongkan satu data terlebih dahulu!");
                }
                break;
            case 2:
                pop();
                break;
            case 3:
                System.out.println("Data yang terakhir dimasukkan: " + stack[hitung]);
                break;
            case 4:
                tampilkan();
                break;
            case 5:
                clear();
                break;
            case 6:
                exit();
                break;
        }
        menuProgram();
    }

    private static void menuProgram() {
        int ulang = 0;
        int pilih = 0;
        while (ulang == 0) {
            System.out.println("=========================");
            System.out.println("Pilihan Menu: ");
            System.out.println("1. Tambah data");
            System.out.println("2. Ambil 1 data dari Stack");
            System.out.println("3. lihat data terakhir yang ditambahkan");
            System.out.println("4. Tampilkan data dalam Stack");
            System.out.println("5. Buat Stack baru (Bersihkan Stack)");
            System.out.println("6. Keluar dari Program");
            System.out.print("Pilih Menu (1 - 6) : ");
            Scanner pilihan = new Scanner(System.in);
            pilih = pilihan.nextInt();
            ulang = 1;
        }
        System.out.println("");
        pilihan(pilih);
    }

    public static void main(String[] args) {
        menuProgram();
    }
}