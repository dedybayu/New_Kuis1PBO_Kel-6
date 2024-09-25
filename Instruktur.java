public class Instruktur {
    private String id;
    private String nama;
    private String keahlian;

    public Instruktur(String id, String nama, String keahlian) {
        this.id = id;
        this.nama = nama;
        this.keahlian = keahlian;
    }

    public void tampilkanDetailInstruktur(){
        System.out.println("-----------------------------------");
        System.out.println("ID Instruktur       : " + id);
        System.out.println("Nama Instruktur     : " + nama);
        System.out.println("Keahlian Instruktur : " + keahlian);
        System.out.println("-----------------------------------\n");
    }

    public Konten buatKonten(String tipe, String judul, int detail) { //NANTI DITAMBAH KREATOR
        switch (tipe) {
            case "Video":
                return new Video(1, judul, detail); // detail di sini adalah durasi
            case "Artikel":
                return new Artikel(2, judul, detail); // detail di sini adalah panjang artikel
            case "Kuis":
                return new Kuis(3, judul, detail); // detail di sini adalah jumlah pertanyaan
            default:
                return null;
        }
    }

    public void tambahKontenKeKursus(Kursus kursus, Konten konten) {
        kursus.tambahKonten(konten);
    }


}

 