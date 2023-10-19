package com.camiones.core.shared.exception.conflict.truck;

import com.camiones.core.shared.exception.conflict.ConflictException;

public class PlateAlreadyExistsException extends ConflictException {

  public PlateAlreadyExistsException(String plate) {
    super(String.format("Plate %s already exists", plate));
  }
}
