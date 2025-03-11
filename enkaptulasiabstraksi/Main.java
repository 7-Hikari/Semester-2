class Main {
    public static void main(String[] args) {
        Bentuk triangle = new Segitiga(5.3f, 4);
        Bentuk circle = new Lingkaran(65);

        System.out.printf("Bentuk Segitiga \nWarna \t: %s \nLuas \t: %.2fcm" +
        "\n\nBentuk Lingkaran \nWarna \t: %s \nLuas \t: %.2fcm", triangle.warna(), triangle.luas(),
        circle.warna(), circle.luas());
    }
}