public class Bus extends Kendaraan{
    // atribut
    private int jumlahKursi;

    // konstruktor
    public Bus(String nomorIdentifikasi, double kecepatanMaksimum, int kapasitasPenumpang, int jumlahKursi){
        super(nomorIdentifikasi, kecepatanMaksimum, kapasitasPenumpang);
        this.jumlahKursi = jumlahKursi;
    }

    // method
    @Override
    public String toString(){
        return super.toString() + "\nJumlah Kursi\t\t: " + jumlahKursi;
    }
}
