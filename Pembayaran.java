public class Pembayaran {
    int idPembayaran;
    int pesertaId;
    int kursusId;
    double jumlah;

    Pembayaran(int idPembayaran, int pesertaId, int kursusId, double jumlah) {
        this.idPembayaran = idPembayaran;
        this.pesertaId = pesertaId;
        this.kursusId = kursusId;
        this.jumlah = jumlah;
    }
}
