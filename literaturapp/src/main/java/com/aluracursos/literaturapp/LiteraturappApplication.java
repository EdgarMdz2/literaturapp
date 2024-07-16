package com.aluracursos.literaturapp;

import com.aluracursos.literaturapp.principal.Principal;
import com.aluracursos.literaturapp.repository.AutoresRepository;
import com.aluracursos.literaturapp.repository.LibrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraturappApplication implements CommandLineRunner {

	@Autowired
	private LibrosRepository librosRepository;
	@Autowired
	private AutoresRepository autoresRepository;


	public static void main(String[] args) {
		SpringApplication.run(LiteraturappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(librosRepository, autoresRepository);

		principal.menu();
	}
}
