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
   
}
