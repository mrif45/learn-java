import java.util.Scanner;

class ExSort2 {
    static Scanner input = new Scanner(System.in);
    static String pilih;
    static boolean Pilih;
    static int menuPilih;
    private static int[] arr;

    static void pilihMenu() {
        System.out.println("==================================");
        System.out.println("Program Nilai MaksMin");
        System.out.println("==================================");
        System.out.println("1. Input Data");
        System.out.println("2. Lihat Data");
        System.out.println("3. Sort");
        System.out.println("4. Keluar");
        System.out.print("Masukan Pilihan: ");
        menuPilih = input.nextInt();
        input.nextLine();
        System.out.println("==================================");
    }

    public static int[] getArr() {
        return arr;
    }

    public static void setArr(int[] arr) {
        ExSort2.arr = arr;
    }

    static void inputData() {
        System.out.println("==================================");
        System.out.print("Masukan Nilai             : ");
        int nilai = input.nextInt();
        setArr(new int[nilai]);
    }

    static void lihatData(int [] arr) {
        System.out.println("==================================");
        System.out.print("Data array arr : { ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println("}");
    }

    static void Sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    int ganti = arr[i];
                    arr[i] = arr[j];
                    arr[j] = ganti;
                }
            }
        }
    }

    public static void main(String[] args) {
        do {
            pilihMenu();
            switch (menuPilih) {
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
                    // lihatData(arr);
                    Pilih = true;
                    break;
                case 3:
                    System.out.println("Urutkan data");
                    // Sort(arr);
                    break;
                case 4:
                    System.out.println("Keluar Dari Program");
                    System.exit(0);
                    Pilih = false;
                    break;
                default:
                    System.out.println("Masukan tidak benar");
                    break;
            }
        } while (Pilih);
    }
}