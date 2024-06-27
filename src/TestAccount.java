public class TestAccount {


    public static void main(String[] args) {

        Account account = new Account(1,331233);
        Account.setAnnualInterestRate(4.5);
        account.withdraw(1233);
        System.out.println(account.getBalance());
        account.deposit(20000);
        System.out.println(account.getBalance());
        System.out.println(account.getDateCreated());

    }

}
