// 1) Method Overloading: changing no. of arguments
class Adder{  
  static int add(int a,int b){return a+b;}  
  static int add(int a,int b,int c){return a+b+c;}  
}

class TestOverloading1{  
  public static void main(String[] args){  
    System.out.println(Adder.add(11,11));       // 22
    System.out.println(Adder.add(11,11,11));    // 33
  } 
}



// 2) Method Overloading: changing data type of arguments
class Adder{  
  static int add(int a, int b){return a+b;}  
  static double add(double a, double b){return a+b;}  
}  

class TestOverloading2{  
  public static void main(String[] args){  
    System.out.println(Adder.add(11,11));       // 22
    System.out.println(Adder.add(12.3,12.6));   // 24.9
  }
}
