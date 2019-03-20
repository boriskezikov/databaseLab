package com.hse.lab.databaseLab.repositories;

import com.hse.lab.databaseLab.domain.databaseConnector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// репозиторий - обьект через который проихсодит обмен данными с бд
public interface dbConnectorRepository extends JpaRepository<databaseConnector, Integer> {
    databaseConnector findById(Integer id);

}

