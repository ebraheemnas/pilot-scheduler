package com.boeing.scheduler.repository;

import com.boeing.scheduler.model.Pilot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PilotRepository extends JpaRepository<Pilot, Long> {}
