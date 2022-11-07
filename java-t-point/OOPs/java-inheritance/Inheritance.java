// Single Inheritance
class Employee{  
 float salary=40000;  
}  

class Programmer extends Employee{  
 int bonus=10000;  
 public static void main(String args[]){  
   Programmer p=new Programmer();  
   System.out.println("Programmer salary is:"+p.salary);  
   System.out.println("Bonus of Programmer is:"+p.bonus);  
  }  
}  



// Multilevel Inheritance
class Animal{  
  void eat(){
    System.out.println("eating...");
  }  
}  
class Dog extends Animal{  
  void bark(){
    System.out.println("barking...");
  }  
}  
class BabyDog extends Dog{  
  void weep(){
    System.out.println("weeping...");
  }  
}  
class TestInheritance2{  
  public static void main(String args[]){  
    BabyDog d=new BabyDog();  
    d.weep();  
    d.bark();  
    d.eat();  
  }
}  



// Hierarchical Inheritance
class Animal{  
  void eat(){
    System.out.println("eating...");
  }  
}  
class Dog extends Animal{  
  void bark(){
    System.out.println("barking...");
  }  
}  
class Cat extends Animal{  
  void meow(){
    System.out.println("meowing...");
  }  
}  
class TestInheritance3{  
  public static void main(String args[]){  
    Cat c=new Cat();  
    c.meow();  
    c.eat();  
    //c.bark();//C.T.Error  
  }
}  
