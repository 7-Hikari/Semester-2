package polimorfisme;

public abstract class Suhu_Celcius {
    protected abstract float suhu();
}

class fahreinheit extends Suhu_Celcius {
    private float suhu;

    public fahreinheit (float c) {
        this.suhu = c;
    }
    @Override
    public float suhu() {
        return (suhu * 9/5) + 32;
    }
}

class Mainsuhu {
    public static void main(String[] args) {
        float celcius = 23;
        Suhu_Celcius ke_f = new fahreinheit(celcius);

        System.out.printf("Suhu %f°C adalah %.2f Fahreinheit", celcius, ke_f.suhu());
    }
}