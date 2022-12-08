package com.askar;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

public class Test{
  public static void main(String[] args){
    
    Resource resource = new ClassPathResource("applicationContext.xml");
    BeanFactory factory = new XmlBeanFactory(resource);
    
    Employee emp = (Employee)factory.getBean("e");
    emp.show();
  }
}
