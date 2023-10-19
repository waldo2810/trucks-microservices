package com.camiones.core.core.domain.service.drivertruck;

import com.camiones.core.core.domain.model.DriverTruck;
import java.util.List;

public interface DriverTruckService {

  DriverTruck create(DriverTruck driverTruck);

  DriverTruck findById(Long id);

  List<DriverTruck> findAll();
}