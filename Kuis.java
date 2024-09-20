public class Kuis extends Konten{
    private int jumlahPertanyaan;
    private int jumlahJawabanBenar, jumlahJawabanSalah;
    private float nilaiKuis;

    public void tampilkanDetail(){
        super.tampilkanDetail();
        System.out.println("=======================================");
        System.out.println("Jumlah Pertanyaan: " + jumlahPertanyaan);
        System.out.println("Jawaban Benar: " + jumlahJawabanBenar);
        System.out.println("Jawaban Salah: " + jumlahJawabanSalah);
        System.out.println("Nilai: " + nilaiKuis);
    }

    void tampilkanHasil(){
        System.out.println("Jawaban Benar: " + jumlahJawabanBenar);
        System.out.println("Jawaban Salah: " + jumlahJawabanSalah);
        System.out.println("Nilai: " + hitungNilai());
    }

    void jawabBenar(){
        if (jumlahJawabanBenar > jumlahPertanyaan) {
            System.out.println("Nope.");            
        } else {
            jumlahJawabanBenar++;
            System.out.println("Jawaban Benar.");
        }
    }

    void jawabSalah(){
        if (jumlahJawabanSalah > jumlahPertanyaan) {
            System.out.println("Nope :)");
        } else {
            jumlahJawabanSalah++;
            System.out.println("Jawaban Salah");            
        }
    }

    //GETTER NILAI
    float hitungNilai(){
        nilaiKuis = (jumlahJawabanBenar / jumlahPertanyaan) * 100F;
        return nilaiKuis; 
    }
}
