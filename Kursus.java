import java.util.ArrayList;
import java.util.List;

public class Kursus {
    private int idKursus;
    private String judul;
    private int harga; // Harga per kursus
    private List<Konten> daftarKonten; // Menyimpan konten terkait kursus

    public Kursus(int idKursus, String judul, int harga) {
        this.idKursus = idKursus;
        this.judul = judul;
        this.harga = harga;
        this.daftarKonten = new ArrayList<>();
    }

    public void tambahKonten(Konten konten) {
        daftarKonten.add(konten);
        System.out.println("Konten \"" + konten.getJudul() + "\" ditambahkan ke kursus \"" + judul + "\".");
    }

    public void tampilkanKonten() {
        System.out.println("--------------------------------------");
        System.out.println("ID Kursus    : " + idKursus);
        System.out.println("Nama Kursus  : " + judul);
        System.out.println("Harga Kursus : " + harga);
        System.out.println("--------------------------------------");

        if (daftarKonten.isEmpty()) {
            System.out.println("Tidak ada konten untuk kursus ini");
            System.out.println("--------------------------------------");
        } else {
            System.out.println("Daftar Konten: ");
            System.out.println("--------------------------------------");
            for (Konten konten : daftarKonten) {
                konten.tampilkanDetail();
                System.out.println("------------------------------");
            }
        }
    }

    public int getHarga() {
        return harga;
    }

    public List<Konten> getDaftarKonten() {
        return daftarKonten;
    }

    public String getJudul() {
        return judul;
    }
}
