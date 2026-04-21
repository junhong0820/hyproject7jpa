package com.spring_boot_jpa_book.projectEx; // 현재 내 패키지 경로

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// 내 프로젝트의 최상위 패키지 경로를 적어주면 그 아래 모든 걸 다 찾아냅니다.
@ComponentScan(basePackages= {"com.spring_boot_jpa_book.projectEx"}) 
public class SpringBootJpaBookExApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaBookExApplication.class, args);
	}

}