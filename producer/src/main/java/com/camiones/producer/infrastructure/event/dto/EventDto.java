package com.camiones.producer.infrastructure.event.dto;

import java.util.Map;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EventDto {

  private Map<String, Object> body;
  private String emittedBy;
  private String eventDateTime;
}
