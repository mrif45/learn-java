import java.util.Scanner;

class TampilanArray2{
    static void tampilkanData(float[] Array) {
        for (int i = 0; i < Array.length; i++) {
            System.out.println("nilai Array ke-" + (i + 1) + " " + Array[i]);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan array nilai 1: ");
        int n = input.nextInt();
        input.nextLine();

        float nilai1[] = new float[n];

        for (int a = 0; a < n; a++) {
            System.out.print("Masukan Nilai ke-" + (a + 1) + ": ");
            nilai1[a] = input.nextFloat();
            input.nextLine();
        }

        System.out.println("");
        System.out.print("Masukan array nilai 2: ");
        int m = input.nextInt();

        float nilai2[] = new float[m];

        for (int b = 0; b < m; b++) {
            System.out.print("Masukan Nilai ke-" + (b + 1) + ": ");
            nilai2[b] = input.nextFloat();
        }

        System.out.println("=============================");
        System.out.println("Data dari nilai1");
        tampilkanData(nilai1);
        System.out.println("=============================");
        System.out.println("Data dari nilai1");
        tampilkanData(nilai2);
        input.close();
    }
}