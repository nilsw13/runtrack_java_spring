package com.job03.contro;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ControApplication {

	private static String nom; 


	public static void main(String[] args) {
		if (args.length <= 0){
            System.out.println("Veuillez fournir un argument pour definir le profil");
            return;
        }

		nom = args[0];
		


		SpringApplication.run(ControApplication.class, args);
	}


	public static String getNom() {
        return nom;
    }
	
}
