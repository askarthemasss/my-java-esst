// Address.java
// This class contains three properties, one constructor and toString() method to return the values of these object.

package com.askar;

public class Address{
  private String city;
  private String state;
  private String country;
  
  public Address(String city, String state, String country){
    super();
    this.city = city;
    this.state = state;
    this.country = country;
  }
  
  public String toString(){
    return city + " - " + state + " - " + country;
  }
}
