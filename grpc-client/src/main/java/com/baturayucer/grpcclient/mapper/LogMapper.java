package com.baturayucer.grpcclient.mapper;

import com.baturayucer.grpcclient.model.LogDto;
import com.baturayucer.proto.service.LogResponse;
import org.mapstruct.Mapper;

@Mapper
public interface LogMapper {

    LogDto toLogDto(LogResponse logResponse);
}