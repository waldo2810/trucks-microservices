package com.camiones.producer.core.processor;

import com.camiones.producer.core.domain.TruckMetric;
import com.camiones.producer.core.service.MetricSender;
import com.camiones.producer.core.service.TruckMetricService;
import com.camiones.producer.infrastructure.event.publish.impl.Publisher;
import java.util.HashMap;
import java.util.Map;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class MetricGenerator implements MetricSender {

  private final Publisher publisher;
  private final TruckMetricService truckMetricService;

  @Override
  @Scheduled(fixedRate = 5000)
  public void sendRandomEvent() {
    TruckMetric metric = truckMetricService.generateRandomMetric();
    Map<String, Object> body = new HashMap<>();
    body.put("metric", metric);
    publisher.publishEvent(body);
  }
}
