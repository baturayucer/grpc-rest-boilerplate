package com.baturayucer.demo.controller;

import com.baturayucer.demo.dto.LogDto;
import com.baturayucer.demo.service.rest.LogRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("app/v1")
public class RestController {

    @Autowired
    private LogRestService service;

    RestController(LogRestService service) {
        this.service = service;
    }

    @GetMapping("status")
    public ResponseEntity<String> status() {
        service.callLogGrpc(new LogDto());
        return new ResponseEntity<>("Mertali Çakmak", HttpStatus.OK);
    }
}
