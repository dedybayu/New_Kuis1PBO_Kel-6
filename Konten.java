public class Konten {
    private int idKonten;
    private String judul;
    private String jenis;
    private String kreator;

    public Konten(int idKonten, String judul, String jenis, String kreator) {
        this.idKonten = idKonten;
        this.judul = judul;
        this.jenis = jenis;
        this.kreator = kreator;
    }

    public void tampilkanDetail(){
        System.out.println("Id Konten    : " + idKonten);
        System.out.println("Jenis Konten : " + jenis);
        System.out.println("Kreator      : " + kreator);
    }

    public String getJudul() {
        return judul;
    }
}
