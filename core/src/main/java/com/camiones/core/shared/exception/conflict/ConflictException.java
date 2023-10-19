package com.camiones.core.shared.exception.conflict;

import com.camiones.core.shared.exception.BaseException;
import com.camiones.core.shared.exception.ExceptionCode;
import org.springframework.http.HttpStatus;

public class ConflictException extends BaseException {

  protected ConflictException(String message) {
    super(HttpStatus.CONFLICT, message, ExceptionCode.CONFLICT);
  }
}
