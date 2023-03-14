public class PersegiPanjangDemo {
    public static void main(String[] args) {
        System.out.println("Sebelum membuat objek");
        // Memanggil variable static 
        System.out.println("Jumlah objek : " + PersegiPanjang.jumlahObjek);

        // Membuat objek persegiPanjang1
        PersegiPanjang persegiPanjang1 = new PersegiPanjang();
        System.out.println("Setelah membuat objek PersegiPanjang1");

        // Memanggil variable instance
        System.out.println("Panjang : " + persegiPanjang1.panjang + "\nLebar : " + persegiPanjang1.lebar);

        // Memanggil method static
        System.out.println("Jumlah objek : " + persegiPanjang1.getJumlahObjek());

        // Membuat objek persegiPanjang2
        PersegiPanjang persegiPanjang2 = new PersegiPanjang(8,5);
        System.out.println("Setelah membuat objek PersegiPanjang2");

        // Memanggil variable instance
        System.out.println("Panjang : " + persegiPanjang2.panjang + "\nLebar : " + persegiPanjang2.lebar);

        // Memanggil method static
        System.out.println("Jumlah objek : " + persegiPanjang2.getJumlahObjek());



    }
}
