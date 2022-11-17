// Example of Abstract class that has an abstract method
abstract class Bike{
  abstract void run();
}

class Honda extends Bike{
  void run(){
    System.out.println("Running Safely...");
  }
  public static void main(String[] args){
    Honda H = new Honda();
    H.run();      // Running Safely...
  }
}



// Understanding the real scenario of Abstract class
abstract class Shape{
  abstract void draw();
}
//In real scenario, implementation is provided by others i.e. unknown by end user
class Rectangle extends Shape{
  void draw(){
    System.out.println("drawing rectangle");
  }
}
class Circle1 extends Shape{
  void draw(){
    System.out.println("drawing circle");
  }
}
//In real scenario, method is called by programmer or user
class TestAbstraction1{
  public static void main(String args[]){
    Shape s = new Circle1();  //In a real scenario, object is provided through method, e.g., getShape() method
    s.draw();
  }
}



// Another example of Abstract class in java
abstract class Bank{
  abstract int getRateOfInterest();
}

class SBI extends Bank{
  int getRateOfInterest(){
    return 7;
  }
}

class PNB extends Bank{
  int getRateOfInterest(){
    return 7;
  }
}

class TestBank{
  public static void main(String args[]){
    Bank b = new SBI(); //if object is PNB, method of PNB will be invoked
    int interest = b.getRateOfInterest();
    System.out.println("Rate of Interest is: "+interest+" %");
  }
}
