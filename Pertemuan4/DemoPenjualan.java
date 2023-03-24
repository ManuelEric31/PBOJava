import java.util.Scanner;

public class DemoPenjualan {
    public static void main(String[] args) {
        String ulang = "";
        do
        {
            Scanner inputdata = new Scanner(System.in);
            Penjualan cust1 = new Penjualan();
            System.out.println("==========INPUT DATA BELANJA==========");
            System.out.print("Kode Barang       : ");
            String Kode = inputdata.nextLine();
            System.out.print("Nama Barang       : ");
            String Nama = inputdata.nextLine();
            System.out.print("Harga Barang      : ");
            double harga = inputdata.nextDouble();
            System.out.print("Jumlah Barang     : ");
            double jumlah = inputdata.nextDouble();
            cust1.setData(Kode, Nama, harga, jumlah);
            cust1.cetakNota();

            System.out.print("Apakah ingin input data ulang? [Y/N] : ");
            inputdata.nextLine();
            Scanner inputulang = new Scanner(System.in);
            ulang = inputdata.nextLine();
        } while (ulang.toLowerCase().equals("y") || ulang.toLowerCase().equals("yes"));
    }
}
