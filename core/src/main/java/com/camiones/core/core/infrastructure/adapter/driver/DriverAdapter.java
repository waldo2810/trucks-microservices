package com.camiones.core.core.infrastructure.adapter.driver;

import com.camiones.core.core.infrastructure.mapper.PersonDtoMapper;
import com.camiones.core.core.infrastructure.repository.driver.DriverRepository;
import com.camiones.core.core.domain.model.Driver;
import com.camiones.core.core.domain.service.driver.DriverService;
import com.camiones.core.shared.exception.conflict.driver.DriverAlreadyExists;
import com.camiones.core.shared.exception.notfound.driver.DriverNotFoundException;
import java.util.List;
import java.util.Objects;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DriverAdapter implements DriverService {

  private final DriverRepository driverRepository;
  private final PersonDtoMapper personDtoMapper;

  @Override
  public Driver createPerson(Driver driver) {
    validateIdentification(driver.getNumberId());
    return personDtoMapper.toEntity(driverRepository.save(personDtoMapper.toDto(driver)));
  }

  @Override
  public Driver findById(Long id) {
    return driverRepository.findById(id).map(personDtoMapper::toEntity)
        .orElseThrow(() -> new DriverNotFoundException(String.valueOf(id)));
  }

  @Override
  public List<Driver> findAllPersons() {
    return personDtoMapper.toEntity(driverRepository.findAll());
  }

  private void validateIdentification(String numberId) {
    if (Objects.nonNull(driverRepository.findByNumberId(numberId))) {
      throw new DriverAlreadyExists(numberId);
    }
  }
}

