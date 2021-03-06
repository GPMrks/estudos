package com.aulajava.exemplomaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class SpringBootBeans {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBeans.class, args);

		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

		Livro livro = factory.getBean(Livro.class);
		livro.setNome("Harry Potter");
		livro.setCodigo("D354GA");
		Autor autor	= factory.getBean(Autor.class);
		autor.setNome("J.K. Rowling");

		livro.exibir();

		((AbstractApplicationContext) factory).close();
	}
}
