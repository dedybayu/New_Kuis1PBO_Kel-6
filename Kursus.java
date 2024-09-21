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

    public Kursus(int idKursus, String judul, int harga) {
        this.idKursus = idKursus;
        this.judul = judul;
        this.harga = harga;
    }

    public int getIdKursus() {
        return idKursus;
    }

    public String getJudul() {
        return judul;
    }

    public int getHarga() {
        return harga;
    }

    public void tampilkanDetailKursus() {
        System.out.println("ID Kursus    : " + idKursus);
        System.out.println("Judul Kursus : " + judul);
        System.out.println("Harga        : " + harga);
    }
}
