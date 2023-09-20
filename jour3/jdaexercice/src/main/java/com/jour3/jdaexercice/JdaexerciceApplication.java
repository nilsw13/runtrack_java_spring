package com.jour3.jdaexercice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JdaexerciceApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(JdaexerciceApplication.class, args);
		Object dataSource = context.getBean("dataSource");
		System.out.println("data source:" + dataSource);

}
}
