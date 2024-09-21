// public class Peserta {
//     int idPeserta;
//     String namaPeserta;
//     String email;

//     Peserta(int idPeserta, String nama, String email) {
//         this.idPeserta = idPeserta;
//         this.namaPeserta = namaPeserta;
//         this.email = email;
//     }
// }

import java.util.ArrayList;
import java.util.List;

public class Peserta {
    private String id;
    private String nama;
    private String email;
    private List<Kursus> daftarKursus; // Daftar kursus yang diikuti peserta

    public Peserta(String id, String nama, String email) {
        this.id = id;
        this.nama = nama;
        this.email = email;
        this.daftarKursus = new ArrayList<>();
    }

    public void daftarKursus(Kursus kursus) {
        daftarKursus.add(kursus);
        System.out.println(nama + " telah mendaftar ke kursus: " + kursus.getJudul());
    }

    public void tampilkanKursus() {
        System.out.println("Daftar Kursus untuk Peserta: " + nama);
        for (Kursus kursus : daftarKursus) {
            kursus.tampilkanKonten();
        }
    }

    public List<Kursus> getDaftarKursus() {
        return daftarKursus;
    }
}
