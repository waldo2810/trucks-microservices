package com.camiones.core.core.infrastructure.repository.metric;

import com.camiones.core.core.domain.model.Truck;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Builder
@Table(name = "METRICS")
public class MetricDto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @ManyToOne
  @JoinColumn(name = "truck_id", referencedColumnName = "id")
  private Truck truck;
  private String plate;
  private String event;
  private String driver;
  @Column(name = "emitted_by")
  private String emittedBy;
  private String eventDateTime;
}
