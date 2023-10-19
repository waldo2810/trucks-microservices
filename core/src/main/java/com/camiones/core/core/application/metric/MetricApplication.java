package com.camiones.core.core.application.metric;

import com.camiones.core.core.application.truck.TruckApplication;
import com.camiones.core.core.domain.model.Metric;
import com.camiones.core.core.domain.model.Truck;
import com.camiones.core.core.domain.service.metric.MetricService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MetricApplication {

  private final TruckApplication truckApplication;
  private final MetricService metricService;

  public void processMetric(Metric metric) {
    Truck existingTruck = truckApplication.findByPlate(metric.getPlate());

    metricService.saveMetric(metric);
  }
}
