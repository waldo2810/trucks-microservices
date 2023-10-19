package com.camiones.core.core.domain.service.truck;


import com.camiones.core.core.domain.model.Truck;
import java.util.List;

public interface TruckService {

  Truck createTruck(Truck truck);

  Truck findById(Long id);

  List<Truck> findAllTrucks();

  void editTruck(Truck truck);

  Truck findByPlate(String plate);
}