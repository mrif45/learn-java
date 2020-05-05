import java.util.Scanner;

public class enkripTeks{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String teks = "";
        String Pilih = "";
        do{
            System.out.println("==============================");
            System.out.print("Masukan Teks      : ");
            teks = input.next();
            System.out.print("jumlah geser(1-25): ");
            System.out.println(enkrip(teks));

            System.out.println("==============================");
            System.out.print("Ingin meng-enkripsi lagi?(y/t): ");
            Pilih = input.next();
            Pilih = Pilih.toLowerCase();
        }while(Pilih.equals("y"));
    }

    public static String enkrip(String teks){
        StringBuffer sb = new StringBuffer();

        int geser = input.nextInt();
        for(int i = 0; i<teks.length(); i++){
            char c = teks.charAt(i);
            if(c == 122){
                c = (char)(c-25);
            }else{
                if(geser <= 25){
                    c = (char)(c+geser);
                    sb.append(c);
                }else{
                    System.out.println("Maksimal geser 25");
                }
            }
        }
        System.out.print("Hasil             : ");
        return sb.toString();
    }
}