import java.util.Scanner;

public class piramidaBalok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tinggi = 0;
        String Pilih = "";

        do{
            System.out.println("=======================================");
            System.out.print("Program Menghitung Tinggi Piramida balok");
            System.out.print("Masukan jumlah balok kayu: ");
            int balok = input.nextInt();

            for (int i=0; i<balok; i++){
                tinggi = i;
                balok -= i + 1;
            }
            System.out.println("hasil : "+(tinggi + 1));

            System.out.println("=======================================");
            System.out.print("Ingin memasukan data lagi?(y/t): ");
            Pilih = input.next();
            Pilih = Pilih.toLowerCase();
        }while(Pilih.equals("y"));
        input.close();
    }
}