import java.util.Scanner;

//*membuat class Truk untuk mengintansiasi method
class Truk{
    double muatan, muatanMaksimum;

    public Truk(double beratMaksimum){
        this.muatanMaksimum = beratMaksimum;
    }

    public double getMuatan(){
        return muatan;
    }

    public double getMuatanMaks(){
        return muatanMaksimum;
    }

    public double tambahMuatan(double berat){
        return this.muatan += berat;
    }
}

//*membuat class DemoTruk sebagai main method
public class DemoTruk{
    public static void main(String[] args) {
        //*menggunakan scanner untuk menginputkan masukan
        Scanner inputan = new Scanner(System.in);

        //*membuat kelas Truk dengan parameter 1000 yang digunakan untuk membuat batasan muatan maksimal
        Truk truk = new Truk(1000);
        System.out.println("Muatan Maksimal Truk Ini: "+ truk.getMuatanMaks());

        /*Input muatan dibatasi hanya 4 kali dan menggunakan method tambahMuatan
        untuk menjumlah muatan yang akan dimasukan*/
        for(int i=0; i<4; i++){
            if(truk.muatan <= truk.muatanMaksimum){
                System.out.print("masukan muatan : ");
                double input = inputan.nextDouble();
                truk.tambahMuatan(input);
            }
        }

        //*method getMuatan digunakan untuk menampilkan jumlah dari muatan yang dimasukan
        System.out.println("Muatan saat ini adalah "+ truk.getMuatan() +" KG");

        //*menggunakan if untuk menentukan apakah truk kelebihan muatan
        if(truk.muatan > truk.muatanMaksimum){
            double lebih = truk.muatan - truk.muatanMaksimum;
            System.out.print("Maaf Truk ini kelebihan muatan sebesar: " + lebih +" KG");
        }
        inputan.close();
    }
}
