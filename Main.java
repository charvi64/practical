package basic_programs;

public class Main {
    public static void main(String[] args) {
        UserSession session = UserSession.getInstance();

        BankOperations bankOps = new BankOperations();
        bankOps.viewBalance();

        session.login("JohnDoe");

        bankOps.viewBalance();
        bankOps.deposit(1000);
        bankOps.withdraw(500);

        session.login("JaneDoe");

        session.logout();
        bankOps.viewBalance();
    }
}

