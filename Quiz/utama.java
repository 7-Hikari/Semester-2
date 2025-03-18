package semgenap.Quiz;

public class utama {
    public static void main(String[] args) {
        Mobil myCar = new Mobil("Toyota", 120);

        Sepeda myBike = new Sepeda("Yamaha", 80);

        myCar.bergerak();
        myBike.bergerak();
    }
}