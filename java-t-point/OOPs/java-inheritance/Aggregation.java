// Simple Example of Aggregation
class Operation{
 int square(int n){
  return n*n;
 }
}

class Circle{
 Operation op;  //aggregation
 double pi=3.14;
    
 double area(int radius){
   op=new Operation();
   int rsquare=op.square(radius); //code reusability (i.e. delegates the method call).
   return pi*rsquare;
 }

 public static void main(String args[]){
   Circle c=new Circle();
   double result=c.area(5);
   System.out.println(result);
 }
}




// Understanding meaningful example of Aggregation
// Address.java
public class Address {  
  String city,state,country;  
  
  public Address(String city, String state, String country) {  
      this.city = city;  
      this.state = state;  
      this.country = country;  
    }  
} 

// Emp.java
public class Emp {  
  int id;  
  String name;  
  Address address;  

  public Emp(int id, String name,Address address) {  
      this.id = id;  
      this.name = name;  
      this.address=address;  
  }  

  void display(){  
    System.out.println(id+" "+name);  
    System.out.println(address.city+" "+address.state+" "+address.country);  
  }  

  public static void main(String[] args) {  
    Address address1=new Address("gzb","UP","india");  
    Address address2=new Address("gno","UP","india");  

    Emp e=new Emp(111,"varun",address1);  
    Emp e2=new Emp(112,"arun",address2);  

    e.display();  
    e2.display();  
  }  
}  
