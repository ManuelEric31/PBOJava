class KaryawanTetap extends Karyawan {
    private double gajiPokok;
    private double totalGaji;
    KaryawanTetap (){}
    KaryawanTetap(double gajiPokok)
    {
        this.gajiPokok = gajiPokok;
    }

    public void setGaji(double gajiPokok)
    {
        this.gajiPokok = gajiPokok;
    }
    public double getTotalGaji()
    {
        totalGaji = gajiPokok + tunjanganAnak;
        return totalGaji;
    }
}

class KaryawanKontrak extends Karyawan {
    private double upahHarian;
    private double totalUpah;
    private int totalHariMasuk;

    KaryawanKontrak (){}
    KaryawanKontrak(double upahHarian, int totalHariMasuk)
    {
        this.upahHarian = upahHarian;
        this.totalHariMasuk = totalHariMasuk;
    }

    void setUpahHarian(double upahHarian)
    {
        this.upahHarian = upahHarian;
    }
    void setTotalHariMasuk(int totalHariMasuk)
    {
        this.totalHariMasuk = totalHariMasuk;
    }

    public double getTotalUpah ()
    {
        totalUpah = (upahHarian*totalHariMasuk) + tunjanganAnak;
        return totalUpah;
    }
    
}

public class KaryawanDemo {
    public static void main(String[] args) {
        KaryawanTetap kyt1 = new KaryawanTetap();
        kyt1.setGaji(2000000);
        System.out.println("Gaji Karyawan Tetap 1 : " + kyt1.getTotalGaji());

        KaryawanKontrak kyk1 = new KaryawanKontrak();
        kyk1.setUpahHarian(50000);
        kyk1.setTotalHariMasuk(15);
        System.out.println("Gaji Karyawan Kontrak 1 : " + kyk1.getTotalUpah());
    }
}
