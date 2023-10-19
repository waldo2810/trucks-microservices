package com.camiones.core.core.infrastructure.mapper;

import com.camiones.core.core.domain.model.Metric;
import com.camiones.core.core.infrastructure.repository.metric.MetricDto;
import com.camiones.core.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;

@Mapper
public interface MetricMapper extends EntityToDto<Metric, MetricDto> {

}
