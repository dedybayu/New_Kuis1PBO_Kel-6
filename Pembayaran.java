// public class Pembayaran {
//     int idPembayaran;
//     int pesertaId;
//     int kursusId;
//     double jumlah;

//     Pembayaran(int idPembayaran, int pesertaId, int kursusId, double jumlah) {
//         this.idPembayaran = idPembayaran;
//         this.pesertaId = pesertaId;
//         this.kursusId = kursusId;
//         this.jumlah = jumlah;
//     }
// }


public class Pembayaran {
    private Peserta peserta;

    public Pembayaran(Peserta peserta) {
        this.peserta = peserta;
    }

    public void prosesPembayaran() {
        int totalPembayaran = 0;
        for (Kursus kursus : peserta.getDaftarKursus()) {
            totalPembayaran += kursus.getHarga();
        }
        System.out.println("Total pembayaran untuk " + peserta.getDaftarKursus().size() + " kursus: Rp " + totalPembayaran);
    }
}
