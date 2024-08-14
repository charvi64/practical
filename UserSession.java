package basic_programs;
public class UserSession {
    
    private static UserSession instance = null;

    
    private boolean loggedIn;
    private String userName;

    private UserSession() {
        this.loggedIn = false;
    }

    public static UserSession getInstance() {
        if (instance == null) {
            instance = new UserSession();
        }
        return instance;
    }

    public void login(String userName) {
        if (!loggedIn) {
            this.loggedIn = true;
            this.userName = userName;
            System.out.println("User " + userName + " logged in successfully.");
        } else {
            System.out.println("User already logged in.");
        }
    }
    public void logout() {
        if (loggedIn) {
            System.out.println("User " + userName + " logged out successfully.");
            this.loggedIn = false;
            this.userName = null;
        } else {
            System.out.println("No user is currently logged in.");
        }
    }
    public boolean isLoggedIn() {
        return loggedIn;
    }

    public String getUserName() {
        if (loggedIn) {
            return userName;
        } else {
            return "No user logged in";
        }
    }
}

