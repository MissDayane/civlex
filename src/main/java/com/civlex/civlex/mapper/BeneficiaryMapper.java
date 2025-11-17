package com.civlex.civlex.mapper;

import com.civlex.civlex.dto.createDTO.BeneficiaryCreateDto;
import com.civlex.civlex.dto.responseDTO.BeneficiaryResponseDTO;
import com.civlex.civlex.models.users.Beneficiary;

public class BeneficiaryMapper {

    public static BeneficiaryResponseDTO toDTO(Beneficiary beneficiary) {
        if (beneficiary == null) return null;

        BeneficiaryResponseDTO dto = BeneficiaryResponseDTO.builder().build();

        UserMapper.mapCommonFieldsToDTO(beneficiary, dto);

        dto.setCadUnico(beneficiary.getCadUnico());
        dto.setCadUnicoAnexo(beneficiary.getCadUnicoAnexoUrl());

        return dto;
    }

    public static Beneficiary toEntity(BeneficiaryCreateDto dto) {
        if (dto == null) return null;

        Beneficiary beneficiary = Beneficiary.builder().build();
        UserMapper.mapCommonFieldsToEntity(dto, beneficiary);

        beneficiary.setCadUnico(dto.getCadUnico());
        beneficiary.setCadUnicoAnexoUrl(dto.getCadUnicoAnexo());

        return beneficiary;
    }
}
