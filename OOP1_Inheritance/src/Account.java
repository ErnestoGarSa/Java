public class Account {

    public static void main(String[] args) {


        Account a = new Account();
        a.setAccountNumber(112);
        a.setAccountBalance(0);
        a.setCustomerName("Ernesto");
        a.setEmail("ernesto@email.com");
        a.setPhoneNumber("331143");

        a.deposit(500);
        a.withDraw(250);

        a.withDraw(300);


        Account ernesto= new Account(123,200.50,"Ernesto", "ernesto@email.com","12345");
        System.out.println(ernesto.getAccountBalance());
        System.out.println(ernesto.getEmail());
    }

    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account() {
        this(542, 2.5, "Default Name", "Default address", "Default phone");
        System.out.println("Empty constructor Called");
    }

    public Account(int accountNumber, double accountBalance, String customerName, String email, String phoneNumber) {
        System.out.println("Constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Account(String customerName, String email, String phoneNumber) {
        this(0000, 0.0, customerName, email, phoneNumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double value) {
        this.accountBalance += value;
        System.out.println("Your balance is = " + getAccountBalance());
    }

    public void withDraw(double value) {
        if (value > this.getAccountBalance()) {
            System.out.println("You don´t have enought money your current balance is " + this.getAccountBalance());
        } else {
            setAccountBalance(this.accountBalance - value);
            System.out.println("Your current balance is = " + this.getAccountBalance());
        }
    }
}
