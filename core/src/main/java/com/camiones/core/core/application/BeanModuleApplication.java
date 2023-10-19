package com.camiones.core.core.application;

import com.camiones.core.core.application.driver.DriverApplication;
import com.camiones.core.core.application.drivertruck.DriverTruckApplication;
import com.camiones.core.core.application.metric.MetricApplication;
import com.camiones.core.core.application.truck.TruckApplication;
import com.camiones.core.core.domain.service.driver.DriverService;
import com.camiones.core.core.domain.service.drivertruck.DriverTruckService;
import com.camiones.core.core.domain.service.metric.MetricService;
import com.camiones.core.core.domain.service.truck.TruckService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanModuleApplication {

  @Bean
  public DriverApplication personApplication(DriverService driverService) {
    return new DriverApplication(driverService);
  }

  @Bean
  public TruckApplication truckApplication(TruckService truckService) {
    return new TruckApplication(truckService);
  }

  @Bean
  public DriverTruckApplication personTruckApplication(
      DriverTruckService driverTruckService, DriverApplication driverApplication,
      TruckApplication truckApplication) {
    return new DriverTruckApplication(driverTruckService, driverApplication, truckApplication);
  }

  @Bean
  public MetricApplication metricApplication(TruckApplication truckApplication,
      MetricService metricService) {
    return new MetricApplication(truckApplication, metricService);
  }
}