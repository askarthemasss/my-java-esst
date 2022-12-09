/*

* Java ArrayList class can contain duplicate elements.
* Java ArrayList class maintains insertion order.
* Java ArrayList class is non synchronized.
* Java ArrayList allows random access because the array works on an index basis.
* In ArrayList, manipulation is a little bit slower than the LinkedList in Java because a lot of shifting needs to occur
  if any element is removed from the array list.
* We can not create an array list of the primitive types, such as int, float, char, etc. It is required to use the required wrapper class in such cases.
* Java ArrayList gets initialized by the size. The size is dynamic in the array list,
  which varies according to the elements getting added or removed from the list.  
  
  // ============ Methods ==============
  add(int index, E element), add(E e), addAll(Collection<? extends E> c), addAll(int index, Collection<? extends E> c), clear()
  get(int index), isEmpty(), indexOf(Object o), remove(Object o), set(int index, E element), size()
  
  Collections.sort(list);
  
*/


// ArrayListExample1.java
import java.util.*;
 public class ArrayListExample1{
   public static void main(String args[]){
        ArrayList<String> list = new ArrayList<String>();//Creating arraylist
        list.add("Mango");//Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        //Printing the arraylist object
        System.out.println(list);
   }
}


// ArrayListExample2.java
import java.util.*;  
public class ArrayListExample2{  
     public static void main(String args[]){  
          ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
         
          list.add("Mango");                    //Adding object in arraylist    
          list.add("Apple");    
          list.add("Banana");    
          list.add("Grapes");    
         
          //Traversing list through Iterator  
          Iterator itr=list.iterator();         //getting the Iterator  
          while(itr.hasNext()){                 //check if iterator has the elements  
           System.out.println(itr.next());      //printing the element and move to next  
          }  
     }  
}  


// ArrayListExample3.java
import java.util.*;  
public class ArrayListExample3{  
 public static void main(String args[]){  
  ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
     
  list.add("Mango");//Adding object in arraylist    
  list.add("Apple");    
  list.add("Banana");    
  list.add("Grapes");    
     
  //Traversing list through for-each loop  
  for(String fruit:list)    
    System.out.println(fruit);
 }  
}  


// SortArrayList.java
import java.util.*;  

class SortArrayList{  
 public static void main(String args[]){  
  
  // Creating a list of fruits  
  List<String> list1 = new ArrayList<String>();  
  list1.add("Mango");  
  list1.add("Apple");  
  list1.add("Banana");  
  list1.add("Grapes");  
  
  // Sorting the list  
  Collections.sort(list1);
  
   // Traversing list through the for-each loop  
  for(String fruit:list1)  
    System.out.println(fruit);  
      
 System.out.println("Sorting numbers...");  
  
  // Creating a list of numbers  
  List<Integer> list2=new ArrayList<Integer>();  
  list2.add(21);  
  list2.add(11);  
  list2.add(51);  
  list2.add(1);  
  
  // Sorting the list  
  Collections.sort(list2);  
  
   // Traversing list through the for-each loop  
  for(Integer number:list2)  
    System.out.println(number);  
  
 }  
   
}  
/* 
==== Output =====
Apple
Banana
Grapes
Mango
Sorting numbers...
1
11
21
51
*/

// ArrayList4.java
import java.util.*;  

class ArrayList4{  
 public static void main(String args[]){  
  
    ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
    list.add("Ravi");//Adding object in arraylist  
    list.add("Vijay");  
    list.add("Ravi");  
    list.add("Ajay");  

  
    System.out.println("Traversing list through List Iterator:");  
    //Here, element iterates in reverse order  
    ListIterator<String> list1 = list.listIterator(list.size());  

    while(list1.hasPrevious())  
    {  
        String str=list1.previous();  
        System.out.println(str);  
    }  
  
  
    System.out.println("Traversing list through for loop:");  
    for(int i=0;i<list.size();i++)  
    {  
     System.out.println(list.get(i));     
    }  

  
    System.out.println("Traversing list through forEach() method:");  
    //The forEach() method is a new feature, introduced in Java 8.  
    list.forEach(a->{ //Here, we are using lambda expression  
      System.out.println(a);  
    });  

  
    System.out.println("Traversing list through forEachRemaining() method:");  
    Iterator<String> itr=list.iterator();  
    itr.forEachRemaining(a-> //Here, we are using lambda expression  
    {  
      System.out.println(a);  
    });  
 }  
}  


// User-defined class objects in Java ArrayList

// Student.java
class Student{  
  int rollno;  
  String name;  
  int age;  
 
  Student(int rollno,String name,int age){  
   this.rollno=rollno;  
   this.name=name;  
   this.age=age;  
  }  
}  


// ArrayList5.java
import java.util.*;  

 class ArrayList5{  
 public static void main(String args[]){  
  
  //Creating user-defined class objects  
  Student s1=new Student(101,"Sonoo",23);  
  Student s2=new Student(102,"Ravi",21);  
  Student s2=new Student(103,"Hanumat",25);  
  
  //creating arraylist  
  ArrayList<Student> al = new ArrayList<Student>();  
  
  al.add(s1);//adding Student class object  
  al.add(s2);  
  al.add(s3);  
  
  //Getting Iterator  
  Iterator itr = al.iterator();  
  
  //traversing elements of ArrayList object  
  while(itr.hasNext()){  
    Student st = (Student)itr.next();  
    System.out.println(st.rollno+" "+st.name+" "+st.age);  
  }  
  
 }  
}  
