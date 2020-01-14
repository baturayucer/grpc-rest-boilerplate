package com.baturayucer.grpcservice.service;

import com.baturayucer.proto.service.LogRequest;
import com.baturayucer.proto.service.LogResponse;
import io.grpc.stub.StreamObserver;

public interface LogService {
    public void log(LogRequest request, StreamObserver<LogResponse> responseObserver);
}
