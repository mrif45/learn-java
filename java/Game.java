import java.util.Scanner;

abstract class Setup{
	Scanner input = new Scanner(System.in);
	String pNama;
	String pSenjata;
	int cincin;
	int pilih;
	int pHP;
	int mHP;
	int pDamage = 0;
	int mDamage = 0;
	boolean bicara = false;

	//constructor
	public Setup(String pSenjata, int pHP, int mHp){
		this.pSenjata = pSenjata;
		this.pHP = pHP;
		this.mHP = mHp;
	}
}

interface persimpangan {
	public void gerbang();
	public void gunung();
	public void hutan();
	public void ngarai();
}

class Pemain extends Setup implements persimpangan{
	public Pemain(String pSenjata, int pHP, int mHp) {
		super(pSenjata, pHP, mHp);		
	}
	
	String Intro = "Pada zaman dahulu hiduplah seorang pemuda tangguh yang tinggal di desa. \nKarena suatu keadaan ada di desanya, ia harus pergi ke kerajaan Terrasia untuk meminta bantuan \nkepada sang raja. Pemuda tersebut berjalan dari desa dan dia sampai di depan gerbang kerajaan. \nAda penjaga yang menjaga gerbang kerajaan di depan pemuda tersebut, sedangkan pemuda tersebut \ningin masuk kerajaan untuk menemui sang raja.";

	//generics
	public static <T> void intro( T Intro){
        System.out.println(Intro);
	}
	
	//exception
	public void lihat() throws NullPointerException{
		System.out.println("\t   SELAMAT DATANG DI   ");
		System.out.println("\tADVENTURE CONSOLE WORLD");
		System.out.println("=================================================\n");
		System.out.println("****************PENGANTAR GAME*******************");
		intro(Intro);

		System.out.println("\n*****************GAME DIMULAI*******************");
		System.out.print("\nMasukan Nama Karakter :  ");
		pNama = input.next();
		pNama = pNama.toUpperCase();

		System.out.println("\n=================================================\n");
		System.out.println("Halo " + pNama + " , Ayo Mulai!");
		System.out.println("Nyawamu              : " + pHP + " HP");
		System.out.println("Senjatamu            : " + pSenjata);
		System.out.println("dengan damage sebesar: 10 atk");
	}

	public void gerbang(){
		System.out.println("\n=================================================\n");
		System.out.println("Apa yang mau kamu lakukan?");
		System.out.println("1: Bicara dengan penjaga");
		System.out.println("2: Serang penjaga");
		System.out.println("3: Pergi");
		System.out.println("4: Keluar dari game");
		System.out.println("\n=================================================\n");

		pilih = input.nextInt();

		if (pilih == 1) {
			if (cincin == 1) {
				selesai();
			} else {
				System.out.println("\n=================================================\n");
				System.out.println("Penjaga : Selamat datang di kerajaan, Maaf  kami tidak dapat memperbolehkan orang asing masuk ke kerajaan kami, Silahkan pergi.");
				bicara = true;
				gerbang();
			}
		} else if (pilih == 2) {
			if(bicara == true){
				pHP -= 30;
				System.out.println("\n=================================================\n");
				System.out.println("Penjaga: Hei jangan bodoh! kamu tidak akan bisa melawanku!!! Silahkan Pergi !!!\n\n*Penjaga menyerangnmu dan kamu menyerah.*\n(Kamu mendapatkan 30 atk)\n");
				System.out.println("Nyawamu tersisa: " + pHP+ " HP");
				input.nextLine();
				if (pHP <= 0) {
					mati();
				} else {
					gerbang();
				}
			}else{
				System.out.println("\n=================================================\n");
				System.out.println("Anda harus berbicara dengan penjaga dahulu");
				gerbang();
			}
		} else if (pilih == 3) {
			persimpangan();
		} else if (pilih == 4){
			System.exit(0);
		} else {
			gerbang();
		}
	}

	public void persimpangan() {
		System.out.println("\n=================================================\n");
		System.out.println("Kamu berada di persimpangan.\n");
		System.out.println("1: Pergi ke Hutan");
		System.out.println("2: Pergi ke Gunung");
		System.out.println("3: Pergi ke Ngarai");
		System.out.println("4: Pergi ke Kerajaan");
		System.out.println("\n=================================================\n");

		pilih = input.nextInt();

		if (pilih == 1) {
			hutan();
		} else if (pilih == 2) {
			gunung();
		} else if (pilih == 3) {
			ngarai();
		} else if (pilih == 4) {
			gerbang();
		} else {
			persimpangan();
		}
	}

