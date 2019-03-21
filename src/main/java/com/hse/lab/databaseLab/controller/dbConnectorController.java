package com.hse.lab.databaseLab.controller;

import com.hse.lab.databaseLab.domain.databaseConnector;
import com.hse.lab.databaseLab.service.dbConnectorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/dbConnector")
public class dbConnectorController {
    private final dbConnectorService service;


    @GetMapping("{id}")
    public databaseConnector getEntity(@PathVariable("id") Integer id) {
        return service.getRecordById(id);
    }
    @PostMapping
    public databaseConnector postEntity(@RequestBody @Valid databaseConnector databaseConnector) {
        return service.addRecord(databaseConnector);
    }

    @DeleteMapping("{id}")
    public void deleteEntity(@PathVariable("id") Integer id) {
        service.deleteRecordById(id);
    }

    @PutMapping("{id}")
    public databaseConnector putEntity(@RequestBody databaseConnector databaseConnector, @PathVariable("id") Integer id) {
        return service.updateRecord(databaseConnector, id);
    }
    @GetMapping
    public List<databaseConnector> getAll(){
        return service.getAll();
    }

}
