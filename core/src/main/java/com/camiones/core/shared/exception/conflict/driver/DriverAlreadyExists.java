package com.camiones.core.shared.exception.conflict.driver;

import com.camiones.core.shared.exception.conflict.ConflictException;

public class DriverAlreadyExists extends ConflictException {

  public DriverAlreadyExists(String id) {
    super(String.format("Driver with ID %s already exists", id));
  }
}
