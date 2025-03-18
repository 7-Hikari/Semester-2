package semgenap.Quiz;
public class Kalkulator {
    public int add(int a, int b) {
        return a + b;
    }

    // Metode untuk menambahkan tiga bilangan bulat
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Metode untuk menambahkan dua bilangan desimal
    public double add(double d, double e) {
        return d + e;
    }

    // Metode utama untuk pengujian
    public static void main(String[] args) {
        Kalkulator kal = new Kalkulator();

        // Menguji metode add()
        System.out.println("Penjumlahan 2 bilangan bulat: " + kal.add(5, 7));
        System.out.println("Penjumlahan 3 bilangan bulat: " + kal.add(2, 3, 4));
        System.out.println("Penjumlahan 2 bilangan desimal: " + kal.add(2.5, 3.8));
}
}