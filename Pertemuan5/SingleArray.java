class SingleArray
{
    public static void main(String[] args) {
        int x [];
        x = new int [3];
        x[0] = 20;
        x[1] = 10;
        x[2] = 30;

        System.out.println("Nilai Array x[0] : " + x[0]);
        System.out.println("Nilai Array x[1] : " + x[1]);
        System.out.println("Nilai Array x[2] : " + x[2]);

        int y [] = new int[3];
        y[0] = 20;
        y[1] = 10;
        y[2] = 30;

        System.out.println("Nilai Array y[0] : " + y[0]);
        System.out.println("Nilai Array y[1] : " + y[1]);
        System.out.println("Nilai Array y[2] : " + y[2]);

        int z [] = {20,10,30};
        
        System.out.println("Nilai Array z[0] : " + z[0]);
        System.out.println("Nilai Array z[1] : " + z[1]);
        System.out.println("Nilai Array z[2] : " + z[2]);
    }
}