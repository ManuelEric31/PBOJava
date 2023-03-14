public class PersegiPanjang {
    // Panjang dan lebar dari persegi panjang
    public int panjang;
    public int lebar;
    public static int jumlahObjek = 0;

    // Konstruktor dari objek persegi panjang
    public PersegiPanjang() {
        jumlahObjek++;
    }

    public PersegiPanjang (int panjang, int lebar)
    {
        this.panjang = panjang;
        this.lebar = lebar;
        jumlahObjek++;
    }

    // Mengembalikan nilai getJumlahObjek
    public static int getJumlahObjek()
    {
        return jumlahObjek;
    }

    // Mengembalikan nilai luas persegi panjang
    public int getLuas ()
    {
        return panjang*lebar;
    }

    // Mengembalikkan nilai keliling persegi panjang
    public int getKeliling ()
    {
        return 2*(panjang+lebar);
    }
}