package com.baturayucer.grpcclient.mapper;

import com.baturayucer.grpcclient.model.LogDto;
import com.baturayucer.grpcservice.service.LogRequest;
import com.baturayucer.grpcservice.service.LogResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper
public interface LogMapper {

    LogMapper INSTANCE = Mappers.getMapper( LogMapper.class );

    LogDto toLogDto(LogRequest logRequest);
    LogRequest logRequest(LogDto logDto);
    LogDto toLogDto(LogResponse logResponse);
    LogDto getLogDto(LogResponse logResponse);
}