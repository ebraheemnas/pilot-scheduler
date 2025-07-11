package com.boeing.scheduler.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
@Schema(description = "Flight entity")
public class Flight {
    @Id @GeneratedValue
    private Long id;
    private String route;
    private LocalDateTime departure;
    private int durationMinutes;

    public Flight() {}

    public Flight(Long id, String route, LocalDateTime departure, int durationMinutes) {
        this.id = id;
        this.route = route;
        this.departure = departure;
        this.durationMinutes = durationMinutes;
    }

    public Long getId() { return id; }
    public String getRoute() { return route; }
    public LocalDateTime getDeparture() { return departure; }
    public int getDurationMinutes() { return durationMinutes; }

    public void setId(Long id) { this.id = id; }
    public void setRoute(String route) { this.route = route; }
    public void setDeparture(LocalDateTime departure) { this.departure = departure; }
    public void setDurationMinutes(int durationMinutes) { this.durationMinutes = durationMinutes; }
}
