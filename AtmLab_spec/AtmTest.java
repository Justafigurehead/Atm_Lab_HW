import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import AtmLab.*;

public class AtmTest{

  Atm atm;
  User user;

  @Before
  public void before(){
    atm = new Atm(350, "Aberdeen");
    user = new User("Michaela", "Strachan", 20);
  }

// Basic tests for setting up an Atm
  @Test
  public void getReserveOfAtm(){
    assertEquals(350, atm.getReserve());
  }

  @Test
  public void withdrawFromAtm(){
    atm.withdraw(50);
    assertEquals(300, atm.getReserve());
  }


  @Test // note this is a setter method for reserve.
  public void refillReserveOfCashAtAtm(){
    atm.withdraw(350);
    atm.fillUp(350);
    assertEquals(350, atm.getReserve());
  }

// Commented out because this function would be called by the user and I would need to adjust output of function to a boolean value which can be assessed. 
  // @Test
  // public void withdrawOverReserve(){
  //   assertEquals("Sorry, that option is unavailable." , atm.withdraw(200));
  // }

  // Extensions tests...
}