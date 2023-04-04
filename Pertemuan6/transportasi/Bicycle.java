package transportasi;

public class Bicycle {
    private int speed = 0;
    private int gear = 0;

    public void upGear ()
    {
        gear++;
        System.out.println("Naik gigi menjadi = " + gear);
    }
    
    public void downGear ()
    {
        if (gear == 0)
            System.out.println("Gigi sudah tidak bisa turun karena netral");
        else
            gear--;
        System.out.println("Turun gigi menjadi = " + gear);
    }

    public void upSpeed ()
    {
        speed += 10;
        System.out.println("Naik kecepatan menjadi = " + speed + " km/h");
    
    }

    public void downSpeed ()
    {
        if (speed == 0)
        {
            System.out.println("Tidak bisa turun gigi karena sepeda sudah berhenti");
        }
        else
            speed -= 10;
        System.out.println("Turun kecepatan menjadi = " + speed + " km/h");
    
    }
    public Bicycle(int speed, int gear) 
    {
        this.speed = speed;
        this.gear = gear;
    }
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    public void setGear (int gear)
    {
        this.gear = gear;
    }
    public int getSpeed()
    {
        return speed;
    }
    public int getGear()
    {
        return gear;
    }
}
