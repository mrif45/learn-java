import java.util.Scanner;

class Rumus{
    Scanner input = new Scanner(System.in);
    int a;
    int f = 1;
    int i;

    void getInput(){
        a = input.nextInt();
        for(i = 1; i<=a; i++){
            f = f*i;
        }
    }

    void Cetak(){
        System.out.println(f);
    }
}

class Factorial{
    public static void main(String[] args) {
        Rumus r = new Rumus();
        r.getInput();
        r.Cetak();
    }
}