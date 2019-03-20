package com.hse.lab.databaseLab.domain;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@RequiredArgsConstructor
@Table(name="dbConnector")
@Entity
// основаня сущность ( тупо обьект с полями мы его записываем в бд)
// аннотации Getter setter - генерят гетеры сетеры ( почитай)
// @RequiredArgsConstructor - создает контруктор просто чтоб не писать его руками
public class databaseConnector {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @NonNull
    @Column(name="phoneNumber")
    private String phoneNumber;
    @Column(name="metaData")
    private String metaData;

    public databaseConnector(){}

}
