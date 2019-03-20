package com.hse.lab.databaseLab.controllers;

import com.hse.lab.databaseLab.domain.databaseConnector;
import com.hse.lab.databaseLab.services.dbConnectorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;


/** Желтые Называется аннотации( почитай что такое аннотация) нужны как конфигурации тупо пишутя и все чтоб работало */
@RestController
@RequiredArgsConstructor
@RequestMapping("/dbConnector")

// класс контроллер отвечает за работу с клиентом, принимает запросы и отправляет обратно
public class dbConnectorController {
    private final dbConnectorService service;


    // гет маппинг отвечяает за (вернуть сущность, вводишь айдишник получаешь обьект)
    @GetMapping("{id}")
    public databaseConnector getEntity(@PathVariable("id") Integer id) {
        return service.getRecordById(id);
    }
    // сэйм хуйня ток для записи в бд
    @PostMapping
    public databaseConnector postEntity(@RequestBody @Valid databaseConnector databaseConnector) {
        return service.addRecord(databaseConnector);
    }

    // удаление  по айди
    @DeleteMapping("{id}")
    public void deleteEntity(@PathVariable("id") Integer id) {
        service.deleteRecordById(id);
    }

    // редактирование сущности по айди
    @PutMapping("{id}")
    public databaseConnector putEntity(@RequestBody databaseConnector databaseConnector, @PathVariable("id") Integer id) {
        return service.updateRecord(databaseConnector, id);
    }
    // возвращает все сущности из бд
    @GetMapping
    public List<databaseConnector> getAll(){
        return service.getAll();
    }

}
