import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import AtmLab.*;

public class AtmTest{

  Atm atm;

  @Before
  public void before(){
    atm = new Atm(350, "Aberdeen");

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


  // @Test // note this is a setter method.
  // public void refillReserveOfCashAtAtm(){
  //   assertEquals(350, atm.fillUp());
  // }

  // Extensions tests...
}