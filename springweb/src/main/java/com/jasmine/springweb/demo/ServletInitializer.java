package com.jasmine.springweb.demo;

import com.jasmine.springweb.demo.MyFirstSpringWebApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MyFirstSpringWebApplication.class);
	}

}
