class BinarySearch{    
    static void Sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int arrI = arr[i];
                    arr[i] = arr[j];
                    arr[j] = arrI;
                }
            }
        }
    }

    static void Search(int[] arr, int angka){
        int awal = 0;
        int akhir = arr.length - 1;
        boolean ketemu = false;
        while (awal <= akhir) {
            int tengah = (awal + akhir) / 2;
            if (angka == arr[tengah]) {
                ketemu = true;
                break;
            } else if (angka > arr[tengah]) {
                awal = tengah + 1;
            } else {
                akhir = tengah - 1;
            }
        }

        if (ketemu) {
            System.out.println("Angka " +angka+ " ditemukan");
        } else {
            System.out.println("Angka " +angka+ " tidak ditemukan");
        }
    }

    static void lihat(int[] arr) {
        System.out.print("Data array arr : { ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println("}");
    }
    public static void main(String[] args) {
        int[] arr = {90, 93, 84, 53, 58, 23, 45};
        lihat(arr);
        int angka = 90;
        System.out.println("Angka yang dicari : " + angka);
        Sort(arr);
        Search(arr, angka);
    }
}