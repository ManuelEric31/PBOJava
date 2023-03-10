
/**
 * PBO - Pak Danny Oka
 * Created by The Manuel Eric Saputra
 * A11.2021.13250
 * A11.4404
 */

import java.util.Scanner;

public class NilaiAkademik {
    private String Nama;
    private String NIM;
    private double nTugas, nUTS, nUAS, nAkhir;
    private double pNilaiTugas, pNilaiUTS, pNilaiUAS;

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

    void hitungNilai() {
        pNilaiTugas = 0.2;
        pNilaiUTS = 0.35;
        pNilaiUAS = 0.45;
        nAkhir = (nTugas * pNilaiTugas) + (nUTS * pNilaiUTS) + (nUAS * pNilaiUAS);
    }

    void cetakNilai() {
        System.out.println("==================================");
        System.out.println("Nama        : " + Nama);
        System.out.println("NIM         : " + NIM);
        System.out.println("Nilai Tugas : " + nTugas);
        System.out.println("Nilai UTS   : " + nUTS);
        System.out.println("Nilai UAS   : " + nUAS);
        System.out.println("Nilai Akhir : " + nAkhir);
        System.out.println("==================================");
    }

    public String getNIM() {
        return NIM;
    }

    public String getNama() {
        return Nama;
    }

}
