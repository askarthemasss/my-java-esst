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
    s1.display();
    s2.display();
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
