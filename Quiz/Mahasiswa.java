package semgenap.Quiz;

public class Mahasiswa {
    private String nama;
    private String nim;
    private double ipk;

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public void set(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        if (ipk >= 0.0 && ipk <= 4.0) {
            this.ipk = ipk;
        } else {
            System.out.println("IPK tidak valid! Harus antara 0.0 - 4.0");
        }
    }

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();

        mhs.set("23012345", "Budi Santoso");
        mhs.setIpk(3.75);

        System.out.println("Data Mahasiswa:");
        System.out.println("Nama : " + mhs.getNama());
        System.out.println("NIM  : " + mhs.getNim());
        System.out.println("IPK  : " + mhs.getIpk());
    }
}