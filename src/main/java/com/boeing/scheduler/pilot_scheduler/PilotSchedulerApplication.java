package com.boeing.scheduler.pilot_scheduler;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Pilot Scheduler API", version = "1.0", description = "API for managing pilot assignments to flights"))
public class PilotSchedulerApplication {
	public static void main(String[] args) {
		SpringApplication.run(PilotSchedulerApplication.class, args);
	}
}
