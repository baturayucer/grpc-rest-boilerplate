package com.baturayucer.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@Accessors(chain = true)
@Document(collection = "logModel")
public class LogModel {
    @Id
    private String id;
    private Date last_change;
    private String log;

    public LogModel() {}

    @Override
    public String toString() {
        return String.format(
                "LogModel[log=%s, lastChange='%tD']",
                log, last_change);
    }
}
