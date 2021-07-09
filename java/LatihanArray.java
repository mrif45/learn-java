import java.util.*;

class LatihanArray{
    public static void main(String[] args) {
        int[] Arraya = {3,2,7,4,9,7,3,8,0,2,7,5,2,6};
        System.out.println(Arrays.toString(Arraya) + "\n");

        //1
        int[] dataku = new int[5];
        //2
        dataku[0] = 10;
        dataku[1] = 30;
        dataku[2] = 50;
        dataku[3] = 70;
        dataku[4] = 90;


        //Array 1
        System.out.println("Array1");
        System.out.println("Banyaknya Elemen: "+ dataku.length + "\n");
        //Array2
        System.out.println("Array2");
        for (int i = 0; i < dataku.length; i++){
            System.out.println("Isi dataku["+i+"]" + dataku[i]);
        } System.out.print("\n");
        //Array3
        System.out.println("Array3");
        for(int i = 0; i<dataku.length; i++){
            dataku[i]= (int)(Math.random()*10);
            System.out.println("Isi dataku["+i+"]= " + dataku[i]);
        } System.out.print("\n");

        //Array4
        System.out.println("Array4");
        int[][] dataku2 = {{9,8,7,}, {6,5,4}, {3,2,1}, {1,2,3}, {4,5,6} };
        System.out.println("isi dataku posisi [3][1]= " + dataku2[1][2] + "\n");

        for(int i = 0; i<5; i++){
            for(int j = 0; j<3; j++){
                System.out.println("isi data baris ["+i+"] kolom ["+j+"] =" + dataku2[i][j]);
            }
        } System.out.print("\n");

        System.out.println("Array5");
        for(int i = 0; i<dataku.length; i++){
            dataku[i]= (int)(Math.random()*100);
        } System.out.println("DATA MULA-MULA");
        for(int i = 0; i<dataku.length; i++){
            System.out.println("\tIsi dataku ["+i+"] = " + dataku[i]);
        }

        // Proses SORTIR
        for (int i = dataku.length - 1; i > 0; i--) {
            for (int kiri = 0; kiri < i; kiri++) {
                int kanan = kiri + 1;
                if (dataku[kiri] > dataku[kanan]) {
                    int bantu = dataku[kiri];
                    dataku[kiri] = dataku[kanan];
                    dataku[kanan] = bantu;
                }
            }
        }
        System.out.println("DATA SETELAH DISORTIR: ");
        for (int i = 0; i < dataku.length; i++) {
            System.out.println("\tIsi dataku[" + i + "] = " + dataku[i]);
        }
    }
}