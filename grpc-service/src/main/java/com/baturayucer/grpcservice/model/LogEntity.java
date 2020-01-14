package com.baturayucer.grpcservice.model;

import javax.persistence.*;

@Entity
@Table
public class LogEntity {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String logLevel;
    @Column
    private String logMessage;
}
