package com.baturayucer.demo.service.rest;

import com.baturayucer.demo.dto.LogDto;
import org.springframework.stereotype.Service;

@Service
public class LogRestServiceImpl implements LogRestService {
    @Override
    public LogDto callLogGrpc(LogDto logDto) {
        //call grpc here
        return null;
    }
}
