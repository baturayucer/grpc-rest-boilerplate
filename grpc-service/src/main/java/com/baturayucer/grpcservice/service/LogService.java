package com.baturayucer.grpcservice.service;

import io.grpc.stub.StreamObserver;

public interface LogService {
    public void log(LogRequest request, StreamObserver<LogResponse> responseObserver);
}
