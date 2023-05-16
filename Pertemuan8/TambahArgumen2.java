public class TambahArgumen2 {
    public static void main(String[] args) {
        try {
            int jumlah = 5;
            for (int i = 0; i < args.length; i++) {
                jumlah += Integer.parseInt(args[i]);
            }
            System.out.println("Jumlah = " + jumlah);
        } catch (NumberFormatException e) {
            System.err.println("Salah satu argumen bukan integer");
        }
    }
}
