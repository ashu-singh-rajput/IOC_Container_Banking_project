package Banking_java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class Bank {
     Withdrawal withdrawal;
     Deposit deposit;

     public Bank(@Qualifier("With") Withdrawal withdrawal ){
         this.withdrawal=withdrawal;

     }

     @Autowired
     public void setDeposit( Deposit deposit){
         this.deposit=deposit;
     }




     public void bankComming(){
         System.out.println("Thanks for coming my bank");

         System.out.println("You Deposit some maony");
         deposit.depositAmount();
         System.out.println("Can you Withdrawa some money");
         withdrawal.withdraw();
         System.out.println("Always welcome my bank😊");

     }


}
