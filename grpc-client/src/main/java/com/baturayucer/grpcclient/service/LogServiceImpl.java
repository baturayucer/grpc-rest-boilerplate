package com.baturayucer.grpcclient.service;

import com.baturayucer.grpcclient.mapper.LogMapper;
import com.baturayucer.grpcclient.model.LogDto;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import com.baturayucer.grpcservice.service.LogRequest;
import com.baturayucer.grpcservice.service.LogResponse;
import com.baturayucer.grpcservice.service.LogServiceGrpc;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {
    @Override
    public LogDto sendLog(LogDto logRequest) {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6565)
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

        return LogMapper.INSTANCE.toLogDto(logResponse);
    }
}
