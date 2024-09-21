// import java.util.ArrayList;
// import java.util.List;

// public class Kursus {
//     private int idKursus;
//     private String namaKursus;
//     private int durasi;
//     private Peserta peserta;
//     private List<Konten> daftarKonten;

//     public Kursus(int idKursus, String namaKursus, int durasi, Peserta peserta) {
//         this.idKursus = idKursus;
//         this.namaKursus = namaKursus;
//         this.durasi = durasi;
//         this.peserta = peserta;
//     }

//     public void ambilKonten(Konten konten){
//         daftarKonten.get(1);
//     }



// }


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
        System.out.println("Kursus: " + judul);
        for (Konten konten : daftarKonten) {
            konten.tampilkanDetail();
            System.out.println("------------------------------");
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
