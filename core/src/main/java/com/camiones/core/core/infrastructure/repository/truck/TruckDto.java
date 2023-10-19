package com.camiones.core.core.infrastructure.repository.truck;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

@Data
@Entity
@Table(name = "TRUCK")
public class TruckDto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String placa;
  @Column(name = "gps_status")
  private String gpsStatus;
  @Column(name = "gas_oil_status")
  private Float gasOilStatus;
  private String status;

}
