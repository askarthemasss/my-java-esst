class Calculation{
  void factorial(int n){
    int fact = 1;
    for(int i = 1; i<=n; i++){
      fact *= i;
    }
    System.out.println("Factorial of " + n + " is " + fact);
  }
  
  public static void main(String[] args){
    new Calculation().factorial(5);
  }
}
