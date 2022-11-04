//Java Program to demonstrate the use of static variable  
class Student{  
   int rollno;//instance variable  
   String name;  
   static String college ="ITS";//static variable  
   //constructor  
   Student(int r, String n){  
     rollno = r;  
     name = n;  
   }  
   //method to display the values  
   void display (){
     System.out.println(rollno+" "+name+" "+college);
   }  
}  
//Test class to show the values of objects  
public class TestStaticVariable1{  
 public static void main(String args[]){  
   Student s1 = new Student(111,"Karan");  
   Student s2 = new Student(222,"Aryan");  
   //we can change the college of all objects by the single line of code  
   //Student.college="BBDIT";  
   s1.display();  // 111 Karan ITS
   s2.display();  // 222 Aryan ITS
 }  
}  





//Java Program to demonstrate the use of an instance variable  
//which get memory each time when we create an object of the class.  

class Counter{  
  int count=0;  //will get memory each time when the instance is created  

  Counter(){  
    count++;    //incrementing value  
    System.out.println(count);  
  }  

  public static void main(String args[]){  
    //Creating objects  
    Counter c1=new Counter();  // 1
    Counter c2=new Counter();  // 1
    Counter c3=new Counter();  // 1
  }  
}  





//Java Program to illustrate the use of static variable which  
//is shared with all objects.  
class Counter2{  
  static int count=0;//will get memory only once and retain its value  

  Counter2(){  
    count++;//incrementing the value of static variable  
    System.out.println(count);  
  }  

  public static void main(String args[]){  
    //creating objects  
    Counter2 c1=new Counter2();  // 1
    Counter2 c2=new Counter2();  // 2
    Counter2 c3=new Counter2();  // 3
  }  
}  

