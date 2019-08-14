package come.clientside.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan()
public class ViewConfigurer implements WebMvcConfigurer {

	
	@Bean
	public InternalResourceViewResolver resolver() {

	InternalResourceViewResolver resolverMain = new InternalResourceViewResolver();
	
	resolverMain.setPrefix("/WEB-INF/views/");
	resolverMain.setSuffix(".jsp");
	
	resolverMain.setViewClass(JstlView.class);
	
	return resolverMain;
	
	}
	
	@Bean
	public ModelAndView modelAndView() {
		
		return new ModelAndView();
	}

	
}
