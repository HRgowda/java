public class CheckingAccount{
  private String name;
  private int balance;
  private String id;

  public CheckingAccount(String inputName, int inputBalance, String inputId){
    name = inputName;
    balance = inputBalance;
    id = inputId;
  }
  public int getBalance(){
    return balance;
  }
 
  //Write new methods here:
   public void setBalance(int newBalance){
    balance=newBalance;
   
  }
}