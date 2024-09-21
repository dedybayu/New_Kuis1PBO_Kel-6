public class Main {
    public static void main(String[] args) {
        // tambah instruktur
        Instruktur instruktur = new Instruktur("I01", "Andi", "Pemrograman");

        // Membuat kursus
        Kursus kursusJava = new Kursus(1, "Belajar Java", 500000);
        Kursus kursusPython = new Kursus(2, "Belajar Python", 400000);

        // Membuat konten untuk kursus
        Konten videoJava = instruktur.buatKonten("Video", "Belajar Java OOP", 90);
        Konten artikelJava = instruktur.buatKonten("Artikel", "Panduan Java", 2000);
        Konten kuisJava = instruktur.buatKonten("Kuis", "Tes Pemrograman Java", 10);

        // menambah konten ke kursus
        instruktur.tambahKontenKeKursus(kursusJava, videoJava);
        instruktur.tambahKontenKeKursus(kursusJava, artikelJava);
        instruktur.tambahKontenKeKursus(kursusJava, kuisJava);

        // Membuat peserta
        Peserta peserta1 = new Peserta("P01", "Budi", "budi@example.com");

        // mendaftarkan kursus
        peserta1.daftarKursus(kursusJava);
        peserta1.daftarKursus(kursusPython); // Kursus tanpa konten sebagai contoh

        // Tampilkan kursus konten 
        peserta1.tampilkanKursus();
    }
}

