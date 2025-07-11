package com.boeing.scheduler.services;

import com.boeing.scheduler.model.*;
import com.boeing.scheduler.repository.*;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ScheduleService {
    private final PilotRepository pilotRepo;
    private final FlightRepository flightRepo;
    private final ScheduleRepository scheduleRepo;

    public ScheduleService(PilotRepository p, FlightRepository f, ScheduleRepository s) {
        this.pilotRepo = p;
        this.flightRepo = f;
        this.scheduleRepo = s;
    }

    public Schedule assignPilotToFlight(Long pilotId, Long flightId) {
        Pilot pilot = pilotRepo.findById(pilotId).orElseThrow();
        Flight flight = flightRepo.findById(flightId).orElseThrow();
        Schedule schedule = new Schedule(null, pilot, flight);
        return scheduleRepo.save(schedule);
    }

    public List<Schedule> getAllSchedules() {
        return scheduleRepo.findAll();
    }
}
