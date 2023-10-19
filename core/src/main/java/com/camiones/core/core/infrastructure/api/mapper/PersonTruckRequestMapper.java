package com.camiones.core.core.infrastructure.api.mapper;

import com.camiones.core.core.domain.model.DriverTruck;
import com.camiones.core.core.infrastructure.mapper.PersonDtoMapper;
import com.camiones.core.core.infrastructure.mapper.TruckDtoMapper;
import com.camiones.core.core.infrastructure.api.dto.PersonTruckRequest;
import com.camiones.core.shared.mapper.EntityToDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING,
    uses = {
        PersonDtoMapper.class,
        TruckDtoMapper.class
    }, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface PersonTruckRequestMapper extends EntityToDto<DriverTruck, PersonTruckRequest> {

  @Mapping(source = "personId", target = "person.id")
  @Mapping(source = "truckId", target = "truck.id")
  DriverTruck toEntity(PersonTruckRequest personTruckRequest);
}
