package com.biblioteca.livros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@OpenAPIDefinition(
        info = @io.swagger.v3.oas.annotations.info.Info(title = "${info.build.name}",
                version = "${info.build.version}",
                description = "${info.app.description}",
                contact = @io.swagger.v3.oas.annotations.info.Contact(
                        name = "Time Arquitetura e APIs",
                        email = "jonatas.edo@gmail.com")))

@SpringBootApplication
public class LivrosApplication {
	                		
	public static void main(String[] args) {
		SpringApplication.run(LivrosApplication.class, args);
	}

}
