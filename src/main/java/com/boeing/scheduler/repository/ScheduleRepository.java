package com.boeing.scheduler.repository;

import com.boeing.scheduler.model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {}
