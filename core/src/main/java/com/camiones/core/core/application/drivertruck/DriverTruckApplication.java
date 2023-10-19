package com.camiones.core.core.application.drivertruck;

import com.camiones.core.core.application.truck.TruckApplication;
import com.camiones.core.core.application.driver.DriverApplication;
import com.camiones.core.core.domain.model.Driver;
import com.camiones.core.core.domain.model.DriverTruck;
import com.camiones.core.core.domain.model.Truck;
import com.camiones.core.core.domain.service.drivertruck.DriverTruckService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DriverTruckApplication {

  private final DriverTruckService driverTruckService;
  private final DriverApplication driverApplication;
  private final TruckApplication truckApplication;

  public DriverTruck create(DriverTruck driverTruck) {

    Driver driver = driverApplication.findById(driverTruck.getDriver().getId());
    Truck truck = truckApplication.findById(driverTruck.getTruck().getId());

    driverTruck.setDriver(driver);
    driverTruck.setTruck(truck);
    return driverTruckService.create(driverTruck);
  }
}
