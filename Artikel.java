public class Artikel extends Konten {
    private int panjang;

    public Artikel(int idKonten, String judul, int panjang, String kreator) {
        super(idKonten, judul, "Artikel", kreator);
        this.panjang = panjang;
    }

    @Override
    public void tampilkanDetail() {
        super.tampilkanDetail();
        System.out.println("Judul        : " + getJudul());
        System.out.println("Panjang      : " + panjang + " kata");
    }
}