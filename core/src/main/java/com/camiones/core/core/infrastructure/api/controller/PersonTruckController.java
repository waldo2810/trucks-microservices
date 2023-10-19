package com.camiones.core.core.infrastructure.api.controller;

import com.camiones.core.core.application.drivertruck.DriverTruckApplication;
import com.camiones.core.core.domain.model.DriverTruck;
import com.camiones.core.core.infrastructure.api.dto.PersonTruckRequest;
import com.camiones.core.core.infrastructure.api.mapper.PersonTruckRequestMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/person-truck")
@AllArgsConstructor
public class PersonTruckController {

  private DriverTruckApplication driverTruckApplication;

  private PersonTruckRequestMapper personTruckRequestMapper;

  @PostMapping
  public ResponseEntity<DriverTruck> create(@RequestBody PersonTruckRequest personTruckRequest) {
    return ResponseEntity.ok(
        driverTruckApplication.create(personTruckRequestMapper.toEntity(personTruckRequest)));
  }

}
