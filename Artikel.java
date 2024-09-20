public class Artikel extends Konten {
    private int panjang;
    private String isiArtikel;

    public void tampilkanDetail() {
        super.tampilkanDetail();
        System.out.println("Panjang Artikel: " + panjang);
    }

    public String tampilkanArtikel(){
        return isiArtikel;
    }

    public void isikanArtikel(String isi){
        isiArtikel = isi;
    }
}
