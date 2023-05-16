import java.util.Scanner;
class TestException {
    public static void main(String[] args) {
        // Buat objek scanner
        Scanner sc = new Scanner(System.in);
        // Kabari user untuk memasukkan angka sisi persegi
        try{
            System.out.print("Masukkan sisi persegi : ");
            double sisi = sc.nextDouble();
            System.out.println("Sisi : " + sisi);
        } catch(Exception e) {
            System.out.println("Error : Input yang dimasukkan harus berupa angka ");
        }
    }
}