package atmJavaBase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        ATMSimulator atmSimulator = context.getBean(ATMSimulator.class);

        atmSimulator.run();


//        ReadFromFile dataSource = new ReadFromFile("customers.txt");
//        Bank bank = new Bank(dataSource);
//        ATM atmNormalConfigWithDB = new ATM(bank);
//        ATMSimulator atmSimulator = new ATMSimulator(atmNormalConfigWithDB);
//        atmSimulator.run();

    }
}
