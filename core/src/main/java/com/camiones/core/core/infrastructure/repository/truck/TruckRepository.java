package com.camiones.core.core.infrastructure.repository.truck;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TruckRepository extends JpaRepository<TruckDto, Long> {

  @Query("SELECT t FROM TruckDto t WHERE  t.placa = ?1")
  Optional<TruckDto> findByPlaca(String placa);

}
