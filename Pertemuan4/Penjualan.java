public class Penjualan {
    private String Kode, Nama;
    private double harga,totalPembelian;   
    private double jumlah;

    Penjualan ()
    {
        Kode = "Unknown";
        Nama = "Unknown";
        harga = 0.0;
        jumlah = 0.0;
    }

    Penjualan (String Kode, String Nama, double harga, double jumlah)
    {
        this.Kode = Kode;
        this.Nama = Nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    void setData (String Kode, String Nama, double harga, double jumlah)
    {
        this.Kode = Kode;
        this.Nama = Nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public double getTotalPembelian ()
    {
        totalPembelian = harga * jumlah;
        return totalPembelian;
    }

    public String getBonus ()
    {
        String bonus = "";
        if (totalPembelian >= 500000 && jumlah > 5)
            bonus = "Setrika";
        else if (totalPembelian > 100000 && jumlah > 3)
            bonus = "Payung";
        else if (totalPembelian > 50000 || jumlah > 2)
            bonus = "Ballpoint";
        else
            bonus = "Tidak dapat bonus";
        return bonus;            
    }

    void cetakNota ()
    {
        System.out.println("==============CETAK NOTA BELANJA==============");
        System.out.println("Kode Barang         : " + Kode);
        System.out.println("Nama Pembeli        : " + Nama);
        System.out.println("Harga barang        : " + harga);
        System.out.println("Jumlah Barang       : " + jumlah);
        System.out.println("Total Harga Belanja : " + getTotalPembelian());
        System.out.println("Bonus Belanja       : " + getBonus());
        System.out.println("==============================================");
    }
}
