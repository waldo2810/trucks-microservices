package com.camiones.producer.core.service.impl;

import com.camiones.producer.core.domain.TruckMetric;
import com.camiones.producer.core.service.TruckMetricService;
import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class TruckMetricServiceImpl implements TruckMetricService {

  private final String[] plates = {"ABC123", "XYZ789", "LMN456", "PQR321"};
  private final String[] events = {"no gas", "filled with gas", "alarm triggered"};
  private final String[] drivers = {"Juan", "Pedro", "Maria"};

  @Override
  public TruckMetric generateRandomMetric() {
    Random random = new Random();
    return TruckMetric.builder()
        .plate(getRandomPlate(random))
        .event(getRandomEvent(random))
        .driver(getRandomDriver(random))
        .build();
  }

  private String getRandomPlate(Random random) {
    int randomIndex = random.nextInt(plates.length);
    return plates[randomIndex];
  }

  private String getRandomEvent(Random random) {
    int randomIndex = random.nextInt(events.length);
    return events[randomIndex];
  }

  private String getRandomDriver(Random random) {
    int randomIndex = random.nextInt(drivers.length);
    return drivers[randomIndex];
  }
}
