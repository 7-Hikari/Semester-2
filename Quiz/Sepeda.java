package semgenap.Quiz;

class Sepeda extends Kendaraan {
    public Sepeda(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void bergerak() {
        System.out.println("Sepeda merk " + getBrand() + ", mampu bergerak dengan kecepatan " + getSpeed() + " km/h.");
    }
}