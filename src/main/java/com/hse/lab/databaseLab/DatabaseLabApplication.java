package com.hse.lab.databaseLab;

import com.hse.lab.databaseLab.service.dbConnectorService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@RequiredArgsConstructor
public class DatabaseLabApplication {
    private final dbConnectorService service;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseLabApplication.class, args);


	}


}
