// contd. - 3) this() : to invoke current class constructor
// The this() constructor call should be used to reuse the constructor from the constructor.
class Student{
  int rollno;
  String name, course;
  float fee;
  
  Student(int rollno, String name, String course){
    this.rollno = rollno;
    this.name = name;
    this.course = course;
  }
  
  Student(int rollno, String name, String course, float fee){
    this(rollno, name, course);     //reusing constructor  
    this.fee = fee;    
  }
  
  void display(){
    System.out.println(rollno+" "+name+" "+course+" "+fee);
  }
}

class TestThis7{
  public static void main(String[] args){
    Student s1=new Student(111,"ankit","java");
    Student s2=new Student(112,"sumit","java",6000f);
    s1.display();     // 111 ankit java 0.0
    s2.display();     // 112 sumit java 6000.0
  }
}


// 4) this: to pass as an argument in the method
class S2{  
  void m(S2 obj){  
      System.out.println("method is invoked");  
  }  
  void p(){  
      m(this);  
  }  
  public static void main(String args[]){  
    S2 s1 = new S2();  
    s1.p();  
  }  
}  


// 5) this: to pass as argument in the constructor call
class B{  
  A4 obj;  
  B(A4 obj){  
    this.obj=obj;  
  }  
  void display(){  
    System.out.println(obj.data);//using data member of A4 class  
  }  
}  
  
class A4{  
  int data=10;  
  A4(){  
   B b=new B(this);  
   b.display();  
  }  
  public static void main(String args[]){  
   A4 a=new A4();  
  }  
}  


// 6) this keyword can be used to return current class instance
class A{  
  // return_type -> class name itself
  A getA(){  
    return this;  
  }  
  void msg(){
    System.out.println("Hello java");
  }  
}  

class Test1{  
  public static void main(String args[]){  
    new A().getA().msg();
    // same as - new A().msg()
  }  
}  
