package com.camiones.core.core.infrastructure.event.dto;

import java.util.Map;
import lombok.Data;

@Data
public class EventDto {

  private Map<String, Object> body;
  private String emittedBy;
  private String eventDateTime;
}
