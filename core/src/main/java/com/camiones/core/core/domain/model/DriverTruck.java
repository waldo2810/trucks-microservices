package com.camiones.core.core.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DriverTruck {

  private Long id;
  private Driver driver;
  private Truck truck;
}