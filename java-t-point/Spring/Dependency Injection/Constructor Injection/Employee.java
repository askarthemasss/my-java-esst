// Injecting primitive and string-based values
// It is a simple class containing two fields id and name. There are four constructors and one method in this class.

package com.askar;

public class Employee{
  private int id;
  private String name;
  
  Employee(){
    System.out.println("Constructor Defined!!");
  }
  
  Employee(int id){
    this.id = id;
  }
  
  Employee(String name){
    this.name = name;
  }
  
  Employee(int id, String name){
    this.id = id;
    this.name = name;
  }
  
  public void show(){
    System.out.println(id + " - " + name);
  }
  
}
