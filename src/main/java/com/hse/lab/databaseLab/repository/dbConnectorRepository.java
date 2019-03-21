package com.hse.lab.databaseLab.repository;

import com.hse.lab.databaseLab.domain.databaseConnector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface dbConnectorRepository extends JpaRepository<databaseConnector, Integer> {
    databaseConnector findById(Integer id);

}

