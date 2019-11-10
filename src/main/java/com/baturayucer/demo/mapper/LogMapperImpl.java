package com.baturayucer.demo.mapper;

import com.baturayucer.demo.dto.LogDto;
import com.baturayucer.demo.model.LogModel;

public class LogMapperImpl implements LogMapper{
    @Override
    public LogDto toLogDto(LogModel log) {
        return new LogDto()
                .setId(log.getId())
                .setLog(log.getLog())
                .setLast_change(log.getLast_change());
    }
}
