public class User {
    public Account account;
    private final String login;

    public User(String login, String password) {
        this.login = login;
        this.account = new Account(password);
    }

     class Account {
        private final String password;

        public Account(String password) {
            this.password = password;
        }

        public void displayAccount() {
            System.out.println("Account Login successful! Login: " + login + ", Password: " + password);
        }
    }

    public static void main(String[] args) {
        User user = new User("Alice", "qwerty");
        user.account.displayAccount();
    }
}
