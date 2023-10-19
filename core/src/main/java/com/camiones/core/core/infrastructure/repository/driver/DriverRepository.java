package com.camiones.core.core.infrastructure.repository.driver;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<DriverDto, Long> {

  Optional<DriverDto> findByNumberId(String numberId);
}
