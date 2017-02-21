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

  public void withdraw(int requestedAmount){
    this.reserve -= requestedAmount;
  }
}