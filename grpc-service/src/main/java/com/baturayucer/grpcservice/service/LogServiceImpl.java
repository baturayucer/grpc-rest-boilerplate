package com.baturayucer.grpcservice.service;

import com.baturayucer.grpcservice.dao.LogDao;
import com.baturayucer.grpcservice.mapper.LogMapper;
import com.baturayucer.proto.service.LogRequest;
import com.baturayucer.proto.service.LogResponse;
import com.baturayucer.proto.service.LogServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl extends LogServiceGrpc.LogServiceImplBase implements LogService {

    @Autowired
    private LogDao logDao;

    @Override
    public void log(LogRequest request, StreamObserver<LogResponse> responseObserver) {

        try {
            logDao.save(LogMapper.INSTANCE.toLogEntity(request));
        } catch (Exception e) {
            e.printStackTrace();
        }

        LogResponse logResponse = LogResponse.newBuilder()
                                        .setLogResponseMessage(
                                                "Log has been created with log message: "
                                                + request.getLogMessage())
                                        .build();
        responseObserver.onNext(logResponse);
        responseObserver.onCompleted();
    }
}