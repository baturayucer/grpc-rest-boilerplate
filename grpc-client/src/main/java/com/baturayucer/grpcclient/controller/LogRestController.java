package com.baturayucer.grpcclient.controller;

import com.baturayucer.grpcclient.model.LogDto;
import com.baturayucer.grpcclient.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogRestController {

    LogService logService;

    @Autowired
    public LogRestController(LogService logService) {
        this.logService = logService;
    }


    @PostMapping("/send")
    public ResponseEntity<LogDto> sendLog(@RequestBody LogDto logDto) {
        LogDto logResponse = logService.sendLog(logDto);
        return new ResponseEntity<>(logResponse, HttpStatus.CREATED);
    }
}
