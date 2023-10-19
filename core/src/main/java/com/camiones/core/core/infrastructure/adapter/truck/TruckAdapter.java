package com.camiones.core.core.infrastructure.adapter.truck;

import com.camiones.core.core.domain.model.Truck;
import com.camiones.core.core.infrastructure.mapper.TruckDtoMapper;
import com.camiones.core.core.infrastructure.repository.truck.TruckRepository;
import com.camiones.core.core.domain.service.truck.TruckService;
import com.camiones.core.shared.exception.conflict.truck.PlateAlreadyExistsException;
import com.camiones.core.shared.exception.notfound.truck.TruckNotFoundException;
import java.util.List;
import java.util.Objects;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TruckAdapter implements TruckService {

  private final TruckRepository truckRepository;
  private final TruckDtoMapper truckMapper;

  @Override
  public Truck createTruck(Truck truck) {
    validatePlaca(truck.getPlate());
    return truckMapper.toEntity(truckRepository.save(truckMapper.toDto(truck)));
  }

  @Override
  public Truck findById(Long id) {
    return truckRepository.findById(id).map(truckMapper::toEntity)
        .orElseThrow(() -> new TruckNotFoundException(String.valueOf(id)));
  }

  @Override
  public List<Truck> findAllTrucks() {
    return truckMapper.toEntity(truckRepository.findAll());
  }

  @Override
  public void editTruck(Truck truck) {
  /*truckRepository.editTruck(truck.getId(),
        truck.getGasOilStatus(),
        truck.getGpsStatus(),
        truck.getStatus());*/

  }

  @Override
  public Truck findByPlate(String plate) {
    return truckMapper.toEntity(
        truckRepository.findByPlaca(plate)
            .orElseThrow(() -> new PlateAlreadyExistsException(String.valueOf(plate))));
  }

  private void validatePlaca(String placa) {
    if (Objects.nonNull(truckRepository.findByPlaca(placa))) {
      throw new PlateAlreadyExistsException(placa);
    }
  }
}

