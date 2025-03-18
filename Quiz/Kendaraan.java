package semgenap.Quiz;

abstract class Kendaraan {
    private String brand;
    private int speed;

    public Kendaraan(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public abstract void bergerak();
}