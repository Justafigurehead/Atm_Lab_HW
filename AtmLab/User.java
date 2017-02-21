package AtmLab;

public class User{

  private int wallet;
  private String firstName;
  private String surname;

  public User(String firstName, String surname, int wallet){
    this.firstName = firstName;
    this.surname = surname;
    this.wallet = wallet;
  }

  public int getWalletTotal(){
    return this.wallet;
  }

  public String getFullName(){
    return firstName + " " +surname;
  }

  public void addToWallet(int denomination){
    this.wallet += denomination;
  }


  public boolean checkCanWithdraw(int denomination, Atm atm){
    if(denomination < 250 && atm.withdraw(denomination)){
      return true;
    }
      return false;
  }

  public String withdraw(int denomination, Atm atm){
    boolean result = this.checkCanWithdraw(denomination, atm);
    if (result == true){
      this.addToWallet(denomination);
      return "Thank you for using our service.";
    }
    return "This service is currently unavailable.";
  }
}