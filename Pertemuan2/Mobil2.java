public class Mobil2 {
    String nama;
    int tahunProduksi;
    int gigiMobil = 0;
    String pilihan = "";

    void tambahGigi() {
        if (gigiMobil < 6)
            gigiMobil++;
        else
            System.out.println("Gigi sudah mentok");
        System.out.println("Gigi Mobil Sekarang : " + gigiMobil);
    }

    void turunGigi() {
        if (gigiMobil > 0)
            gigiMobil--;
        else
            System.out.println("Gigi Sudah Netral");
        System.out.println("Gigi Mobil Sekarang : " + gigiMobil);
    }

    void hidupkanMobil() {
        if (gigiMobil == 0)
            System.out.println("Jrenggg Mobile sudah nyala");

        else
            System.out.println("Netralkan gigi terlebih dahulu");
    }

    void matikanMobil() {
        if (gigiMobil == 0)
            System.out.println("Mobil telah dimatikan");

        else
            System.out.println("Netralkan gigi terlebih dahulu");
    }

    void ubahGigi() {
        if (pilihan.toLowerCase().equals("naik"))
            tambahGigi();
            
        else if (pilihan.toLowerCase().equals("turun"))
            turunGigi();
    }
}