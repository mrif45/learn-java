import java.util.*;

public class latuts {
    public static void main(String[] args) {
        //tipedata
        String text = "latihan uts";
        int angka = 32;
        byte angka1 = 8;
        short angka2 = 16;
        long angka3 = 32l;
        float a1 = 32.0f;
        double a2 = 64.0d;
        char c = 'c';
        boolean dua = true;

        //operator aritmatika
        int z = angka * angka - angka;

        System.out.println(text);
        System.out.print(angka);
        System.out.println(angka1);
        System.out.println(angka2);
        System.out.println(angka3);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(c);
        System.out.println(dua + "\n");
        System.out.println(z + "\n");


        //percabangan
        if (a1>40){
            System.out.println("a1 lebih dari 10 " + a1);
        } else if(a2>10) {
            System.out.println("a2 kurang dari 10");
        } else {
            System.out.println("ngga ada");
        }

        //Switch case
        switch (z) {
            case 993:
                System.out.println("x nya 993" + "\n");
                break;
            case 43:
                System.out.println("x nya 43");
                break;
            default:
                break;
        }

        //scanner
        int t;
        System.out.println("masukan nilai ");

        Scanner inputan = new Scanner(System.in);
        int Input = inputan.nextInt();

        System.out.println("nilai anda " + Input);

        //ternary operator
        t = (Input == 10) ? (Input+Input) : (Input/5);
        System.out.println("nilainya " + t + "\n");

        //perulangan
        //while > aksinya di perulangan, ngecek kondisi dulu
        while(z<994){
            System.out.println("nilai z kurang dari 1000");
            z++;
        }

        //do while aksinya dulu baru kondisi
        int a = 9;
        boolean kondisia = true;
        do{
            a++;
            System.out.println("do while ke-" + a);
            if (a == 10) {
                kondisia = false;
            }
        }while(kondisia);
        System.out.println("selesai" + "\n");

        //for bintang
        for (int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
            System.out.print("*");
            if((i+j) ==4){
                break;
            }
        }
        System.out.print("\n");
        }

        for (int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
            System.out.print("*");
            if(i==j){
                break;
            }
        }
            System.out.print("\n");
        }
        System.out.print("\n");

        //bintang segitiga
        for (int i = 0; i < 9; i++){
            for(int j= 0; j < 9; j++){
                System.out.print("* ");

            if(i == j){
                break;
            }else if((i+j) ==8){
                break;
                }
            }

            System.out.print("\n");
        }
        inputan.close();
    }
}