import java.util.Scanner;

public class Kuis extends Konten {
    private int jumlahPertanyaan;

    public Kuis(int idKonten, String judul, int jumlahPertanyaan) {
        super(idKonten, judul, "Kuis", "Instruktur");
        this.jumlahPertanyaan = jumlahPertanyaan;
    }

    @Override
    public void tampilkanDetail() {
        super.tampilkanDetail();
        System.out.println("Jenis Konten : Kuis");
        System.out.println("Judul        : " + getJudul());
        System.out.println("Jumlah Pertanyaan : " + jumlahPertanyaan);
    }

    public void kerjakanKuis() {
        Scanner scanner = new Scanner(System.in);
        int poin = 0;
        double nilai;
    
        System.out.println("Kuis: " + getJudul());
    
        for (int i = 0; i < jumlahPertanyaan; i++) {
            // Buat Contoh Kuis
            System.out.println("APA BENAR (Y/N):");
            String jawaban = scanner.nextLine();
    
            if (jawaban.equalsIgnoreCase("y")) {
                poin++;
                System.out.println("Jawaban Benar");
            } else {
                System.out.println("Jawaban Salah");
            }
        }
        
        System.out.println("Poin yang diperoleh: " + poin);
        
        nilai = ((double) poin / jumlahPertanyaan) * 100;
    
        System.out.println("Nilai akhir Anda: " + (int)nilai + " dari 100");
    }
}

