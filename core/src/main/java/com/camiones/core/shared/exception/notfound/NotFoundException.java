package com.camiones.core.shared.exception.notfound;

import com.camiones.core.shared.exception.BaseException;
import com.camiones.core.shared.exception.ExceptionCode;
import org.springframework.http.HttpStatus;

public class NotFoundException extends BaseException {

  protected NotFoundException(String message) {
    super(HttpStatus.NOT_FOUND, message, ExceptionCode.NOT_FOUND);
  }
}
