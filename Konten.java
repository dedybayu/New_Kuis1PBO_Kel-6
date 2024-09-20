public class Konten {
    private int idKonten;
    private String judul;
    private String jenis;
    private String kreator;

    Konten(){}
    Konten(int idKonten, String judul, String jenis, String kreator) {
        this.idKonten = idKonten;
        this.judul = judul;
        this.jenis = jenis;
        this.kreator = kreator;
    }
    
    public void tampilkanDetail(){
        System.out.println("ID Konten    : " + idKonten);
        System.out.println("Judul Konten : " + judul);
        System.out.println("Jenis Konten : " + jenis);
        System.out.println("Kreator      :" + kreator);
    }
}
