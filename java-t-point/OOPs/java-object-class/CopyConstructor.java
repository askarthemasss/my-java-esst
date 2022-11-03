// copy the values of one object into another using Java constructor.
class Student6{
    String name;
    int id;

    Student6(int i, String n){
        id = i;
        name = n;
    }

    Student6(Student6 s){
        id = s.id;
        name = s.name;
    }

    void display(){
        System.out.println(id + " " +name);
    }

    public static void main(String[] args){
        Student6 s1 = new Student6(111, "Karan");
        Student6 s2 = new Student6(s1);
        s1.display();
        s2.display();
   }

}


// Copying values without constructor
class Student7{  
    int id;  
    String name;  
    Student7(int i,String n){  
      id = i;  
      name = n;  
    }  
  
    Student7(){}  
  
    void display(){
      System.out.println(id+" "+name);
    }  
   
    public static void main(String args[]){  
      Student7 s1 = new Student7(111,"Karan");  
      Student7 s2 = new Student7();  
      s2.id=s1.id;  
      s2.name=s1.name;  
      s1.display();  
      s2.display();  
   }  
}  
