class All_in_One<T> {
    
    private T Manusia;
    
    protected void setManusia(T Manusia){
        this.Manusia = Manusia;
    }

    protected T getManusia(){
        return Manusia;
    }
}

public class LatGeneric {
    public static void main(String[] args){

        All_in_One<String> nama = new All_in_One<>();
        nama.setManusia("Wildan");
        System.out.println("Nama Saya: "+nama.getManusia());
        
        All_in_One<Integer> umur = new All_in_One<>();
        umur.setManusia(19);
        System.out.println("Usia Saya: "+umur.getManusia()+" Tahun");
        
        All_in_One<Boolean> kondisi = new All_in_One<>();
        kondisi.setManusia(true);
        System.out.println("Saya Sedang Belajar Java: "+kondisi.getManusia());
        
        All_in_One<Float> IPK = new All_in_One<>();
        IPK.setManusia(3.5f);
        System.out.println("Nilai IPK Saya: "+IPK.getManusia());
        
        All_in_One<Character> Karakter = new All_in_One<>();
        Karakter.setManusia('W');
        System.out.println("Huruf Awalan Nama Saya Adalah: "+Karakter.getManusia());
    }
}