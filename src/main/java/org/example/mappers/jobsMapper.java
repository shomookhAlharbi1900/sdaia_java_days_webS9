package org.example.mappers;

import org.example.dto.jobsDto;
import org.example.models.jobs;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface jobsMapper {
    jobsMapper INSTANCE = Mappers.getMapper(jobsMapper.class);
    jobsDto tojobtDto(jobs j);
    jobs toModel(jobsDto dto);



}
