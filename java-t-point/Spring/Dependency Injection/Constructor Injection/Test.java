//  Test.java
// This class gets the bean from the applicationContext.xml file and calls the show method.

package com.askar;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

public class Test{
  public static void main(String[] args){
    Resource resource = ClassPathResource("applicationContext.xml");
    BeanFactory factory = new XmlBeanFactory(resource);
    
    Employee emp = (Employee)factory.getBean("e");
    emp.show();     // 10 null
  }
}
