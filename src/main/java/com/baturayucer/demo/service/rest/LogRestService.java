package com.baturayucer.demo.service.rest;

import com.baturayucer.demo.dto.LogDto;
import org.springframework.stereotype.Service;

@Service
public interface LogRestService {
    LogDto callLogGrpc(LogDto logDto);
}
