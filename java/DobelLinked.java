import java.util.Scanner;

class Node{
    public String Data1;
    public Long Data2;
    public char Data3;
    public Node next; // pointer (link) untuk terhubung dengan Node berikutnya
    public Node previous; // pointer (link) untuk terhubung dengan Node sebelumnya

    public Node(String nama, Long nim, char jk) {
        Data1 = nama;
        Data2 = nim;
        Data3 = jk;
    }

    public void tampilNode() {
        System.out.println(Data1 + ", " + Data2 + " , " + Data3 );
    }
}

class DoubleLink{
    public Node first;
    public Node last;

    public DoubleLink() { // constructor
        first = null;
        last = null;
    }

    public boolean isEmpty() { // bernilai true jika tidak ada data
        return first == null;
    }

    public void insertFirst(String nama, Long nim, char jk) {
        Node newNode = new Node(nama, nim, jk);
        if (isEmpty())
            last = newNode;
        else
            first.previous = newNode;
        newNode.next = first;
        first = newNode;
    }

    public Node hapus(Long nim) {
        Node indek = first;
        while (!(indek.Data2).equals(nim)) {
            indek = indek.next;
            if (indek == null)
                return null;
        }
        if (indek == first)
            first = indek.next;
        else
            indek.previous.next = indek.next;

        if (indek == last)
            last = indek.previous;
        else
            indek.next.previous = indek.previous;
        return indek;
    }

    public void tampil() {
        System.out.println("List (first-->last): ");
        Node indek = last;
        int i = 1;
        while (indek != null) {
            System.out.print(i+". ");
            indek.tampilNode();
            indek = indek.previous;
            i++;
        } 
        System.out.println("");
    }    
}

public class DobelLinked {
    static Scanner scan = new Scanner(System.in);
    static DoubleLink list = new DoubleLink();

    static char pilMenu;
    static String nama;
    static Long nim;
    static char jk;

    static void inputData() {

        System.out.print("Nama : ");
        nama = scan.next();
        System.out.print("nim : ");
        nim = scan.nextLong();
        System.out.print("Jenis Kelamin : ");
        jk = scan.next().charAt(0);
        System.out.println();

        list.insertFirst(nama, nim, jk);
    }

    static void showData() {
        list.tampil();
    }

    // Update data work in progress
    static void updateData(Long nim, Node first) {
        System.out.print("nim Mahasiswa yang akan di-update : ");
        nim = scan.nextLong();

        Node last = null;
        if (first == null) {
            System.out.println("Kosong");
            return;
        }

        while (first != null) {
            if (nim == first.Data2) {
                System.out.println("Masukan yang akan diupdate: \n1. nim-> " + first.Data2 + "\n2. Nama-> "
                        + first.Data1 + "\n3. Jenis Kelamin-> " + first.Data3);
                Long milih = scan.nextLong();
                if (milih == 1) {
                    System.out.print("Masukan nim baru: ");
                    Long temp = scan.nextLong();
                    first.Data2 = temp;
                    Node a = first.previous;
                    a.next = first;
                } else if (milih == 2) {
                    System.out.print("Masukan Nama baru: ");
                    String tempNama = scan.next();
                    first.Data1 = tempNama;
                    Node a = first.previous;
                    a.next = first;
                } else if (milih == 3) {
                    System.out.print("Masukan Jenis Kelamin baru: ");
                    char tempJK = scan.next().charAt(0);
                    first.Data3 = tempJK;
                    Node a = first.previous;
                    a.next = first;
                }
            }
            last = first;
            first = first.next;
        }
    }

    static void deleteData() {
        System.out.print("nim Mahasiswa yang akan dihapus : ");
        nim = scan.nextLong();
        list.hapus(nim);
    }

    static void menuProgram() {
        System.out.println("===========================================");
        System.out.println("Pilih menu : ");
        System.out.print("1.Memasukkan data\n2.Menghapus data\n3.Mengupdate data\n4.Menampilkan data\n5.Keluar");
        System.out.print("\nAnda pilih : ");
        pilMenu = scan.next().charAt(0);
        switch (pilMenu) {
            case '1':
                // Beralih ke menu input data
                inputData();
                break;
            case '2':
                // Beralih ke menu hapus data
                deleteData();
                break;
            case '3':
                // Beralih ke menu update data
                updateData(nim, list.first);
                break;
            case '4':
                // Beralih ke menu tampilkan data
                showData();
                break;
            case '5':
                scan.nextLine();
                break;
        }
    }

    public static void main(String[] args) {
        do {
            menuProgram();
        } while (pilMenu != '5');

    }
}
