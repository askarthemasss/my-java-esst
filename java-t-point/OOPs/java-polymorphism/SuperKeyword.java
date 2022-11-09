// 1) super is used to refer immediate parent class instance variable.
class Animal{  
  String color="white";  
}  

class Dog extends Animal{  
  String color="black";  
  void printColor(){  
    System.out.println(color);        // black
    System.out.println(super.color);  // white
  }  
}  

class TestSuper1{  
  public static void main(String args[]){  
    Dog d=new Dog();  
    d.printColor();  
  }
}  



// 2) super can be used to invoke parent class method
class Animal{  
  void eat(){
    System.out.println("eating...");
  }  
}  

class Dog extends Animal{  
    void eat(){
      System.out.println("eating bread...");
    }  
    void bark(){
      System.out.println("barking...");
    }  
    void work(){  
      super.eat();  
      bark();  
    }  
}  

class TestSuper2{  
  public static void main(String args[]){  
    Dog d=new Dog();  
    d.work();  
  }
}  



// 3) super is used to invoke parent class constructor.
class Animal{  
  Animal(){
    System.out.println("animal is created");
  }  
}  

class Dog extends Animal{  
  Dog(){  
    super();  // super() is added in each class constructor automatically by compiler if there is no super() or this().
    System.out.println("dog is created");  
  }  
}  

class TestSuper3{  
  public static void main(String args[]){  
    Dog d=new Dog();  
  }
}  



//super example: real use
class Person{  
  int id;  
  String name;  
  Person(int id,String name){  
    this.id=id;  
    this.name=name;  
  }  
}  
class Emp extends Person{  
  float salary;  
  Emp(int id,String name,float salary){  
    super(id,name);//reusing parent constructor  
    this.salary=salary;  
  }  
  void display(){
    System.out.println(id+" "+name+" "+salary);
  }  
}  
class TestSuper5{  
  public static void main(String[] args){  
    Emp e1=new Emp(1,"ankit",45000f);  
    e1.display();  
  }
}  

