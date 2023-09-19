package com.job03.contro;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ControApplication {




	public static void main(String[] args) {
		
		SpringApplication Monapp = new SpringApplication(ControApplication.class);

		if (args.length > 0){
			String profile = args[0];
			System.setProperty("spring.profiles.active", profile);
		}

		Monapp.run(args);


		
	}
	
}
