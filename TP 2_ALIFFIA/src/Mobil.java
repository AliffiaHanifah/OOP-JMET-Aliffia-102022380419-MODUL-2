public class Mobil extends Kendaraan{
    // atribut
    private int jumlahPintu;

    // konstruktor
    public Mobil(String nomorIdentifikasi, double kecepatanMaksimum, int kapasitasPenumpang, int jumlahPintu){
        super(nomorIdentifikasi, kecepatanMaksimum, kapasitasPenumpang);
        this.jumlahPintu = jumlahPintu;
    }

    // method
    @Override
    public String toString(){
        return super.toString() + "\nJumlah Pintu\t\t: " + jumlahPintu;
    }

}
