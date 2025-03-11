class Segitiga extends Bentuk {
    private float alas;
    private float tinggi;

    public Segitiga (float a, float t) {
        this.alas = a;
        this.tinggi = t;
    }

    @Override
    public String warna() {
        return "Hijau";
    }

    @Override
    public double luas() {
        return alas * tinggi / 2;
    }   
}