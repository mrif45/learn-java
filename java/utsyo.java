import java.util.Scanner;
class utsyo{
    public static void main(String[]args){
        // Instansiasi object scanner
        Scanner inputAh = new Scanner(System.in);

        // Deklarasi array
        String[] harinya = {"Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"};
        String[] senin = {"Agama","Matematika Teknik"};
        String[] selasa = {"Logika","Teknik Digital","Praktik Teknik Digital E1"};
        String[] rabu = {"Transformasi Digital","Praktik Pemrograman E1"};
        String[] kamis = {"OSK","Pengantar TI","Praktik Teknik Digital E1"};
        String[] jumat = {"Fisika Teknik","Teori Pemrograman","Praktik Pemrograman E2"};

        // Variable buat looping do while
        String lanjut;
        Boolean x, y;
        lanjut = "";
        x = true;
        y = false;

        do{

            System.out.println("SISTEM INFORMASI JADWAL KULIAH PTI 19");
            System.out.println("=====================================");
            // Memasukan hari
            System.out.println("Masukan hari apa...");
            String hari = inputAh.nextLine();
            // fungsi dibawah untuk mengatur inputan user otomatis kapital
            String inputHari = hari.substring(0, 1).toUpperCase() + hari.substring(1);

            if(inputHari.equals(harinya[0])){
                System.out.println("Ini dia jadwal hari "+harinya[0]);
                for(String matkulSenin : senin){
                    System.out.println("- "+matkulSenin);
                }
            }else if(inputHari.equals(harinya[1])){
                System.out.println("Ini dia jadwal hari "+harinya[1]);
                for(String matkulSelasa : selasa){
                    System.out.println("- "+matkulSelasa);
                }
            }else if(inputHari.equals(harinya[2])){
                System.out.println("Ini dia jadwal hari "+harinya[2]);
                for(String matkulRabu : rabu){
                    System.out.println("- "+matkulRabu);
                }
            }else if(inputHari.equals(harinya[3])){
                System.out.println("Ini dia jadwal hari "+harinya[3]);
                for(String matkulKamis : kamis){
                    System.out.println("- "+matkulKamis);
                }
            }else if(inputHari.equals(harinya[4])){
                System.out.println("Ini dia jadwal hari "+harinya[4]);
                for(String matkulJumat : jumat){
                    System.out.println("- "+matkulJumat);
                }
            }else if(!(inputHari.equals(harinya[0])) && !(inputHari.equals(harinya[1])) && !(inputHari.equals(harinya[2])) && !(inputHari.equals(harinya[3])) && !(inputHari.equals(harinya[4])) && !(inputHari.equals(harinya[5]))  && !(inputHari.equals(harinya[6]))){
                // logika if disini untuk menampilkan peringatan jika user menginputkan selain nama hari
                System.out.println("Mohon maaf hari "+inputHari+ " tidak ada :( ");
            }else if(inputHari.equals(harinya[5]) || inputHari.equals(harinya[6])){
                System.out.println("Kuliah libur dulu...");
            }

            System.out.println("=====================================");

            do{
                System.out.println("Mau lihat jadwal lagi ? (y/t)");
                lanjut = inputAh.nextLine();
                if(lanjut.equals("t") || lanjut.equals("T")){
                    y = true;
                }else if(lanjut.equals("y") || lanjut.equals("Y")){
                    y = true;
                }else if(!(lanjut.equals("y")) && !(lanjut.equals("t"))){
                    System.out.println("Kami tidak mengerti, bisa diulangi?");
                    y = false;
                }
            }while(x != y);

            if(lanjut.equals("t") || lanjut.equals("T")){
                y = false;
            }else if(lanjut.equals("y") || lanjut.equals("Y")){
                y = true;
            }

        }while(x.equals(y));
        inputAh.close();
    }
}