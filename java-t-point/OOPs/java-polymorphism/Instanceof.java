// example of java instanceof operator
class Animal{}
class Dog1 extends Animal{//Dog inherits Animal
   public static void main(String args[]){
     Dog1 d=new Dog1();
     System.out.println(d instanceof Animal);     //true
     System.out.println(d instanceof Dog1);       //true
   }
}


// instanceof in java with a variable that have null value
class Dog2{
   public static void main(String args[]){
      Dog2 d = null;
      System.out.println(d instanceof Dog2);    //false
   }
}


// Possibility of downcasting with instanceof
class Animal { }

class Dog3 extends Animal {
  static void method(Animal a) {
    if(a instanceof Dog3){
       Dog3 d=(Dog3)a;//downcasting
       System.out.println("ok downcasting performed");
    }
  }
 
  public static void main (String [] args) {
    Animal a=new Dog3();
    Dog3.method(a);
  }
}



// Understanding Real use of instanceof in java
