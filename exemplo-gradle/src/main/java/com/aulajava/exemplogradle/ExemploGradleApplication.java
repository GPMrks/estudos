package com.aulajava.exemplogradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExemploGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemploGradleApplication.class, args);

		final FormaGeometrica quadrado = new Quadrado("Quadrado", 10.0);

		System.out.println(quadrado);

		System.out.println(quadrado.desenha(12, 34));
		System.out.println(quadrado.nome());
		System.out.println(quadrado.area());

	}

}
