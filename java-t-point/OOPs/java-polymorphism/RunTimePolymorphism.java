// Example of Java Runtime Polymorphism
class Bike{
   void run(){System.out.println("running");}
 }
 class Splender extends Bike{
   void run(){System.out.println("running safely with 60km");}
 
   public static void main(String args[]){
     Bike b = new Splender();//upcasting
     b.run();       // running safely with 60km
   }
 }


// Bank - This example is also given in method overriding but there was no upcasting.
class Bank{
   float getRateOfInterest(){
      return 0;
   }
}

class SBI extends Bank{
   float getRateOfInterest(){
      return 8.4f;
   }
}

class ICICI extends Bank{
   float getRateOfInterest(){
      return 7.3f;
   }
}

class AXIS extends Bank{
   float getRateOfInterest(){
      return 9.7f;
   }
}

class TestPolymorphism{
   public static void main(String[] args){
      Bank b;
      b=new SBI();
      System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());
      b=new ICICI();
      System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());
      b=new AXIS();
      System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());
   }
}
/*
SBI Rate of Interest: 8.4
ICICI Rate of Interest: 7.3
AXIS Rate of Interest: 9.7
*/



// Java Runtime Polymorphism Example: Shape
class Shape{
   void draw(){
      System.out.println("drawing...");
   }
}
class Rectangle extends Shape{
   void draw(){
      System.out.println("drawing rectangle...");
   }
}
class Circle extends Shape{
   void draw(){
      System.out.println("drawing circle...");
   }
}
class Triangle extends Shape{
   void draw(){
      System.out.println("drawing triangle...");
   }
}
class TestPolymorphism2{
   public static void main(String args[]){
      Shape s;
      s=new Rectangle();
      s.draw();
      s=new Circle();
      s.draw();
      s=new Triangle();
      s.draw();
   }
}
/*
drawing rectangle...
drawing circle...
drawing triangle...
*/



// Java Runtime Polymorphism Example: Animal
class Animal{
   void eat(){
      System.out.println("eating...");
   }
}
class Dog extends Animal{
   void eat(){
      System.out.println("eating bread...");
   }
}
class Cat extends Animal{
   void eat(){
      System.out.println("eating rat...");
   }
}
class Lion extends Animal{
   void eat(){
      System.out.println("eating meat...");
   }
}
class TestPolymorphism3{
   public static void main(String[] args){
      Animal a;
      a=new Dog();
      a.eat();
      a=new Cat();
      a.eat();
      a=new Lion();
      a.eat();
   }
}



// Runtime polymorphism can't be achieved by data members.
class Bike{
 int speedlimit=90;
}
class Honda3 extends Bike{
 int speedlimit=150;

 public static void main(String args[]){
  Bike obj=new Honda3();
  System.out.println(obj.speedlimit);  //90
 }
}


// Java Runtime Polymorphism with Multilevel Inheritance
class Animal{
   void eat(){
      System.out.println("eating");
   }
}
class Dog extends Animal{
   void eat(){
      System.out.println("eating fruits");
   }
}
class BabyDog extends Dog{
   void eat(){
      System.out.println("drinking milk");
   }
   public static void main(String args[]){
      Animal a1,a2,a3;
      a1=new Animal();
      a2=new Dog();
      a3=new BabyDog();
      a1.eat();         // eating
      a2.eat();         // eating fruits
      a3.eat();         // drinking milk
   }
}


// 
class Animal{
   void eat(){
      System.out.println("animal is eating...");
   }
}
class Dog extends Animal{
   void eat(){
      System.out.println("dog is eating...");
   }
}
class BabyDog1 extends Dog{
   public static void main(String args[]){
      Animal a=new BabyDog1();
      a.eat();          // dog is eating...
   }
}
