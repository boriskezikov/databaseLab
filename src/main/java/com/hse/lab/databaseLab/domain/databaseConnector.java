package com.hse.lab.databaseLab.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Table(name="dbConnector")
@Entity
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

}
