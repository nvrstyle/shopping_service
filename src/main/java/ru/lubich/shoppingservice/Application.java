package ru.lubich.shoppingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import ru.lubich.shoppingservice.category.CategoriesStorage;
import ru.lubich.shoppingservice.user.ApplicationSecurity;
import ru.lubich.shoppingservice.product.ProductsStorage;

@ComponentScan
@EnableAutoConfiguration
public class Application  {

	@Bean
	public WebSecurityConfigurerAdapter webSecurityConfigurerAdapter() {
		return new ApplicationSecurity();
	}



	public static void main(String[] args) {
		//SpringApplication application = new SpringApplication(Application.class);
        CategoriesStorage.init();
        ProductsStorage.init();
		SpringApplication.run(Application.class);
		//application.run(args);

	}
}
