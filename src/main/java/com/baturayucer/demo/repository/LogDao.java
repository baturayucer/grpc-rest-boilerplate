package com.baturayucer.demo.repository;

import com.baturayucer.demo.model.LogModel;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface LogDao extends MongoRepository<LogModel, String> {
    LogModel findById(int id);
}