	public void hutan() {
		pHP += 20;
		System.out.println("\n=================================================\n");
		System.out.println("Ada sebuah sungai suci.\nMinum airnya dan kamu akan mendapatkan nyawa tambahan.");

		System.out.println("Kamu mendapat nyawa sebesar 20 HP");
		System.out.println("Nyawamu: " + pHP + " HP");
		System.out.println("\n* Kembali ke persimpangan *");
		System.out.println("\n=================================================");

		persimpangan();
	}

	public void gunung() {
		System.out.println("\n=================================================\n");
		System.out.println("Setelah berjalan menelusuri gunung akhirnya menemukan pedang Sakti!");
		
		pSenjata = "Pedang Sakti";
		System.out.println("Senjatamu: " + pSenjata);
		System.out.println("Memiliki damage : 25 atk");
		System.out.println("\n * Kembali ke persimpangan *");
		System.out.println("\n=================================================");

		persimpangan();
	}

	public void ngarai() {
		System.out.println("\n=================================================\n");
		System.out.println("Kamu bertemu Monster!\n");
		System.out.println("1: Bertarung");
		System.out.println("2: Lari");
		System.out.println("\n=================================================");

		pilih = input.nextInt();

		if (pilih == 1) {
			tarung(pHP,mHP);
		} else if (pilih == 2) {
			persimpangan();
		} else {
			ngarai();
		}
	}

	//polymorphism
	public void tarung(int pHP, int mHP) {
		System.out.println("\n=================================================\n");
		System.out.println("Nyawamu: " + pHP+" HP");
		System.out.println("Nyawa monster: " + mHP+" HP");
		System.out.println("\n1:Menyerang");
		System.out.println("2: Lari");
		System.out.println("\n=================================================\n");

		pilih = input.nextInt();

		if (pilih == 1) {
			tarung();
		} else if (pilih == 2) {
			persimpangan();
		} else {
			tarung(pHP, mHP);
		}
	}

	public void tarung() {
		if (pSenjata.equals("Clurit")) {
			pDamage = 10;
		} else if (pSenjata.equals("Pedang Sakti")) {
			pDamage = 25;
		}
		System.out.println("\n=================================================\n");
		System.out.println("Kekuatan monster : 20 atk");
		System.out.println("\nKamu menyerang monster dan memberikan " + pDamage + " damage!");
		mHP = mHP - pDamage;
		
		if (mHP <= 0) {
			menang();
		} else if (mHP > 0) {
			mDamage = 20;
			System.out.println("Monster itu menyerangmu dan memberikan " + mDamage + " damage!");
			System.out.println("=================================================\n");
			pHP = pHP - mDamage;

			if (pHP <= 0) {
				mati();
			} else if (pHP > 0) {
				tarung(pHP, mHP);
			}
		}
	}

	public void mati() {
		System.out.println("\n=================================================\n");
		System.out.println("Kamu telah mati!!!");
		System.out.println("\n\nGAME OVER");
		System.out.println("\n=================================================");
	}

	public void menang() {
		System.out.println("\n=================================================\n");
		System.out.println("Kamu membunuh monster itu!");
		System.out.println("Monster itu menjatuhkan cincin!");
		System.out.println("\nSelamat, Kamu memperoleh cincin!");
		System.out.println("Silahkan kembali ke kerajaan dan bicara dengan Penjaga");

		cincin = 1;
		gerbang();
	}

	public void selesai() {
		System.out.println("\n=================================================\n");
		System.out.println("Penjaga: Oh Kamu mendapatkan cincin itu?!! Kerja bagus!");
		System.out.println("Penjaga: Sepertinya kamu dapat dipercaya. \n\nSelamat anda boleh masuk ke kerajaan");
		System.out.println("\n           THE END                    ");
		System.out.println("\n    Terimakasih Telah Bermain                   ");
		System.out.println("\n=================================================");
	}
}

//main class
class Game{
	public static void main(String[] args) {
		//membuat object
		Pemain pemain = new Pemain("Clurit", 100, 80);		
		pemain.lihat();
		pemain.gerbang();
	}
}


