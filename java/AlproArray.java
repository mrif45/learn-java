import java.util.Arrays;
import java.util.Scanner;

class AlproArray{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=============================");
        System.out.print("Masukan jumlah data (maks 20): ");
        int jumlah = input.nextInt();

        int total = 0;
        int rerata = 0;
        int Bilangan[] = new int[jumlah];

        for(int i = 0; i < jumlah; i++){
            System.out.print("Masukan data ke-" +(i+1)+ ": ");
            Bilangan[i] = input.nextInt();
            total += Bilangan[i];
        }

        System.out.println("=============================");
        System.out.println("Total Jumlah data : " + total);

        rerata = total/jumlah;
        System.out.println("Rata - rata       : " + rerata);
        System.out.println("=============================");

        System.out.println("\n=============================");
        System.out.println("data  \t  selisih");
        System.out.println("=============================");
        Arrays.sort(Bilangan);
        for (int i = 0; i < Bilangan.length; i++) {
            int selisih = Bilangan[i] - rerata;
            System.out.println(Bilangan[i] + "\t  "+ selisih);
        }
        input.close();
    }
}