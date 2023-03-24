import javax.lang.model.util.ElementScanner6;

public class DeterminanABC {
    private double determinant, a,b,c,x1,x2;

    DeterminanABC ()
    {
        determinant = 0.0;
        a = 0.0;
        b = 0.0;
        c = 0.0;
    }

    DeterminanABC (double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void setDeterminan (double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void hitungDeterminan ()
    {
        determinant = (Math.pow(b,2)) - (4*a*c);
    }
    
    void rumusABC()
    {
        if (determinant > 0)
        {
            x1 = (-b + (Math.sqrt(determinant))) / (2*a);
            x2 = (-b - (Math.sqrt(determinant))) / (2*a);
        }
        else if (determinant == 0)
        {
            x1 = x2 = (-b / 2*a);
        }

        else
        {
            x1 = (-b + (-1 *(Math.sqrt(determinant))) / (2*a));
            x2 = (-b - (-1 *(Math.sqrt(determinant))) / (2*a));
        }
    }

    void cetakHasil ()
    {
        System.out.println("Hasil persamaan : " + a + "x^2 + " + b + "x + " + c);
        System.out.println("Determinan      : " + determinant);
        System.out.println("x1              : " + x1);
        System.out.println("x2              : " + x2);
    }
    
    double getDeterminant ()
    {
        return determinant;
    }


}
