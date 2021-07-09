import java.util.Scanner;


public class DoublyLinkedList{
    Scanner input = new Scanner(System.in);
    Node head;
    class Node{
        int  NIM;
        String Nama;
        char jenisKelamin;
        Node next, prev;

        //contructor to create new node
        //next and prev initialized as null
        Node(int d, String N, char JK) {
            NIM = d;
            Nama = N;
            jenisKelamin = JK;
        }
    }

    public void push(int new_Data, String Nama,char JenisK){
        //alokasi node sama masukin data
        Node new_Node = new Node(new_Data, Nama, JenisK);
        
        /*Make next of new node as head and previous as NULL */
        new_Node.next = head;
        new_Node.prev = null;

        //rubah pointer head sebelumnya
        if(head != null){
            head.prev = new_Node;
        }
        //mindah pointer headnya
        head = new_Node;

    }

    public void printlist(Node node){
        Node last = null;
        System.out.println("Data: ");
        while(node != null){
            System.out.println(node.NIM +" "+node.Nama+" "+node.jenisKelamin);
            last = node;
            node = node.next;
        }
    }

    public Node hapus(int yangDihapus) {
        Node index = head;
        while(index.NIM != yangDihapus){
            index = index.next;
            if(index == null){
                return null;
            }
        }
        if(index == head){
            head = index.next;
        }else{
            index.prev.next = index.next;
        }

        if(index == head.prev){
            head.prev = index.prev;
        }else{
            index.next.prev = index.prev;
        }

        return index;
    }//hapus data manut input e user

    public void updateData(int nimYangDiupdate, Node node){
        Node last = null;
        if(head == null){
            System.out.println("Kosong");
            return;
        }

        while(node != null){
            if(nimYangDiupdate == node.NIM){
                System.out.println("Masukan yang akan diupdate: \n1. NIM-> "+node.NIM+"\n2. Nama-> "+node.Nama+"\n3. Jenis Kelamin-> "+node.jenisKelamin);
                int milih = input.nextInt();
                if(milih == 1){
                    System.out.print("Masukan NIM baru: ");
                    int tempNIM = input.nextInt();
                    node.NIM = tempNIM;
                    Node a = node.prev;
                    a.next = node;
                }
                else if(milih == 2){
                    System.out.print("Masukan Nama baru: ");
                    String tempNama = input.next();
                    node.Nama = tempNama;
                    Node a = node.prev;
                    a.next = node;
                }
                else if(milih==3){
                    System.out.print("Masukan Jenis Kelamin baru: ");
                    char tempJK = input.next().charAt(0);
                    node.jenisKelamin = tempJK;
                    Node a = node.prev;
                    a.next = node;
                }
            }
            last = node;
            node = node.next;
        }
        

    }

    Node split(Node head){
        Node fast = head, slow = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        Node temp = slow.next;
        slow.next = null;
        return temp;
    } //end split

    Node mergeSort(Node node){
        if(node == null || node.next == null){
            return node;
        }
        Node second = split(node);

        node = mergeSort(node);
        second = mergeSort(second);

        return merge(node, second);
    }//end sort

    Node merge(Node first, Node second){
        if(first == null){
            return second;
        }
        if(second == null){
            return first;
        }

        if(first.NIM < second.NIM){
            first.next = merge(first.next, second);
            first.next.prev = first;
            first.prev = null;
            return first;
        } else{
            second.next = merge(first, second.next);
            second.next.prev = second;
            second.prev = null;
            return second;
        }
    }//end merge

    boolean check(Node node, int nimInput) {
        Node last = null;
        boolean check = true;

        while(node != null){
            if(node.NIM == nimInput){
                check = false;
            }

            last = node;
            node = node.next;
        }

        return check;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DoublyLinkedList dll = new DoublyLinkedList();
        int menuUtama, NIM;
        String Nama;
        char JK;

        try{
            while(true){
                System.out.println("Menu:\n1. Memasukan Data\n2. Menghapus Data\n3. Mengupdate Data\n4. Menampilkan Data\n5. Keluar");
                System.out.print("Masukan option: ");
                menuUtama = input.nextInt();
                if(menuUtama == 1){
                    
                    System.out.print("masukan\nNama: ");
                    Nama = input.next();
                    
                    System.out.print("Nim: ");
                    NIM = input.nextInt();
                    
                    System.out.print("Jenis Kelamin(L/P): ");
                    JK = input.next().charAt(0);
                    System.out.println();
    
                    if(dll.check(dll.head, NIM) == true){
                        dll.push(NIM, Nama, JK);
                    } else System.out.println("Data NIM sama");
                } //iki input data 
                else if(menuUtama == 2){
                    System.out.print("Masukan NIM mahasiswa yang akan dihapus: ");
                    NIM = input.nextInt();
                    dll.hapus(NIM);
                } //iki hapus data 
                else if(menuUtama == 3){
                    System.out.print("Masukan NIM yang akan di update: ");
                    int nimUpdate = input.nextInt();
                    dll.updateData(nimUpdate, dll.head);
                }//iki update
                else if(menuUtama == 4){
                    //dll.sortlist();
                    Node node = dll.mergeSort(dll.head);
                    dll.printlist(node);
                }else if(menuUtama == 5){
                    input.close();
                    break;
                }//iki metu
            }
        }
        catch(Exception e){
            System.out.println("error");
        }
            
    
        

        
    }
}