import junit.framework.TestCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CoffeeTest extends TestCase {
  
    CoffeeMachine coffeeMachine = new CoffeeMachine();
    @Test
    public void noCoffeeCups(){
      coffeeMachine.coffeeCups=0;
      assertEquals(coffeeMachine.despence(),"no cups");
    }
    @Test
    public void CoffeeCupsAvailable(){
      coffeeMachine.coffeeCups=10;
      assertEquals(coffeeMachine.despence(),"making coffee");
      assertEquals(coffeeMachine.coffeeCups,9);
    }
}