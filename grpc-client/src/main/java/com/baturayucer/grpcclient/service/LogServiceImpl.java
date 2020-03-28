package com.baturayucer.grpcclient.service;

import com.baturayucer.grpcclient.mapper.LogMapper;
import com.baturayucer.grpcclient.model.LogDto;
import com.baturayucer.proto.service.LogRequest;
import com.baturayucer.proto.service.LogResponse;
import com.baturayucer.proto.service.LogServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {

    LogMapper logMapper = Mappers.getMapper(LogMapper.class);

    @Override
    public LogDto sendLog(LogDto logRequest) {

        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 6565)
                .usePlaintext()
                .build();

        LogServiceGrpc.LogServiceBlockingStub stub
                = LogServiceGrpc.newBlockingStub(channel);

        LogResponse logResponse = stub.log(LogRequest.newBuilder()
                .setLogLevel(logRequest.getLogLevel())
                .setLogMessage(logRequest.getLogMessage())
                .build());

        System.out.println("Log Response:" + logResponse);

        channel.shutdown();
        return logMapper.toLogDto(logResponse);
    }
}
