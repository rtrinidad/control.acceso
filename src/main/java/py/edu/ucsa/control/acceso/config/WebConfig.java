package py.edu.ucsa.control.acceso.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Toda la configuracion web sucede aqui
 * 
 * @author Pablo
 */
@Configuration
@EnableWebMvc
@ComponentScan({
	"py.edu.ucsa.control.acceso.web.controllers", 
	"py.edu.ucsa.control.acceso.core.services"
	})
public class WebConfig extends WebMvcConfigurerAdapter {

	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
}
