// import java.util.Scanner;

// class Pemain {
// }

// class Pergi {
//     String pNama;
//     String pSenjata;
    
//     int pHP;
//     int pilih;
//     int mHP;
//     int cincin;
    
//     public void pSetup() {
//         this.pHP = 10;
//         this.pSenjata = "Clurit";
//         this.mHP = 12;
    
//         System.out.print("Masukan Nama Karakter          :  ");
//         pNama = input.next();
    
//         System.out.println("Halo " + this.pNama + ", Ayo Mulai!");
//         System.out.println("Nyawa Anda: " + this.pHP);
//         System.out.println("Senjata Anda: " + this.pSenjata);
//     }

//     public void gerbang() {

//         System.out.println("\n===================================================\n");
//         System.out.println("Kamu ada di depan gerbang kerajaan.");
//         System.out.println("Ada penjaga yang menjaga gerbang kota di depanmu.\n");
//         System.out.println("Apa yang mau kamu lakukan?");
//         System.out.println("1: Bicara dengan penjaga");
//         System.out.println("2: Serang penjaga");
//         System.out.println("3: Pergi");
//         System.out.println("\n===================================================\n");

//         pilih = input.nextInt();

//         if (pilih == 1) {
//             if (cincin == 1) {
//                 akhir();
//             } else {
//                 System.out.println("Penjaga : Hello. Namamu " + pNama+ "? \nSorry, kita tidak dapat memperbolehkan orang asik masuk ke kota kita.");
//                 gerbang();
//             }

//         } else if (pilih == 2) {
//             pHP--;
//             System.out.println(
//                     "Penjaga: Hei jangan bodoh!.\n\nPenjaga menyerangnmu dan kamu menyerah.\n(Kamu mendapatkan 1 serangan)\n");
//             System.out.println("HP mu: " + pHP);
//             masuk.nextLine();
//             if (pHP <= 0) {
//                 mati();
//             } else {
//                 gerbang();
//             }

//         } else if (pilih == 3) {
//             perempatan();
//         } else {
//             gerbang();
//         }
//     }

//     public void perempatan() {
//         System.out.println("\n------------------------------------------------------------------\n");
//         System.out.println("Kamu berada di persimpangan. Jika kamu pergi ke selatan, Kamu akan kembali ke kota.\n\n");
//         System.out.println("1: Pergi ke Utara");
//         System.out.println("2: Pergi ke timur");
//         System.out.println("3: Pergi ke Selatan");
//         System.out.println("4: Pergi ke Barat");
//         System.out.println("\n------------------------------------------------------------------\n");

//         pilih = input.nextInt();

//         if (pilih == 1) {
//             hutan();
//         } else if (pilih == 2) {
//             gunung();
//         } else if (pilih == 3) {
//             ngarai();
//         } else if (pilih == 4) {
//             gerbang();
//         } else {
//             perempatan();
//         }
//     }

//     public void hutan() {
//         System.out.println("\n------------------------------------------------------------------\n");
//         System.out.println("Ada sebuah sungai. Minum airnya dan beristirahatlah di tepi sungai.");
//         System.out.println("HP mu sudah pulih.");
//         pHP++;
//         System.out.println("HP mu: " + pHP);
//         System.out.println("\n\n1: Kembali ke persimpangan");
//         System.out.println("\n------------------------------------------------------------------\n");

//         pilih = input.nextInt();

//         if (pilih == 1) {
//             perempatan();
//         } else {
//             hutan();
//         }
//     }

//     public void gunung() {
//         System.out.println("\n------------------------------------------------------------------\n");
//         System.out.println("Kamu berjalan ke dalam hutan dan menemukan pedang panjang!");
//         pSenjata = "";
//         System.out.println("Senjatamu: " + pSenjata);
//         System.out.println("\n\n1: Kembali ke persimpangan");
//         System.out.println("\n------------------------------------------------------------------\n");

//         pilih = input.nextInt();

//         if (pilih == 1) {
//             perempatan();
//         } else {
//             gunung();
//         }
//     }

//     public void ngarai() {
//         System.out.println("\n------------------------------------------------------------------\n");
//         System.out.println("Kamu bertemu goblin!\n");
//         System.out.println("1: Bertarung");
//         System.out.println("2: Lari");
//         System.out.println("\n------------------------------------------------------------------\n");

//         pilih = input.nextInt();

//         if (pilih == 1) {
//             tarung();
//         } else if (pilih == 2) {
//             perempatan();
//         } else {
//             ngarai();
//         }
//     }
// }

// class Bertarung {
//     public void tarung() {
//         System.out.println("\n------------------------------------------------------------------\n");
//         System.out.println("HP mu: " + pHP);
//         System.out.println("HP monster: " + mHP);
//         System.out.println("\n1:Menyerang");
//         System.out.println("2: Lari");
//         System.out.println("\n------------------------------------------------------------------\n");

//         pilih = input.nextInt();

//         if (pilih == 1) {
//             serang();
//         } else if (pilih == 2) {
//             perempatan();
//         } else {
//             tarung();
//         }
//     }

//     public void serang() {
//         int pDamage = 0;

//         if (pSenjata.equals("Knife")) {
//             pDamage = new java.util.Random().nextInt(5);
//         } else if (pSenjata.equals("Long Sword")) {
//             pDamage = new java.util.Random().nextInt(8);
//         }

//         System.out.println("Kamu menyerang monster dan memberikan" + pDamage + " damage!");

//         mHP = mHP - pDamage;

//         System.out.println("HP monster: " + mHP);

//         if (mHP < 1) {
//             menang();
//         } else if (mHP > 0) {
//             int mDamage = 0;

//             mDamage = new java.util.Random().nextInt(4);

//             System.out.println("Monster itu menyerangmu dan memberikan " + mDamage + " damage!");

//             pHP = pHP - mDamage;

//             System.out.println("HP pemain: " + pHP);

//             if (pHP < 1) {
//                 mati();
//             } else if (pHP > 0) {
//                 tarung();
//             }
//         }
//     }
// }

// class Selesai {
//     public void mati() {
//         System.out.println("\n------------------------------------------------------------------\n");
//         System.out.println("Kamu telah mati!!!");
//         System.out.println("\n\nGAME OVER");
//         System.out.println("\n------------------------------------------------------------------\n");

//     }

//     public void menang() {
//         System.out.println("\n------------------------------------------------------------------\n");
//         System.out.println("Kamu membunuh monster itu!");
//         System.out.println("Monster itu menjatuhkan cincin!");
//         System.out.println("Kamu memperoleh cincin silver!\n\n");
//         System.out.println("1: Pergi ke Timur");
//         System.out.println("\n------------------------------------------------------------------\n");

//         cincin = 1;

//         pilih = input.nextInt();
//         if (pilih == 1) {
//             perempatan();
//         } else {
//             menang();
//         }

//     }

//     public void selesai() {
//         System.out.println("\n------------------------------------------------------------------\n");
//         System.out.println("Penjaga: Oh Kamu membunuh goblin itu?!! Kerja bagus!");
//         System.out.println("Penjaga: Sepertinya kamu dapat dipercaya. Selamat datang di kota kita!");
//         System.out.println("\n\n           THE END                    ");
//         System.out.println("\n------------------------------------------------------------------\n");
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         Pemain pemain = new Pemain();
//         Pergi pergi = new Pergi();

//         pemain.pSetup();
//         pergi.gerbang();
//     }
// }