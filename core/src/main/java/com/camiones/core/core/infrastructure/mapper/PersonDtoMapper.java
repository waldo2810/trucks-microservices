package com.camiones.core.core.infrastructure.mapper;

import com.camiones.core.core.domain.model.Driver;
import com.camiones.core.core.infrastructure.repository.driver.DriverDto;
import com.camiones.core.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface PersonDtoMapper extends EntityToDto<Driver, DriverDto> {

}
