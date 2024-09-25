public class Video extends Konten {
    private int durasi;

    public Video(int idKonten, String judul, int durasi, String kreator) {
        super(idKonten, judul, "Video", kreator);
        this.durasi = durasi;
    }

    @Override
    public void tampilkanDetail() {
        super.tampilkanDetail();
        System.out.println("Judul        : " + getJudul());
        System.out.println("Durasi       : " + durasi + " menit");
    }
}
