package UAS;

import java.util.Scanner;

class TugasArray{
    static Scanner scan = new Scanner(System.in);

    static float[] inputanDataArray(int isiArray){
        float[] a = new float[isiArray];
        for(int i=0;i<a.length;i++){
            System.out.print("masukan nilai ke-"+(i+1)+" : ");
            a[i] = (float)(scan.nextFloat());
        }
        System.out.println();
        return a;
    }

    static void tampilkanDataArray(float[] nilaiArray){
        for(int i=0;i<nilaiArray.length;i++){
            System.out.println("isi array ["+i+"] = "+nilaiArray[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("\n============== PROGRAM ARRAY ==============\n");
        
        System.out.print("masukan banyak data pada array nilai1 : ");
        int n1 = scan.nextInt();
        float[] nilai1 = inputanDataArray(n1); 

        System.out.print("masukan banyak data pada array nilai2 : ");
        int n2 = scan.nextInt();
        float[] nilai2 = inputanDataArray(n2);

        System.out.println("=====DATA ARRAY NILAI 1=====");
        tampilkanDataArray(nilai1);
        System.out.println("=====DATA ARRAY NILAI 2=====");
        tampilkanDataArray(nilai2);
    }
}