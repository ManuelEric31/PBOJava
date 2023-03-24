/**
 * PBO - Pak Danny Oka
 * Created by The Manuel Eric Saputra
 * A11.2021.13250
 * A11.4404
 */

import java.util.Scanner;

public class DemoNilaiAkademik {
    public static void main(String[] args) {
        String ulang = "";

        // Default Constructor
        NilaiAkademik mhs = new NilaiAkademik();
        mhs.hitungNilai();
        mhs.cetakNilai();

        // Overloaded Constructor
        NilaiAkademik mhs1 = new NilaiAkademik("Manuel Eric", "A11.2021.13250", 80, 80, 85);
        mhs1.hitungNilai();
        mhs1.cetakNilai();
        
        // Using loop
        do
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
                        
            NilaiAkademik mhs2 = new NilaiAkademik(Nama, NIM, nTugas, nUTS, nUAS);  // Using Overloaded Constructor
            mhs2.hitungNilai();
            mhs2.cetakNilai();
            System.out.println("==================================");
            
            System.out.print("Lakukan Input Ulang Nilai? [Y/N] : ");
            Scanner inputUlang = new Scanner(System.in);
            ulang = inputUlang.nextLine();
        
        } while (ulang.toLowerCase().equals("y") || ulang.toLowerCase().equals("yes"));

    }
}