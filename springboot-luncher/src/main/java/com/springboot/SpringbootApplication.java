package com.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@MapperScan("com.springboot.service.mapper")
@EnableSwagger2
@SpringBootApplication
//(scanBasePackages = {"com.springboot"})
public class SpringbootApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
		System.out.println("---启动成功---");
	}
	
}

