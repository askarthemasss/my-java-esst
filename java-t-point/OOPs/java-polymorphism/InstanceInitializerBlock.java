// Example of instance initializer block
class Bike7{  
    int speed;  
      
    Bike7(){
      System.out.println("speed is "+speed);
    }  
   
    // can perform some (complex) operations (like a for loop to fill a complex array or error handling etc) while assigning value to instance data member
    {speed=100;}  
       
    public static void main(String args[]){  
      Bike7 b1=new Bike7();  // speed is 100
      Bike7 b2=new Bike7();  // speed is 100
    }      
}  


// Program of instance initializer block that is invoked after super()
class A{  
  A(){  
    System.out.println("parent class constructor invoked");  
  }  
}  
class B2 extends A{  
  B2(){  
    super();  
    System.out.println("child class constructor invoked");  
  }  

  {System.out.println("instance initializer block is invoked");}  

  public static void main(String args[]){  
    B2 b=new B2();  
  }  
}  

/*
Output:   parent class constructor invoked
          instance initializer block is invoked
          child class constructor invoked
*/



// Another example of instance block
class A{  
  A(){  
    System.out.println("parent class constructor invoked");  
  }  
}  
  
class B3 extends A{  
  B3(){  
    super();  
    System.out.println("child class constructor invoked");  
  }  

  B3(int a){  
    super();  
    System.out.println("child class constructor invoked "+a);  
  }  

  {System.out.println("instance initializer block is invoked");}  

  public static void main(String args[]){  
    B3 b1=new B3();  
    B3 b2=new B3(10);  
  }  
}  

/*
       parent class constructor invoked
       instance initializer block is invoked
       child class constructor invoked
       parent class constructor invoked
       instance initializer block is invoked
       child class constructor invoked 10
*/
