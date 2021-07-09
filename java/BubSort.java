public class BubSort {
    public static void main(String[] args) {
        int[] arr = { 90, 93, 84, 53, 58, 23, 45 };
        lihat(arr);
        Sort(arr);
        lihat(arr);
    }

    public static void Sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] < arr[j+1]) {
                    int ganti = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = ganti;
                }
            }
        }
    }

    static void lihat(int[] arr){
        System.out.print("Data array arr : { ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println("}");
    }
}