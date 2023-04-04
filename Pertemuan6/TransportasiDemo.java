import transportasi.*;
import java.util.Scanner;

public class TransportasiDemo {
    public static void main(String[] args) {
        String ubah = "";
        Mobil mobilku = new Mobil();
        Mobil mobilku2 = new Mobil();

        mobilku.nama = "Toyota Enzo";
        mobilku.tahunProduksi = 2020;
        mobilku2.nama = "Toyota James";
        mobilku2.tahunProduksi = 2000;
        
        System.out.println("Mobilku nama : " + mobilku.nama);
        System.out.println("Mobilku tahun : " + mobilku.tahunProduksi);
        do
        {
            System.out.println("Pindah Posisi Gigi [Naik / Turun / Skip]? : ");
            Scanner pilihan = new Scanner(System.in);
            ubah = pilihan.nextLine();
            if (ubah.toLowerCase().equals("naik")) // Untuk membandingkan kedua objek menggunakan .equals
            {
                mobilku.pilihan = ubah;
                mobilku.ubahGigi();
            }
            else if (ubah.toLowerCase().equals("turun"))
            {
                mobilku.pilihan = ubah;
                mobilku.ubahGigi();
            }
            else if (ubah.toLowerCase().equals("skip"))
                System.out.println("Metode ubah posisi gigi di skip!");
            else
                System.out.println("Inputan tidak valid!");
        } while (ubah.toLowerCase().intern() != "skip");
        mobilku.matikanMobil();

        System.out.println();

        System.out.println("Mobilku2 tahun : " + mobilku2.nama);
        System.out.println("Mobilku2 tahun : " + mobilku2.tahunProduksi);
        do
        {
            System.out.println("Pindah Posisi Gigi [Naik / Turun / Skip]? : ");
            Scanner pilihan = new Scanner(System.in);
            ubah = pilihan.nextLine();
            if (ubah.toLowerCase().equals("naik")) // Untuk membandingkan kedua objek menggunakan .equals
            {
                mobilku2.pilihan = ubah;
                mobilku2.ubahGigi();
            }
            else if (ubah.toLowerCase().equals("turun"))
            {
                mobilku2.pilihan = ubah;
                mobilku2.ubahGigi();
            }
            else if (ubah.toLowerCase().equals("skip"))
                System.out.println("Metode ubah posisi gigi di skip!");
            else
                System.out.println("Inputan tidak valid!");
        } while (ubah.toLowerCase().intern() != "skip");
        mobilku2.matikanMobil();
        System.out.println();
        
        Bicycle object1 = new Bicycle(0, 0);
        object1.upGear();
        object1.upSpeed();
        object1.upGear();
        object1.upSpeed();
        object1.upGear();
        object1.upSpeed();
        object1.downGear();
        object1.downSpeed();
    }
}
