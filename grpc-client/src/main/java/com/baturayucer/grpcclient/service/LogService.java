package com.baturayucer.grpcclient.service;

import com.baturayucer.grpcclient.model.LogDto;
import com.baturayucer.grpcservice.service.LogRequest;
import com.baturayucer.grpcservice.service.LogResponse;

public interface LogService {
    public LogDto sendLog(LogDto logRequest);
}
