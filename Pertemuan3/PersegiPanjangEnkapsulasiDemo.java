public class PersegiPanjangEnkapsulasiDemo
{
    public static void main(String[] args) {
        System.out.println("Sebelum membuat objek");
        System.out.println("Jumlah objek : " + PersegiPanjangEnkapsulasi.getJumlahObjek());
        
        // Membuat objek persegi panjang dengan panjang 0 dan lebar 0
        PersegiPanjangEnkapsulasi pp1 = new PersegiPanjangEnkapsulasi();
        System.out.println("Luas Persegi Panjang 1 : " + pp1.getPanjang() + " * " + pp1.getLebar() + " = " + pp1.getLuas());

        System.out.println("Jumlah objek : " + PersegiPanjangEnkapsulasi.getJumlahObjek());
        
        // Membuat objek persegi panjang dengan panjang 6 dan lebar 7
        PersegiPanjangEnkapsulasi pp2 = new PersegiPanjangEnkapsulasi();
        pp2.setPanjang(6);
        pp2.setLebar(7);
        System.out.println("Luas Persegi Panjang 2 : " + pp2.getPanjang() + " * " + pp2.getLebar() + " = " + pp2.getLuas());

        System.out.println("Jumlah objek : " + PersegiPanjangEnkapsulasi.getJumlahObjek());

        // Membuat objek persegi panjang dengan panjang 8 dan lebar 5
        PersegiPanjangEnkapsulasi pp3 = new PersegiPanjangEnkapsulasi(8,5);
        System.out.println("Luas Persegi Panjang 3 : " + pp3.getPanjang() + " * " + pp3.getLebar() + " = " + pp3.getLuas());

        System.out.println("Jumlah objek : " + PersegiPanjangEnkapsulasi.getJumlahObjek());
    }
}