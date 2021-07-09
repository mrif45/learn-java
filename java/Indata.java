import java.util.Scanner;

class Indata{
    private static Scanner inputan = new Scanner(System.in);

    public static void main(String[] args)
    {
     System.out.print("masukan data teks : ");
     String kata = inputan.next();

     System.out.print("masukan bilangan bulat : ");
     int bilbul = inputan.nextInt();

     System.out.print("masukan desimal : ");
     Double bilR = inputan.nextDouble();

     System.out.println("teks yang anda masukan : " + kata);
     System.out.println("bilangan yang anda masukan : " + bilbul);
     System.out.println("desimal yang anda masukan : " + bilR);
    }
}
