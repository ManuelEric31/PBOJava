public class PersegiPanjangEnkapsulasi {
    // Panjang, lebar, dan jumlahObjek dengan modifier private
    private int panjang;
    private int lebar;
    private static int jumlahObjek = 0;

    // Konstruktor dari objek persegi panjang
    public PersegiPanjangEnkapsulasi() {
        jumlahObjek++;
    }

    // Konstruktor dari objek persegi panjang
    public PersegiPanjangEnkapsulasi (int panjang, int lebar)
    {
        this.panjang = panjang;
        this.lebar = lebar;
        jumlahObjek++;
    }

    // Method setter  dan getter untuk property panjang
    public void setPanjang (int panjang)
    {
        this.panjang = panjang;
    }
    public int getPanjang ()
    {
        return panjang;
    }

    // Method setter dan getter untuk property lebar
    public void setLebar (int lebar)
    {
        this.lebar = lebar;
    }
    public int getLebar ()
    {
        return lebar;
    }

    public static int getJumlahObjek ()
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