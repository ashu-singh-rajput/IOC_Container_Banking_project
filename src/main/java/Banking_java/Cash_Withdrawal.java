package Banking_java;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component

public class Cash_Withdrawal implements Withdrawal {
    public void withdraw(){
        System.out.println("Withdrawal Successfull by Cash");
    }
}
