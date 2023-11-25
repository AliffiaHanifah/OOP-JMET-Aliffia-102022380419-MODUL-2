public class MainApp {
    public static void main(String[] args) throws Exception {
        // membuat objek baru dari class mobil
        Mobil mobil1 = new Mobil("M1", 120.0, 5, 4);
        double jarak = 300.0;
        double waktuTempuhMobil = mobil1.hitungWaktuTempuh(jarak);
        
        System.out.println("====== Informasi Mobil 1 ======");
        System.out.println(mobil1.toString());
        System.out.println("Waktu Tempuh dengan Mobil1 : " + waktuTempuhMobil + " jam");
        System.out.println("\n");

        Mobil mobil2 = new Mobil("M2", 150.0, 2, 2);
        double waktuTempuhMobil2 = mobil2.hitungWaktuTempuh(jarak);
        
        System.out.println("====== Informasi Mobil 2 ======");
        System.out.println(mobil2.toString());
        System.out.println("Waktu Tempuh dengan Mobil2 : " + waktuTempuhMobil2 + " jam");

        System.out.println("\n");
        // membuat objek baru dari class bus
        Bus bus = new Bus("B1", 80.0, 40, 30);
        double waktuTempuhBus = bus.hitungWaktuTempuh(jarak);

        System.out.println("====== Informasi Bus ======");
        System.out.println(bus.toString());
        System.out.println("Waktu Tempuh dengan Bus : " + waktuTempuhBus + " jam");
    }
}
