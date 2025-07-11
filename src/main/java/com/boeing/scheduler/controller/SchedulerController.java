package com.boeing.scheduler.controller;

import com.boeing.scheduler.model.Flight;
import com.boeing.scheduler.model.Pilot;
import com.boeing.scheduler.model.Schedule;
import com.boeing.scheduler.repository.FlightRepository;
import com.boeing.scheduler.repository.PilotRepository;
import com.boeing.scheduler.services.ScheduleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "Scheduler Controller", description = "Endpoints for managing pilots, flights, and schedules")
@RequestMapping("/api")
public class SchedulerController {

    private final PilotRepository pilotRepo;
    private final FlightRepository flightRepo;
    private final ScheduleService scheduleService;

    public SchedulerController(PilotRepository p, FlightRepository f, ScheduleService s) {
        this.pilotRepo = p;
        this.flightRepo = f;
        this.scheduleService = s;
    }

    @Operation(summary = "Get all pilots")
    @GetMapping("/pilots")
    public List<Pilot> getPilots() {
        return pilotRepo.findAll();
    }

    @Operation(summary = "Create a new flight")
    @PostMapping("/flights")
    public Flight createFlight(@RequestBody Flight flight) {
        return flightRepo.save(flight);
    }

    @Operation(summary = "Assign a pilot to a flight")
    @PostMapping("/assign")
    public Schedule assignPilot(@RequestParam Long pilotId, @RequestParam Long flightId) {
        return scheduleService.assignPilotToFlight(pilotId, flightId);
    }

    @Operation(summary = "Get all schedules")
    @GetMapping("/schedules")
    public List<Schedule> getSchedules() {
        return scheduleService.getAllSchedules();
    }
}