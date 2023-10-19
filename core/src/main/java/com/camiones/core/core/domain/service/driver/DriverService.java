package com.camiones.core.core.domain.service.driver;


import com.camiones.core.core.domain.model.Driver;
import java.util.List;

public interface DriverService {

  Driver createPerson(Driver driver);

  Driver findById(Long id);

  List<Driver> findAllPersons();
}