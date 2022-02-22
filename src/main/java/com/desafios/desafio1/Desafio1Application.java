package com.desafios.desafio1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		String movieTableQuery = "CREATE TABLE movie ("
				+ "id int NOT NULL,"
				+ "title varchar(255) NOT NULL,"
				+ "director varchar(255),"
				+ "PRIMARY KEY (id)"
				+ ")";
		
		String categoryTableQuery = "CREATE TABLE category ("
				+ "id int NOT NULL,"
				+ "category varchar(255) NOT NULL,"
				+ "PRIMARY KEY (id)"
				+ ")";
		
		String actorTableQuery = "CREATE TABLE actor ("
				+ "id int NOT NULL,"
				+ "name varchar(255) NOT NULL,"
				+ "lastname varchar(255) NOT NULL,"
				+ "PRIMARY KEY (id)"
				+ ")";
		
		jdbcTemplate.update(movieTableQuery);
		jdbcTemplate.update(categoryTableQuery);
		jdbcTemplate.update(actorTableQuery);
	}
}
