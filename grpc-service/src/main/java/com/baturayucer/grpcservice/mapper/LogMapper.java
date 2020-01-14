package com.baturayucer.grpcservice.mapper;

import com.baturayucer.grpcservice.model.LogEntity;
import com.baturayucer.proto.service.LogRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LogMapper {

    LogMapper INSTANCE = Mappers.getMapper( LogMapper.class );

    LogEntity toLogEntity(LogRequest logRequest);
}