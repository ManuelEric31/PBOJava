
/**
 * PBO - Pak Danny Oka
 * Created by The Manuel Eric Saputra
 * A11.2021.13250
 * A11.4404
 */

import java.util.Scanner;

public class NilaiAkademik {
    private String Nama;
    private String Predikat;
    private String NIM;
    private double nTugas, nUTS, nUAS, nAkhir;
    private double pNilaiTugas, pNilaiUTS, pNilaiUAS;
    private char nHuruf;

    NilaiAkademik() {
        NIM = "Anonymous";
        Nama = "Anonymous";
        nTugas = 0.0;
        nUTS = 0.0;
        nUAS = 0.0;
    }

    NilaiAkademik(String Nama, String NIM, double nTugas, double nUTS, double nUAS) {
        this.Nama = Nama;
        this.NIM = NIM;
        this.nTugas = nTugas;
        this.nUTS = nUTS;
        this.nUAS = nUAS;
    }

    void setNilaiAkademik(String Nama, String NIM, double nTugas, double nUTS, double nUAS)
    {
        this.Nama = Nama;
        this.NIM = NIM;
        this.nTugas = nTugas;
        this.nUTS = nUTS;
        this.nUAS = nUAS;
    }

    void hitungNilai() {
        pNilaiTugas = 0.3;
        pNilaiUTS = 0.35;
        pNilaiUAS = 0.35;
        nAkhir = (nTugas * pNilaiTugas) + (nUTS * pNilaiUTS) + (nUAS * pNilaiUAS);
    }

    
    void cetakNilai() {
        
        System.out.println("==================================");
        System.out.println("Nama        : " + Nama);
        System.out.println("NIM         : " + NIM);
        System.out.println("Nilai Tugas : " + nTugas + " 30%     : " + (nTugas * pNilaiTugas));
        System.out.println("Nilai UTS   : " + nUTS + " 35%     : " + (nUTS * pNilaiUTS));
        System.out.println("Nilai UAS   : " + nUAS + " 35%     : " + (nUAS * pNilaiUAS));
        System.out.println("Nilai Akhir : " + nAkhir);
        System.out.println("Nilai Huruf : " + getNilaiHuruf());
        System.out.println("Predikat    : " + getPredikat());
        System.out.println("==================================");
    }

    void isiData ()
    {
            Scanner inputdata = new Scanner(System.in);
            System.out.println("=======INPUT NILAI MAHASISWA=======");
            System.out.print("Masukkan Nama         : ");
            String Nama = inputdata.nextLine();
            System.out.print("Masukkan NIM          : ");
            String NIM = inputdata.nextLine();
            System.out.print("Masukkan Nilai Tugas  : ");
            double nTugas = inputdata.nextDouble();
            System.out.print("Masukkan Nilai UTS    : ");
            double nUTS = inputdata.nextDouble();
            System.out.print("Masukkan Nilai UAS    : ");
            double nUAS = inputdata.nextDouble();
            setNilaiAkademik(Nama, NIM, nTugas, nUTS, nUAS);
    }

    static void tampilData (NilaiAkademik array [], int counter)
    {
        int i = 0;
        System.out.println("============DAFTAR NILAI MAHASISWA============");
        System.out.println("No\tNIM\tNama\tNilai Akhir\tNilai Huruf\tPredikat");
        while (i < counter)
        {
            System.out.println(i+1 + "\t" + array[i].NIM + "\t"+ array[i].Nama + "\t"+ array[i].nAkhir + "\t\t" + array[i].getNilaiHuruf() + "\t\t" + array[i].getPredikat());
            i++;
        }

    }

    public String getNIM() {
        return NIM;
    }

    public String getNama() {
        return Nama;
    }

    public char getNilaiHuruf ()
    {
        if (nAkhir >= 85 && nAkhir <= 100)
            nHuruf = 'A';
        else if (nAkhir >= 70 && nAkhir < 85)
            nHuruf = 'B';
        else if (nAkhir >= 60 && nAkhir < 70)
            nHuruf = 'C';
        else if (nAkhir >= 40 && nAkhir < 60)
            nHuruf = 'D';
        else
            nHuruf = 'E';
        return nHuruf;
    }

    public String getPredikat ()
    {
        switch (nHuruf)
        {
            case 'A' : 
                Predikat = "Apik";
                break;
            case 'B' :
                Predikat = "Baik";
                break;
            case 'C' : 
                Predikat = "Cukup";
                break;
            case 'D' :
                Predikat = "Buruk";
                break;
            default : Predikat = "Elek";
        }
        return Predikat;
    }



}
