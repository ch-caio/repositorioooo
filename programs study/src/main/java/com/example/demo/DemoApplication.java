package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(DemoApplication.class, args);
		Pessoa pessoa = new Pessoa();
		pessoa.setId("id1");

		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(pessoa);


		boolean finalll = pessoa.metodo(pessoas);
		System.out.println("resultado: " + finalll);
		System.out.println("pessoa: " + pessoa.getId());
	}

}
