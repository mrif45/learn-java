import java.util.Scanner;

public class GanjilGenap2{
    static String apakahGanjil(int ParamBilangan){
        String Hasil;
        if(ParamBilangan %2 !=0){
            Hasil = " Ganjil";
        } else {
            Hasil = " Genap";
        }
        return Hasil;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Bilangan ");
        int bilangan = input.nextInt();

        System.out.println(bilangan+" Merupakan bilangan"+ apakahGanjil(bilangan));
        input.close();
    }
}