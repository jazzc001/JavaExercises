package com.jasmine.bookspringrestapi.app;

import com.jasmine.bookspringrestapi.app.BookspringrestapiApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BookspringrestapiApplication.class);
	}

}
