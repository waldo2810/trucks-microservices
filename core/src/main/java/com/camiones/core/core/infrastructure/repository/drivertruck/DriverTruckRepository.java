package com.camiones.core.core.infrastructure.repository.drivertruck;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverTruckRepository extends JpaRepository<DriverTruckDto, Long> {

}
