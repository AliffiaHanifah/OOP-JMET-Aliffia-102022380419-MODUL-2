public class MainApp {
    public static void main(String[] args){
        
        // TO DO: Create expedisi Object from Ekspedisi Class
        Ekspedisi ekspedisi = new Ekspedisi(10, "Jakarta", 10000);
        // TO DO: Create teluexpress Object from TelUExpress Class
        TelUExpress telUExpress = new TelUExpress(100, "Bandung", 50000, true);
        // TO DO: Create friexpress Object from FRIExpress Class
        FRIExpress friExpress =  new FRIExpress(30, "Bojongsoang", 7000, true);

        ekspedisi.informasi();
        telUExpress.informasi();
        telUExpress.ambil("Sukabirus");
        telUExpress.antar(1628389);
        telUExpress.antar(1922722, 7628262);
        System.out.println("\n");

        friExpress.informasi();
        friExpress.terima(2000);
        friExpress.kirim("Lembang");
        friExpress.kirim("Braga", "Jakarta");

    }
}
