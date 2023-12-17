public class Atm {
    public int atm(int cardnumber, int reqamount)throws Exception {
        int balance = 100;
        if (balance >= reqamount) {
            balance = balance - reqamount;
            System.out.println("Balance updated: "+balance);
        } else {
            throw new Exception("Inssuficent funds");
        }
        return balance;
    }

}
