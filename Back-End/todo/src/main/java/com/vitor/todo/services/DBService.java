package com.vitor.todo.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vitor.todo.domain.Todo;
import com.vitor.todo.repositories.TodoRepository;

@Service
public class DBService {

	@Autowired
	private TodoRepository todoRepository;

	public void instanciaBaseDeDados() throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Todo t1 = new Todo(null, "Estudar", "Estudar Spring Boot 2 e Angular 11",
				sdf.parse("25/03/2022"), false);
		
		Todo t2 = new Todo(null, "Ler", "Ler Livros de Desenvolvimento Pessoal",
				sdf.parse("23/02/2021"), false);
		
		Todo t3 = new Todo(null, "Exercicios", "Praticar Exercicios Fisicos",
				sdf.parse("21/03/2022"), true);
		
		Todo t4 = new Todo(null, "Meditar", "Meditar Durante 30 Minutos",
				sdf.parse("27/03/2021"), true);

		todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4));

	}
}
