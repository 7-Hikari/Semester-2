package semgenap.Quiz;
public class Kalkulator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double d, double e) {
        return d + e;
    }

    public static void main(String[] args) {
        Kalkulator kal = new Kalkulator();

        System.out.println("Penjumlahan 2 bilangan bulat: " + kal.add(5, 7));
        System.out.println("Penjumlahan 3 bilangan bulat: " + kal.add(2, 3, 4));
        System.out.println("Penjumlahan 2 bilangan desimal: " + kal.add(2.5, 3.8));
}
}