package com.camiones.core.core.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Driver {

  private Long id;
  private String name;
  private String lastName;
  private String numberId;
}