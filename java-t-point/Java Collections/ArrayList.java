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


