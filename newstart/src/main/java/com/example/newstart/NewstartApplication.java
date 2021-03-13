package com.example.newstart;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableDiscoveryClient
//@EnableResourceServer
@EnableSwagger2
@EnableTransactionManagement
@MapperScan("com.example.newstart")
//@EnableRedisHttpSession
public class NewstartApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewstartApplication.class, args);
	}




}
