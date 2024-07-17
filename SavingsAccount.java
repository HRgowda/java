public class SavingsAccount {
  
  int balance;
  
  public SavingsAccount(int initialBalance){
    balance = initialBalance;
  }
  public void checkBalance(){
    System.out.println("Hello!");
    System.out.println("Your balance is "+balance);
  }
  public void deposit(int amountToDeposit){
    int newBalance=balance+amountToDeposit;
    balance=newBalance;
    System.out.println("You just deposited "+amountToDeposit);
  }
  public int withdraw(int amountToWithdraw){
    int newBalance1=balance-amountToWithdraw;
    balance=newBalance1;
    System.out.println("You just withdrew "+amountToWithdraw);
    return amountToWithdraw;
  }
  public String toString(){
    return "The available balance is "+balance;
  }
  public static void main(String[] args){
    SavingsAccount savings = new SavingsAccount(2000);
    savings.deposit(5000);
    System.out.println(savings.toString());
    System.out.println();
    savings.withdraw(2095);
    System.out.println(savings.toString());
    savings.checkBalance();
     
  }
  
}
