package com.javatpoint;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController{
  
  @RequestMapping('/hello')
  public String display(@RequestParam("name") String name, @RequestParam("pass") String pass, Model m){

    // Validation
    if(pass.equals("admin")){
      String msg = "Hello " + name;
      // Add a Message to Model
      m.addAttribute("message", msg);
      return "viewPage";
    }
    else {
      String msg = "Hello " + name + ", you entered an incorrect password!!";
      m.addAttribute("message",msg);
      return "errorPage";
    }
    
  }
}
