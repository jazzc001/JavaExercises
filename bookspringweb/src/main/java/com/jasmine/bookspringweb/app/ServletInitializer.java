package com.jasmine.bookspringweb.app;

import com.jasmine.bookspringweb.app.BookspringwebApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BookspringwebApplication.class);
	}

}
