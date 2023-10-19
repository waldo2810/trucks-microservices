package com.camiones.core.core.application.driver;

import com.camiones.core.core.domain.model.Driver;
import com.camiones.core.core.domain.service.driver.DriverService;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DriverApplication {

  private final DriverService driverService;

  public Driver create(Driver driver) {
    return driverService.createPerson(driver);
  }

  public List<Driver> findAll() {
    return driverService.findAllPersons();
  }

  public Driver findById(Long id) {
    return driverService.findById(id);
  }

}
