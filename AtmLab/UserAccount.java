package AtmLab;

public class UserAccount{

  private int pin;
  private int balance;

  public UserAccount(int pin, int balance ){
    this.pin = pin;
    this.balance = balance;
  }

  public boolean getPin(int value){
    if (this.pin == value){
      return true;
    }
    return false;
  }
  
  public int getBalance(){
    return this.balance;
  }

  public void setBalance(int value){
    this.balance += value;
  }

  public String hidePin(){
    
  }
}