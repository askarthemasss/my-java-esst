class Account{
  int acc_no;
  String name;
  float amount;
  
  // Initialize Object
  void insert(int ac, String n, float amt){
    acc_no = ac;
    name = n;
    amount = amt;
  }
  
  // Deposit
  void deposit(float amt){
    amount += amt;
    System.out.println("Deposited Amount: " + amt);
  }
  
  // Withdraw
  void withdraw(float amt){
    if(amt > amount){
      System.out.println("Insufficient Balance!");
    } else {
      amount -= amt;
      System.out.println("Withdrawn Amount: " + amt);
      System.out.println("Available Balance: " + amount);
    }
  }
  
  // Check Balance
  void checkBalance(){
    System.out.println("Available Balance: " + amount);
  }
  
  // Account Details
  void displayAccountDetails(){
    System.out.println("Name: " + name + ", Account No: " + acc_no + ", Balance: " + amount );
  }
}
  
  // 
  class TestAccount{
    public static void main(String[] args){
      Account a1 = new Account();
      a1.insert(18148461, "Askar", 75000);
      a1.displayAccountDetails();
      a1.checkBalance();
      a1.deposit(4000);
      a1.checkBalance();
      a1.withdraw(10000);
      a1.checkBalance();
    }
  }
