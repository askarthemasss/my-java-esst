// Example of Abstract class that has an abstract method
abstract class Bike{
  abstract void run();
}

class Honda extends Bike{
  void run(){
    System.out.println("Running Safely...");
  }
  public static void main(String[] args){
    Bike B = new Honda();
    B.run();      // Running Safely...
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



// Abstract class having constructor, data member and methods
//example of abstract class that have method body
 abstract class Bike{
   Bike(){
     System.out.println("bike is created");
   }
   abstract void run();
   void changeGear(){
     System.out.println("gear changed");
   }
 }

 class Honda extends Bike{
   void run(){
     System.out.println("running safely..");
   }
 }
 class TestAbstraction2{
   public static void main(String args[]){
    Bike obj = new Honda();
    obj.run();
    obj.changeGear();
   }
}
/*
       bike is created
       running safely..
       gear changed
*/



// The abstract class can also be used to provide some implementation of the interface.
interface A{
  void a();
  void b();
  void c();
  void d();
}

abstract class B implements A{
  public void c(){System.out.println("I am C");}
}

class M extends B{
  public void a(){System.out.println("I am a");}
  public void b(){System.out.println("I am b");}
  public void d(){System.out.println("I am d");}
}

class Test5{
  public static void main(String args[]){
    A a=new M();
    a.a();
    a.b();
    a.c();
    a.d();
  }
}
/*
Output:I am a
       I am b
       I am C
       I am d
*/
