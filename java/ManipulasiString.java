import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ManipulasiString{
    static Character[] HurufVokal = {'a','A','i','I','u','U','e','E','o','O'};
    static ArrayList<Character> ListHurufVokal = new ArrayList<Character>(Arrays.asList(HurufVokal));

    static boolean ApakahAlfabet(char huruf){
        boolean alfabet = false;
        if((huruf >= 'a' && huruf <= 'z')||
            (huruf >= 'A' && huruf <= 'Z')){
                alfabet = true;
            }
            return alfabet;
    }

    static String hapusHurufKonsonan(String paramTeks) {
        String teksBaru = "";
        for(int i = 0; i < paramTeks.length(); i++){
            if(ApakahAlfabet(paramTeks.charAt(i))){
                if(ListHurufVokal.contains(paramTeks.charAt(i))){
                    teksBaru += paramTeks.charAt(i);
                }
            }else{
                teksBaru += paramTeks.charAt(i);
            }
        }
        return teksBaru;
    }

    static String hapusHurufKonsonan2(String teks) {
        return teks.replaceAll("[^aAiIuUeEoO0-9]+", "");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String teks = "";
        boolean ulang = true;
        String pilih = "t";

        while(ulang){
            System.out.print("Masukan Teks : ");
            teks = input.nextLine();
            System.out.println("Hasil hapus huruf konsonan : " + hapusHurufKonsonan(teks));
            System.out.println("Hasil hapus huruf konsonan : " + hapusHurufKonsonan2(teks));
            System.out.println("Apakah ingin mengulang program(y/t)? : ");
            pilih = input.nextLine();
            pilih.toLowerCase();
            if(pilih.equals("t")){
                break;
            }
        }
            input.close();
    }
}