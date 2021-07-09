class Searching{
    static void Search(int[] arr, int angka, boolean ketemu){
        int n = arr.length;
        System.out.println("angka yang dicari: " + angka);
        for(int i = 0; i < n; i++){
            if(angka == arr[i]){
                ketemu = true;
                break;
            }
        }     
        if(ketemu = true){
            System.out.println("angka " +angka+ " ditemukan");
        } else{
            System.out.println("angka " +angka+ "tidak ditemukan");
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
        boolean ketemu = false;
        int[] arr = {90, 93, 84, 53, 58, 23, 45};
        lihat(arr);
        int angka = 23;
        Search(arr,angka, ketemu);
    }
}