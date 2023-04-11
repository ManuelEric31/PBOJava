public class Mobil {
    public String nama;
    public int tahunProduksi;
    public int gigiMobil = 0;
    public String pilihan = "";

    public void tambahGigi() {
        if (gigiMobil < 6)
            gigiMobil++;
        else
            System.out.println("Gigi sudah mentok");
        System.out.println("Gigi Mobil Sekarang : " + gigiMobil);
    }

    public void turunGigi() {
        if (gigiMobil > 0)
            gigiMobil--;
        else
            System.out.println("Gigi Sudah Netral");
        System.out.println("Gigi Mobil Sekarang : " + gigiMobil);
    }

    public void hidupkanMobil() {
        if (gigiMobil == 0)
            System.out.println("Jrenggg Mobile sudah nyala");

        else
            System.out.println("Netralkan gigi terlebih dahulu");
    }

    public void matikanMobil() {
        if (gigiMobil == 0)
            System.out.println("Mobil telah dimatikan");

        else
            System.out.println("Netralkan gigi terlebih dahulu");
    }

    public void ubahGigi() {
        if (pilihan.toLowerCase().equals("naik"))
            tambahGigi();

        else if (pilihan.toLowerCase().equals("turun"))
            turunGigi();
    }
}
