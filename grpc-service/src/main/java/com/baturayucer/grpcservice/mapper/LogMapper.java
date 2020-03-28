package com.baturayucer.grpcservice.mapper;

import com.baturayucer.grpcservice.model.LogEntity;
import com.baturayucer.proto.service.LogRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface LogMapper {

    @Mappings({
            @Mapping(source = "logLevel", target = "logLevel"),
            @Mapping(source = "logMessage", target = "logMessage")
    })
    LogEntity toLogEntity(LogRequest logRequest);
}