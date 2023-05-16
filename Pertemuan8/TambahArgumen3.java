public class TambahArgumen3 {
    public static void main(String[] args) {
        int jumlah = 0;
        for (int i = 0; i < args.length; i++) {
                try {
                    jumlah += Integer.parseInt(args[i]);
                } catch (NumberFormatException e) {
                        System.err.println(args[i] +" bukan integer");
                    }
            }
            System.out.println("Jumlah = " + jumlah);
        }
}
