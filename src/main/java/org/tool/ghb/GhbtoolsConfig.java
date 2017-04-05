package org.tool.ghb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.TemplateResolver;

import nz.net.ultraq.thymeleaf.LayoutDialect;

@Configuration
public class GhbtoolsConfig {
	
	@Autowired
	private TemplateResolver templateResolver;
	
	@Bean
	public SpringTemplateEngine templateEngine() {
	    SpringTemplateEngine templateEngine = new SpringTemplateEngine();
	    templateEngine.addDialect(new LayoutDialect());
	    templateEngine.setTemplateResolver(templateResolver);
	    return templateEngine;
	}
	
	@Bean
	public ViewResolver viewResolver(){
	    ThymeleafViewResolver viewResolver = new ThymeleafViewResolver() ;
	    viewResolver.setTemplateEngine(templateEngine());
	    viewResolver.setOrder(1);
	    return viewResolver;
	}
}
