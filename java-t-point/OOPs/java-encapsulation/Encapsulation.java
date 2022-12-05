// Simple Example of Encapsulation in Java

// Let's see the simple example of encapsulation that has only one field with its setter and getter methods.
// File: Student.java

// A Java class which is a fully encapsulated class.  
// It has a private data member and getter and setter methods.  
package com.javatpoint;  
public class Student{  
  // private data member  
  private String name;  
  // getter method for name  
  public String getName(){  
    return name;  
  }  
  //setter method for name  
  public void setName(String name){  
    this.name=name  
  }  
}  



// A Java class to test the encapsulated class.  
package com.javatpoint;  
class Test{  
  public static void main(String[] args){  
    // creating instance of the encapsulated class  
    Student s = new Student();  
    // setting value in the name member  
    s.setName("vijay");  
    // getting value of the name member  
    System.out.println(s.getName());  
  }  
}  



