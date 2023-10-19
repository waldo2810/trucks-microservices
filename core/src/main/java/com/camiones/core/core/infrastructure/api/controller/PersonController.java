package com.camiones.core.core.infrastructure.api.controller;

import com.camiones.core.core.application.driver.DriverApplication;
import com.camiones.core.core.domain.model.Driver;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/persons")
@AllArgsConstructor
public class PersonController {

  private final DriverApplication driverApplication;

  @PostMapping
  public ResponseEntity<Driver> create(@RequestBody Driver driver) {
    return ResponseEntity.ok(driverApplication.create(driver));
  }

  @GetMapping
  public ResponseEntity<List<Driver>> findAll() {
    return ResponseEntity.ok(driverApplication.findAll());
  }
}
