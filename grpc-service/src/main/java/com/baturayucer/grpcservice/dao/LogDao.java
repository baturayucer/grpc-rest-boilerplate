package com.baturayucer.grpcservice.dao;

import com.baturayucer.grpcservice.model.LogEntity;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface LogDao extends CrudRepository<LogEntity, Long> {
}
