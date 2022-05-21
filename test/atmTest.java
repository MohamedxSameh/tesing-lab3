import junit.framework.TestCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ATMTest extends TestCase {
  
    ATM atmMachine = new ATM();
    @Test
    public void withdraw100From500BalanceAnd1000AtmCash(){
      atmMachine.withdraw(100);
      assertEquals(atmMachine.atmCash,900);
      assertEquals(atmMachine.balance,400);
    }
    @Test
    public void withdraw800From500BalanceAnd1000AtmCash(){
      atmMachine.withdraw(800);
      assertEquals(atmMachine.atmCash,1000);
      assertEquals(atmMachine.balance,500);
    }
    @Test
    public void withdraw2000From500BalanceAnd1000AtmCash(){
      atmMachine.withdraw(2000);
      assertEquals(atmMachine.atmCash,1000);
      assertEquals(atmMachine.balance,500);
    }
    public void deposit200From500BalanceAnd1000AtmCash(){
      atmMachine.deposit(200);
      assertEquals(atmMachine.atmCash,1200);
      assertEquals(atmMachine.balance,700);
    }

}