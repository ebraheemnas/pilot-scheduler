package com.boeing.scheduler.repository;

import com.boeing.scheduler.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {}
