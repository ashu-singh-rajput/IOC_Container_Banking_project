package Banking_java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Bank_Config.class);

//        Withdrawal withdrawal =  context.getBean(Cash_Withdrawal.class);
//        withdrawal.withdraw();

        Bank bank = context.getBean(Bank.class);
        bank.bankComming();

    }
}