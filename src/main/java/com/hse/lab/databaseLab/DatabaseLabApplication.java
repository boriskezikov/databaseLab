package com.hse.lab.databaseLab;

import com.hse.lab.databaseLab.services.dbConnectorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;


// старт приложение

@SpringBootApplication
@RequiredArgsConstructor
public class DatabaseLabApplication {
    private final dbConnectorService service;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseLabApplication.class, args);


	}


}
