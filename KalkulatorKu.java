import java.util.Scanner;

class KalkulatorKu{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kalkulator");
        System.out.print("Masukan Bilangan Pertama: ");
        double bil1 = input.nextDouble();
        System.out.print("Masukan Operator (+ - x /): ");
        String operator = input.next();
        System.out.print("Masukan Bilangan Kedua: ");
        double bil2 = input.nextDouble();

        switch(operator){
            case "+":
                penjumlahan(bil1, bil2);
                break;
            case "-":
                pengurangan(bil1, bil2);
                break;
            case "x":
                perkalian(bil1, bil2);
                break;
            case "/":
                pembagian(bil1, bil2);
                break;
        }
        input.close();
    }

    static double penjumlahan(double bil1, double bil2) {
        double hasil = bil1 + bil2;
        System.out.println("Penjumlahan dari "+bil1+" + "+bil2+" Adalah "+hasil);
        return hasil;
    }

    static double pengurangan(double bil1, double bil2) {
        double hasil = bil1 - bil2;
        System.out.println("Penjumlahan dari " + bil1 + " - " + bil2 + " Adalah " + hasil);
        return hasil;
    }

    static double perkalian(double bil1, double bil2) {
        double hasil = bil1 * bil2;
        System.out.println("Penjumlahan dari " + bil1 + " x " + bil2 + " Adalah " + hasil);
        return hasil;
    }

    static double pembagian(double bil1, double bil2) {
        double hasil = bil1 / bil2;
        System.out.println("Penjumlahan dari " + bil1 + " / " + bil2 + " Adalah " + hasil);
        return hasil;
    }
}