//Java Program to illustrate the use of Java Method Overriding  
//Creating a parent class.  
class Vehicle{  
  //defining a method  
  void run(){
    System.out.println("Vehicle is running");
  }  
}  

//Creating a child class  
class Bike2 extends Vehicle{  
    //defining the same method as in the parent class  
    void run(){
      System.out.println("Bike is running safely");
    }  
    public static void main(String args[]){  
      Bike2 obj = new Bike2();  //creating object  
      obj.run();  //calling method  
    }  
}  



//Java Program to demonstrate the real scenario of Java Method Overriding  
//where three classes are overriding the method of a parent class.  
//Creating a parent class.  
class Bank{  
  int getRateOfInterest(){return 0;}  
}  
//Creating child classes.  
class SBI extends Bank{  
  int getRateOfInterest(){return 8;}  
}  
  
class ICICI extends Bank{  
  int getRateOfInterest(){return 7;}  
}  
class AXIS extends Bank{  
  int getRateOfInterest(){return 9;}  
}  
//Test class to create objects and call the methods  
class Test2{  
  public static void main(String args[]){  
    SBI s=new SBI();  
    ICICI i=new ICICI();  
    AXIS a=new AXIS();  
    System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());     // SBI Rate of Interest: 8
    System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());   // ICICI Rate of Interest: 7
    System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());    // AXIS Rate of Interest: 9
  }  
}  
