package com.camiones.core.core.application.truck;

import com.camiones.core.core.domain.model.Truck;
import com.camiones.core.core.domain.service.truck.TruckService;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TruckApplication {

  private final TruckService truckService;

  public Truck create(Truck truck) {
    return truckService.createTruck(truck);
  }

  public List<Truck> findAll() {
    return truckService.findAllTrucks();
  }

  public Truck findById(Long id) {
    return truckService.findById(id);
  }

  public void editTruck(Truck truck) {
    truckService.editTruck(truck);
  }

  public Truck findByPlate(String plate) {
    return truckService.findByPlate(plate);
  }
}
