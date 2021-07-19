package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    @RequestMapping("/login/login")
	public String loginform() {
		return "/login/login" ;
	}
    
    @RequestMapping("/login/logindo")
    public ModelAndView logindo(HttpServletRequest request) {
    	 ModelAndView mv=new ModelAndView();
    	 request.getSession().setAttribute("id","user");
    	 mv.setViewName("/login/loginsucess");
    	 
    	 return mv;
    	
    }
   
}
