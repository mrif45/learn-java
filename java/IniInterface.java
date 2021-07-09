interface Awal {
    void method1();
    void method2();
    void method3();
}

class implementasi implements Awal{
    public void method1(){
        System.out.println("ini method 1");
    }
    public void method2() {
        System.out.println("ini method 2");
    }
    public void method3() {
        System.out.println("ini method 3");
    }
}

class IniInterface{
    public static void main(String[] args) {
        implementasi iml = new implementasi();
        iml.method1();
        iml.method2();
        iml.method3();
    }
}