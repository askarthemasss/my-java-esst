// 1) this: to refer current class instance variable
class Student{  
  int rollno;  
  String name;  
  float fee;  
  Student(int rollno,String name,float fee){  
    this.rollno=rollno;  
    this.name=name;  
    this.fee=fee;  
  }  
  void display(){
    System.out.println(rollno+" "+name+" "+fee);
  }  
}  
  
class TestThis2{  
  public static void main(String args[]){  
    Student s1=new Student(111,"ankit",5000f);  
    Student s2=new Student(112,"sumit",6000f);  
    s1.display();  
    s2.display();  
  }
}  


// 2) this: to invoke current class method
class A{  
  void m(){
    System.out.println("hello m");
  }  
  void n(){  
    System.out.println("hello n");  
    //m();//same as this.m()  
    this.m();  
  }
}  
class TestThis4{  
  public static void main(String args[]){  
    A a=new A();  
    a.n();  
  }
}  


// 3) this() : to invoke current class constructor
// Calling default constructor from parameterized constructor:
class A{  
  A(){
    System.out.println("hello a");
  }  
  A(int x){  
    this();  
    System.out.println(x);  
  }  
}  
class TestThis5{  
  public static void main(String args[]){  
    A a=new A(10);  
  }
}  

// Calling parameterized constructor from default constructor:
class A{  
  A(){  
    this(5);  
    System.out.println("hello a");  
  }  
  A(int x){  
    System.out.println(x);  
  }  
}  
class TestThis6{  
  public static void main(String args[]){  
    A a=new A();  
  }
}  

