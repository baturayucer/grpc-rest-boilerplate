package com.baturayucer.demo.mapper;

import com.baturayucer.demo.dto.LogDto;
import com.baturayucer.demo.model.LogModel;

public interface LogMapper {
    LogDto toLogDto(LogModel log);
}
