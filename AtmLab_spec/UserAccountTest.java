import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import AtmLab.*;

public class UserAccountTest{

  UserAccount userAccount;

  @Before
  public void before(){
    userAccount = new UserAccount(1234, 1000);
  }

  @Test
  public void getBalance(){
    assertEquals(1000, userAccount.getBalance());
  }

  @Test
  public void setBalance(){
    userAccount.setBalance(-50);
    assertEquals(950,userAccount.getBalance() );
  }

  @Test
  public void getPin(){
    int pin = 1234;
    assertEquals(true, userAccount.getPin(pin));
  }

  @Test
  public void hidePin(){
    int pin = 1234;
    assertEquals("****", userAccount.hidePin(pin));
  }
}