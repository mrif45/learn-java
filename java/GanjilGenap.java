import java.util.Scanner;

public class GanjilGenap{
    static boolean apakahGanjil(int ParamBilangan){
        return (ParamBilangan %2 !=0);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Bilangan ");
        int bilangan = input.nextInt();

        if(apakahGanjil(bilangan)){
            System.out.println(bilangan+" merupakan Bilangan Ganjil");
        } else {
            System.out.println(bilangan+" merupakan Bilangan Genap");
        }
        input.close();
    }
}