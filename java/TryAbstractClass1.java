abstract class Hewan{
    String nama;
    public abstract void habitatHewan();
    public void namaHewan(){
        System.out.println("\nMethod di dalam abstract class Hewan");;
        System.out.println("Nama Hewan : "+ nama);
    }
}
class Karnivora extends Hewan{
    String habitat;
    public void habitatHewan(){
        System.out.println("\nMethod di dalam class karnivora");
        System.out.println("Habitat Hewan : "+ habitat);
    }
}
class TryAbstractClass1{
    public static void main(String[] args) {
        System.out.println("===========================");
        System.out.println("Menerapkan Penggunaan Abstract Class #1");;
        System.out.println("===========================");

        Karnivora singa = new Karnivora();
        singa.nama = "Singa";
        singa.habitat = "Darat";
        singa.namaHewan();
        singa.habitatHewan();
    }
}