// public class Video extends Konten {
//     private int durasi;
//     private String link;

//     public void tampilkanDetail() {
//         super.tampilkanDetail();
//         System.out.println("Durasi Video: " + durasi + " menit");
//         System.out.println("Link Video: " + link);
//     }

//     void setDurasiLink(int durasi, String link){
//         this.durasi = durasi;
//         this.link = link;
//     }

//     void tunjukkanLink(){
//         System.out.println("==============================================");
//         System.out.println("Link Video Pembelajaran dapat di tonton di:");
//         System.out.println(link);
//     }
// }

public class Video extends Konten {
    private int durasi;

    public Video(int idKonten, String judul, int durasi) {
        super(idKonten, judul, "Video", "Instruktur");
        this.durasi = durasi;
    }

    @Override
    public void tampilkanDetail() {
        super.tampilkanDetail();
        System.out.println("Judul        : " + getJudul());
        System.out.println("Durasi       : " + durasi + " menit");
    }
}
