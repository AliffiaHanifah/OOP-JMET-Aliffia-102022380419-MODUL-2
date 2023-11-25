public class Kendaraan {
    // atribut
    private String nomorIdentifikasi;
    private double kecepatanMaksimum;
    private int kapasitasPenumpang;

    // konstruktor
    public Kendaraan(String nomorIdentifikasi, double kecepatanMaksimum, int kapasitasPenumpang){
        this.nomorIdentifikasi = nomorIdentifikasi;
        this.kecepatanMaksimum = kecepatanMaksimum;
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    // method
    public String toString() {
        return "Nomor Identifikasi\t: " + nomorIdentifikasi +
                "\nKecepatan Maksimum\t: " + kecepatanMaksimum + " km/jam" +
                "\nKapasitas Penumpang\t: " + kapasitasPenumpang + " orang" ;
    }

    public double hitungWaktuTempuh(double jarak){
        return jarak / kecepatanMaksimum;
    }
}