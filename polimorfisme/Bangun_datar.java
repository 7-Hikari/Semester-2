package polimorfisme;

public abstract class Bangun_datar {
    protected abstract double luas();
    protected abstract double keliling();
}

class persegi extends Bangun_datar {
    private float sisi;

    public persegi (float s) {
        this.sisi = s;
    }

    @Override
    public double luas() {
        return sisi * sisi;
    }
    @Override
    public double keliling() {
        return sisi * 4;
    }
}
class lingkaran extends Bangun_datar {
    private float r;

    public lingkaran(float jari2) {
        this.r = jari2;
    }

    @Override
    public double luas() {
        return Math.PI * r * r;
    }
    @Override
    public double keliling() {
        return Math.PI * r * 2;
    }
}
class segitiga extends Bangun_datar {
    private float tinggi, alas;

    public segitiga(float a, float t) {
        this.alas = a;
        this.tinggi = t;
    }
    @Override
    public double luas(){
        return alas * tinggi / 2;
    }
    @Override
    public double keliling() {
        return alas + tinggi + (Math.sqrt(alas * alas + tinggi * tinggi));
    }
}

class Main {
    public static void main(String[] args) {
        Bangun_datar segi4 = new persegi(4.4f);
        Bangun_datar lingkar = new lingkaran(91.11f);
        Bangun_datar segi3 = new segitiga(6, 14);

        System.out.printf ("Luas persegi\t: %.2f cm\n Keliling persegi\t: %.2f cm"+
        "\n\n Luas lingkaran\t: %.2f cm\n Keliling lingkaran\t: %.2f cm" +
        "\n\n Luas segitiga\t: %.2f cm\n Keliling segitiga\t: %.2f cm",
        segi4.luas(), segi4.keliling(),
        lingkar.luas(), lingkar.keliling(), segi3.luas(),segi3.keliling());
    }
}