package basic_programs;

public class BankOperations {

    public void viewBalance() {
        UserSession session = UserSession.getInstance();
        if (session.isLoggedIn()) {
            System.out.println("Displaying balance for " + session.getUserName());
           
        } else {
            System.out.println("Please log in to view balance.");
        }
    }

    public void deposit(double amount) {
        UserSession session = UserSession.getInstance();
        if (session.isLoggedIn()) {
            System.out.println("Depositing " + amount + " for " + session.getUserName());
           
        } else {
            System.out.println("Please log in to deposit money.");
        }
    }

    public void withdraw(double amount) {
        UserSession session = UserSession.getInstance();
        if (session.isLoggedIn()) {
            System.out.println("Withdrawing " + amount + " for " + session.getUserName());
           
        } else {
            System.out.println("Please log in to withdraw money.");
        }
    }
}
