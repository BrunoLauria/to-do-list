package com.bruno.todo.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bruno.todo.domain.Todo;
import com.bruno.todo.repositories.TodoRepository;

import net.bytebuddy.agent.builder.AgentBuilder.FallbackStrategy.Simple;

@Service
public class DBService {

	@Autowired
	private TodoRepository todoRepository;

	public void instaciaBaseDeDados() throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");

		Todo t1 = new Todo(null, "Estudar", "Estudar Spring Boot 2 e Angular 11",sdf.parse("25/03/2022"), false);
		Todo t2 = new Todo(null, "Ler", "Ler Livros de desenvolvimento pessoal",sdf.parse("24/03/2022"), false);
		Todo t3 = new Todo(null, "Exercicios", "Praticar exercicios fisicos",sdf.parse("12/03/2022"), false);
		Todo t4 = new Todo(null, "Meditar", "Meditar durante 30 min pela manhã",sdf.parse("21/03/2"), true);

		todoRepository.saveAll(Arrays.asList(t1,t2,t3,t4));
	}
}
