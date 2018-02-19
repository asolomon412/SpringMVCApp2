package com.gc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/*
 * @author: Antonella Solomon
 *
 */

@Controller
public class HomeController {

	@RequestMapping("/welcome")
	public String registerForm() {

		return "register";
	}

	@RequestMapping("success")
	public ModelAndView registerSuccess(@RequestParam("fName") String firstName, @RequestParam("lName") String lastName,
			@RequestParam("gender") String gender, @RequestParam("test") String checkbox) {

		String sayHello = "Hello, " + firstName + " " + gender + " " + checkbox;
		// first parameter : the name of the jsp
		// second parameter : name of the EL tag variable name
		// third parameter : object or data that should go back into our jsp page

		return new ModelAndView("success", "helloMsg", sayHello);
	}
}
