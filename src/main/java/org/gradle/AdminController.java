package org.gradle;

import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class AdminController {
	

	@RequestMapping("/")
    @ResponseBody
	public String getAllDeptType(HttpServletResponse response){
		/*try {
			response.getWriter().println("ok");
			response.setStatus(200);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	return "hello2"; 	
	}
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(AdminController.class, args);
    }
}
