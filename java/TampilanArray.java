import java.util.Scanner;

public class TampilanArray{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan array nilai1: ");
        int n = input.nextInt();
        input.nextLine();
        float nilai1[] = new float[n];

        for(int a = 0; a<n; a++){
            System.out.print("Masukan Nilai ke-"+(a+1)+": ");
            nilai1[a] = input.nextFloat();
            input.nextLine();
        }

        System.out.println("\n");
        System.out.print("Masukan array nilai 2: ");
        int m = input.nextInt();
        float nilai2[] = new float[m];

        for (int b = 0; b < m; b++) {
            System.out.print("Masukan Nilai ke-" + (b+1) + ": ");
            nilai2[b] = input.nextFloat();
        }

        System.out.println("==================================");
        for(int i = 0; i<nilai1.length; i++) {
            System.out.println("nilai Array ke-"+ (i+1) +" "+nilai1[i]);
        }

        for (int i = 0; i < nilai2.length; i++) {
            System.out.println("nilai Array ke-" + (i+1) + " "+nilai1[i]);
        }
        input.close();
    }
}