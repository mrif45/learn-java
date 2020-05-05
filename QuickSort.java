class QuickSort {
    int partisi(int arr[], int kiri, int kanan){
        int pivot = arr[kanan];
        int i = (kiri-1);

        for (int j=kiri; j<kanan; j++){
            if (arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[kanan];
        arr[kanan] = temp;

        return i+1;
    }

    void sort(int arr[], int kiri, int kanan){
        if (kiri < kanan){
            int pi = partisi(arr, kiri, kanan);

            sort(arr, kiri, pi-1);
            sort(arr, pi+1, kanan);
        }
    }

    static void lihat(int[] arr) {
        System.out.print("Data array arr : { ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println("}");
    }

    public static void main(String args[]){
        int arr[] = { 90, 93, 84, 53, 58, 23, 45};
        int n = arr.length;

        lihat(arr);
        QuickSort qs = new QuickSort();
        qs.sort(arr, 0, n-1);
        lihat(arr);
    }
}