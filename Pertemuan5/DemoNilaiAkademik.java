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
        int counter = 0;
        // Default Constructor
        // NilaiAkademik mhs [] = new NilaiAkademik[100];
        // mhs[0].hitungNilai();
        // mhs[0].cetakNilai();

        // Overloaded Constructor
        NilaiAkademik mhs1 = new NilaiAkademik("Manuel Eric", "A11.2021.13250", 80, 80, 85);
        mhs1.hitungNilai();
        mhs1.cetakNilai();
        
        // Using loop
        NilaiAkademik mhs2[] = new NilaiAkademik[100];  // Using Overloaded Constructor
        do
        {
            NilaiAkademik nilai = new NilaiAkademik();
            nilai.isiData();
            nilai.hitungNilai();
            mhs2[counter] = nilai;
            System.out.println("==================================");
            System.out.print("Lakukan Input Ulang Nilai? [Y/N] : ");
            Scanner inputUlang = new Scanner(System.in);
            ulang = inputUlang.nextLine();
            counter++;
        
        } while (ulang.toLowerCase().equals("y") || ulang.toLowerCase().equals("yes"));
        System.out.println();
        NilaiAkademik.tampilData(mhs2 , counter);
    }
    
}