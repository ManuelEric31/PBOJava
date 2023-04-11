class MountainBike extends Bicycle {
    int seatHeight;
    
    public void seatHeight (int newValue)
    {
        seatHeight = newValue;
        System.out.println("Seat height: " + seatHeight);
    }
}

class MountainBikeDemo {
    public static void main(String[] args) {
        MountainBike mb1 = new MountainBike();

        mb1.upGear();
        mb1.upSpeed();
        mb1.seatHeight(10);
    }
}
