package com.camiones.core.core.infrastructure.event.listen;

import com.camiones.core.core.application.metric.MetricApplication;
import com.camiones.core.core.infrastructure.mapper.MetricMapper;
import com.camiones.core.core.infrastructure.repository.metric.MetricDto;
import com.camiones.core.core.infrastructure.event.dto.EventDto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class MetricsReceiver {

  private final MetricApplication metricApplication;
  private final MetricMapper metricMapper;

  @RabbitListener(queues = "metricas")
  public void receiveMessage(EventDto message) {
    MetricDto metricDto = (MetricDto) message.getBody().get("metric");
    metricDto.setEventDateTime(message.getEventDateTime());
    metricDto.setEmittedBy(message.getEmittedBy());

    log.info("Received message for truck plate: [{}]", metricDto.getPlate());
    metricApplication.processMetric(metricMapper.toEntity(metricDto));
  }
}