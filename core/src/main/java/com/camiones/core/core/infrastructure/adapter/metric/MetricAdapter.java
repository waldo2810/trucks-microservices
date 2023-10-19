package com.camiones.core.core.infrastructure.adapter.metric;

import com.camiones.core.core.domain.model.Metric;
import com.camiones.core.core.domain.service.metric.MetricService;
import com.camiones.core.core.infrastructure.mapper.MetricMapper;
import com.camiones.core.core.infrastructure.repository.metric.MetricRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MetricAdapter implements MetricService {

  private final MetricRepository metricRepository;
  private final MetricMapper metricMapper;

  @Override
  public void saveMetric(Metric metric) {
    metricRepository.save(metricMapper.toDto(metric));
  }
}
