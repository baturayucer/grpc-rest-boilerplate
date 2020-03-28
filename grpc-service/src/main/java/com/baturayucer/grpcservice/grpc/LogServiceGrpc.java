package com.baturayucer.grpcservice.grpc;

import com.baturayucer.grpcservice.service.LogService;
import com.baturayucer.proto.service.LogRequest;
import com.baturayucer.proto.service.LogResponse;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;

public class LogServiceGrpc extends
        com.baturayucer.proto.service.LogServiceGrpc.LogServiceImplBase {

    @Autowired
    private LogService logService;

    @Override
    public void log(LogRequest request,
                    StreamObserver<LogResponse> responseObserver) {

        String responseMessage = logService.log(request).getLogMessage();

        LogResponse logResponse =
                LogResponse.newBuilder().setLogResponseMessage(
                        "Log has been created with log message: "
                        .concat(responseMessage)).build();

        responseObserver.onNext(logResponse);
        responseObserver.onCompleted();
    }

}
