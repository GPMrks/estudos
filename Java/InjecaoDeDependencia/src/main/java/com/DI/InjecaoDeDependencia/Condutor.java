package com.DI.InjecaoDeDependencia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Condutor {

	public static void main(String[] args) {
		//SpringApplication.run(Condutor.class, args);

		Condutor condutor = new Condutor(new Moto());
		condutor.automovel();

	}

	@Autowired
	private Veiculo veiculo;

	public Condutor(Veiculo obj){
		this.veiculo = obj;
	}

	public void automovel(){
		veiculo.acao();
	}


}
