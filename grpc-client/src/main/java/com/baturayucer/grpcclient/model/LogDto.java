package com.baturayucer.grpcclient.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LogDto {
    private String logLevel;
    private String logMessage;
}
