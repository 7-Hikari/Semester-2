class Lingkaran extends Bentuk {
    private float jari2;

    public Lingkaran(float r) {
        this.jari2 = r;
    }

    @Override
    public String warna() {
        return "Ungu";
    }

    @Override
    public double luas() {
        return Math.PI * jari2 * jari2;
    }
}
