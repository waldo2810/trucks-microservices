package com.camiones.producer.infrastructure.event.publish.impl;

import com.camiones.producer.infrastructure.event.dto.EventDto;
import com.camiones.producer.infrastructure.event.publish.PublisherService;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@AllArgsConstructor
public class Publisher implements PublisherService {

  private final RabbitTemplate rabbitTemplate;

  @Override
  public void publishEvent(Map<String, Object> body) {
    EventDto event = EventDto.builder()
        .body(body)
        .emittedBy("")
        .eventDateTime(getFormattedDate())
        .build();
    try {
      log.info("Sending event to RabbitMQ...");
      rabbitTemplate.convertAndSend("metrics", event);
    } catch (Exception e) {
      log.info("Failed to send event to RabbitMQ. Error: [{}], Cause: [{}], At: [{}]",
          e.getLocalizedMessage(), e.getCause(), this.getClass());
    }
  }

  private String getFormattedDate() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    return LocalDateTime.now().format(formatter);
  }
}
