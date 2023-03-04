import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int boolLoop = 0;
        Scanner sisiPer = new Scanner(System.in);
        Scanner alasSeg = new Scanner(System.in);
        Scanner sisiSPanjang = new Scanner(System.in);
        Scanner tinggiSeg = new Scanner(System.in);
        Scanner jariLing = new Scanner(System.in);
        Scanner rusukKub = new Scanner(System.in);
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("*****************************");
            System.out.println("********    MENU    *********");
            System.out.println("*****************************");
            System.out.println("1. Luas dan Keliling Persegi");
            System.out.println("2. Luas Segitiga dan Keliling Segitiga");
            System.out.println("3. Luas dan Keliling Lingkaran");
            System.out.println("4. Keliling dan Luas Permukaan Kubus");
            System.out.print("Masukkan Pilihan Anda : ");
            boolLoop = input.nextInt();
            switch (boolLoop) {
                case 1:
                    System.out.println("Masukkan sisi persegi : ");
                    int sisiPersegi = sisiPer.nextInt();
                    System.out.println("Luas Persegi : " + sisiPersegi * sisiPersegi);
                    System.out.println("Keliling Persegi : " + sisiPersegi * 4);
                    break;
                case 2:
                    System.out.println("Masukkan alas : ");
                    int alasSegitiga = alasSeg.nextInt();
                    System.out.println("Masukkan dua sisi sama panjang : ");
                    int duasisiSamaP = sisiSPanjang.nextInt();
                    System.out.println("Masukkan tinggi segitiga : ");
                    int tinggiSegitiga = tinggiSeg.nextInt();
                    System.out.println("Luas Segitiga : " + (alasSegitiga * tinggiSegitiga) / 2);
                    System.out.println("Keliling Segitiga : " + ((2 * duasisiSamaP) + alasSegitiga));
                    break;
                case 3:
                    float phi = 3.14f;
                    System.out.println("Masukkan jari jari : ");
                    float jariLingkaran = jariLing.nextInt();
                    System.out.println("Luas Lingkaran : " + phi * (jariLingkaran * jariLingkaran));
                    System.out.println("Keliling Lingkaran : " + phi * (jariLingkaran * 2));
                    break;
                case 4:
                    System.out.println("Masukkan Rusuk : ");
                    int rusukKubus = rusukKub.nextInt();
                    System.out.println("Luas Kubus : " + 6 * (rusukKubus * rusukKubus));
                    System.out.println("Keliling Kubus : " + 12 * rusukKubus);
                    break;
            }

        } while (boolLoop != 5);
    }
}



