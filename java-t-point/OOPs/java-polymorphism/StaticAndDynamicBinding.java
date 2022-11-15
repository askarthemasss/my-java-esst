// Example of static binding

class Dog{
 private void eat(){
  System.out.println("dog is eating...");
 }
  
 public static void main(String args[]){
  Dog d1=new Dog();
  d1.eat();
 }
}

// Example of dynamic binding
class Animal{
 void eat(){
  System.out.println("animal is eating...");
 }
}

class Dog extends Animal{
 void eat(){
  System.out.println("dog is eating...");
 }

 public static void main(String args[]){
  Animal a=new Dog();
  a.eat();        // dog is eating...
 }
}
/*
In the above example object type cannot be determined by the compiler,
because the instance of Dog is also an instance of Animal.So compiler doesn't know its type, only its base type.
*/
