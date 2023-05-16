public class TesBank2 {
    public static void main(String[] args) {
        Account [] accounts = new Account[100];
        accounts[0] = new Account(2000000);        
        accounts[1] = new Account(0);    
        
        for (int i = 0; i < 2; i++) {
            try {
                accounts[i].withdraw(1000000);
            } catch (OverdraftException ode) {
                System.err.println("" + ode);
            }
            double b = accounts[i].getBalance();
            System.out.println("Saldo akhir account ke " + i + " = " + b);
        }
    }
}
