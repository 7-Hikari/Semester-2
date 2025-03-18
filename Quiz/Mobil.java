package semgenap.Quiz;

class Mobil extends Kendaraan {
    public Mobil(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void bergerak() {
        System.out.println("Mobil merk " + getBrand() + ", bergerak dengan kecepatan " + getSpeed() + " km/h.");
    }
}