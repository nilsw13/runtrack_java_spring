package com.jour2.ViewExercice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ViewExerciceApplication {

	public static void main(String[] args) {
		SpringApplication ViewApp = new SpringApplication(ViewExerciceApplication.class);
		if (args.length > 0){
			String profile = args[0];
			System.setProperty("spring.profiles.active", profile);
		}

		ViewApp.run();
	}
	

}
