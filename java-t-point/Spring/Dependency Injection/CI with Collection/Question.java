package com.askar;

import java.util.Iterator;
import java.util.List;

public class Question{
  private int id;
  private String name;
  private List<String> answers;
  
  public Question(){}
  
  public Question(int id, String name, List<String> answers){
    super();
    this.id = id;
    this.name = name;
    this.answers = answers;
  }
  
  public void displayInfo(){
    System.out.println(id + " - " + name);
    System.out.println("Answers: ");
    Iterator<String> it = answers.iterator();
    while(it.hasNext()){
      System.out.println(it.next());
    }
  }
}
