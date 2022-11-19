// In this example, the Printable interface has only one method, and its implementation is provided in the A6 class.
interface printable{
  void print();
}

class A6 implements printable{
  public void print(){
    System.out.println("Hello");
  }
  public static void main(String args[]){
    A6 obj = new A6();
    obj.print();
  }
}



// Java Interface Example: Drawable

//Interface declaration: by first user
interface Drawable{
  void draw();
}

//Implementation: by second user
class Rectangle implements Drawable{
  public void draw(){
    System.out.println("drawing rectangle");
  }
}

class Circle implements Drawable{
  public void draw(){
    System.out.println("drawing circle");
  }
}

//Using interface: by third user
class TestInterface1{
  public static void main(String args[]){
    Drawable d = new Circle();  //In real scenario, object is provided by method e.g. getDrawable()
    d.draw();                   // drawing circle
  }
}



// Java Interface Example: Bank
interface Bank{
  float rateOfInterest();
}

class SBI implements Bank{
  public float rateOfInterest(){
    return 9.15f;
  }
}

class PNB implements Bank{
  public float rateOfInterest(){
    return 9.7f;
  }
}

class TestInterface2{
  public static void main(String[] args){
    Bank b = new SBI();
    System.out.println("ROI: "+b.rateOfInterest());   // ROI: 9.15
  }
}


// Multiple inheritance in Java by interface
interface Printable{
  void print();
}

interface Showable{
  void show();
}

class A7 implements Printable,Showable{
  public void print(){
    System.out.println("Hello");
  }
  public void show(){
    System.out.println("Welcome");
  }
  public static void main(String args[]){
    A7 obj = new A7();
    obj.print();
    obj.show();
  }
}



// Multiple inheritance is not supported through class in java, but it is possible by an interface
interface Printable{
  void print();
}
interface Showable{
  void print();
}

class TestInterface3 implements Printable, Showable{
    public void print(){
      System.out.println("Hello");
    }
    public static void main(String args[]){
      TestInterface3 obj = new TestInterface3();
      obj.print();
    }
}



// Interface Inheritance
interface Printable{
  void print();
}

interface Showable extends Printable{
  void show();
}

class TestInterface4 implements Showable{
  public void print(){
    System.out.println("Hello");
  }
  public void show(){
    System.out.println("Welcome");
  }

  public static void main(String args[]){
    TestInterface4 obj = new TestInterface4();
    obj.print();
    obj.show();
  }
}


// Default method in Interface
interface Drawable{
  void draw();
  default void msg(){
    System.out.println("default method");
  }
}
class Rectangle implements Drawable{
  public void draw(){
    System.out.println("drawing rectangle");
  }
}
class TestInterfaceDefault{
  public static void main(String args[]){
    Drawable d=new Rectangle();
    d.draw();
    d.msg();
  }
}


// Static method in Interface
interface Drawable{
  void draw();
  static int cube(int x){
    return x*x*x;
  }
}
class Rectangle implements Drawable{
  public void draw(){
    System.out.println("drawing rectangle");
  }
}

class TestInterfaceStatic{
  public static void main(String args[]){
    Drawable d=new Rectangle();
    d.draw();                                 // drawing rectangle
    System.out.println(Drawable.cube(3));     // 27
  }
}


