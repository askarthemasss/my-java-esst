package com.askar;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Question{
  private int id;
  private String name;
  private Map<Answer, User> answers;
  
  public Question(){}
  
  public Question(int id, String name, Map<Answer, User> answers){
    super();
    this.id = id;
    this.name = name;
    this.answers = answers;
  }
  
  public void displayInfo(){
    System.out.println("ID: " + id);
    System.out.println("Name: " + name);
    System.out.println("Answers:");
    
    Set<Entry<Answer, User>> set = answers.entrySet();
    
    Iterator<Entry<Answer, User>> itr = set.iterator();
    while(ite.hasNext()){
      Entry<Answer, User> entry = itr.next();
      Answer ans = entry.getKey();
      User user = entry.getValue();
      
      System.out.println("Answer Info: ");
      System.out.println(ans);
      System.out.println("Answered by: ");
      System.out.println(user);
    }
  }
  
}
