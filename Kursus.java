import java.util.ArrayList;
import java.util.List;

public class Kursus {
    private int idKursus;
    private String namaKursus;
    private int durasi;
    private Peserta peserta;
    private List<Konten> daftarKonten;

    public Kursus(int idKursus, String namaKursus, int durasi, Peserta peserta) {
        this.idKursus = idKursus;
        this.namaKursus = namaKursus;
        this.durasi = durasi;
        this.peserta = peserta;
    }

    public void ambilKonten(Konten konten){
        daftarKonten.get(1);
    }



}
