package com.hse.lab.databaseLab.service;


import com.hse.lab.databaseLab.domain.databaseConnector;

import java.util.List;

//хедер
public interface dbConnectorService {
    databaseConnector addRecord(databaseConnector connector);
    void deleteRecordById(Integer id);
    databaseConnector updateRecord(databaseConnector connector, Integer id);
    databaseConnector getRecordById(Integer id);
    void deleteAll();
    List<databaseConnector>getAll();


}
