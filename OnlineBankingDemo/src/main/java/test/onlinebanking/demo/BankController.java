package test.onlinebanking.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class BankController {
	@RequestMapping("bankHome")
	public ModelAndView bankHome(Login log) {
		
		ModelAndView mv1 = new ModelAndView();
		mv1.addObject("obj1",log);
		mv1.setViewName("bankHome");
		
		return mv1;
	}


}
