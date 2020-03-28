package com.baturayucer.grpcclient.service;

import com.baturayucer.grpcclient.model.LogDto;

public interface LogService {
    LogDto sendLog(LogDto logRequest);
}
