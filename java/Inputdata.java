import java.util.*;
public class Inputdata{

    public static void main(String[] args) {
        ArrayList<Float> nilai = new ArrayList<Float>();
        Scanner scan = new Scanner (System.in);
        boolean x = true;
        int loop;
        do{
        System.out.println("Berikut daftar menu yang ada: ");
        System.out.println("1. Input Data \n2. Lihat Data \n3.Keluar");
        System.out.print("Masukkan pilihan anda : ");
        int input = scan.nextInt();
        switch (input){
            case 1 :
                System.out.print("Masukkan nilai yang ingin anda tambahkan = ");
                float masukkan=scan.nextFloat();
                nilai.add(masukkan);
                System.out.println("Apakah anda mau memasukkan data lagi ");
                System.out.println("1. Ya\n2. Tidak");
                loop= scan.nextInt();
                if(loop==1){
                    do{
                        System.out.print("Masukkan nilai yang ingin anda tambahkan = ");
                        masukkan=scan.nextFloat();
                        nilai.add(masukkan);
                        System.out.println("Apakah anda mau memasukkan data lagi ");
                        System.out.println("1. Ya\n2. Tidak");
                        loop= scan.nextInt();
                    }
                    while (loop==1);
                }
                x=true;
                break;
            case 2 :
                System.out.println("Berikut nilai yang anda masukkan : ");
                for(int i=0;i<nilai.size();i++ ){
                System.out.println(nilai.get(i));
                }
                x=true;
                break;
            case 3 :
                System.out.println("Keluar dari Aplikasi ");
                x=false;
                break;
            }
        }
        while (x);
        scan.close();
    }
}