import java.util.Scanner;

class TampilanArray2{
    private static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);

        int data;
        long[] larik;
        int i;

        System.out.print("Masukkan jumlah data : ");
        int jumlahData = input.nextInt();
        larik = new long[jumlahData];

        for (i = 0; i < jumlahData; i++) {
            System.out.print("Data ke " + (i + 1) + "= ");
            int inputData = input.nextInt();
            larik[i] = inputData;
        }

        System.out.println("==================================");
        System.out.println("Pilih menu dibawah ini :");
        System.out.println("==================================");
        System.out.println("1. Pencarian Data");
        System.out.println("2. Penghapusan Data");
        System.out.println("3. Penampilan Data");
        System.out.println("4. Keluar Program");
        System.out.print("Pilihan anda: ");
        int menuPilih = input.nextInt();
        input.nextLine();
    
        switch (menuPilih) {
            case 1:
                System.out.print("Masukkan data yang dicari : ");
                data = input.nextInt();
                for (i = 0; i < larik.length; i++) {
                    if (larik[i] == data)
                        break;
                }
                if (i == larik.length)
                    System.out.println("Data " + data + " tidak ditemukan ");
                else
                    System.out.println("Data " + data + " ditemukan");
                break;
            case 2:
                System.out.print("Masukkan data yang dihapus : ");
                data = input.nextInt();
                for (i = 0; i < larik.length; i++) {
                    if (larik[i] == data)
                        break;
                }
                int nElemen = larik.length;
                for (int j = i; j < nElemen - 1; j++) {
                    larik[j] = larik[j + 1];
                    nElemen--;
                }

                for (i = 0; i < larik.length; i++) {
                    System.out.print(larik[i] + " ");
                    System.out.print(" ");
                }
                break;
            case 3:
                for (i = 0; i < larik.length; i++) {
                    System.out.print(larik[i] + " ");
                    System.out.println(" ");
                }
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan tidak benar");
                break;
        }
    }
}
