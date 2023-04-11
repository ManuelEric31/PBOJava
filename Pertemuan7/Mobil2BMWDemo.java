class Mobil2BMW  extends Mobil{
    public void nontonTV()
    {
        System.out.println("TV Dihidupkan");
        System.out.println("TV Mencari Channel");
        System.out.println("TV Menampilkan Gambar");
    }
}
public class Mobil2BMWDemo {
    public static void main(String[] args) {
        Mobil2BMW bmw1 = new Mobil2BMW();
        bmw1.hidupkanMobil();
        bmw1.nontonTV();
        bmw1.tambahGigi();
        bmw1.turunGigi();
        bmw1.matikanMobil();
        
    }
    
}
