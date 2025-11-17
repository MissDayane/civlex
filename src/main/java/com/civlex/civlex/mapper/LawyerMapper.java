package com.civlex.civlex.mapper;

import com.civlex.civlex.dto.createDTO.LawyerCreateDto;
import com.civlex.civlex.dto.responseDTO.LawyerResponseDTO;
import com.civlex.civlex.models.users.Lawyer;

public class LawyerMapper {

    public static LawyerResponseDTO toDTO(Lawyer lawyer) {
        if (lawyer == null) return null;

        LawyerResponseDTO dto = LawyerResponseDTO.builder().build();

        UserMapper.mapCommonFieldsToDTO(lawyer, dto);

        dto.setOab(lawyer.getOab());
        dto.setSpecialty(lawyer.getSpecialty());

        return dto;
    }

    public static Lawyer toEntity(LawyerCreateDto dto) {
        if (dto == null) return null;

        Lawyer lawyer = Lawyer.builder().build();

        // Campos comuns
        UserMapper.mapCommonFieldsToEntity(dto, lawyer);

        // Campos específicos
        lawyer.setOab(dto.getOab());
        lawyer.setAnexoOabUrl(dto.getAnexoOab());
        lawyer.setSpecialty(dto.getSpecialty());

        return lawyer;
    }
}
