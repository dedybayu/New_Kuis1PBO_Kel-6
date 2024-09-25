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

    public void tampilkanDetailPeserta(){
        System.out.println("Id Peserta : " + id);
        System.out.println("Nama    : " + nama);
        System.out.println("Email : " + email);
        System.out.println("Daftar Kursus Peserta : " + nama);
        for (Kursus kursus : daftarKursus) {
            kursus.tampilkanKonten();
        }
    }

    public void daftarkanKursus(Kursus kursus) {
        daftarKursus.add(kursus);
        System.out.println(nama + " telah mendaftar ke kursus: " + kursus.getJudul());
    }

    public List<Kursus> getDaftarKursus() {
        return daftarKursus;
    }

    public void kerjakanKuis() {
        boolean adaKuis = false;
        System.out.println("\n--------------------------------");
        System.out.println("Kerjakan Kuis untuk peserta " + nama);
        System.out.println("--------------------------------");
        for (Kursus kursus : daftarKursus) {
            List<Konten> daftarKonten = kursus.getDaftarKonten(); // Ambil konten dari kursus
            
            for (Konten konten : daftarKonten) {
                if (konten instanceof Kuis) { // Cek apakah konten adalah kuis
                    System.out.println("Mengikuti Kuis dari Kursus: " + kursus.getJudul());
                    ((Kuis) konten).kerjakanKuis(); // Peserta mengerjakan kuis
                    adaKuis = true;
                }
            }
        }
    
        if (!adaKuis) {
            System.out.println("Tidak ada kuis yang tersedia untuk peserta: " + nama);
        }
    }
    
}
