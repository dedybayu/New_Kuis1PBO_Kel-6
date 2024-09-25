public class Artikel extends Konten {
    private int panjang;

    public Artikel(int idKonten, String judul, int panjang) {
        super(idKonten, judul, "Artikel", "Instruktur");
        this.panjang = panjang;
    }

    @Override
    public void tampilkanDetail() {
        super.tampilkanDetail();
        System.out.println("Jenis Konten : Artikel");
        System.out.println("Judul        : " + getJudul());
        System.out.println("Panjang      : " + panjang + " kata");
    }
}