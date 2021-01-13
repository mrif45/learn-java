package UAS;

import java.util.Scanner;

public class Uts{
    public static void main( String[] args) {
        //Instansiasi Scanner
        Scanner inputan = new Scanner(System.in);

        //deklarasi tipedata
        int a, x, Lagu;
        String Genre, PilihGenre, ulang;
        Boolean y,t;
        y = false;
        t = true;

        do{
                //deklarasi Array
            String genre[] = {"POP", "JAZZ", "ROCK", "DANGDUT", "RNB"};
            String pop[] = {"1 Chrisye - Seperti Yang Kau Minta", "2 Dewa - Pupus", "3 Iwan Fals - Ijinkan Aku Menyayangimu", "4 Peterpen - Menghapus Jejakmu", "5 D'Masiv - Merindukanmu"};
            String jazz[] = {"1 Raisa - Could It Be", "2 Tompi - Sendari Dulu", "3 Sandy S - Malam Biru (Kekasihku)", "4 Tulus - Sepatu", "5 Andien - Pulang"};
            String rock[] = {"1 Cokelat - Bendera", "2 Jamrud - Putri", "3 Dewa 19 - Arjuna", "4 Kotak - Beraksi", "5 J-Rocks - Meraih Mimpi"};
            String dangdut[] = {"1 Denny Caknan - Sugeng Ndalu", "2 Via Valen - Sayang", "3 Abah Lala - Gede Roso", "4 Guyon Waton - Ora Masalah", "5 Didi kempot - Pamer Bojo"};
            String rnb[] = {"1 TLC - No Scrubs", "2 Dilemma - Nelly feat Kelly Rowland", "3 User - Yeah", "4 R. Kelly - Ignition", "5 Bruno Mars - 24K Magic"};

            System.out.println("==================================");
            System.out.println("Memilih Musik");
            System.out.println("==================================");
            System.out.println("Genre    : ");
            System.out.println("==================================");

            // Menampilkan Data dari Array Genre
            for (a = 0; a < genre.length; a++) {
                System.out.println(genre[a]);
            }

            // memasukan input Genre
            System.out.println("==================================");
            System.out.println("Pilih Genremu");
            System.out.println("==================================");
            Genre = inputan.nextLine();

            //Mengubah inputan huruf menjadi kapital agar sama dengan array
            PilihGenre = Genre.toUpperCase();

            //menampilkan data dari array yang dipilih
            if(PilihGenre.equals(genre[0])){
                System.out.println("==================================");
                System.out.println("Daftar lagu di genre "+ genre[0]);
                for(String genrepop : pop){
                    System.out.println(genrepop);
                }

                //memilih data dari array pop
                System.out.println("==================================");
                System.out.println("Pilih lagunya");
                System.out.println("==================================");
                Lagu = inputan.nextInt();
                System.out.println("==================================");
                x = Lagu - 1;
                System.out.println("Now playing >> " + pop[x]);

            }else if(PilihGenre.equals(genre[1])){
                System.out.println("==================================");
                System.out.println("Daftar Lagu di Genre : "+ genre[1]);
                for (String genrejazz : jazz) {
                    System.out.println(genrejazz);
                }

                // memilih data dari array jazz
                System.out.println("==================================");
                System.out.println("Pilih lagunya");
                System.out.println("==================================");
                Lagu = inputan.nextInt();
                System.out.println("==================================");
                x = Lagu - 1;
                System.out.println("Now Playing >> " + jazz[x]);

            }else if(PilihGenre.equals(genre[2])){
                System.out.println("==================================");
                System.out.println("Daftar Lagu di Genre : "+ genre[2]);
                for ( String genrerock : rock) {
                    System.out.println(genrerock);
                }

                // memilih data dari array rock
                System.out.println("==================================");
                System.out.println("Pilih lagunya");
                System.out.println("==================================");
                Lagu = inputan.nextInt();
                System.out.println("==================================");
                x = Lagu - 1;
                System.out.println("Now Playing >> " + rock[x]);

            }else if(PilihGenre.equals(genre[3])){
                System.out.println("==================================");
                System.out.println("Daftar Lagu di Genre : Dangdut");
                for ( String genredangdut : dangdut) {
                    System.out.println(genredangdut);
                }

                // memilih data dari array dangdut
                System.out.println("==================================");
                System.out.println("Pilih lagunya");
                System.out.println("==================================");
                Lagu = inputan.nextInt();
                System.out.println("==================================");
                x = Lagu - 1;
                System.out.println("Now Playing >> " + dangdut[x]);

            }else if(PilihGenre.equals(genre[4])){
                System.out.println("==================================");
                System.out.println("Daftar Lagu di Genre : R&B");
                for ( String genrerdanb : rnb) {
                    System.out.println(genrerdanb);
                }

                // memilih data dari array R&B
                System.out.println("==================================");
                System.out.println("Pilih lagunya");
                Lagu = inputan.nextInt();
                System.out.println("==================================");
                System.out.println("==================================");
                x = Lagu - 1;
                System.out.println("Now Playing >> " + jazz[x]);

            }else if(!(PilihGenre.equals(genre[0])) &&!(PilihGenre.equals(genre[1])) && !(PilihGenre.equals(genre[2])) && !(PilihGenre.equals(genre[3])) && !(PilihGenre.equals(genre[4]))){
                System.out.println("==================================");
                System.out.print("genre yang ditulis tidak ada di daftar\n");
            }

            System.out.println("==================================");

            do{
                System.out.println("Mau memutar lagu lain ? (y/t)");
                ulang = inputan.nextLine();
            if (ulang.equals("y") || ulang.equals("Y")) {
                    t = true;
            }else if (ulang.equals("t") || ulang.equals("T"))  {
                    t = true;
                }else if (!(ulang.equals("y")) && !(ulang.equals("t"))) {
                    System.out.println("Kami tidak mengerti, bisa diulangi?");
                    t = false;
                }
            }while(y != t);
            if (ulang.equals("t") || ulang.equals("T")) {
                t = true;
            } else if (ulang.equals("y") || ulang.equals("Y")) {
                t = false;
            }
    }while(y.equals(t));
    inputan.close();
}
}