package com.boeing.scheduler.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
@Schema(description = "Schedule entity")
public class Schedule {
    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    private Pilot pilot;

    @ManyToOne
    private Flight flight;

    public Schedule() {}

    public Schedule(Long id, Pilot pilot, Flight flight) {
        this.id = id;
        this.pilot = pilot;
        this.flight = flight;
    }

    public Long getId() { return id; }
    public Pilot getPilot() { return pilot; }
    public Flight getFlight() { return flight; }

    public void setId(Long id) { this.id = id; }
    public void setPilot(Pilot pilot) { this.pilot = pilot; }
    public void setFlight(Flight flight) { this.flight = flight; }
}