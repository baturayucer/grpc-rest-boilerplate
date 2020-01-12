package com.baturayucer.grpcservice.service;

import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl extends LogServiceGrpc.LogServiceImplBase implements LogService {

    @Override
    public void log(LogRequest request, StreamObserver<LogResponse> responseObserver) {

        LogResponse logResponse = LogResponse.newBuilder()
                                        .setLogResponseMessage(
                                                "Log has been created with log message: "
                                                + request.getLogMessage())
                                        .build();
        responseObserver.onNext(logResponse);
        responseObserver.onCompleted();
    }
}