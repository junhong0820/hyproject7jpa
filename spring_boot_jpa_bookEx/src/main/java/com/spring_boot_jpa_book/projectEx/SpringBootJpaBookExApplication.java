package com.spring_boot_jpa_book.projectEx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.spring_boot_jpa_book.projectEx"})
public class SpringBootJpaBookExApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaBookExApplication.class, args);
	}

}
