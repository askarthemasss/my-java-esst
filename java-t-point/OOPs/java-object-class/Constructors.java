// Java Program to create and call a default constructor - no-args

class Bike1{  
  //creating a default constructor  
  Bike1(){
    System.out.println("Bike is created");
  }  
  //main method  
  public static void main(String args[]){  
    //calling a default constructor  
    Bike1 b=new Bike1();  
  }  
}


//Java Program to demonstrate the use of the parameterized constructor.  
class Student4{  
    int id;  
    String name;  
    //creating a parameterized constructor  
    Student4(int i,String n){  
      id = i;  
      name = n;  
    }  
    //method to display the values  
    void display(){
      System.out.println(id+" "+name);
    }  
   
    public static void main(String args[]){  
      //creating objects and passing values  
      Student4 s1 = new Student4(111,"Karan");  
      Student4 s2 = new Student4(222,"Aryan");  
      //calling method to display the values of object  
      s1.display();  
      s2.display();  
   }  
}  


// Java program to overload constructors  
class Student5{  
    int id;  
    String name;  
    int age;  
    //creating two arg constructor  
    Student5(int i,String n){  
      id = i;  
      name = n;  
    }  
    //creating three arg constructor  
    Student5(int i,String n,int a){  
      id = i;  
      name = n;  
      age=a;  
    }  
    void display(){
      System.out.println(id+" "+name+" "+age);
    }  
   
    public static void main(String args[]){  
      Student5 s1 = new Student5(111,"Karan");  
      Student5 s2 = new Student5(222,"Aryan",25);  
      s1.display();                                   // 111 Karan 0
      s2.display();                                   // 222 Aryan 25
   }  
}  
