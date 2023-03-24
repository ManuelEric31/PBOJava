import java.util.Scanner;
public class demoDeterminanABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        String input = "";

        DeterminanABC pers1 = new DeterminanABC();
        
        do
        {
            System.out.print("Masukkan A  : ");
            a = sc.nextDouble();
            System.out.print("Masukkan B  : ");
            b = sc.nextDouble();
            System.out.print("Masukkan C  : ");
            c = sc.nextDouble();
    
            pers1.setDeterminan(a,b,c);
            pers1.hitungDeterminan();
            pers1.rumusABC();
            pers1.cetakHasil();
            System.out.print("Apakah ingin hitung ulang? [Y/N] : ");
            Scanner inputulang = new Scanner(System.in);
            input = inputulang.next();

        } while (input.toLowerCase().equals("yes") || input.toLowerCase().equals("y"));

        
    }
}
