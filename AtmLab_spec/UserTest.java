import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import AtmLab.*;

public class UserTest{

  @Before
  public void before(){

  }

  // Basic MVP methods for user

  @Test
  public void getMoneyInUserWallet(){
    assertEquals(20, user.getWalletTotal());
  }

  @Test 
  public void withdrawMoneyFromATMAndAddToWallet(){
    user.withdraw(30);
    assertEquals(30, user.getWalletTotal());
  }

  @Test 
  public void getUserName(){

  }

  @Test
  public void userTriesToWithdrawMoreThanReserveMaxLimit(){
    
  }

  @Test 
  public void userTriesToWithdrawMoreThanWhatsLeft(){

  }
}