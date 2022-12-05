// Example of package that import the packagename.*

//save by A.java  
package pack;  
public class A{  
  public void msg(){System.out.println("Hello");}  
}  

//save by B.java  
package mypack;  
import pack.*;  

class B{  
  public static void main(String args[]){  
   A obj = new A();  
   obj.msg();  
  }  
}  



// Example of package by import package.classname
//save by A.java  

package pack;  
public class A{  
  public void msg(){System.out.println("Hello");}  
}  

//save by B.java  
package mypack;  
import pack.A;  

class B{  
  public static void main(String args[]){  
   A obj = new A();  
   obj.msg();  
  }  
}  



// Example of package by import fully qualified name
//save by A.java  
package pack;  
public class A{  
  public void msg(){System.out.println("Hello");}  
}  

//save by B.java  
package mypack;  
class B{  
  public static void main(String args[]){  
   pack.A obj = new pack.A();     //using fully qualified name  
   obj.msg();  
  }  
}  



