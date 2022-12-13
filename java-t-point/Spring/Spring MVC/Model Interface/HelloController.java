package com.javatpoint;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController{
  
  @RequestMapping('/hello')
  public String display(HttpServletRequest req, Model m){
    
     //read the provided form data(index.jsp)
    String name = req.getParameter("name");
    String pass = req.getParameter("pass");
    
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
