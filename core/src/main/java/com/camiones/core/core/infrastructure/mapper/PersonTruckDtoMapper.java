package com.camiones.core.core.infrastructure.mapper;

import com.camiones.core.core.domain.model.DriverTruck;
import com.camiones.core.core.infrastructure.repository.drivertruck.DriverTruckDto;
import com.camiones.core.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING, uses = {
    PersonTruckDtoMapper.class,
    TruckDtoMapper.class
})
public interface PersonTruckDtoMapper extends EntityToDto<DriverTruck, DriverTruckDto> {

}
