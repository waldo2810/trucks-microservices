package com.camiones.core.core.infrastructure.mapper;

import com.camiones.core.core.domain.model.Truck;
import com.camiones.core.core.infrastructure.repository.truck.TruckDto;
import com.camiones.core.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface TruckDtoMapper extends EntityToDto<Truck, TruckDto> {

}
