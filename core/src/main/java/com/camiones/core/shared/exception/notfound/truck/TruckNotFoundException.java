package com.camiones.core.shared.exception.notfound.truck;

import com.camiones.core.shared.exception.notfound.NotFoundException;

public class TruckNotFoundException extends NotFoundException {

  public TruckNotFoundException(String id) {
    super(String.format("Truck with ID: %s was not found", id));
  }
}
