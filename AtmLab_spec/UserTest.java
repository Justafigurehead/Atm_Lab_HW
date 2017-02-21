import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import AtmLab.*;

public class UserTest{

  User user;
  User john;
  Atm atm;

  @Before
  public void before(){
    user = new User("Michaela", "Strachan", 20);
    atm = new Atm(350, "Glasgow");
    john = new User ("John", "Doe", 0);
  }

  // Basic MVP methods for user

  @Test
  public void getMoneyInUserWallet(){
    assertEquals(20, user.getWalletTotal());
  }

  @Test 
  public void getUserName(){
    assertEquals("Michaela Strachan", user.getFullName());
  }

  @Test 
  public void changeWalletBalance(){
    user.addToWallet(10);
    assertEquals(30,user.getWalletTotal());
  }


  @Test 
  public void withdrawMoneyFromATMAndAddToWallet(){
    user.withdraw(30, atm);
    assertEquals(50, user.getWalletTotal());
    assertEquals(320, atm.getReserve());
  }

  @Test
  public void userTriesToWithdrawMoreThanReserveMaxLimit(){
    assertEquals("This service is currently unavailable.", user.withdraw(400, atm));
  }

  @Test 
  public void userTriesToWithdrawMoreThanWhatsLeftInReserve(){
    assertEquals("This service is currently unavailable.", user.withdraw(360, atm));
  }
}