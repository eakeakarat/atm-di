package atmJDBC_mySQL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configJDBC.xml");
        ATMSimulator atmSimulator = context.getBean("ATMSimulator", ATMSimulator.class);

        atmSimulator.run();


//        ReadFromFile dataSource = new ReadFromFile("customers.txt");
//        Bank bank = new Bank(dataSource);
//        ATM atmNormalConfigWithDB = new ATM(bank);
//        ATMSimulator atmSimulator = new ATMSimulator(atmNormalConfigWithDB);



//        atmSimulator.run();

    }
}
