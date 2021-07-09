class Car {
    private double regularPrice;
    public Car (double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getSalePrice() {
        return regularPrice;
    }
}

class Truck extends Car {
    public Truck (double regularPrice) {
        super(regularPrice);
    }

    public double getSalePrice() {
        return super.getSalePrice();
    }
}

class Ford extends Car{
    public Ford (double regularPrice) {
        super(regularPrice);
    }

    public double getSalePrice() {
        return super.getSalePrice();
    }
}

class Sedan extends Car {
    public Sedan (double regularPrice) {
        super (regularPrice);
    }

    public double getSalePrice() {
            return super.getSalePrice() - (0.1 * super.getSalePrice());
        }
}

public class MyOwnAutoShop {
    double regularPrice;
    public static void main(String[] args) {
        Sedan mySedan = new Sedan(200000);
        Ford myFord1 = new Ford (445200.0);
        Ford myFord2 = new Ford (500000);
        Car myCar = new Car (568560.0);

        System.out.printf("MySedan Price Rp%s\n", mySedan.getSalePrice());
        System.out.printf("MyFord1 Price Rp%.1f\n", myFord1.getSalePrice());
        System.out.printf("MyFord2 Price Rp%.1f\n", myFord2.getSalePrice());
        System.out.printf("MyCar Price Rp%s\n", myCar.getSalePrice());
    }
}