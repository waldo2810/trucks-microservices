package com.camiones.core.core.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Truck {

  private Long id;
  private String plate;
  private String gpsStatus;
  private Float gasOilStatus;
  private String status;
}