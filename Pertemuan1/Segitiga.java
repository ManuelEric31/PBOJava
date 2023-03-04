public class Segitiga {
    public static void main(String[] args) {
        float alasSegitiga = 12.5f;
        float tinggiSegitiga = 15.0f;
        float duaSisi = 20.5f;
        float luas = (alasSegitiga * tinggiSegitiga) / 2;
        float Keliling = alasSegitiga + (duaSisi * 2);

        System.out.println("Alas                    : " + alasSegitiga);
        System.out.println("Tinggi                  : " + tinggiSegitiga);
        System.out.println("Dua Sisi Sama Panjang   : " + duaSisi);
        System.out.println("Luas                    : " + luas);
        System.out.println("Keliling                : " + Keliling);
    }
}
