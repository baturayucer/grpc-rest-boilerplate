package com.baturayucer.grpcservice.service;

import com.baturayucer.grpcservice.dao.LogRepository;
import com.baturayucer.grpcservice.mapper.LogMapper;
import com.baturayucer.proto.service.LogRequest;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {

    private LogRepository logRepository;

    @Autowired
    LogServiceImpl(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    private LogMapper logMapper = Mappers.getMapper(LogMapper.class);

    @Override
    public LogRequest log(LogRequest request) {

        try {
            logRepository.save(logMapper.toLogEntity(request));
            return request;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}