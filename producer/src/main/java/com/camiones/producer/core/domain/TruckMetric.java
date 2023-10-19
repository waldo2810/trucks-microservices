package com.camiones.producer.core.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TruckMetric {

  private String plate;
  private String event;
  private String driver;
}
