package Banking_java;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
//@Qualifier("UPI")
public class UPI_Withdrawal implements Withdrawal {
    public void withdraw(){
        System.out.println("Withdrawal Successfull by UPI");
    }
}
