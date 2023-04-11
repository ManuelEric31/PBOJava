class Satu {
    Satu (String s)
    {
        System.out.println("Satu..." + s);
    }
}

class Dua extends Satu {
    Dua (String s)
    {
        super(s);
        System.out.println("Dua...");
    }
}

class Tiga extends Dua {
    Tiga (String s)
    {
        super(s);
        System.out.println("Tiga...");
    }
}

class Empat extends Tiga {
    Empat (String s) {
        super(s);
        System.out.println("Empat...");
    }
}

public class TestTurunan2 {
    public static void main(String[] args) {
        new Empat("Selamat Pagi Berkah Dalem...");
    }
}

