package com.camiones.core.shared.exception.notfound.driver;

import com.camiones.core.shared.exception.notfound.NotFoundException;

public class DriverNotFoundException extends NotFoundException {

  public DriverNotFoundException(String id) {
    super(String.format("Driver with ID: %s was not found", id));
  }
}
