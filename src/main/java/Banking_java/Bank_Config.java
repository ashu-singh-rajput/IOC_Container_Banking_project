package Banking_java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("Banking_java")
public class Bank_Config {

    @Bean
    public Deposit createDeposit(){
        return new Deposit();
    }

    @Bean
    public Withdrawal createWithdrawal(){
        return new Cash_Withdrawal();
    }
    @Bean
    public  Bank createBank(){
        Bank bank = new Bank(createWithdrawal());
        bank.setDeposit(createDeposit());
        return bank;
    }

}
