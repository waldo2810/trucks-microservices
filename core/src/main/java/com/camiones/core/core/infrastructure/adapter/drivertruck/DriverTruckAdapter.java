package com.camiones.core.core.infrastructure.adapter.drivertruck;

import com.camiones.core.core.infrastructure.mapper.PersonTruckDtoMapper;
import com.camiones.core.core.infrastructure.repository.drivertruck.DriverTruckRepository;
import com.camiones.core.core.domain.model.DriverTruck;
import com.camiones.core.core.domain.service.drivertruck.DriverTruckService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DriverTruckAdapter implements DriverTruckService {

  private final DriverTruckRepository driverTruckRepository;
  private final PersonTruckDtoMapper personTruckDtoMapper;


  @Override
  public DriverTruck create(DriverTruck driverTruck) {
    return personTruckDtoMapper.toEntity(
        driverTruckRepository.save(personTruckDtoMapper.toDto(driverTruck)));
  }

  @Override
  public DriverTruck findById(Long id) {
    return driverTruckRepository.findById(id).map(personTruckDtoMapper::toEntity).orElse(null);
  }

  @Override
  public List<DriverTruck> findAll() {
    return personTruckDtoMapper.toEntity(driverTruckRepository.findAll());
  }
}
