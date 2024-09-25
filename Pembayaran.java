import java.util.Scanner;

public class Pembayaran {

    public void prosesPembayaran(Peserta peserta) {
        Scanner input = new Scanner(System.in);

        int totalPembayaran = 0;
        for (Kursus kursus : peserta.getDaftarKursus()) {
            totalPembayaran += kursus.getHarga();
        }
        System.out.println(
                "\nTotal pembayaran untuk " + peserta.getDaftarKursus().size() + " kursus: Rp " + totalPembayaran);
        int uang;
        do {
            System.out.print("Masukan Uang : ");
            uang = input.nextInt();
            if (uang < totalPembayaran) {
                System.out.println("Uang tidak cukup!");
            } else {
                int kembalian = totalPembayaran - uang;
                if (kembalian != 0) {
                    System.out.println("Kembalian : " + kembalian);
                    System.out.println("Terimakasih telah mengikuti Kursus");
                } else {
                    System.out.println("Uang Pas");
                    System.out.println("Terimakasih telah mengikuti Kursus");
                }
            }
            

        } while (uang < totalPembayaran);
        input.close();
    }
}
