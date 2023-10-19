package com.camiones.core.core.domain.model;

import lombok.Data;

@Data
public class Metric {

  private Long id;
  private String plate;
  private String event;
  private String driver;
  private Truck truck;
}
