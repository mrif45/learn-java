class SelSort{
    public static void main(String[] args) {
        int[] arr = {90, 93, 84, 53, 58, 23, 45};
        lihat(arr);
        Sort(arr);
        lihat(arr);
    }

    static void Sort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            int indeks = i;
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[indeks]){
                    if(indeks == i){
                        int ganti = arr[i];
                        arr[i] = arr[j];
                        arr[j] = ganti;
                    }
                }
            }
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