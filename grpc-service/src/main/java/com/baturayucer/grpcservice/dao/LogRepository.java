package com.baturayucer.grpcservice.dao;

import com.baturayucer.grpcservice.model.LogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends JpaRepository<LogEntity, Long> {
}
