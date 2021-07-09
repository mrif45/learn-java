class InSort{
    public static void main(String[] args) {
        int[] arr = {90, 93, 84, 53, 58, 23, 45};
        lihat(arr);
        Sort(arr);
        lihat(arr);
    }

    static void Sort(int[] arr){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int j = i-1;
            int angka = arr[i];
            while(j >= 0 && arr[j] < angka){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = angka;
        }
    }

    static void lihat(int[] arr) {
        System.out.print("Data array arr : { ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println("}");
    }
}