package py.edu.ucsa.control.acceso.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class BaseController {

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcome(ModelMap model) {

		model.addAttribute("message", "Maven Web Project + Spring 4 MVC - welcome()");

		// Spring uses InternalResourceViewResolver and return back index.jsp
		return "index";

	}

	@RequestMapping(value = "/welcome/{name}/{last}", method = {RequestMethod.GET, RequestMethod.POST})
	public String welcomeName(@PathVariable("name") String nombre, @PathVariable("last") String ape, ModelMap model) {

		model.addAttribute("message", "Maven Web Project + Spring 4 MVC - " + nombre);
		return "index";

	}
}