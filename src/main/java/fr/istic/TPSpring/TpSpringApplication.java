package fr.istic.TPSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TpSpringApplication {
	@Autowired
	private Client client;

	public void run(String... args){
		System.out.println();
	}

	public static void main(String[] args) {
		SpringApplication.run(TpSpringApplication.class, args);
	}

}
