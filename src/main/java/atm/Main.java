package atm;

public class Main {
    public static void main(String[] args) {
        DataSource dataSource = new DataSource("customers.txt");
        Bank bank = new Bank(dataSource);
        ATM atm = new ATM(bank);
        ATMSimulator atmSimulator = new ATMSimulator(atm);
        atmSimulator.run();
    }
}
