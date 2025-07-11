package com.boeing.scheduler.model;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Schema(description = "Pilot entity")
public class Pilot {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String licenseType;
    private LocalDateTime availableFrom;
    private LocalDateTime availableUntil;

    public Pilot() {}

    public Pilot(Long id, String name, String licenseType, LocalDateTime availableFrom, LocalDateTime availableUntil) {
        this.id = id;
        this.name = name;
        this.licenseType = licenseType;
        this.availableFrom = availableFrom;
        this.availableUntil = availableUntil;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getLicenseType() { return licenseType; }
    public LocalDateTime getAvailableFrom() { return availableFrom; }
    public LocalDateTime getAvailableUntil() { return availableUntil; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setLicenseType(String licenseType) { this.licenseType = licenseType; }
    public void setAvailableFrom(LocalDateTime availableFrom) { this.availableFrom = availableFrom; }
    public void setAvailableUntil(LocalDateTime availableUntil) { this.availableUntil = availableUntil; }
}