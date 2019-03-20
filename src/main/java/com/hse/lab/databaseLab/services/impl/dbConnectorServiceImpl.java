package com.hse.lab.databaseLab.services.impl;

import com.hse.lab.databaseLab.domain.databaseConnector;
import com.hse.lab.databaseLab.repositories.dbConnectorRepository;
import com.hse.lab.databaseLab.services.dbConnectorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class dbConnectorServiceImpl implements dbConnectorService {
    private final dbConnectorRepository repository;
    // сервис - тут основная логика типа записать в бд достать из бд удалить и тд
    // оверрайд - перегрузка ( похуй забей на нее)
    @Override
    public databaseConnector addRecord(databaseConnector connector) {
        return repository.save(connector);
    }

    @Override
    public void deleteRecordById(Integer id) {
        repository.delete(id);

    }

    @Override
    public databaseConnector updateRecord(databaseConnector connector, Integer id) {
        databaseConnector connector1 = getRecordById(id);
        connector1.setId(id);
        repository.delete(id);
        return repository.save(connector1);
    }

    @Override
    public databaseConnector getRecordById(Integer id) {
        return repository.findOne(id);
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();

    }

    @Override
    public List<databaseConnector> getAll()throws StackOverflowError {
        return repository.findAll();
    }
}
