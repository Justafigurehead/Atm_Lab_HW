package AtmLab;

public class Atm{

  private int reserve;
  private String location;

  public Atm(int reserve, String location){
    this.reserve = reserve;
    this.location = location;
  }

  //  Methods!

  public int getReserve(){
    return this.reserve;
  }

  public boolean withdraw(int requestedAmount){
    if (requestedAmount > this.reserve){
      return false;
     }
    this.reserve -= requestedAmount;
    return true;
  }


  public void fillUp(int value){
    this.reserve += value;
  }
}