public class TestAccount {
    public static void main(String[] args) {
        //create two accounts with preset balances
        Account acc1 = new Account("A101", "Account 1", 5000);
        Account acc2 = new Account("A102", "Account 2", 4000);

        //display initial balances
        System.out.println("--- Initial Balances ---");
        System.out.println("Acc1 Balance: $" + acc1.getBalance());
        System.out.println("Acc2 Balance: $" + acc2.getBalance());

        //transfering $1000 from acc1 to acc2
        System.out.println("Transferring $1000 from Acc1 to Acc2...");
        acc1.transferTo(acc2, 1000);

        //displaying balances
        System.out.println("--- Final Balances ---");
        System.out.println("Acc1 Balance: $" + acc1.getBalance());
        System.out.println("Acc2 Balance: $" + acc2.getBalance());
        
    }
}