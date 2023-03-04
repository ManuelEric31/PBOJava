public class Lingkaran {
    public static void main(String[] args) {
        float phi = 3.14f;
        // Default pecahan double jika dibuat float diberi suffix f
        int r = 10;
        float luas = phi * (r * r);
        float keliling = phi * (2 * r);
        System.out.println("Phi     : " + phi);
        System.out.println("Jari    : " + r);
        System.out.println("Luas    : " + luas);
        System.out.println("Keliling: " + keliling);
    }
}
