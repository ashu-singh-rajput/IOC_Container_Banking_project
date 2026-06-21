package Withdrawal;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Cash_Withdrawal implements Withdrawal{
    public void withdraw(){
        System.out.println("Withdrawal Successfull by Cash");
    }
}
