import java.util.Scanner;

class TugasKelompok2{
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Input Huruf(A-E): ");
        char Huruf = input.next().charAt(0);

        switch(Huruf){
            case 'A':
                System.out.println("Rentang nilai nilai 90-100");
                break;
            case 'B':
                System.out.println("Rentang nilai nilai 80-89");
                break;
            case 'C':
                System.out.println("Rentang nilai nilai 70-79");
                break;
            case 'D':
                System.out.println("Rentang nilai nilai 60-69");
                break;
            case 'E':
                System.out.println("Rentang nilai nilai 0-59");
                break;
            default:
                System.out.println("Input tidak benar ");
                break;
        }
        input.close();
    }
}