package com.camiones.core.core.infrastructure.api.controller;

import com.camiones.core.core.domain.model.Truck;
import com.camiones.core.core.domain.service.truck.TruckService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/trucks")
@AllArgsConstructor
public class TruckController {

  private final TruckService truckService;

  @PostMapping
  public ResponseEntity<Truck> create(@RequestBody Truck truck) {
    return ResponseEntity.ok(truckService.createTruck(truck));
  }

  @GetMapping
  public ResponseEntity<List<Truck>> findAll() {
    return ResponseEntity.ok(truckService.findAllTrucks());
  }
}
