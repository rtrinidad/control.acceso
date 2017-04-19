package py.edu.ucsa.control.acceso.config;

import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import py.edu.ucsa.control.acceso.web.filters.CORSFilter;

/**
 * Configuracion Java para esta aplicacion.  La vida empieza aqui.
 * 
 * @author Pablo
 */
public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[]{DataConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[]{WebConfig.class};
	}

	@Override
	protected Filter[] getServletFilters() {
		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
		characterEncodingFilter.setEncoding("UTF-8");
		return new Filter[]{characterEncodingFilter, new CORSFilter()};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[]{"/*"};
	}

}