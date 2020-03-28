package com.baturayucer.grpcservice.service;

import com.baturayucer.proto.service.LogRequest;

public interface LogService {
    LogRequest log(LogRequest request);
}
